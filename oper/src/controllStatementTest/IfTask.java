package controllStatementTest;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
//		입력상태로 만들기 위해 Scanner 사용
		  Scanner sc = new Scanner(System.in);
//		  사용자에게 보여질 메시지를 각 변수에 저장
	      String title = "Q. 당신이 좋아하는 색을 선택하세요.";
	      String menu = "1.빨간색\n2.노란색\n3.검은색\n4.흰색";
//	      choice 를 int로 설정 후 초기값 설정
	      int choice = 0;
//	      각 결과에 출력할 메시지를 각 변수에 저장
	      String redMessage = "불같고 열정적이고 적극적이다.";
	      String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
	      String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
	      String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
	      String errorMessage = "잘못 입력하셨습니다.";
//	      사용자에게 title과 menu 출력
	      System.out.println(title);
	      System.out.println(menu);
//	      사용자에게 받은 값을 정수형으로 추출
	      choice = sc.nextInt();
//	      논리형인 condition1,2,3,4의 초기값 설정
	      boolean condition1 = false, condition2 = false, condition3 = false,condition4 = false;
//	      각 변수에 맞는 조건식 저장
	      condition1 = choice == 1;
	      condition2 = choice == 2;
	      condition3 = choice == 3;
	      condition4 = choice == 4;
//	      문자열인 resultMessage 초기값 설정
	      String resultMessage = null;
	      
//	      if문을 사용해서 프로그램을 완성한다.
//	     만약 조건식이 condition1이라면 결과값은 redMessage 출력
	      if(condition1) {
	    	  resultMessage = redMessage;
	      }
//	     그렇지 않고 만약 조건식이 condition2이라면 결과값은 yellowMessage 출력
	      else if(condition2) {
	    	  resultMessage = yellowMessage;
	      }
//	     1, 2 조건이 모두 아니고 만약 조건식이 condition3이라면 결과값은 blackMessage 출력
	      else if(condition3) {
	    	  resultMessage = blackMessage;
//	     1, 2, 3 조건식이 모두 아니고 condition3이라면 결과값은 whiteMessage 출력
	      }
	      else if(condition4) {
	    	  resultMessage = whiteMessage;
	      }	 
//	     1, 2, 3 , 4 조건식이 모두 아니라면 결과값은 errorMessage 출력
	      else{
	    	  resultMessage = errorMessage;
	      }
//	      사용자에게 결과값 출력
	      System.out.println(resultMessage);
	}

}
