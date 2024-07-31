package arrayTest;

import java.util.Scanner;

public class ArrayPrac1 {
	public static void main(String[] args) {
//		인당 문제 1개 만들고 공유
//		다른 팀원 문제 모두 풀고 공유
//		강사님 코드 주석 달기

//	 	사용자에게 5개의 수를 입력받고 배열에 담은 후 입력한 정수들의 합을 구한 후 출력
//		int[] arr1 = new int[5];
//		Scanner sc = new Scanner(System.in);
//		String message = "5개의 정수를 입력하세요.\n 예) 1 2 3 4 5";
//		System.out.println(message);
//		
//		int sum = 0;
//		for (int i = 0; i < arr1.length; i++) {
//			arr1[i] = sc.nextInt();
//			sum += arr1[i];
//		}
//		System.out.println("입력하신 정수의 합은 " + sum + " 입니다.");
//
//

//      승민님 문제 1
//      사용자에게 5개의 실수를 입력받아서 배열에 담은 후 총합을 출력하기 
//      ex) 
//      입력: 1.0, 2.0, 5.0, 7.0. 11.0
//      출력: 26.0
//		배열 설정 및 초기화
//		double[] arr2 = new double[5];
//		입력상태로 만들기 위해 Scanner 사용
//		Scanner sc = new Scanner(System.in);
//		사용자에게 보여줄 메시지 변수에 저장
//		String message = "5개의 실수를 입력해주세요.\n 예) 1.0 2.0 5.0 7.0 11.0 ";
//		사용자에게 메시지 출력
//		System.out.println(message);
//		실수의 합을 넣을 변수 설정 및 초기화
//		double sum = 0.0;
//		사용자에게 입력받은 5 개의 값을 실수로 추출 후 변수를 사용하여 더함
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i] = sc.nextDouble();
//			sum +=arr2[i];
//		}
//		사용자에게 결과 출력
//		System.out.println("입력하신 실수의 합은" + sum + "입니다");

//		승민님 문제2
//      사용자에게 5개의 문자열을 입력받아서 배열에 담은 후 한 단어로 만들어 출력하기 
//      ex)
//      입력: a, bc, def, gh, i
//      출력: abcdefghi
//		5개의 문자열을 담을 배열 선언
//		String[] arr3 = new String[5];
//		입력상태로 만들기 위해 Scanner 사용
//		Scanner sc = new Scanner(System.in);
//		사용자에게 출력할 메시지 변수에 저장
//		String message = "5개의 문자열을 입력해주세요.\n 예) a bc def gh i";
//		메시지 출력
//		System.out.println(message);
//		입력받은 문자의 합을 저장할 변수 설정 안보이게 하기 위해 빈 문자열로 초기화
//		String sum = ""; 
//		배열의 각 요소에 대해 반복
//		for (int i = 0; i < arr3.length; i++) {
//		사용자가 입력한 문자열을 배열에 저장
//			arr3[i] = sc.next();
//		입력된 문자열을 배열에 저장
//			sum += arr3[i];
//		}
//		사용자에게 결과값 출력
//		System.out.println(sum);

//			

// 주현님 문제
//  10 ~ 1까지 홀수만 배열에 담고 출력
//		10개 이기 때문에 크기가 10인 배열 선언
//      int[] arData = new int[10];
//      배열에 10부터 1까지의 값을 할당
//      for (int i = 0; i < arData.length; i++) {
//		1~10까지 저장
//         arData[i] = (10 - i);
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//		현재 배열의 값이 홀수인지 확인
//    	  if(arData[i] % 2 == 1) {
//		맞다면 홀수인 값 출력
//    		  System.out.println(arData[i]);   		  
//    	  }
//         
//      }
//		

// 아영님 문제   
//1 ~ 30까지 배열에 담은 후 짝수만 출력하세요	
//		크기가 30인 배열 선언
//		int[] arData = new int[30];
//		배열에 1~30까지의 값을 할당
//		for(int i = 0; i<arData.length; i++) {
//		1~30까지 값을 배열에 저장
//			arData[i] = i+1;
//		}
//		
//		for(int i = 0; i<arData.length; i++) {
//		현재 배열의 값이 짝수인지 확인
//			if(arData[i] % 2 == 0) {
//		맞다면 짝수인 값 출력
//				System.out.println(arData[i]);
//			}
	}

}
