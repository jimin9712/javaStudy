package list.test;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest<T> {

	public static void main(String[] args) {
//		<?>: 제네릭(이름이 없는) 타입을 정할 수 없을 때 사용, 신입 때는 거의 안 씀..
//		객체화 시 타입을 지정하는 기법
//		자료구조는 설계할 때 데이터의 타입을 지정할 수 없기 때문에 임시로 타입을 선언한다.

//		아니, Object 쓰면 되는 거 아닌가요?? 왜 제네릭 써요??
//		따로 다운 캐스팅할 필요가 없으며, 지정할 타입에 제한을 줄 수 있기 때문에 Object 가 아닌 제네릭으로 선언한다.

		ArrayList<Integer> datas = new ArrayList<Integer>();
		datas.add(10);
		datas.add(20);
		datas.add(40);
		datas.add(30);
		datas.add(50);
		datas.add(60);
		datas.add(90);
		datas.add(70);
		datas.add(80);

//		System.out.println((datas));
//		System.out.println((datas.size()));
//
////		정렬
//		Collections.sort(datas);
//		System.out.println(datas);
////		섞기
//		Collections.shuffle(datas);
//		System.out.println(datas);

//		API 처음 보는 거라도 목적에 맞게 쓸 수 있어야 한다
//		피하지 말고 부딪혀라! 몰라도 검색하고
//		이 연습을 죽어라 해라

//		추가(삽입) 60은 항상 30 뒤에 삽입된다.

//		1. 30을 찾는다.
//		ArrayList에 검색하는 메소드가 필요하다.
// 		2. 원하는 위치에 원하는 값을 넣는다.		
		// 추가(삽입) 60은 항상 30 뒤에 삽입된다.
//		if(datas.contains(30)) {
//			datas.add(datas.indexOf(30) +1,60);
//			System.out.println(datas);
//		}
//		else {
//			System.out.println("찾는 값이 없습니다.");
//		}

//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		datas.add(10);
//		datas.add(20);
//		datas.add(40);
//		datas.add(30);
//		datas.add(50);
//		datas.add(60);
//		datas.add(90);
//		datas.add(70);
//		datas.add(80);

//		수정, 10을 1로 수정한다.
		// 10을 1로 수정합니다.
//        if (datas.contains(10)) {
//        	datas.set(datas.indexOf(10),1);
//            System.out.println(datas);
//        }
//		삭제(값으로 삭제), 20을 삭제한다.
//        if (datas.contains(20)) {
//            datas.remove(Integer.valueOf(20));
//            System.out.println(datas);
//        }

//		삭제(인덱스로 삭제, 50을 삭제한다.
//		if (datas.contains(50)) {
//			datas.remove(datas.indexOf(50));
//			System.out.println(datas);
//		}
	}
}
