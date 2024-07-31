package operTest;

import java.math.BigDecimal;
import java.util.Scanner;

public class OperTest3 {
	public static void main(String[] args) {
//      사용자에게 키를 입력받고 
//      정수라면 정수로 출력
//      실수라면 실수로 출력
//      예)   183 -> 183 출력
//            183.5 -> 183.5 출력
//         183.0 -> 183 출력
//=============================내 코드====================================
////		입력상태로 만들기 위해 Scanner 사용
//        Scanner sc = new Scanner(System.in);
////        사용자에게 보이는 문구 입력
//        System.out.print("숫자를 입력하세요: ");
////        사용자에게 받은 값을 변수(number1)에 저장
//        String number1 = sc.next();
////      사용자에게 받은 number1이 "."을 포함하고 있을 때
//            if (number1.contains(".")) {
////      number1을 doubleNum에 받고 이 값을 실수로 추출
//                double doubleNum = Double.parseDouble(number1);
////      실수로 추출한 값이 정수와 같은 값이면 (int)로 강제 형변환 후 정수로 추출
//                if (doubleNum == (int) doubleNum) {
//                    System.out.println((int)doubleNum);
////      그렇지 않으면 실수로 추출
//                } 
//                else {
//                    System.out.println(doubleNum);
//                }
////      사용자에게 받은 값이 "."을 포함하고 있지 않다면 받은 값을 intNum에 저장 후 그 값를 정수로 추출
//            }   
//            else {
//                int intNum = Integer.parseInt(number1);
////              그 후 사용자에게 정수로 추출한 값을 출력
//                System.out.println(intNum);
//            }
		
//=============================강사님 코드==========================================
		  Scanner sc = new Scanner(System.in);
	      double height = 0.0;
	      String message = "키: ", format = null;
	      boolean isInteger = false;
	      int length = 0;
	      BigDecimal originalHeight = null;
	      BigDecimal exp = null;
	      
	      System.out.print(message);
	      height = sc.nextDouble();
	      
	      originalHeight = new BigDecimal(String.valueOf(height));
	      exp = new BigDecimal(String.valueOf((int)height));
	      
	      isInteger = (height - (int)height) == 0;
	      length = originalHeight.subtract(exp).toString().length() - 2;
//	      length = (height - (int)height + "").length() - 2;
	      format = isInteger ? "%.0f" : "%." + length + "f";
	      
	      System.out.printf(format, height);

		
		
		
		
		
        } 
    }






















