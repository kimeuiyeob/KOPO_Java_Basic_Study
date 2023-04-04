package 과제6;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {

//		User inputs a string
//		Print the encrypted string
//		To encrypt the string, use an array to match characters one to one
//		Write a scenario and compose it

//		사용자가 문자열을 입력합니다.
//		암호화된 문자열 출력
//		문자열을 암호화하려면 배열을 사용하여 문자를 일대일로 일치시킵니다.

//		zyxw
//		abcd

		
		String sen =  input();
		encrypted(sen);

	}
	
	public static void encrypted(String sen) {

		String result = "";

		for (char c : sen.toCharArray()) {
			int i = 219 - c;
			result += (char) i;
		}

		System.out.println("결과 값 : " + result);
	}
	
	public static String input() {
		System.out.println("문자열 입력 : ");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		return sentence;
	}
	

}
