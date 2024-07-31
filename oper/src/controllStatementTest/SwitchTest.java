package controllStatementTest;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
//		입력상태로 만들기 위해 Scanner 사용
	      Scanner sc = new Scanner(System.in);
//	      사용자에게 보여지는 문구를 변수에 저장
	      String title = "Q. 당신이 좋아하는 색을 선택하세요.";
	      String menu = "1.빨간색\n2.노란색\n3.검은색\n4.흰색";
//	      사용자에게 choice 정수로 받기 위해 초기값 설정
	      int choice = 0;
//	      choice에 맞는 메시지들을 변수에 저장
	      String redMessage = "불같고 열정적이고 적극적이다.";
	      String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
	      String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
	      String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
//	      choice에 없는 수를 고르면 출력될 메시지를 변수에 저장
	      String errorMessage = "잘못 입력하셨습니다.";
//	      String resultMessage 초기값 설정
	      String resultMessage = null;
//	     사용자에게 처음 보여지는 제목과 메뉴 출력
	      System.out.println(title);
	      System.out.println(menu);
//	      사용자에게 받은 수를 정수로 출력받기 위해 nextInt 사용
	      choice = sc.nextInt();
	      
//	      switch(choice) {
//	      case 1:
//	    	  resultMessage = redMessage;
//	    	  break;
//	      case 2:
//	    	  resultMessage = yellowMessage;
//	    	  break;
//	      case 3:
//	    	  resultMessage = blackMessage;
//	    	  break;
//	      case 4:
//	    	  resultMessage = whiteMessage;
//	    	  break;
//	      default:
//	    	  resultMessage = errorMessage;
//	    	  break;
//	      
//	      }
//	      choice의 값이 1일 때는 resultMessage 안에 redMessage 저장
//	      그 후도 동일하게 저장 후 1~4 모두 아니라면 resultMessage 안에 errorMessage 저장
	      switch(choice) {
	      case 1 -> resultMessage = redMessage; 
	      case 2 -> resultMessage = yellowMessage; 
	      case 3 -> resultMessage = blackMessage; 
	      case 4 -> resultMessage = whiteMessage; 
	      default -> resultMessage = errorMessage; 
	      }
//	      사용자에게 결과값 출력
	      System.out.println(resultMessage);	      
	}
}
