package castingTest;

public class Encryption {
   public static void main(String[] args) {
      String password = "Yong_Ho_Jung_Bung_sin";
      String encryptedPassword = "", decryptedPassword = "";
      final int KEY = 3;
      
      for (int i = 0; i < password.length(); i++) {
         encryptedPassword += (char)(password.charAt(i) * KEY);
      }
      
      System.out.println(encryptedPassword);
      
      for (int i = 0; i < encryptedPassword.length(); i++) {
         decryptedPassword += (char)(encryptedPassword.charAt(i) / KEY);
      }
      System.out.println(decryptedPassword);
   }
}







