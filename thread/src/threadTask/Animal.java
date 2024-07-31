package threadTask;

public class Animal {
	public void makeSound(Runnable runnable) {
		String[] arSound = { "어흥", "음메", "야옹" };
		Thread[] arThread = new Thread[arSound.length];

		for (int i = 0; i < arThread.length; i++) {
			arThread[i] = new Thread(runnable, arSound[i]);
		}

		for (int i = 0; i < arThread.length; i++) {
			arThread[i].start();
			if (i != 0) {
				try {
					arThread[i].join();
				} catch (InterruptedException e) {
					;
				}
			}
		}
	}

}
