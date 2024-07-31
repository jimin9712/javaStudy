package controllStatementTest;

public class ForTest {
	public static void main(String[] args) {
//		이름 10번 출력

//		for(int i = 0; i<10; i++) {
//			if(i< 9) {
//				System.out.print(" ");
//			}
//			System.out.println(i + 1 +" 이지민");
//		}
//		
		for (int i = 0; i < 10; i++) {
//			10부터 i값을 뺀 값과 이름 출력
			System.out.println(10 - i + ". 이지민");
			if (i < 10) {
				System.out.print(" ");
			}
		}
	}

}
