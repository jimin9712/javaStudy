package classTest;

//슈퍼카

class SuperCar {
//	브랜드
	String brand;
//	색상
	String color;
//	가격
	int price;

//  Alt + Shift + s 누르고 o
//	초기화할 필드를 체크하고 Generate
	public SuperCar(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	SuperCar(String brand) {
		this.brand = brand;
	}

//	시동 켜기
	void engineStart() {
		System.out.println(brand + " 시동 켜짐");

	}

//	시동 끄기
	void engineStop() {

	}

}

public class ClassTask1 {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("Ferrari", "빨간색", 75_000);
		SuperCar bentley = new SuperCar("Bentley");

		System.out.println(ferrari.brand);
		ferrari.engineStart();
		bentley.engineStart();

	}

}
