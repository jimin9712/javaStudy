package myjob;

import java.util.Scanner;

public class MyjobTest {
	public static void main(String[] args) {
//		사용자에게 보여줄 메시지를 변수에 저장
		String title = "승부차기";
		String message = "1. 승부차기 시작 \n2. 정보확인 \n3.종료";
//		입력상태로 만들기 위해 Scanner 사용
		Scanner sc = new Scanner(System.in);
//		3회 연속 성공 시 이적할 팀 설정(rank)
		String arRank[] = { "FC서울", "첼시", "레알마드리드" };
		Myjob Lee = new Myjob("용호중", 0, 70, 0);
//		변수 초기화
		int choice = 0;
		int successCount = 0, failCount = 0;
//		메뉴 창이 계속 돌아야 하므로 while문 사용
		while (true) {
//			title 출력
			System.out.println(title);
//			message 출력
			System.out.println(message);
//			받은 값을 정수값으로 받고 choice에 저장
			choice = sc.nextInt();
//			3. 종료 이므로 3을 입력 시 while문 종료
			if (choice == 3) {
				break;
			}

			switch (choice) {
			case 1:
//			1번을 골랐다면 팬 백만명 추가 , 성공횟수 1회 추가, 연속성공횟수 1회 추가, 3회 연속 성공 시 다음 팀으로 이적
//			3번 성공 후 다음 팀으로 이적 성공했다면, 다시 연속 성공횟수 초기화
				if (Lee.goal()) {
					Lee.fan += 10_000_000;
					Lee.successCount++;
					successCount++;
					failCount = 0;

					System.out.println("★☆★☆★☆★☆★☆승부차기 성공!!★☆★☆★☆★☆★☆");
					System.out.println("현재 연속 " + successCount + "회 성공중!");
					if (successCount >= 3) {
						if (Lee.rank < 2) {
							Lee.rank++;
							System.out.println(arRank[Lee.rank] + "(으)로 이적!!! 축하합니다!");
							successCount = 0;
						}
					}
					break;
				}
//				그게 아니라면 (실패 시) 팬 수 절반으로 감소, 실패횟수 1회 추가, 연속 실패횟수 1회 추가, 2회 연속 실패 시 다음 팀으로 강등
//				다음 팀으로 강등 되었다면, 연속 실패 횟수 초기화
				Lee.fan /= 2;
				Lee.failCount++;
				failCount++;
				successCount = 0;
				System.out.println("실패...");
				System.out.println("위험!! 현재 연속 " + failCount + "회 실패중!");
				if (failCount >= 2) {
					if (Lee.rank > 0) {
						Lee.rank--;
						System.out.println(arRank[Lee.rank] + "(으)로 복귀 분발하세요!");
						failCount = 0;
					}
				}

				break;
//				2번을 고르면 printInfo 출력 현재 팀도 보여주고 싶어서 arRank 사용
			case 2:
				Lee.printInfo(arRank);
				break;
			}

		}
	}
}