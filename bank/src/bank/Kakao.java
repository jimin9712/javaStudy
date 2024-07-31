package bank;

public class Kakao extends Bank {

	@Override
	public int showBalance() {
		this.setMoney(this.getMoney() / 2);
//		가져온 돈(getMoney)를 2로 나눈 값을 setMoney에 전달
		return super.showBalance();
	}

}
