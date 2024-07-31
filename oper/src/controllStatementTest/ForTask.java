package controllStatementTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {

//		브론즈
//		1~100까지 출력
//		1부터 100까지 출력이므로 i의 자료값을 int, 초기값을 0으로 설정 후 100까지, 1씩 증가하므로 i++
//		0부터 100까지인데 하나 부족하므로 i+1을 출력
//		for(int i = 0; i<100; i++) {
//			System.out.println(i+1);
//		}

////		100~1까지 출력
//		for(int i = 0; i<100; i++) {
//		100-i 출력
//			System.out.println(100-i);
//		}
//		1~100까지 중 짝수만 출력
//		for(int i = 2; i<50; i++) {
//			System.out.print(2*(i+1));
//		}
// =========================================================
//		실버
//		1~10까지 합 출력
//		int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            sum += i+1;
//        }
//        System.out.println(sum);

//		1~n까지 합 출력 n은 사용자에게 입력받는다.	

//		Scanner sc = new Scanner(System.in);
//		System.out.println("n값을 입력하세요: ");
//		int n = sc.nextInt();
//		int sum = 0;
//		for (int i = 1; i<= n; i ++) {
//			sum += i;
//		}
//		System.out.println(sum);
// =========================================================
//		골드
//		A~F까지 출력
//		for (char c = 'A'; c <= 'F'; c++) {
//			System.out.print(c + " ");
//		}
//		
//		for (int i = 0; i<6; i++) {
//			System.out.print((char)(65 + i) + " ");
//		}
//		

//		A~F까지 중 C 제외하고 출력(contunue) 사용하지 않기	
//		for (char c = 'A'; c <= 'F'; c++) {
//			if (c != 'C') {
//				System.out.println(c + " ");
//			}
//			else {
//				System.out.println(" ");
//			}
//		}
//		====강사님 코드======
//		for(int i = 0; i < 5; i++) {
//			System.out.println((char)(i> 1 ? i + 66 : i + 65));
//		}
// =========================================================		
//      다이아
//      0 1 2 3 0 1 2 3 0 1 2 3 출력
//		0 1 2 3이 나머지로 나오는 값을 12
//		for (int i = 0; i< 12; i++) {
//			System.out.print(i % 4 + " ");		
//		}

//      aBcDeFgH...Z 출력
//      알파벳은 총 26개			

		// 'A'부터 'Z'까지의 문자를 반복
//		for (char c = 'A'; c <= 'Z'; c++) {
//			// 'A'로부터의 차이가 짝수인지 확인
//			if ((c - 'A') % 2 == 0) {
//				// 짝수인 경우 소문자로 변환하여 출력
//				System.out.print(Character.toLowerCase(c));
//			} else {
//				// 홀수인 경우 대문자로 그대로 출력
//				System.out.print(c);
//			}
//		}
//		System.out.println(); // 줄바꿈을 위해 추가

		// 0부터 25까지의 숫자를 반복
//		for (char c = 0; c < 26; c++) {
//			// 숫자가 짝수인지 확인
//			if (c % 2 == 0) {
//				// 짝수인 경우 소문자로 변환하여 출력
//				System.out.print((char) (c + 97)); // 97은 'a'의 아스키 코드 값
//			} else {
//				// 홀수인 경우 대문자로 변환하여 출력합니다.
//				System.out.print((char) (c + 65)); // 65는 'A'의 아스키 코드 값
//			}
//		}
	}
}
