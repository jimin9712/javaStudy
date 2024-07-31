package wrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		int data_i = 10; //JAVA에서는 언더바 잘 안씀;;
		
//		boxing
//		deprecated :햔재 버전부터는 사욯하지 않는 것을 권장한다!
//		Integer data_I = new Integer(data_i);
//		Integer data_I = Integer.valueOf(data_i);
		Integer data_I = data_i;
		
//		unboxing
//		data_i = data_I.intValue();
		data_i = data_I;
		
		
		
		
	}

}
