package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
//		LambdaInter lambdaInter = n -> n % 10 == 0;

		LambdaInter lambdaInter = (number) -> number % 10 == 0;

		System.out.println(lambdaInter.checkMultipleOf10(900));
	}

}
