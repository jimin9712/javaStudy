package operTest;

import java.util.Scanner;

public class OperTest3_1 {
    public static void main(String[] args) {
//      사용자에게 키를 입력받고 
//      정수라면 정수로 출력
//      실수라면 실수로 출력
//      예)   183 -> 183 출력
//            183.5 -> 183.5 출력
//         183.0 -> 183 출력   	
    	    	
//    	입력상태로 만들기 위해 Scanner 사용
        Scanner sc = new Scanner(System.in);
//      사용자에게 보여줄 메시지 출력
        System.out.print("숫자를 입력하세요: ");
//      사용자에게 받은 값을 number 변수에 저장
        String number = sc.next();
       
//      사용자에게 입력받은 값의 입력 문자열의 길이 구하고 length 라는 변수에 저장
        int length = number.length();

//      사용저에게 입력받은 값을 parseDouble로 실수로 변환 후 number1 변수에 저장
        double number1 = Double.parseDouble(number);

//      사용자에게 입력받은 값을 정수형으로 강제 형변환 후 부분만 추출
        int intPart = (int)number1;

//      number1과 intPart가 동일한지 확인하여 입력 값이 정수인지 아닌지 알 수 있음
        boolean isInt = (number1 == intPart);
//      문자열의 길이가 1보다 큰지 확인 후 (.0이 들어가려면 두 자리는 필요하기 때문) 1보다 크다면 charAt(문자열의 위치를 알 수 있는 메서드)을 사용하여 
//      전체 length 에서 2를 뺐을 때 그 위치에 '.'가 있다면 다시 length 에서 1을 빼서 마지막 위치에 '0'이 있는지 확인 
//      -> 0이라면.0은 빼고 출력 하기 위해서 ex) 183.0 -> 183 
//      그 후 이 조건을 findZero라는 변수에 저장
        boolean findZero = (length > 1 && number.charAt(length - 2) == '.' && number.charAt(length - 1) == '0');
//      그 후 isInt와 findZero를 AND 계산으로 입력 받은 값이 두 조건에 모두 참이면 " " + intPart(문자열로 바꾸기 위해 " "부분을 더함)를 출력
//      그렇지 않다면 number를 출력하는 부분을 result라는 변수에 저장
        String result = (isInt && findZero) ? (" " + intPart) : number;
        
//		사용자에게 결과값 출력
        System.out.println(result);
    }
}
