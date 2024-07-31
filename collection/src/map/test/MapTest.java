package map.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

import netscape.javascript.JSObject;

public class MapTest {
	public static void main(String[] args) {
//      1. ###################################################
//      HashMap<String, Object> userMap = new HashMap<>();
//      String jsonUser = "";
//      
//      userMap.put("id", 1);
//      userMap.put("userId", "hds");
//      userMap.put("name", "한동석");
//      userMap.put("age", 20);
//      
//      System.out.println(userMap.toString());
//      System.out.println(userMap.get("name"));
//      
//      jsonUser += "{\"id\"=" + userMap.get("id") + ", ";
//      jsonUser += "\"name\"=" + "\"" + userMap.get("name") + "\"}";
//            
//      System.out.println(jsonUser);

//      2. ###################################################
//      HashMap<String, Object> userMap = new HashMap<>();

//      JSONObject userJSON = null;

//      userMap.put("id", 1);
//      userMap.put("userId", "hds");
//      userMap.put("name", "한동석");
//      userMap.put("age", 20);

//      userJSON = new JSONObject(userMap);
//      System.out.println(userMap);

//      3. ###################################################
//		회원 정보 제작
		User user = new User(1, "hds", "한동석", 20);
//		회원 정보를 JSONObject를 이용해 user를 json형식으로 변환
		JSONObject userJSON = new JSONObject(user);
//		바꾼 json 객체를 문자열로 변환
		String json = userJSON.toString();
//		결과 값을 담을 변수 선언
		JSONObject result = null;
//		변환된 문자열 출력
		System.out.println(json);

		try {
			result = new JSONObject(json);
//			name이라는 Key에 홍길동이라는 value 추가 -> 수정
			result.put("name", "홍길동");
//			result에서 name이라는 키 값 출력
			System.out.println(result.get("name"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
}
