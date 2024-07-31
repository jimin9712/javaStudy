package controllStatementTest;

import java.util.Scanner;

public class DoWhileTest {
   public static void main(String[] args) {
      String message = "1.통신요금조회\n2.번호변경\n3.통신사변경\n0.상담원 연결";
      Scanner sc = new Scanner(System.in);
      int choice = 0;
//      바로 while을 사용하면 한번도 반복하지 않고 끝나기 때문에
//      do를 먼저 사용하여 한번은 반복할 수 있게 함
      do {
         System.out.println(message);
         choice = sc.nextInt();
         
         System.out.println("들어옴");
      } while(choice != 0);
      
   }
}
