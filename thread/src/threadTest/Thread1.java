package threadTest;

public class Thread1 extends Thread{
   
   private String data;
   
   public Thread1() {;}
   
   public Thread1(String data) {
      super();
      this.data = data;
   }
   
   public Thread1(String data, String name) {
      super(name);
      this.data = data;
   }

   public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }

   @Override
   public void run() {
//      자원
      for (int i = 0; i < 10; i++) {
         System.out.println(data);
         try {
            sleep(50); //1초 == 1000밀리초
         } catch (InterruptedException e) {;}
      }
   }
}




















