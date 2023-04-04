package 과제5;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {

//		사용자가 하나의 연산자만 포함하는 수식을 입력합니다.
//		프로그램은 다음 4가지 함수를 사용하여 수식을 계산합니다.

//		   1) public static void 추가(double num1, double num2)
//		   2) public static void 빼기(double num1, double num2)
//		   3) 공공 정적 무효 곱셈(double num1, double num2)
//		   4) 공공 정적 무효 분할(double num1, double num2)
//			3*7
//			21
//			6+9
//			15
		
		inputText();
	}

	public static void inputText() {

		Scanner sc = new Scanner(System.in);

		String[] strArray;
		double num1 = 0;
		double num2 = 0;

		System.out.println("입력해주세요.");
		String str = sc.nextLine();

		if (str.contains("+")) {
			strArray = str.split("\\+");
			num1 = Double.parseDouble(strArray[0]);
			num2 = Double.parseDouble(strArray[1]);
			plus(num1, num2);

		} else if (str.contains("-")) {
			strArray = str.split("\\-");
			num1 = Double.parseDouble(strArray[0]);
			num2 = Double.parseDouble(strArray[1]);
			minus(num1, num2);

		} else if (str.contains("*")) {
			strArray = str.split("\\*");
			num1 = Double.parseDouble(strArray[0]);
			num2 = Double.parseDouble(strArray[1]);
			multi(num1, num2);

		} else if (str.contains("/")) {
			strArray = str.split("\\/");
			num1 = Double.parseDouble(strArray[0]);
			num2 = Double.parseDouble(strArray[1]);
			devide(num1, num2);
		}
	}

	public static void plus(double num1, double num2) {
		System.out.println(num1 + num2);
	};

	public static void minus(double num1, double num2) {
		System.out.println(num1 - num2);
	};

	public static void multi(double num1, double num2) {
		System.out.println(num1 * num2);
	};

	public static void devide(double num1, double num2) {
		System.out.println(num1 / num2);
	};

}
