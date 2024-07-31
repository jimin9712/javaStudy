package methodTest;

import java.util.Iterator;

public class MethodTask {
//   1 ~ 10까지 println()으로 출력하는 메소드
   void printFrom1To10() {
      for (int i = 0; i < 10; i++) {
         System.out.println(i + 1);
      }
   }

//   "홍길동"을 n번 println()으로 출력하는 메소드
   void printHong(int count) {
      for (int i = 0; i < count; i++) {
         System.out.println("홍길동");
      }
   }

//   이름을 n번 println()으로 출력하는 메소드
   void printName(String name, int count) {
      for (int i = 0; i < count; i++) {
         System.out.println(name);
      }
   }

//   세 정수의 뺄셈 메소드
   int subtract(int number1, int number2, int number3) {
      return number1 - number2 - number3;
   }

//   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//   return 값은 반드시 1개만 가능하다.
   int[] divide(int number1, int number2) {
      int[] result = null;

      if (number2 != 0) {
         result = new int[] { number1 / number2, number1 % number2 };
//         result = new int[2];
//         result[0] = number1 / number2;
//         result[1] = number1 % number2;

      }
      return result;
   }

// 1 ~ n 까지의 합을 구해주는 메소드
   int getTotal(int n) {
      int result = 0;
      for (int i = 0; i < n; i++) {
         result += i + 1;
      }
      return result;
   }

//   홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
   int changeToOddToEven(int number) {
      return ++number;
   }

//   문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
   String changeAlphabet(String data) {
      String result = "";

      for (int i = 0; i < data.length(); i++) {
         char ch = data.charAt(i);
         if (ch >= 97 && ch <= 122) { // 소문자 검사
            result += (char) (ch - 32);

         } else if (ch >= 65 && ch <= 90) { // 대문자 검사
            result += (char) (ch + 32);

         } else {
            result += ch;
         }
      }
      return result;
   }

//   한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
   int changeToInteger(String data) {
//      자동 줄맞춤: Ctrl + Shift + f
      String hangle = "공일이삼사오육칠팔구";
      String temp = "";
      int result = 0;
      
      for (int i = 0; i < data.length(); i++) {
         temp += hangle.indexOf(data.charAt(i));
      }

      result = Integer.parseInt(temp);
      return result;
   }
   
//   정수를 한글로 바꿔주는 메소드 (1024 -> 일공이사)
   String changeToHangeulFromInteger(int number) {
      String hangle = "공일이삼사오육칠팔구";
      String result = "";
      
      while(number != 0) {
         result = hangle.charAt(number % 10) + result;
         number /= 10;
      }

      return result;
   }
   
   String changeToHangeulFromString(String data) {
      String hangle = "공일이삼사오육칠팔구";
      String result = "";
      
      for (int i = 0; i < data.length(); i++) {
         result += hangle.charAt(data.charAt(i) - 48);
      }

      return result;
   }

//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//   int[] getMaxAndMin(int number1, int number2, int number3, int number4, int number5) {
//      int[] arData = {number1, number2, number3, number4, number5};
   int[] getMaxAndMin(int[] arData) {
      int[] result = new int[2];
      
      result[0] = arData[0];
      result[1] = arData[0];
      
      for (int i = 1; i < arData.length; i++) {
         if(result[0] < arData[i]) {
            result[0] = arData[i];
         }
         
         if(result[1] > arData[i]) {
            result[1] = arData[i];
         }
      }
      
      return result;
   }
   
//   upgrade: 리턴타입은 void로 하되, 사용하는 부분에서 결과를 쓸 수 있어야 한다(주소를 활용!).
   void getMaxAndMin(int[] arData, int[] result) {
      
      result[0] = arData[0];
      result[1] = arData[0];
      
      for (int i = 1; i < arData.length; i++) {
         if(result[0] < arData[i]) {
            result[0] = arData[i];
         }
         
         if(result[1] > arData[i]) {
            result[1] = arData[i];
         }
      }
   }
   
   
   
//   void change(int[] data) {
//      data[0] = 20;
//   }

   public static void main(String[] args) {
//      MethodTask methodTask = new MethodTask();
//      int[] data = {10};
//      
//      methodTask.change(data);
//      System.out.println(data[0]);
      
      int[] arData = {3, 5, 7, 2, 9};
      int[] result = new int[2];
      MethodTask methodTask = new MethodTask();
      
      methodTask.getMaxAndMin(arData, result);
      
      System.out.println(result[0]);
      System.out.println(result[1]);
      
//      methodTask.printFrom1To10();
//      methodTask.printHong(10);
//      methodTask.printName("한동석", 5);
//      int result = methodTask.subtract(3, 2, 1);
//      System.out.println(result);
//      int[] result = methodTask.divide(10, 3);
//      String resultMessage = null;
//
//      if (result == null) {
//         resultMessage = "0 으로 나눌 수 없습니다.";
//      } else {
//         resultMessage = "몫: " + result[0] + "\n나머지: " + result[1];
//      }
//
//      System.out.println(resultMessage);

//      int result = methodTask.changeToOddToEven(11);
//      String message = "로 바뀌었습니다.";
//      String temp = result % 2 == 0 ? "짝수" : "홀수";
//      
//      System.out.println(temp + message);
   }
}
