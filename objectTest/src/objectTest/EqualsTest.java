package objectTest;

public class EqualsTest {
   public static void main(String[] args) {
      Customer customer = new Customer(1, "Mike");
      
      System.out.println(customer.equals(new Customer(1, "Mike")));
   }
}
