package classTest;

public class Customer {
//   이름
	String name;
//   핸드폰번호
	String phone;
//   잔액
	int money;
//   할인율
	int discount;

//   Customer 클래스의 생성자
	public Customer(String name, String phone, int money, int discount) {
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.discount = discount;
	}

}
