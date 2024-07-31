package controllStatementTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		입력상태로 만들기 위해 Scanner 사용
		Scanner sc = new Scanner(System.in);
//		변수 2개를 0으로 초기값 설정
		int number1 = 0, number2 = 0;
//		사용자에게 보여줄 메시지를 변수에 저장
		String message = "비교할 두 정수를 입력하세요.\n 예)1 4";
//		논리형 변수 2개 초기값 설정		
		//초기값을 써주고 해야 조건식에서 무조건 false가 안나옴
		boolean condition1 = false;
		boolean condition2 = false;
//		message 출력
		System.out.println(message);
//		사용자에게 받은 두 개의 값을 정수형으로 추출
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
//		conition1이라는 변수에 number1 > number2 조건식 저장, condition2에는 number2 > number1 저장
		condition1 = number1 > number2;
		condition2 = number2 > number1;
//		만약 condition1의 조건식(number1 > number2)이라면 큰 값: number1 출력
		if(condition1) {
			System.out.println("큰 값 : " + number1);
		}
//		그렇지 않고 만약 condition2의 조건식이라면 큰 값: number2 출력	
		else if(condition2) {
			System.out.println("큰 값 : " + number2);
//		이 두 조건식 모두 아니라면 "두 수는 같습니다." 출력
		}else {
			System.out.println("두 수는 같습니다.");
		}
		
	}

}
