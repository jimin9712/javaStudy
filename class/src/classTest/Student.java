//package classTest;
//
//public class Student {
////	학생번호
//	int studentId;
////  국어점수
//	int koreanScore;
////  영어점수
//	int englishScore;
////	수학점수
//	int mathScore;
//
//	public Student(int studentNum, int koreanScore, 
//			int englishScore, int mathScore) {
//		this.studentId = studentNum;
//		this.koreanScore = koreanScore;
//		this.englishScore = englishScore;
//		this.mathScore = mathScore;
//	}
//
//	int getTotalScore() {
//		return koreanScore + englishScore + mathScore;
//	}
//
//	double getAvgScore() {
//		return getTotalScore() / 3.0;
//	}
//}

package classTest;

public class Student {
//   학생 번호
	int id;
////   국어 점수
//   int kor;
////   수학 점수
//   int math;
////   영어 점수
//   int eng;

//   과목
	Subject[] arSubject;

//   총점
	int total;
//   평균
	double average;

//   Student 클래스의 생성자
	public Student(int id, Subject[] arSubject) {
//	   전달 받은 id와 과목 인스턴스 변수에 저장
		this.id = id;
		this.arSubject = arSubject;
//      총 점수를 계산하기 위해 Subject 배열의 각 요소를 반복
		for (int i = 0; i < arSubject.length; i++) {
//    	  각 점수를 모두 합하면 total이 되게 함
			this.total += arSubject[i].score;
		}
//		total을 Subject 배열의 길이로 나누어 평균을 구함
		this.average = (double) this.total / arSubject.length;

	}

//   public Student(int id, int kor, int math, int eng) {
//      this.id = id;
//      this.kor = kor;
//      this.math = math;
//      this.eng = eng;
//      this.total = kor + math + eng;
//      this.average = total / 3.0;
//   }

}
