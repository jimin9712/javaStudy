package bank;

public class Shinhan extends Bank {

	@Override
	public void deposit(int money) {
		money /= 2;
		super.deposit(money);
	}


}
