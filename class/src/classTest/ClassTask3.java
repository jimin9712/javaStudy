package classTest;

public class ClassTask3 {
	public static void main(String[] args) {
//      마켓은 단 1개이다.
//      2명의 손님이
//      상품을 각각 구매하면
//      할인율에 맞게 잔액이 반영된다.
//	   Market 객체 생성
		Market emart = new Market("새우깡", 1200, 10);
//		
		Customer[] arCustomer = { new Customer
//				첫 번째 손님 객체 생성 
				("한동석", "01012341234", 10000, 30),
//				두 번째 손님 객체 생성
				new Customer("오현준", "01099998888", 1000000, 0), };
//		각 요소를 순회하기 위한 for 루프
//		각 손님이 상품을 구매
		for (int i = 0; i < arCustomer.length; i++) {
			emart.sell(arCustomer[i]);
		}
//		stock -- 이므로 팔린 만큼 재고 수 출력
		System.out.println(emart.stock + "개의 재고");
//		각 손님의 잔액 출력
		for (int i = 0; i < arCustomer.length; i++) {
			System.out.println(arCustomer[i].name + "님의 현재 잔액: " + arCustomer[i].money + "원");
		}

	}
}
