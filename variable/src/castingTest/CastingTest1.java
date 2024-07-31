package castingTest;

public class CastingTest1 {
	public static void main(String[] args) {
//		자동 형변환
		System.out.println(5/2);
		System.out.println(5/2.0);
		System.out.println("======================================");
//		강제 형변환
		System.out.println((double)5 / 2);
		System.out.println((int)2.9 + 5);
		
//		8.43 + 2.59 = 10 가 나오게 형변환 해보자!
		double number1 = 8.43;
		double number2 = 2.59;
		System.out.println((int)number1 + (int)number2);
	}

}
