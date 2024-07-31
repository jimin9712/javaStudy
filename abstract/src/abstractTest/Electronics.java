package abstractTest;

// 알고만 있기! final이 붙은 class는 상속이 안됨
public abstract class Electronics {
//	전자제품이면 이것부터 받아서 구현해야한다(강제성).
//	무조건 구현해라
	public abstract void on();

	public abstract void off();

//	재정의 선택
	public void printProduct() {
		System.out.println("전자제품");
	}

//	재정의 불가
	public final void sos() {
		System.out.println("긴급 전화 119 연락");
	}

	public static void main(String[] args) {
//		익명 내부 클래스
//		익명 클래스가 메모리에 올라간 것, Electronics 가 올라간 것이 아님
//		e는 익명 클래스의 주소를 갖고 있다.
		Electronics e =  new Electronics() {

			@Override
			public void on() {
				// TODO Auto-generated method stub

			}

			@Override
			public void off() {
				// TODO Auto-generated method stub

			}
		};
	}
}
