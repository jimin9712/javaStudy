package inputTest;
import java.util.Scanner;
// Scanner에서 커서를 맨 뒤에 두고 자동완성하면 생김

public class InputTest1 {
	public static void main(String[] args) {
//		초기값 : 아직 어떤 값을 넣을지 모를 때 넣은 값
//		정수: 0
//		실수: 0.0
//		문자: ' ' <- 공백
//		문자열: null
//		Scanner sc = new Scanner(System.in);
//		String name = null;
//		System.out.print("이름을 입력하세요. : ");
//		name = sc.next(); //사용자가 입력한 문자열값까지 가져와줌
//		System.out.println(name + "님 환영합니다!");
		
		Scanner sc = new Scanner(System.in);
		String lastName = null, firstName = null;
		System.out.print("이름 입력 : ");
		lastName = sc.next(); 
		firstName = sc.next(); 
		System.out.println(lastName +  firstName  + "님 환영합니다!");
	}

}
