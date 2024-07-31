package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	Bank[][] arrBank = new Bank[3][100];
	int[] arCount = new int[arrBank.length];

	public static void main(String[] args) {
		String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
		String menu = "1. 계좌 개설\n" + "2. 입금하기\n" + "3. 출금하기\n" + "4. 잔액조회\n"
				+ "5. 계좌번호 찾기(새로운 계좌발급, 핸드폰 번호로 서비스 이용가능)\n" + "6. 은행 선택 메뉴로 돌아가기";
//		Ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int choice = 0;
		int bankNumber = 0;

		while (true) {
			System.out.println(message);
			bankNumber = sc.nextInt();

			if (bankNumber == 4) {
				System.out.println("종료되었습니다.");
				break;
			}

			bankNumber--;

			while (true) {
				System.out.println(menu);
				choice = sc.nextInt();

				if (choice == 6) {
					System.out.println("종료되었습니다.");
					break;
				}
				switch (choice) {

				case 1:
					
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;

				}
			}
		}

	}


	}

