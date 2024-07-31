package staticTest;

class Data {
   int data;
   static int data_s = 10;

   public Data() {;}
   // 기본생성자

   public Data(int data) {
      this.data = data;
   }

   void increase() {
      System.out.println(data++);
   }

   static void increase_s() {
      System.out.println(++data_s);
   }
}

public class StaticTest {
   public static void main(String[] args) {
      Data data1 = new Data(10);
      Data data2 = new Data();
      
      
      
      Data.data_s = 100;
      System.out.println(Data.data_s);

//      data1.increase();
//      data1.increase();
//      data1.increase();
//      data1.increase();
//      data1.increase();
//      
//      data1 = new Data(10);
//      
//      data1.increase();
//      data1.increase();
//      data1.increase();
//      data1.increase();
//      data1.increase();
      
//      data2.increase_s();
//      data2.increase_s();
//      data2.increase_s();
//      data2.increase_s();
//      data2.increase_s();
//      
//      data2 = new Data();
//      data2.increase_s();
//      data2.increase_s();
//      data2.increase_s();
//      data2.increase_s();
//      data2.increase_s();
//      data2.increase_s();
   
      
   }
}