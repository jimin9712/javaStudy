package myjob;

import java.util.Scanner;
//기획
//
//장의사
//
//1.시체 나르기
//2.정보 보기
//3.종료
public class JobTest {
   public static void main(String[] args) {
      String title = "세계 최고의 장의사 키우기";
      String message = "1. 시체 나르기\n2. 정보 보기\n3. 종료";
      Scanner sc = new Scanner(System.in);
      String[] arRank = {"브론즈", "실버", "골드"};
      DeadMan john = new DeadMan("John", 0, 60, 0);
      
      int choice = 0;
      int successCount = 0, failCount = 0;
      
      while(true) {
         System.out.println(title);
         System.out.println(message);
         choice = sc.nextInt();
         
         if(choice == 3) {
            break;
         }
         
         switch(choice) {
         case 1: 
            if(john.move()) {
               john.money += 1_000_000;
               john.successCount ++;
               successCount++;
               failCount = 0;
               
               System.out.println("★☆★☆★☆★☆★☆시체 나르기 성공!!★☆★☆★☆★☆★☆");
               System.out.println("현재 연속 " + successCount + "회 성공중!");
               if(successCount >= 3) {
                  if(john.rank < 2) {
                     john.rank++;
                     System.out.println(arRank[john.rank] + "(으)로 승급!!! 축하합니다!");
                  }
               }
               break;
            }
            
            john.money /= 2;
            john.failCount ++;
            failCount ++;
            successCount = 0;
            System.out.println("실패...");
            System.out.println("위험!! 현재 연속 " + failCount + "회 실패중!");
            if(failCount >= 2) {
               if(john.rank > 0) {
                  john.rank--;
                  System.out.println(arRank[john.rank] + "(으)로 강등ㅠㅠㅠㅠ 분발하세요!");
               }
            }
        
            break;
         case 2 :
            john.printInfo();
            break;
         }
         
      }
   }
}


















