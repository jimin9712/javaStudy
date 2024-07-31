package ambiguity;

public class ClassB extends ClassA implements InterA{
	
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		InterA.super.printName();
	}
	public static void main(String[] args) {
		new ClassB().printName();
//		클래스와 인터페이스 간의 우선순위는 클래스가 훨씬 높다.
//		
	}
	 
		
}
