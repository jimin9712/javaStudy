package list.task.user;

import java.util.Base64;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import list.task.DBConnecter;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
	private final static int CERTIFICATED_NUMBER_LENGTH = 5;

//   - 아이디 중복검사
	public User findByUserId(String userId) {
//      아래와 같이 사용할 수 있지만, 굳이 필요하지 않은 User 객체를 얕은 복사할 필요 없다.
//      ArrayList<User> users = new ArrayList<User>();
//      for (int i = 0; i < DBConnecter.users.size(); i++) {
//         users.add(new User(DBConnecter.users.get(i)));
//      }
		User user = null;

//      위에 처럼 모든 User객체를 얕은 복사하지 않고, 찾은 User 객체만 얕은 복사하자!
		for (int i = 0; i < DBConnecter.users.size(); i++) { // DB에 있는 모든 회원 수 만큼 반복
			if (DBConnecter.users.get(i).getUserId().equals(userId)) { // 각 회원의 id를 전달받은 id와 같은지 검사
//            해당 회원을 찾았으면, 얕은 복사 후 user에 저장
				user = new User(DBConnecter.users.get(i));
			}
		}

//      만약 해당 회원을 찾았으면, 그 회원 리턴
//      못찾았으면, null 리턴
		return user;
	}

//   - 회원가입
//   화면에서 입력한 회원 정보를 받아온다.
	public void join(User user) {
//      비밀번호 암호화한다.
		user.setPassword(encrypt(user.getPassword()));
//      회원을 DB(저장소)에 저장한다.
		DBConnecter.users.add(user);
	}

//   - 로그인
//   로그인에 필요한 회원정보를 한 번에 다 받아온다.
	public User login(User user) {
//      아이디 검사
		User foundUser = findByUserId(user.getUserId());
		if (foundUser != null) { // 아이디가 있다면,
//         사용자가 입력한 아이디를 암호화한 뒤, DB에 있는 암호화된 비밀번호와 같은지 검사(단방향)
			if (foundUser.getPassword().equals(encrypt(user.getPassword()))) {
//            로그인 성공 시 해당 회원 객체 리턴
				return foundUser;
			}
		}
//      로그인 실패 시 null 리턴
		return null;
	}

//   - 암호화(강사), 정확히 따지면 암호화가 아니고 단순 인코딩
//   단방향: 암호화된 것끼리 비교
//   양방향: 복호화해서 비교
//   원본 비밀번호 받아오기
	public String encrypt(String password) {
//      원본 비밀번호를 모두 바이트로 가져온 다음, Base64라는 방식으로 인코딩해준다
//      Base64방식으로 인코딩된 비밀번호를 리턴한다.
		return new String(Base64.getEncoder().encode(password.getBytes()));
	}

//   - 비밀번호 변경(마이 페이지)
//   단, 비밀번호 찾기를 통해 새로운 비밀번호로 변경
//   아이디와 비밀번호 받아오기
	public void update(String userId, String password) {
//      아이디 검사
		User user = findByUserId(userId);
		if (user != null) { // 아이디가 존재하면,
//         새롭게 입력한 비밀번호를 암호화해서 기존 비밀번호에 덮어 씌운다.
			user.setPassword(encrypt(password));
		}
	}

//   - 인증번호 전송(API)
	public String sendCertificatedNumber(String phone) {
		String api_key = "";
		String api_secret = "";
		Message coolsms = new Message(api_key, api_secret);

//      인증번호 5자리 랜덤하게 생성해온다.
		String certificatedNumber = makeCertificatedNumber();

//		 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", phone);
		params.put("from", "내번호");
		params.put("type", "SMS");
		params.put("text", certificatedNumber);
		params.put("app_version", "test app 1.2"); // application name and version

		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}

//      인증번호 발송 버튼을 누르면 지금 이 메소드가 실행된다.
//      그런데, 발송한 인증번호를 화면에서 모르기 때문에
//      사용자가 입력한 인증번호가 맞는지 알 수가 없다.
//      그러니까 여기서 보낸 인증번호를 화면에 리턴해줘야된다.
		return certificatedNumber;
	}

//   5자리 인증번호
	private String makeCertificatedNumber() {
		Random random = new Random();
		String certificatedNumber = "";

//      인증번호 길이만큼 반복한다.
		for (int i = 0; i < CERTIFICATED_NUMBER_LENGTH; i++) {
//         0~9중 하나를 뽑는다.
//         그 숫자를 certificatedNumber에 누적해서 연결한다.
			certificatedNumber += random.nextInt(10);
		}

//      랜덤한 5자리 인증번호를 리턴한다.
		return certificatedNumber;
	}

//   - 개인 정보 수정
//   외부에서 수정완료된 새로운 정보 모두 전달받는다.
	public void update(User user) {
		User dbUser = null;

//      모든 회원 수만큼 반복한다.
		for (int i = 0; i < DBConnecter.users.size(); i++) {
			dbUser = DBConnecter.users.get(i);
//         각 회원의 아이디와 수정하고자 하는 회원 정보의 아이디를 비교한다.
			if (dbUser.getUserId().equals(user.getUserId())) {
//            찾은 회원의 정보를 새로운 정보로 교체한다. 깊은 복사
				DBConnecter.users.set(i, new User(user));
			}
		}
	}
}
