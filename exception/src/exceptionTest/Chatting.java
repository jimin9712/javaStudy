package exceptionTest;

import java.util.Scanner;

public class Chatting {
   
   public void chat(String message) {
//      equals(): 같을 때 true
//      contains(): 문장에 포함되어 있으면 true
      if(message.contains("바보")) {
         try {
            throw new BadWordException();
         } catch (BadWordException e) {
            message = "으응~ 안돼 나쁜말";
         }
      }
      
      System.out.println(message);
   }
   
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Chatting chatting = new Chatting();
      String message = "메세지 :";
      String data = null;
      
      while(true) {
         System.out.print(message);
         data = sc.nextLine();
         
         chatting.chat(data);
         
//         if(data.equals("바보")) {
//            throw new BadWordException();
//         }
//         
//         System.out.println(data);
      }
   }
}












