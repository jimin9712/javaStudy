package operTest;

public class OperTest1 {
	public static void main(String[] args) {
//		논리형인 isTrue 라는 변수에 10==11이라는 값(false)를 저장
		boolean isTrue = 10 == 11;
//		논리형인 result라는 변수에 isTrue && 10<=20 즉, false && true 를 저장
		boolean result = isTrue && 10<=20;
		
//		10 == 11 의 결과값 출력
		System.out.println(10 == 11);
//		10> 3의 결과값 출력
		System.out.println(10 > 3);
//		isTrue의 결과값 출력
		System.out.println(isTrue);
		
		System.out.println("===============================");
//		result의 결과값 출력
		System.out.println(result);
		
		System.out.println("===============================");
//      isTrue && 10 <= 20 의 결과를 true가 나오게 변경하기
//		isTrue -> 10==11이기 때문에 false 지만 !를 사용하게 되면 true가 됨 true가 됐을 때 10<=20 과 AND 연산한 결과값을 출력
		System.out.println(!isTrue && 10 <= 20);
//		false 와 true의 OR 연산 결과값 출력 
		System.out.println(isTrue || 10 <= 20);
	}
}
