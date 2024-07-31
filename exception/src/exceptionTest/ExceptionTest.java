package exceptionTest;

//Exception 상속: 컴파일러가 페크(컴파일 오류), 강제종료 하기 싫다!
//RunTimeException 상속: 컴파일러가 체크하지 않음(빌드 오류 또는 런타임 오류), 강제 종료 해야한다!

public class ExceptionTest {
	public static void main(String[] args) throws BadWordException {
//		int[] arData = new int[5];
//
//		try {
//			arData[5] = 100;
//		} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("인덱스를 다시 확인해주세요.");
//		}
//		System.out.println("무조건 실행할 문장");

//		try {
//			System.out.println(10 / 0);
//			
//		} catch (ArithmeticException e) {
//			System.out.println("");
//		}
//		System.out.println("무조건 실행해야 하는 문장");
		boolean test = true;
		if (test) {
			throw new BadWordException();
		}
		System.out.println("반드시 실행할 문장");
	}
}
