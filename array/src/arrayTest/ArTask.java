package arrayTest;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
//      브론즈
//      1 ~ 10까지 배열에 담고 출력
//      10번 반복하는 for문 만들기
//		10개의 배열 생성
//      int[] arData = new int[10];
//      
//      for (int i = 0; i < 10; i++) {
//		배열
//         arData[i] = i + 1;
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//		배열 출력
//         System.out.println(arData[i]);
//      }

//      10 ~ 1까지 중 짝수만 배열에 담고 출력
//		배열 생성
//      int[] arData = new int[5];
//      
//      for (int i = 0; i < arData.length; i++) {
//		5부터 출력
//         arData[i] = (5 - i) * 2;
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }

//      1 ~ 100까지 배열에 담은 후 홀수만 출력
//		배열 생성
//      int[] arData = new int[100];
//      
//      for (int i = 0; i < arData.length; i++) {
//		??
//         arData[i] = i + 1;
//      }

//      for (int i = 0; i < arData.length; i++) {
//		배열 값ㅇ 홀수인지 확인
//         if(arData[i] % 2 == 1) {
//            System.out.println(arData[i]);
//         }
//      }

//      for (int i = 0; i < 50; i++) {
//		배열 값 출력
//         System.out.println(arData[i * 2]);
//      }

//      실버
//      1 ~ 100까지 배열에 담은 후 짝수의 합 출력
//		100크기의 정수형 배열 생성
//      int[] arData = new int[100];
//		결과값 초기화
//      int result = 0;
//      i+1 깂을 배열에 저장
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//		배열에 있는 값의 크기가 짝수인지 확인
//         if (arData[i] % 2 == 0) {
//		맞다면 합에 저장
//            result += arData[i];
//         }
//      }
//      결과값 출력
//      System.out.println(result);

//      A ~ F까지 배열에 담고 출력
//		크기 6만큼의 배열 생성
//      char[] arData = new char[6];
////    
//      for (int i = 0; i < arData.length; i++) {
////    i값을 문자열로 형변환 후 배열에 저장
//         arData[i] = (char)(65 + i);
//      }
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }

//      A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
//		5개의 배열 생성
//      char[] arData = new char[5];
//      
//      for (int i = 0; i < arData.length; i++) {
//		삼항연산 후 문자열 형변환 후 배열에 저장
//         arData[i] = (char)(i > 1 ? 66 + i : 65 + i);
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//		배열 값 출력
//         System.out.println(arData[i]);
//      }

////      골드
////      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
////      비교하기 위해서는 항이 2개가 필요하다.
////		입력상태로 만들기 위해 Scanner 사용
//		Scanner sc = new Scanner(System.in);
////      5개 크기의 배열을 arData에 저장
//		int[] arData = new int[5];
////		사용자에게 출력할 메시지를 변수에 저장
//		String message = "5개의 정수를 입력하세요.\n예)1 3 2 4 6";
////		최소값과 최대값을 받을 변수 선언
//		int max = 0, min = 0;
////		사용자에게 메시지 출력
//		System.out.println(message);
////		
//		for (int i = 0; i < arData.length; i++) {
////		사용자에게 입력받은 5개의 변수를 배열에 저장
//			arData[i] = sc.nextInt();
//		}
////	입력이 끝나면, 첫번째 방에 있는 값을 max와 min에 각각 담아준다.
//		다른 값과의 비교를 위해
//		max = arData[0];
//		min = arData[0];
//
//		for (int i = 1; i < arData.length; i++) {
////		최대값 배열 탐색
//			if (max < arData[i]) {
//				max = arData[i];
//			}

////		최소값 배열 탐색
//			if (min > arData[i]) {
//				min = arData[i];
//			}
//		}
////		결과값 출력
//		System.out.println("최대값: " + max);
//		System.out.println("최소값: " + min);

//      다이아
//      사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 다시 입력받는다.
//      입력한 정수들의 평균값을 구한다.
//	    정수를 담을 배열 선언
		int[] arData = null;
//      입력상태로 만들기 위해 Scanner 사용
		Scanner sc = new Scanner(System.in);
//		사용자에게 보여줄 메시지 변수에 저장
		String message1 = "몇 개의 정수를 입력하시나요?";
		String message2 = "번 정수: ";

//		사용자에게 입력받을 배열의 크기와 총합을 받을 변수 선언
		int size = 0, total = 0;
//		message1 변수 출력
		System.out.println(message1);
//		입력받은 값을 정수값으로 size 에 저장
		size = sc.nextInt();
//		입력된 크기만큼 배열 할당한다. Heap 메모리에
		arData = new int[size];
//
		for (int i = 0; i < arData.length; i++) {
//		입력된 크기와 message2 출력
			System.out.print(i + 1 + message2);
//			사용자가 입력한 정수를 배열에 저장
			arData[i] = sc.nextInt();
		}

		for (int i = 0; i < arData.length; i++) {
//			배열의 값을 모두 더한 값
			total += arData[i];
		}
//		결과값 출력
		System.out.println((double) total / arData.length);
	}
}
