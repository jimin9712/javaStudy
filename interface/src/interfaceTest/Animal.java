package interfaceTest;

public interface Animal {
//	상수와 추상 메소드만 존재한다.
	/*final static*/ int eyes = 2;
	final static int nose = 1;
	
	void showHands();
	abstract void sitDown();
	abstract void poop();
	abstract void waitNow();
	
}
