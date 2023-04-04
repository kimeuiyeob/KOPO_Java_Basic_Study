package 과제7;

import java.util.Arrays;
import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {

//		Initialize an integer array
//		Print the numbers with N in each digit
//		Add exception statements
//		정수 배열 초기화
//		각 숫자에 N이 있는 숫자를 인쇄하십시오.
//		예외문 추가
//
//		[Code]
//		int[] numbers = {123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29};
//
//		[Example]
//		5
//		356 53
//
//		2
//		123 32 2 29

		try {
			String num = inputNumber();
			howManyIndex(num);
		} catch (Exception e) {
			System.out.println("에러~~");
		}

	}

	public static void howManyIndex(String num) {
		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };
		String str = Arrays.toString(numbers);
		String[] strArray = null;
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			strArray = str.split(",");
		}

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].contains(num)) {
				System.out.print(strArray[i] + " ");
			}
		}
	}

	public static String inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력해주세요.");
		String num = sc.next();
		return num;

	}

}
