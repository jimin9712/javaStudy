package interfaceTest;

public class Cat implements Animal {

	@Override
	public void showHands() {
		System.out.println("냥?");
	}

	@Override
	public void sitDown() {
		System.out.println("냥?");

	}

	@Override
	public void poop() {
		System.out.println("냥~!");

	}

	@Override
	public void waitNow() {
		System.out.println("냥냥!");

	}

}
