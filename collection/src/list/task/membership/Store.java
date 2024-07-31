package list.task.membership;

import java.util.ArrayList;
import list.task.DBConnecter;

public class Store {
	// 새로운 멤버를 DBConnecter의 멤버 리스트에 추가하는 메서드
	public void add(Member member) {
		DBConnecter.members.add(member); // DBConnecter의 members 리스트에 멤버 추가
	}

	// 사용자 이름으로 등급을 조회하는 메서드
	public String gradeChckByName(String name) {
		// DBConnecter의 멤버 리스트를 복제
		ArrayList<Member> members = (ArrayList<Member>) DBConnecter.members.clone();

		// 모든 멤버를 순회하며 이름이 일치하는 멤버의 등급을 반환
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getUserName().equals(name)) {
				// 일치하는 이름을 가진 멤버의 등급 반환
				return members.get(i).getUserGrade();

			}
		}

		return null; // 이름이 일치하는 멤버가 없으면 null 반환
	}

	// 모든 사용자 정보를 조회하는 메서드
	public ArrayList<Member> selectAll() {
		// 새로운 멤버 리스트 생성
		ArrayList<Member> members = new ArrayList<Member>(); 
		for (int i = 0; i < DBConnecter.members.size(); i++) {
			// DBConnecter의 각 멤버를 복사하여 추가
			members.add(new Member(DBConnecter.members.get(i))); 
		}
		return members; // 복사된 멤버 리스트 반환
	}

	// 멤버의 등급과 사용금액을 업데이트하는 메서드
	public void updateGradeAndDiscount(Member member, String newGrade) {
		member.setUserGrade(newGrade); // 멤버의 등급을 새로운 등급으로 설정
		// 멤버의 사용 금액에 0.99 곱하여 할인 적용
		member.setUseAmount(member.getuseAmount() * 0.99); 
	}
}
