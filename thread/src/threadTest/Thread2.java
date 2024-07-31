package threadTest;

public class Thread2 implements Runnable{

   @Override
   public void run() {
//      자원
      for (int i = 0; i < 10; i++) {
//         접근한 쓰레드를 알아낼 수 있다.
         System.out.println(Thread.currentThread().getName());
         try {
            Thread.sleep(500);
         } catch (InterruptedException e) {;}
      }
      
   }
   

}
