package wrapperTest;

public class WrapperTask {
	public static void main(String[] args) {
//		1,3.56,'A', false, "ABC"
//		위위 5개 값을 각각의 자료형을 유지한채로 하나의 배열에 모두 담는다.
		Object[] arData = { 1, 3.56, 'A', false, "ABC" };

		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);

		}

	}

}
