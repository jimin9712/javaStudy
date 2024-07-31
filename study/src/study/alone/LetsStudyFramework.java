package study.alone;

public interface LetsStudyFramework {
	public static void main(String[] args) {
//      한글을 정수로 변경 HashMap
//		HashMap<String, Integer> koreanToNumber = new HashMap<>();
//		koreanToNumber.put("일", 1);
//		koreanToNumber.put("이", 2);
//		koreanToNumber.put("삼", 3);
//		koreanToNumber.put("사", 4);
//		koreanToNumber.put("오", 5);
//		koreanToNumber.put("육", 6);
//		koreanToNumber.put("칠", 7);
//		koreanToNumber.put("팔", 8);
//		koreanToNumber.put("구", 9);
//		koreanToNumber.put("공", 0);
//		System.out.println(koreanToNumber.get("일"));
//		System.out.println(koreanToNumber.get("공"));
//		System.out.println(koreanToNumber.get("이"));
//		System.out.println(koreanToNumber.get("사"));
		
		String hangle = "공일이삼사오육칠팔구";
		String input = "공공공육공이";
		
		input.chars().map(hangle::indexOf).forEach(System.out::print);
			
// 정수를 한글로 변경
//		HashMap<Integer, String> numberToKorean = new HashMap<>();
//		numberToKorean.put(1, "일");
//		numberToKorean.put(2, "이");
//		numberToKorean.put(3, "삼");
//		numberToKorean.put(4, "사");
//		numberToKorean.put(5, "오");
//		numberToKorean.put(6, "육");
//		numberToKorean.put(7, "칠");
//		numberToKorean.put(8, "팔");
//		numberToKorean.put(9, "구");
//		numberToKorean.put(10, "공");
//		System.out.println(numberToKorean.get(2));
//		
//		
//		

//      정수를 한글로 변경
//      String hangle = "공일이삼사오육칠팔구";
//      String input = "16249";
//      input.chars().map((c) -> c - 48).forEach((i) -> System.out.println(hangle.charAt(i)));
   }
}

