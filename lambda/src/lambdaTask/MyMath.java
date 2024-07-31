package lambdaTask;

import java.util.Scanner;

public class MyMath {

	public static Calc operate(String oper) {
		return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요.";
		String example = "예)9+7-5";
		String expression = null;
		String[] opers = null;
		String[] temp = null;
		int number1 = 0, number2 = 0;

		System.out.println(message);
		System.out.println(example);
		expression = sc.next();

		OperCheck operCheck = e -> {
			String result = "";
			for (int i = 0; i < e.length(); i++) {
				char c = e.charAt(i);
				if (c == '+' || c == '-') {
					result += c;
				}
			}
			return result.split("");
		};

		opers = operCheck.getOpers(expression);
		temp = expression.split("\\+|\\-");

		number1 = Integer.parseInt(temp[0].equals("") ? opers[0] + temp[1] : temp[0]);

		for (int i = 0; i < opers.length; i++) {
//         아래의 조건식은 number1이 음수라면, 평생 음수이다.
//         if(number1 < 0) {continue;}

//         첫 번째 반복에서만 검사해야 한다!
			if (i == 0 && number1 < 0) {
				continue;
			}
			number2 = Integer.parseInt(temp[i + 1]);
			number1 = MyMath.operate(opers[i]).calc(number1, number2);
		}

		System.out.println(number1);
	}
}
