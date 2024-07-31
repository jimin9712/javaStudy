package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
//		2차원 배열(3행 100열)
		Bank[][] arrBank = new Bank[3][100];
		int[] arCount = new int[arrBank.length];
		String[] arBankName = { "신한은행", "국민은행", "카카오뱅크" };

		String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
		String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";
//		Ctrl + Shift + o: 자동 import 및 사용하지 않는 import 삭제
		Scanner sc = new Scanner(System.in);

		int bankNumber = 0, choice = 0, myBankNumber = 0;
		String account = null, password = null, phone = null, name = null;
		Bank user = null;
		int money = 0, withdrawMoney = 0;
		Random random = new Random();
		int passwordCheck = 0, phoneCheck = 0;

		String accountMessage = "계좌번호: ";
		String nameMessage = "예금주: ";
		String passwordMessage = "비밀번호(4자리): ";
		String phoneMessage = "핸드폰번호(- 제외): ";
		String depositMessage = "입금액: ";
		String withdrawMessage = "출금액: ";
		String errorMessage = "다시 시도해주세요.";
		String loginFailMessage = "계좌번호 혹은 비밀번호를 다시 확인해주세요.";

		while (true) {
			System.out.println(message);
			bankNumber = sc.nextInt();

			if (bankNumber == 4) {
				break;
			}

			bankNumber--;

			while (true) {
				System.out.println(menu);
				choice = sc.nextInt();

				if (choice == 6) {
					break;
				}

				switch (choice) {
				case 1: // 계좌개설
					Bank[] arBank = { new Shinhan(), new Kookmin(), new KaKao() };
					user = arBank[bankNumber];

//					계좌번호 생성
					while (true) {
						// 문자열로 변환
						account = String.valueOf(random.nextInt(90000) + 10000);
						account = bankNumber + account;
						if (Bank.checkAccount(arrBank, arCount, account) == null) {
							break;
						}
					}

//					예금주 작성
					System.out.print(nameMessage);
					name = sc.next();

//					비밀번호 작성
					while (true) {
						System.out.print(passwordMessage);
						password = sc.next();
						passwordCheck = 0;

						if (password.length() == 4) {
							for (int i = 0; i < password.length(); i++) {
								char c = password.charAt(i);
								if (c >= 48 && c <= 57) {
									passwordCheck++;
								}
							}

							if (passwordCheck == 4) {
								break;
							}
						}
					}

//					핸드폰 번호 작성
					while (true) {
						System.out.print(phoneMessage);
						phone = sc.next();
						phoneCheck = 0;

//						-가 있으면, 없애주기
						phone = phone.replaceAll("-", "");

						if (phone.length() == 11) {
							for (int i = 0; i < phone.length(); i++) {
								char c = phone.charAt(i);
								if (c >= 48 && c <= 57) {
									phoneCheck++;
								}
							}
							if (phoneCheck == 11) {
								if (Bank.checkPhone(arrBank, arCount, phone) == null) {
									break;
								}
							}
						}
					}

					user.setAccount(account);
					user.setName(name);
					user.setPassword(password);
					user.setPhone(phone);

					arrBank[bankNumber][arCount[bankNumber]] = user;
					arCount[bankNumber]++;

					System.out.println(arBankName[bankNumber] + " 가입을 진심으로 환영합니다!");
					System.out.println("고객님의 소중한 계좌번호: " + account);
					break;
				case 2: // 입금하기
					System.out.print(accountMessage);
					account = sc.next();

					System.out.print(passwordMessage);
					password = sc.next();

					user = Bank.login(arrBank, arCount, account, password);

//					입금 서비스를 이용할 은행(bankNumber)이 계좌를 개설한 은행(charAt(0))이라면,
					if (user != null) {
						myBankNumber = user.getAccount().charAt(0) - 48;
						if (myBankNumber == bankNumber) {
							System.out.print(depositMessage);
							money = sc.nextInt();

							if (money > 0) {
								user.deposit(money);
								System.out.println("현재 잔액: " + user.showBalance() + "원");

							} else {
								System.out.println(errorMessage);

							}
						} else {
							System.out.println(arBankName[myBankNumber] + " 은행에서만 입금 서비스를 이용하실 수 있습니다.");
						}
					} else {
						System.out.println(loginFailMessage);
					}

					break;
				case 3: // 출금하기
					System.out.print(accountMessage);
					account = sc.next();

					System.out.print(passwordMessage);
					password = sc.next();

					user = Bank.login(arrBank, arCount, account, password);
					if (user != null) {
						System.out.print(withdrawMessage);
						money = sc.nextInt();

						withdrawMoney = user instanceof Kookmin ? (int) (money * 1.5) : money;

						if (money > 0) {
							if (withdrawMoney <= user.getMoney()) {
								user.withdraw(money);
								System.out.println("현재 잔액: " + user.showBalance() + "원");

							} else {
								System.out.println(errorMessage);

							}
						} else {
							System.out.println(errorMessage);
						}
					} else {
						System.out.println(loginFailMessage);
					}
					break;
				case 4: // 잔액조회
					System.out.print(accountMessage);
					account = sc.next();

					System.out.print(passwordMessage);
					password = sc.next();

					user = Bank.login(arrBank, arCount, account, password);
					if (user != null) {
						System.out.println("현재 잔액: " + user.showBalance() + "원");
					} else {
						System.out.println(loginFailMessage);
					}
					break;
				case 5: // 계좌번호 찾기
					System.out.print(phoneMessage);
					phone = sc.next();

					System.out.print(passwordMessage);
					password = sc.next();

					user = Bank.checkPhone(arrBank, arCount, phone);
					if (user != null) {
						while (true) {
							account = String.valueOf(random.nextInt(90000) + 10000);
							account = user.getAccount().charAt(0) + account;
							if (Bank.checkAccount(arrBank, arCount, account) == null) {
								break;
							}
						}
					}

					user.setAccount(account);

					System.out.println("고객님의 소중한 계좌번호: " + account);
					break;
				default:
					System.out.println(errorMessage);
				}
			}
		}
	}
}
