package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
   public static void main(String[] args) {
//      5개의 정수만 입력받기
//      - 무한 입력 상태로 구현(5번 이상 입력 가능)
//      - q 입력 시 나가기
//      - 각 정수는 배열에 담기
//      - if문은 딱 한 번만 사용하기(q입력 시 나가기)
      
//      오류 상황
//      6번째 정수를 입력했을 때
//      정수가 아닌 다른 것을 입력했을 때
      
      int[] arNumber = new int[5];
      Scanner sc = new Scanner(System.in);
      String message = "번째 정수: ";
      String temp = null;
      int count = 0;
      
      while(true) {
         System.out.println(++count + message);
         temp = sc.next();
         
         if(temp.equals("q")){
            break;
         }
         
         try {
            arNumber[count - 1] = Integer.parseInt(temp);
         } catch (NumberFormatException e) {
            System.out.println("정수만 입력해주세요.");
            count --;
         } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("5개 정수까지만 입력가능합니다.");
            
            for (int i = 0; i < arNumber.length; i++) {
               System.out.println(arNumber[i]);
            }
            
            break;
         } catch (Exception e) {
            System.out.println("다시 시도해주세요.");
         }
      }
   }
}









