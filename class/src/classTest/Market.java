package classTest;

public class Market {
//   상품명
	String name;
//   상품가격
	int price;
//   상품재고
	int stock;

//	Market 클래스의 생성자
	public Market(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

//   판매
//   손님의 정보를 가져와서
//   해당 할인율을 적용한다.
	void sell(Customer customer) {
		customer.money -= this.price * ((100 - customer.discount) * 0.01);
		stock--;
	}

}
