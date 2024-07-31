package inheritanceTest;

// 부모 클래스
class A {
	String name;
	int age;

	public A() {
		System.out.println("부모 생성자 호출");
	}

	public A(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}

}

// 자식 클래스
class B extends A {
	public B() {
		super();
		System.out.println("자식 생성자 호출");
	}

	public B(String name, int age) {
		super(name, age);
	}
}

public class InheritacneTest1 {
	public static void main(String[] args) {
		B b = new B("이지민", 20);
		System.out.println(b.name);
		System.out.println(b.age);
		b.printInfo();
	}
}
