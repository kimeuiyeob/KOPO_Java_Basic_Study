package 과제7;

import java.util.Scanner;
import java.util.Stack;

public class A2 {

	public static void main(String[] args) {

//		User inputs a series of numbers and assign them to a stack
//		User input a number from the series of numbers
//		Print the number in order of output
//		Add exception statements
//
//		1 21 13 34 15 16
//		13
//		4
		try {
			String str = sentence1();
			String str2 = sentence1();
			printOrderStack(str, str2);
		} catch (Exception e) {
			System.out.println("에러~~");
		}
	}

	public static void printOrderStack(String str, String str2) {
		Stack<String> stack = new Stack<>();
		String[] strArray = null;
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			strArray = str.split(" ");
		}

		for (int i = 0; i < strArray.length; i++) {
			stack.add(strArray[i]);
		}
		for (int i = 0; i < strArray.length; i++) {
			stack.pop();
			count++;
			if (Integer.parseInt(str2) == Integer.parseInt(stack.peek())) {
				break;
			}
		}
		System.out.println("위치 : " + (count + 1));
	}

	public static String sentence1() {
		System.out.println("문자 입력");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		return str;
	}

}
