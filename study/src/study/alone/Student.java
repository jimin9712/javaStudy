package study.alone;

public class Student extends Person implements StudyAble {
	public Student() {
	}

	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	public void Study() {
		System.out.println(getName() + "은 열심히 공부 중입니다!");
	}

//	Person을 상속 받고 Person에 있는 introduce 메소드 재정의 해서 사용
	@Override
	public void introduce() {
		System.out.println("안녕하세요 저는 " + getName() + "이고 " + getAge() + " 살입니다!");
	}
}
