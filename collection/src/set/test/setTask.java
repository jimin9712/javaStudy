package set.test;

import java.util.HashSet;

public class setTask {
	public static void main(String[] args) {
//		태극기 색깔
//		흰색, 검은색, 파란색, 빨간색
//		HashSet 자료구조의 메소드 사용하기
//		HashSet에서 중복검사를 진행할 때에는 hashCode로 비교하기 때문에
//		객체끼리의 비교가 아닌, 원하는 필드의 비교를 원한다면 hashCode()를 재정의 해야 한다.
		HashSet<String> koreanFlag = new HashSet<String>();

		koreanFlag.add("흰색");
		koreanFlag.add("검은색");
		koreanFlag.add("파란색");
		koreanFlag.add("빨간색");
		koreanFlag.add("빨간색");
		koreanFlag.add("빨간색");
		
		
		
		System.out.println(koreanFlag.toString());
		System.out.println(koreanFlag.size());
		System.out.println(koreanFlag.contains("흰색"));
		
	}

}
