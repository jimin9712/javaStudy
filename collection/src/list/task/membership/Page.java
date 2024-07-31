package list.task.membership;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Page {
    public static void main(String[] args) {
    	
        // 사용자 정보 추가
        Member 사용자1 = new Member("이세찬", "bronze", 100000);
        Member 사용자2 = new Member("용호중", "silver", 200000);
        Member 사용자3 = new Member("이지민", "vip", 300000);

        Store store = new Store();
        ArrayList<Member> members;

        store.add(사용자1);
        store.add(사용자2);
        store.add(사용자3);

        System.out.println(DBConnecter.members);

        members = store.selectAll();
        System.out.println(members);

        String grade = store.gradeChckByName("이지민");
        System.out.println(사용자3 + "님의 등급: " + grade);

        Member memberToUpdate = (Member) DBConnecter.members.get(1);
        store.updateGradeAndDiscount(memberToUpdate, "vip");
        System.out.println("등급 수정 후: " + memberToUpdate);

        System.out.println(store.selectAll());
    }
}
