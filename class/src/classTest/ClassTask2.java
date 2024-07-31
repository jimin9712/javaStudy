//
//package classTest;
//
//import java.util.Scanner;
//
//public class ClassTask2 {
//
//    public static void main(String[] args) {
////    	화면
////    	학생의 점수를 입력받은 뒤 총점과 평균을 구한다
////    	학생의 점수는 생성자로 초기화
////    	모든 학생은 공통적으로 총점과 평균을 알 수 있다.
//        Scanner sc = new Scanner(System.in);
////        String message = "번호와 점수를 순서대로 입력하세요";
////        String message2 = "예)1 100 90 80";
//
//        System.out.println("학생번호: ");
//        int studentId = sc.nextInt();
//        
//        System.out.println("국어점수: ");
//        int koreanScore = sc.nextInt();
//        
//        System.out.println("영어점수: ");
//        int englishScore = sc.nextInt();
//        
//        System.out.println("수학점수: ");
//        int mathScore = sc.nextInt();
//        
////        Student student = new Student(20, 100, 16, 70);
////        Student leejimin = new Student(21, 100, 50, 15);
////
////        System.out.println("총점: "+student.getTotalScore());
////        System.out.println("펑균: "+ student.getAvgScore());
////        
////        System.out.println("총점: "+leejimin.getTotalScore());
////        System.out.println("펑균: "+ leejimin.getAvgScore());
//    }
//}

package classTest;

import java.util.Scanner;

public class ClassTask2 {
	public static void main(String[] args) {
//      화면
//      학생의 점수를 입력받은 뒤 총점과 평균을 출력한다.
//      학생의 점수는 생성자로 초기화 한다.
//      모든 학생은 공통적으로 총점과 평균을 구할 수 있다.
//      Scanner sc = new Scanner(System.in);
//      String message = "번호 국어 영어 수학 점수를 순서대로 입력하세요";
//      String example = "예)3 100 20 50";
//      int id = 0, kor = 0, eng = 0, math = 0;
//      Student ted = null;
//      
//      System.out.println(message + "\n" + example);
//      id = sc.nextInt();
//      kor = sc.nextInt();
//      eng = sc.nextInt();
//      math = sc.nextInt();
//      
//      ted = new Student(id, kor, math, eng);
//      
//      System.out.println("총점: " + ted.total);
//      System.out.println("평균: " + ted.average);
//      사용자에게 보여줄 메시지와 예시 변수에 저장
		String message = "번호 국어 영어 수학 점수를 순서대로 입력하세요";
		String example = "예)3 100 20 50";
//		입력상태로 만들기 위해 Scanner 사용
		Scanner sc = new Scanner(System.in);
//		학생 번호, 국어 점수, 영어 점수, 수학 점수 초기화
		int id = 0, kor = 0, eng = 0, math = 0;
//		과목을 넣을 배열 초기화
		Subject[] arSubject = null;
		Student ted = null;
//		사용자에게 각 점수와 학생번호를 입력받고 입력받은 값을 정수값으로 받음
		System.out.println(message + "\n" + example);
		id = sc.nextInt();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
//		과목 배열 설정
		arSubject = new Subject[] { new Subject("국어", kor), new Subject("영어", eng), new Subject("수학", math), };

		ted = new Student(id, arSubject);

		System.out.println("총점: " + ted.total);
		System.out.println("평균: " + ted.average);

	}
}
