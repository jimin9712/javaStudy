package anonymous;

public class Computer {
   public static void main(String[] args) {
//      Game 인터페이스는 구현되지 않은 추상 메소드가 있기 때문에 메모리에 올릴 수 없다.
//      따라서, 이를 구현할 클래스인 익명 클래스가 만들어지고 Game 인터페이스를 지정받는다.
//      익명 클래스는 지정받은 인터페이스를 구현할 수 있으며, 어차피 새롭게 필드를 구성해도
//      up casting되기 때문에 의미가 없다.
//      따라서 rpg객체는 Game(부모)타입이지만, 구현체인 자식값(익명 클래스)이 들어간 up casting이다.
//      한 번만 구현하고(일회성) 계속 사용만 하기 때문에 굳이 새로운 클래스를 만들어서 구현체로 사용할 필요가 없다.
      Game rpg = new Game() {
         
         @Override
         public void play() {
            System.out.println("실행하기");
         }
         
         @Override
         public void exit() {
            System.out.println("종료하기");
         }
      };
      
      rpg.play();
   }
}
