package threadTest;

public class Thread3 implements Runnable {

//   public boolean isBreak;

	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName());
//         try {
//            Thread.sleep(1000);
//         } catch (InterruptedException e) {
//            break;
//         }

//         isInterrupted를 사용할 때에는 다른 일시정지 코드가 없어야 한다.
//         객체로 접근할 때에는 isInterrupted()를 사용하고
//         클래스로 접근할 때에는 interrupted()를 사용한다.
//         if(Thread.currentThread().isInterrupted()) {
			if (Thread.interrupted()) {
//         두 번 interrupt()를 사용하면, 다시 false로 변경된다.
				break;
			}

//         if(isBreak) {
//            break;
//         }
		}
	}

}
