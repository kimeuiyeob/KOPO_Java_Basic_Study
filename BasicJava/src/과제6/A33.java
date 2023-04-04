package 과제6;

import java.util.Scanner;

public class A33 {

	public static void main(String[] args) {

//		User inputs a string
//		Print the encrypted string
//		To encrypt the string, use an array to match characters one to one
//		Write a scenario and compose it

//		사용자가 문자열을 입력합니다.
//		암호화된 문자열 출력
//		문자열을 암호화하려면 배열을 사용하여 문자를 일대일로 일치시킵니다.

//		abcd
//		zyxw
		
		String input = input();
		encrypted(input);
	}
	
	public static void encrypted(String input) {
		String result = "";
		for (char c : input.toCharArray()) {
			int i = 219 - c;
			result += (char) i;
		}

		System.out.println("결과 값 : " + result);
	};
	
	public static String input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String input = sc.next();
		return input;
	}

}
