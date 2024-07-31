package stringTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {

//		검색: JAVA에서 문자열값에서 뒤에서부터 검색하는 방법
//		처음보는 것이라도 그거까지 다 알아내자!!

//		 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//		대문자는 모두 소문자로 변경한다.
//		입력받을 변수 초기화
		String input = "";
		String output = "";
		char word;
//		입력받은 문자열이 들어갈 배열 선언 및 초기화
		String[] wordData = null;
//		입력상태로 만들기 위해 Scanner 사용
		Scanner sc = new Scanner(System.in);
//		사용자에게 보여줄 문자 변수에 저장
		String message = "영어로 문자열을 하나 입력해주세요.\n 예) abcd ";
//		사용자에게 메시지 출력
		System.out.println(message);
//		사용자에게 받은 값을 저장
		input = sc.next();
		for (int i = 0; i < input.length(); i++) {
// 		word에 입력받은 문자열을 문자로 가져와서 저장
			word = input.charAt(i);
//			만약 word가 65 보다 크고 90보다 작다면(아스키 코드에서 대문자) input에 있는 word를 소문자로 변경  후 output의 저장
			if ((word > 65) && (word < 90)) {
				output = input.valueOf(word).toLowerCase();
//			만약 word가 97보다 크고 122보다 작다면 (아스키 코드에서 소문자) input에 있는 word를 대문자로 변경 후 output의 저장
			}
			if ((word > 97) && (word < 122)) {
				output = input.valueOf(word).toUpperCase();
//			다 아니라면 "잘못 입력하셨습니다" 출력
			} else {
				System.out.print(input);
			}
////			else문을 제외한 if문의 조건이 맞다면 output
//			System.out.print(output);
//		}
			
			
//      정수를 한글로 변경한다.
//      입력 예) 1024
//      출력 예) 일공이사
//      String message = "정수 입력: ";
//      Scanner sc = new Scanner(System.in);
//      String data = null;
////      int number = 0;
//      String hangle = "공일이삼사오육칠팔구";
//      String result = "";
//            
//      System.out.println(message);
//      data = sc.next();
//      
//      for (int i = 0; i < data.length(); i++) {
//         result += hangle.charAt(data.charAt(i) - 48);
//      }
//      
//      System.out.println(result);

//      number = sc.nextInt();
//      
//      while(number != 0) {
//         result = hangle.charAt(number % 10) + result;
//         number /= 10;
//      }
//      
//      System.out.println(result);

//      한글을 정수로 변경한다.
//      입력 예) 일공이사
//      출력 예) 1024
//      String hangle = "공일이삼사오육칠팔구";
//      String message = "정수를 한글로 입력: ";
//      Scanner sc = new Scanner(System.in);
//      String data = null;
//      String temp = "";
//      int result = 0;
//      
//      System.out.println(message);
//      data = sc.next();
//      
//      for (int i = 0; i < data.length(); i++) {
//         temp += hangle.indexOf(data.charAt(i));
//      }
//      
//      result = Integer.parseInt(temp);
//      System.out.println(result);

//      아래의 주소에서 "/news"만 분리하여 출력한다.
//      www.naver.com/news

//      String data = "www.naver.com/news";
//      int fromIndex = data.indexOf("/");
//      String result = data.substring(fromIndex);
//      
//      System.out.println(result);
		}
	}

}
