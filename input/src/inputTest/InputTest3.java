package inputTest;
import java.util.Scanner;

public class InputTest3 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후 덧셈 결과 출력
//		nextInt(): 사용자가 입력한 정수 값
		
//		입력상태를 만들기 위헤 Scanner 사용
		Scanner sc = new Scanner(System.in);
//		사용자에게 출력할 메시지 변수에 저장 문자열이기 때문에 앞에 String
		String message = "세 정수를 입력하세요.";
//		사용자에게 출력할 메시지(예시)를 변수에 저장
		String exampleMessage = "예) 1 2 3";
//		사용자에게 결과를 보여줄 메시지를 변수에 저장
		String resultMessage = "%d + %d + %d = %d";
//		사용자에게 입력받을 세 정수 초기화(정수이기 때문에 0으로 초기화)
		int number1 = 0, number2 = 0, number3 = 0, result = 0;
//		사용자에게 메시지 출력
		System.out.println(message);
//		사용자에게 예시 메시지 출력
		System.out.println(exampleMessage);
//		사용자에게 입력받은 세 수를 nextInt()로 정수로 추출
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
//		사용자에게 입력받은 세 수의 합 결과값 변수에 저장 정수이기 때문에 앞에 int
		result = number1 + number2 + number3;
//		사용자에게 결과값 출력
		System.out.printf("세 수의 합은 " + resultMessage, number1, number2, number3, result);
		
		
				
	}

}
