package operTest;

public class OperTest6 {
	public static void main(String[] args) {
//		1~10까지 중 4까지만 출력한다.
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i+1);
//			if (i == 3) {
//				break;
//			}
//		}
		
		
//		1~10까지 중 4를 제외하고 출력
		for (int i = 0; i < 10; i++) {
//			i가 3일 때 continue를 만나서 4가 출력됨
			if(i == 3) {
				continue;
				
			}
			System.out.println(i+1);
		}
	}

}
