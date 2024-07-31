package lambdaTask;

public class PrintNameTest {
   public void printFullName(PrintName printName, String lastName, String firstName) {
      String fullName = printName.getFullName(lastName, firstName);
      System.out.println(fullName);
   }
   
   public static void main(String[] args) {
      PrintNameTest printNameTest = new PrintNameTest();
      printNameTest.printFullName((l, f) -> l + f, "이", "지민");
   }
}