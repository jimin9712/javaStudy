package inheritanceTest;

class Animal {
	String name;
	int age;
	String feed;

// 기본 생성자를 만드는 이유: 이렇게 해야 상속할 때 자잘한 오류가 안난다.
	public Animal() {
		;
	}

//	animal의 생성자
	public Animal(String name, int age, String feed) {
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
// 동물들의 기본 메소드 (부모 클래스의 기본 메소드)
	void walk() {
		System.out.println("걷기");
	}

	void run() {
		System.out.println("뛰기");
	}

	void eat() {
		System.out.println("먹기");
	}
}

// Lion 클래스가 Animal 클래스를 부모로 받아온다 , Lion 클래스가 자식 클래스
class Lion extends Animal {
	public Lion() {
		;
	}
//	animal 클래스 + lion의 메소드
	void hunt() {
		System.out.println("사냥하기");
	}

//	재정의할 부모의 메소드 이름을 적당히 작성한 뒤 Ctrl + space 입력
//	@Override 반드시 써주는 게 좋다!
	@Override // 어노테이션
	void walk() {
//		부모 클래스에 같은 메소드를 받아올 수 있으면 받아오자!
//		lion 클래스도 걷기가 있지만 네 발로만 더 있으면 되므로 super.walk로 animal에서 walk 메소드를 받아온다.
		System.out.println("네 발로");
		super.walk();
	}
}

public class InheritacneTest2 {
	public static void main(String[] args) {
		Lion lion = new Lion();
//		-> 네 발로 걷기 출력됨
		lion.walk();
		lion.run();
		lion.hunt();
	}
}