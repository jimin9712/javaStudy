package printTest;

public class PrintTest {
	public static void main(String[] args) {
		
//		주석 (CTRL + /)
//		1. 소스코드에 설명글을 작성할 때
//		2. 지금 당장 사용하지 않는 코드를 번역하고 싶지 않을 때
		
//		범위 주석 (CTRL + SHIFT + /, CTRL + SHIFT + \)
		/*
		 * 코드 중간에 있는 부분을 주석처리할 때
		 */
		
		
//		제어 문자
//		반드시 따옴표 안에서 작성한다.
		
//		\n: new line, 줄바꿈, 개행 문자
//		\t: tab, 위 아래 줄 간격 맞춰 띄기
//		\": 쌍 따옴표 표현
//		\': 작은 따옴표 표현
//		\\
		
//		 이름을 출력하는 부분
//		System.out.print("\"한동석\"\n");
		
//		 나이를 출력하는 부분
//		System.out.println("20살");
		
//		System.out.print("\\n을 사용하면 줄바꿈할 수 있습니다.");
		
//		서식 문자
//		반드시 따옴표 안에 작성한다.
		
//		%d	: decimal 10진수 정수
//		%o	: octal 8진수 정수
//		%x	: hexadecimal 16진수 정수
//		%f	: float 실수
//		%c	: character 문자
//		%s	: string 문자열
		
		String name = "한동석";
		int age = 20;
		
		System.out.printf("%s님 %d살", name, age);
		
		
	}
}

















