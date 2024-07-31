package accessTest1;

public class Access1 {
	int data1;
	public int data2;
	protected int data3;
	private int data4;

	public Access1() {
		;
	}

	// Alt + shift + s ,o

	public Access1(int data1, int data2, int data3, int data4) {
		super();
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}

	// Alt + Shift + s , r
	public int getData4() {
		return data4;
	}

	public void setData4(int data4) {
		this.data4 = data4;
	}

}
