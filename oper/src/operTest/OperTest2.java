package operTest;

import java.util.Scanner;

public class OperTest2 {
	public static void main(String[] args) {
//		두 정수 비교
//		입력상태로 만들기 위해 Scanner 사용
		Scanner sc = new Scanner(System.in);
//		0으로 초기값 설정
		int number1 = 0, number2 = 0;
//		int result;
//		String이므로 null로 초기값 설정
		String result = null;
//		사용자에게 보여줄 문구를 변수에 저장
		String message = "비교할 두 정수를 입력하세요.\n 예)1 4";
//		사용자에게 보여줄 문구 출력
		System.out.println(message);
//		사용자에게 받은 두 변수를 nextInt로 정수값으로 추출
		number1 = sc.nextInt();
		number2 = sc.nextInt();
//      참과 거짓 자리에 들어갈 값은 자료형이 서로 달라도 된다.
//		System.out.println(number1 > number2 ? "큰 값:" + number1 : number2);
//		result = number1 > number2 ? number1:number2;
//		System.out.println(result);
		
//		number1이 number2 보다 크다면 "큰 값" + number1 출력
		result = number1 > number2 ? "큰 값:" + number1 :
//			그렇지 않고 number1 과 number2이 같다면 "두 수가 같습니다." 출력 그렇지 않다면 "큰 값" + number2 출력
			number1 == number2 ? "두 수가 같습니다." : "큰 값"+ number2;
//		결과값 출력
		System.out.println(result);
	} 

}
