package operTest;

import java.util.Scanner;

public class OperTest4 {
   public static void main(String[] args) {
//      심리 테스트
//      
//      Q. 당신이 좋아하는 색을 선택하세요.
//      1. 빨간색
//      2. 노란색
//      3. 검은색
//      4. 흰색
//      
//      빨간색 : 불같고 열정적이고 적극적이다.
//      노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//      검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//      흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
//      입력상태로 만들기 위해 Scanner 사용
      Scanner sc = new Scanner(System.in);
//      사용자에게 보여지는 문구를 변수에 저장
      String title = "Q. 당신이 좋아하는 색을 선택하세요.";
      String menu = "1.빨간색\n2.노란색\n3.검은색\n4.흰색";
//      사용자에게 choice 정수로 받기 위해 초기값 설정
      int choice = 0;
//      choice에 맞는 메시지들을 변수에 저장
      String redMessage = "불같고 열정적이고 적극적이다.";
      String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
      String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
      String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
//      choice에 없는 수를 고르면 출력될 메시지를 변수에 저장
      String errorMessage = "잘못 입력하셨습니다.";
//      String resultMessage 초기값 설정
      String resultMessage = null;
//     사용자에게 처음 보여지는 제목과 메뉴 출력
      System.out.println(title);
      System.out.println(menu);
//      사용자에게 받은 수를 정수로 출력받기 위해 nextInt 사용
      choice = sc.nextInt();
//      choice가 1과 같으면 -> redMessage출력 -> redMessage가 아니고 2와 같으면 yellow, 1,2가 아니고 3과 같으면 black, 1,2,3이 아니고 4와 같으면 white,
//      1,2,3,4가 모두 아닐 때 errorMessage 출력
      resultMessage = choice == 1 ? redMessage :
         choice == 2 ? yellowMessage :
            choice == 3 ? blackMessage :
               choice == 4? whiteMessage : errorMessage;
//      사용자에게 결과값 출력
      System.out.println(resultMessage);
                  
   }
}














