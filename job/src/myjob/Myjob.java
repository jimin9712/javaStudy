package myjob;

// Random 클래스를 사용하기 위해 사용
import java.util.Random;

public class Myjob {

	// 클래스 변수 선언
	String name;
	int successCount;
	int failCount;
	int fan;
	int rating;
	int rank;

	// Myjob 클래스의 생성자
	public Myjob(String name, int fan, int rating, int rank) {
		// 전달받은 변수를 인스턴스 변수에 할당
		this.name = name;
		this.fan = fan;
		this.rating = rating;
		this.rank = rank;
	}

	// 승부차기 성공 여부를 결정하는 메서드
	boolean goal() {
		// Random 객체 생성
		Random random = new Random();
		// 길이가 10인 배열 생성
		int[] arData = new int[10];

		// 랜덤 인덱스 초기화
		int randomIndex = 0;

		// rating 값을 기준으로 배열의 앞부분을 1로 채움
		for (int i = 0; i < rating / 10; i++) {
			arData[i] = 1;
		}

		// 0에서 arData.length 사이의 랜덤 인덱스 생성
		randomIndex = random.nextInt(arData.length);

		// 랜덤 인덱스의 값이 1이면 성공, 아니면 실패 반환
		return arData[randomIndex] == 1;
	}

	// 객체의 정보를 출력하는 메서드
//    MyjobTest에서 arRank를 받아와서 arRank의 인덱스명을 보여줌
	void printInfo(String[] arRank) {
		String infoMessage = "이름: " + this.name + "\n" + "성공횟수: " + this.successCount + "번\n" + "실패 횟수: "
				+ this.failCount + "번\n" + "현재 팬수: " + this.fan + "명\n" + "현재 팀: " + arRank[this.rank];
		// 정보 메시지를 출력
		System.out.println(infoMessage);
	}
}

// 1) 승부차기 성공
//  성공 시 70%
//      팬 100만 명 증가
//     
//  실축 시 30%
//      팬 반토막
//
//  연속 3회 성공 시
//     다음 팀으로 이적
//
//  연속 2회 실패 시
//     이전 팀으로 복귀

// 이적이나 강등 시 연속 성공 및 실패 횟수 초기화
//		
//  1-1) 등급
//     FC 서울
//     첼시
//     레알 마드리드
//
//2) 정보 보기
//  이름
//  성공 횟수
//  실패 횟수
//  현재 잔액
