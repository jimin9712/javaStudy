package interfaceTest;

//			구현체
public class Puppy implements Animal {

	@Override
	public void showHands() {
		// TODO Auto-generated method stub
		System.out.println("멍!");
	}

	@Override
	public void sitDown() {
		System.out.println("멍멍!");

	}

	@Override
	public void poop() {
		System.out.println("머~엉!");

	}

	@Override
	public void waitNow() {
		System.out.println("멍멍멍!");

	}

}
