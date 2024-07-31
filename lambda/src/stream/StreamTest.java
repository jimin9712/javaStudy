package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
   
   public static int getDoubleTime(int data) {
      return data * 2;
   }
   
   public static boolean checkEven(int data) {
      return data % 2 == 0;
   }
   
   public int plus1(int data) {
      return ++data;
   }
   
   
   public static void main(String[] args) {
//      JAVA에서는 배열이 Arrays 객체이다.
//      Arrays.asList() 메소드는 가변인자를 받기 때문에, 여러 개의 값을 전달할 수도 있고
//      시작 주소를 가지고 있는 배열을 전달하면, 마지막 주소까지 읽어나가면서 모든 값들을 List에 넣고 리턴해준다.
      
//      배열을 ArrayList로 변경하는 방법
//      Integer[] arData = {10, 20, 30, 40, 50};
//      ArrayList<Integer> datas = new ArrayList<>(Arrays.asList(arData));
//      System.out.println(datas);
      
//      ArrayList를 배열로 변경하는 방법
//      Object[] arNumber = datas.toArray();
//      for (int i = 0; i < arNumber.length; i++) {
//         System.out.println((Integer)arNumber[i]);
//      }
      
//      IntStream: 정수를 다루는 Stream API
//      IntStream.range(1, 11).forEach((number) -> {System.out.println(number);});
//      IntStream.rangeClosed(1, 10).forEach((number) -> {System.out.println(number);});
//      
//      for (int i = 1; i < 11; i++) {
//         System.out.println(i);
//      }
      
//      forEach(): 반복
//      여러 값을 가지고 있는 컬렉션 객체 또는 Stream API에서 forEach 메소드를 사용할 수 있다.
//      forEach() 메소드에는 Consumer 인터페이스 타입의 값(구현체)을 전달해야 한다.
//      Consumer는 함수형 인터페이스이기 때문에 람다식을 사용할 수 있다.
//      매개변수에는 컬렉션 객체 또는 Stream 객체 안에 있는 값들이 순서대로 담기고,
//      화살표 뒤에서는 실행하고 싶은 문장을 작성한다.
//      ArrayList<String> colors = new ArrayList<String>(Arrays.asList("검은색", "빨간색", "녹색"));
//      colors.forEach((color) -> {System.out.println(color);});
      
//      참조형(객체명::메소드명)
//      매개변수로 전달받은 값을 다른 메소드에 넣는 작업만 한다면,
//      아래와 같이 참조형 문법을 사용하여 전달할 수 있다.
//      colors.forEach(System.out::println);
   
//      map(): 기존 값 변경
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(1, 10).forEach(datas::add);
//      datas.stream().map((data) -> data * 2).forEach(System.out::println);
//      datas.stream().map(StreamTest::getDoubleTime).forEach(System.out::println);
      
//      ArrayList<User> users = new ArrayList<User>(Arrays.asList(new User(1, "한동석", 20), new User(2, "홍길동", 18)));
//      users.stream().map(User::getAge).map((age) -> age / 2).forEach(System.out::println);
      
//      filter(): 조건식이 true일 경우만 추출
//      IntStream.range(1, 11).filter((data) -> data % 2 == 0).forEach(System.out::println);
//      IntStream.range(1, 11).filter(StreamTest::checkEven).forEach(System.out::println);
      
//      chars(): 문자열을 IntStream으로 변경
//      String data = "ABC";
//      data.chars().forEach(System.out::println);
//      data.chars().map((c) -> (char)c).forEach(System.out::println);
//      data.chars().forEach((c) -> System.out.println((char)c));
      
//      sorted(): 정렬
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      StreamTest streamTest = new StreamTest();
//      IntStream.range(0, 10).map(streamTest::plus1).forEach(datas::add);
//      Collections.shuffle(datas);
//      System.out.println(datas);
//      datas.stream().sorted().forEach(System.out::println);
//      datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
      
//      collect(): 결과를 다양한 타입으로 리턴해준다.
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(30, 20, 90, 40, 80));
//      datas.sort(null);
//      datas.sort(Collections.reverseOrder());
      
//      ArrayList<Integer> doubleTimeOfDatas = (ArrayList<Integer>) datas.stream().map(StreamTest::getDoubleTime).collect(Collectors.toList());
//      List<Integer> doubleTimeOfDatas = datas.stream().map(StreamTest::getDoubleTime).toList();
//      System.out.println(doubleTimeOfDatas);
      
//      ArrayList<String> colors = new ArrayList<>(Arrays.asList("검은색", "흰색", "파란색"));
//      System.out.println(colors.stream().collect(Collectors.joining("::")));
      
   }
}






























