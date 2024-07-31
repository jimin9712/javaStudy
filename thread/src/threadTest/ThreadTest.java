package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
//      자원 1개와 쓰레드 1개를 2쌍 선언
//      쓰레드는 각자의 자원에 접근
//      Thread1 thread1 = new Thread1("?", "쓰레드1");
//      Thread1 thread2 = new Thread1("!", "쓰레드2");
//      
//      System.out.println(thread1.getName());
//      System.out.println(thread2.getName());

//      start()는 Thread 클래스에만 있다.
//      thread1.start();
//      thread2.start();
//      
//      System.out.println("메인 쓰레드 종료");

//      #######################################################

////      자원 1개 선언
//      Thread2 resource = new Thread2();
//      
////      쓰레드 2개 선언
////      한 개의 자원을 여러 쓰레드가 공유
//      Thread thread1 = new Thread(resource, "★");
//      Thread thread2 = new Thread(resource, "♥");
//      Thread thread3 = new Thread(resource, "♣");
//      
//      thread1.start();
//      
//      try {
////         join을 사용한 쓰레드가 끝나고 나서 나머지 쓰레드가 실행된다.
////         단, 이미 join()전에 start()된 쓰레드를 멈출 수 없다.
//         thread1.join();
//      } catch (InterruptedException e) {;}
//      
//      thread2.start();
//      thread3.start();

//      #######################################################

		Thread3 resource = new Thread3();
		Thread thread = new Thread(resource);

		thread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			;
		}
//      resource.isBreak = true;
//      thread.interrupt();

//      System.exit(0);
	}
}
