package arrayTest;

public class ArTest1 {
	public static void main(String[] args) {
//		int[] arData = { 2, 4, 5, 6, 8 };
////		주소값 출력
//		System.out.println(arData);
////		값 출력
//		System.out.println(arData[0]);
////		길이 출력
//		System.out.println(arData.length);
//		System.out.println("===================================");

//      첫 번째 값부터 순서대로 출력	

//		for (int i = 0 ; i< arData.length;  i++) {
//			System.err.print(arData[i] + " ");
//		}

//		선언 시, 어떤 값이 들어갈 지는 모르지만 5칸이 필요한 것은 안다고 가정한다.
//		5, 4, 3, 2, 1을 각 방에 넣고 출력
//		5개 크기의 배열 생성
		int arNumber[] = new int[5];
//		
		for (int i = 0; i < arNumber.length; i++) {
//			// 5부터 시작해서 1씩 감소하는 값을 배열에 저장
			arNumber[i] = 5 - i;
			// 배열의 현재 값을 출력
			System.out.print(arNumber[i]);
		}

	}
}
