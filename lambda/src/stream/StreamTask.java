package stream;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamTask {

	public static int minus10(int data) {
		return 10 - data;
	}

	public static void main(String[] args) {
//      1~10까지 ArrayList에 담고 출력
//      Integer[] arData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//      ArrayList<Integer> datas = new ArrayList<Integer>();

//      참조형(객체명::메소드명)
//      매개변수로 전달받은 값을 다른 메소드에 넣는 작업만 한다면,
//      아래와 같이 참조형 문법을 사용하여 전달할 수 있다.
//      IntStream.rangeClosed(1, 10).forEach((data) -> {datas.add(data);}); 
//      IntStream.rangeClosed(1, 10).forEach(datas::add); 
//      System.out.println(datas);

//      10~1까지 ArrayList에 담고 출력
//      upgrade: 짝수만 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(0, 9).forEach((data) -> {datas.add(10 - data);});
//		IntStream.rangeClosed(0, 9).forEach((data) -> {
//			datas.add(10 - data);
//		});
//      IntStream.range(0, 5).forEach((data) -> {System.out.println(datas.get(data * 2));});
//		System.out.println(datas);

//      10~1까지 ArrayList에 담고 출력 (map 사용)
//      ArrayList<Integer> datas = new ArrayList<>();
//      IntStream.rangeClosed(0, 9).map(StreamTask::minus10).forEach(datas::add);
//      System.out.println(datas);

//      10~1까지 ArrayList에 담고 짝수만 출력 (map 사용)
//      ArrayList<Integer> datas = new ArrayList<>();
//      IntStream.rangeClosed(0, 9).map(StreamTask::minus10).forEach(datas::add);
//      datas.stream().forEach((data) -> {
//         if(data % 2 == 0) {
//            System.out.println(data);
//         }
//      });

//      10~1까지 ArrayList에 담고 짝수만 출력 (map, filter 사용)
//      ArrayList<Integer> datas = new ArrayList<>();
//      IntStream.rangeClosed(0, 9).map(StreamTask::minus10).forEach(datas::add);
//      datas.stream().filter((data) -> data % 2 == 0).forEach(System.out::println);
//		========================================================================================
//      ABCDEF를 각 문자별로 출력
//		String data = "ABCDEF";
//		data.chars().forEach((c) -> System.out.print((char)c + " "));

//      1~100까지 중 홀수만 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 101).filter((i) -> i % 2 == 1).forEach(datas::add);
//		System.out.println(datas);

//      A~F까지 중 D제외하고 ArrayList에 담은 뒤 출력
//		ArrayList<Character> datas = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F'));
//		datas.stream().filter(i -> i != 'D').forEach(System.out::print);

// 		1~100까지 중 짝수만 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 101).filter((i) -> i % 2 == 0).forEach(datas::add);
//		System.out.println(datas);

//      5개의 문자열을 모두 소문자로 변경("Black", "WHITE", "reD", "yeLLow", "PINk")
//		ArrayList<String> datas = new ArrayList<>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		datas.stream().map(String::toLowerCase).forEach(System.out::println);;

//      "Apple", "banana", "Melon" 중 첫 번째 문자가 대문자인 문자열 출력
//		ArrayList<String> datas = new ArrayList<>(Arrays.asList("Apple", "banana", "Melon"));
//
//		datas.stream().filter((data)-> data.charAt(0) >= 'A').filter((data) -> data.charAt(0) <= 'Z')
//		.forEach(System.out::println);
//		datas.stream().filter((data) -> data.charAt(0) >= 'A').filter((data) -> data.charAt(0) <= 'Z')
//				.forEach(System.out::println);

//		datas.stream().filter(s -> Character.isUpperCase(s.charAt(0))).forEach(System.out::println);

//      한글을 정수로 변경 stream 사용
//		HashMap<String, Integer> koreanToNumber = new HashMap<>();
//		koreanToNumber.put("일", 1);
//		koreanToNumber.put("이", 2);
//		koreanToNumber.put("삼", 3);
//		koreanToNumber.put("사", 4);
//		koreanToNumber.put("오", 5);
//		koreanToNumber.put("육", 6);
//		koreanToNumber.put("칠", 7);
//		koreanToNumber.put("팔", 8);
//		koreanToNumber.put("구", 9);
//		koreanToNumber.put("공", 0);

//		String hangle = "공일이삼사오육칠팔구";
//		String input = "공공공육공이";
//		input.chars().map(hangle::indexOf).forEach(System.out::print);
// 정수를 한글로 변경
//		HashMap<Integer, String> numberToKorean = new HashMap<>();
//		numberToKorean.put(1, "일");
//		numberToKorean.put(2, "이");
//		numberToKorean.put(3, "삼");
//		numberToKorean.put(4, "사");
//		numberToKorean.put(5, "오");
//		numberToKorean.put(6, "육");
//		numberToKorean.put(7, "칠");
//		numberToKorean.put(8, "팔");
//		numberToKorean.put(9, "구");
//		numberToKorean.put(10, "공");
//		System.out.println(numberToKorean.get(2));
//      정수를 한글로 변경
//      String hangle = "공일이삼사오육칠팔구";
//      String input = "1024";
//      input.chars().map((c) -> c - 48).forEach((i) -> System.out.println(hangle.charAt(i)));
//		String hangle = "공일이삼사오육칠팔구";
//		String input = "1024";
//		input.chars().map((c) -> c - 48).forEach((i) -> System.out.println(hangle.charAt(i)));

	}
}
