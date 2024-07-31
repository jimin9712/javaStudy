package set.test;

import java.util.ArrayList;
import java.util.HashSet;

//	중복검사할 때 이 만한게 없다
public class SetTest {
	public static void main(String[] args) {
//		HashSet<String> bloodTypeSet = new HashSet<String>();
//		
//		bloodTypeSet.add("A");
//		bloodTypeSet.add("B");
//		bloodTypeSet.add("AB");
//		bloodTypeSet.add("O");
//		bloodTypeSet.add("O");
//		bloodTypeSet.add("O");
//		
//		System.out.println(bloodTypeSet.toString());
//		System.out.println(bloodTypeSet.size());
////		contains가 핵심!!
//		System.out.println(bloodTypeSet.contains("C"));
		
		
//		회원들의 혈액형만 모아놓은 list이다
		ArrayList<String> userBloodTypes = new ArrayList<String>();
		HashSet<String> bloodTypeSet = null;
		
		userBloodTypes.add("A");
		userBloodTypes.add("A");
		userBloodTypes.add("A");
		userBloodTypes.add("A");
		userBloodTypes.add("B");
		userBloodTypes.add("AB");
		userBloodTypes.add("O");
		
		System.out.println(userBloodTypes);
		
		
		
		
		
		

	}

}
