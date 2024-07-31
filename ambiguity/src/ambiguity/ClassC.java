package ambiguity;

public class ClassC implements InterA, InterB {
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		InterA.super.printName();
	}
	public static void main(String[] args) {
		new ClassC().printName();
	}

	}
