package inputTest;

import java.util.Scanner;

public class InputTest2 {
	public static void main(String[] args) {
//		두 정수를 입력한 뒤 곱셈 결과 출력
//		단, next()만 사용한다.
//		===============================내 코드===================================
//		Scanner sc = new Scanner(System.in);
//		int num1= 0 , num2 = 0;
//		int result = num1 * num2;
		
//		System.out.println("첫 번째 정수 입력:");
//		num1 = Integer.parseInt(sc.next());
//		System.out.println("두 번째 정수 입력:");
//		num2 = Integer.parseInt(sc.next());
//		System.out.println("두 수의 곱은 " + result + "입니다."); 
//		
//	    
//		     =======================강사님 코드=================================
//		      입력 상태를 만들기 위해 입력 클래스(Scanner) 준비
		      Scanner sc = new Scanner(System.in);
//		      사용자에게 출력할 메세지 변수에 저장
		      String message = "두 정수를 입력해주세요.";
//		      사용자에게 출력할 메세지(예시) 변수에 저장
		      String exampleMessage = "예)3 48";
//		      사용자가 입력한 정수로 계산한 결과를 출력하는 메세지 변수에 저장
		      String resultMessage = "%d * %d = %d";
//		      사용자가 입력한 문자열 값을 저장할 변수 선언 및 초기화
		      String data1 = null, data2 = null;
//		      사용자가 입력한 문자열 값을 정수로 변환해서 담아놓을 변수 선언(number1, number2)
//		      사용자가 입력한 두 정수를 곱한 결과를 담아놓을 변수 선언(result)
		      int number1 = 0, number2 = 0, result = 0;
		      
//		      사용자에게 메세지 출력
		      System.out.println(message);
		      System.out.println(exampleMessage);
		      
//		      사용자가 입력한 두 정수(문자열)를 각 변수에 저장
		      data1 = sc.next();
		      data2 = sc.next();
		      
//		      사용자가 입력한 문자열 값을 정수로 변환 후 각 변수에 저장
		      number1 = Integer.parseInt(data1);
		      number2 = Integer.parseInt(data2);
		      
//		      사용자가 입력한 값을 곱한 결과값을 result에 저장
		      result = number1 * number2;
		      
//		      연산 결과 메세지 출력
		      System.out.printf(resultMessage, number1, number2, result);
		   }
		}
















