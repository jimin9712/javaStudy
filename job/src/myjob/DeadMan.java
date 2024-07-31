package myjob;

import java.util.Random;

//1) 시체 나르기
//   성공 시 60%
//      100만원 벌기
//      
//   실패 시 40%
//      전재산 반토막
//
//   연속 3회 성공 시
//      다음 등급으로 승급
//
//   연속 2회 실패 시
//      이전 등급으로 강등
//
//
//   1-1) 등급
//      브론즈
//      실버
//      골드
//
//2) 정보 보기
//   이름
//   성공 횟수
//   실패 횟수
//   현재 잔액  
public class DeadMan {
   String name;
   int successCount;
   int failCount;
   int money;
   int rating;
   int rank;
   
   public DeadMan(String name, int money, int rating, int rank) {
      this.name = name;
      this.money = money;
      this.rating = rating;
      this.rank = rank;
   }

   boolean move(){
      Random random = new Random();
      int[] arData = new int[10];
      int randomIndex = 0;
      
      for (int i = 0; i < rating / 10; i++) {
         arData[i] = 1;
      }
      
      randomIndex = random.nextInt(arData.length);
      
      if(arData[randomIndex] == 1) {
         return true;
      }
      
      return false;
   }
   
   void printInfo() {
      String infoMessage = "이름: " + this.name + "\n"
            + "성공횟수: " + this.successCount + "번\n"
                  + "실패 횟수: " + this.failCount + "번\n"
                        + "현재 잔액: " + this.money + "원";
      System.out.println(infoMessage);
   }
}













