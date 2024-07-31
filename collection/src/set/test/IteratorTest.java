package set.test;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
//		HashSet 사용<- 중복 제거 가능
//		HashSet에서 중복검사를 진행할 때에는 hashCode로 비교하기 때문에
//		객체끼리의 비교가 아닌, 원하는 필드의 비교를 원한다면 hashCode()를 재정의 해야한다.
		HashSet<String> bloodTypeSet = new HashSet<String>();

		bloodTypeSet.add("A");
		bloodTypeSet.add("B");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("O");
		bloodTypeSet.add("O");
		bloodTypeSet.add("O");

		Iterator<String> iter = bloodTypeSet.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
