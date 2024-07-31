package exceptionTask;

public class NicknameException extends Exception{
   
   public NicknameException() {;}
   
//   원하는 메세지를 출력하고 싶으면 생성자에 메세지를 전달한다.
   public NicknameException(String message) {
      super(message);
   }
}