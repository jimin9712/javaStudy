package study.alone;

//종합 문제: 학생 관리 시스템
//요구 사항
//배열과 제어문
//학생 정보를 저장하는 배열을 만드세요. 배열에는 Student 객체가 저장됩니다.
//배열을 순회하면서 모든 학생의 정보를 출력하세요.
//메소드
//학생의 이름과 나이를 입력 받아 Student 객체를 생성하는 메소드를 만드세요.
//학생 객체 배열을 매개변수로 받아서 모든 학생의 평균 나이를 반환하는 메소드를 만드세요.
//클래스
//Student 클래스를 만드세요. 필드는 name과 age를 포함합니다.
//기본 생성자와 초기화 생성자, getter, setter, toString, hashCode, equals 메소드를 작성하세요.
//상속
//Person 클래스를 만들고 Student 클래스가 이를 상속받도록 하세요.
//Person 클래스에 기본적인 메소드(introduce 등)를 정의하고 Student 클래스에서 이를 재정의하세요.
//캐스팅
//Person 타입의 배열을 만들고 Student 객체를 추가한 후 다시 Student 타입으로 캐스팅하여 사용하세요.
//인터페이스
//Studyable 인터페이스를 만들고 study 메소드를 정의하세요. Student 클래스가 이 인터페이스를 구현하도록 하세요.
public class StudentManagementSystem {

	public static Student createStudent(String name, int age) {
		return new Student(name, age);
	}

// 화면
	public static void main(String[] args) {
		Student[] students = { createStudent("이지민", 23), createStudent("용호중", 24), createStudent("이세찬", 25) };

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);

		}

		Person[] people = students;
		for (int i = 0; i < people.length; i++) {
			people[i].introduce();
			if (people[i] instanceof Student) {
				((Student) people[i]).Study();
			}
		}

	}
}
