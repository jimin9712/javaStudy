package castingTest;

class Car {
   private String brand;
   private String color;
   private int price;
   
   // 상속할 때 자잘한 오류가 안나니까 기본 생성자 만들기
   public Car() {;}

   public Car(String brand, String color, int price) {
      super();
      this.brand = brand;
      this.color = color;
      this.price = price;
   }

   public String getBrand() {
      return brand;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public void engineStart() {
      System.out.println("열쇠로 시동 켜기");
   }
   
   public void engineStop() {
      System.out.println("열쇠로 시동 끄기");
   }
   
}

class SuperCar extends Car {
   private String mode;
   
   public SuperCar() {;}

   public SuperCar(String brand, String color, int price, String mode) {
      super(brand, color, price);
      this.mode = mode;
   }

   public String getMode() {
      return mode;
   }

   public void setMode(String mode) {
      this.mode = mode;
   }
   
   @Override
   public void engineStart() {
      super.engineStart();
      System.out.println("음성으로 시동 켜기");
   }
   
   public void openRoof() {
      System.out.println("뚜껑 열기");
   }
   
   public void closeRoof() {
      System.out.println("뚜껑 닫기");
   }
   
}

public class CastingTest {
   public static void main(String[] args) {
      Car matiz = new Car("마티즈", "황금색", 250);
      SuperCar ferrari = new SuperCar("페라리", "빨간색", 750_000_000, "Sport");
      
//      up casting
      Car noOptionFerrari = new SuperCar("페라리", "빨간색", 750_000_000, "Sport");
      noOptionFerrari.engineStart();
      
//      오류
//      SuperCar borkenFerrari = (SuperCar) new Car();
      
//      down casting
      SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
      fullOptionFerrari.openRoof();
      
//      instanceof: 조건식
//      객체 instanceof 타입: 참 또는 거짓

      System.out.println(matiz instanceof Car);
      System.out.println(matiz instanceof SuperCar);
      System.out.println(ferrari instanceof Car);
      System.out.println(ferrari instanceof SuperCar);
      System.out.println(noOptionFerrari instanceof Car);
      System.out.println(noOptionFerrari instanceof SuperCar);
      System.out.println(fullOptionFerrari instanceof Car);
      System.out.println(fullOptionFerrari instanceof SuperCar);
   }
}




















	


