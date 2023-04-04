package 과제7;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {

//		User inputs the numbers N and M
//		Print all the cases made by the combination of 1 to N and 1 to M
//		Add exception statements
//		사용자가 숫자 N과 M을 입력합니다.
//		1을 N으로, 1을 M으로 조합하여 만든 경우를 모두 출력
//		예외문 추가

//		->
//		2
//		3

//		1,1
//		1,2
//		1,3
//		2,1
//		2,2
//		2,3

		try {
			int number1 = num1Func();
			int number2 = num1Func();
			countNumbers(number1, number2);
		} catch (Exception e) {
			System.out.println("에러~");
		}
	}

	public static int num1Func() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력해주세요.");
		int num1 = sc.nextInt();
		return num1;
	}

	public static void countNumbers(int num1, int num2) {

		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.println(i + "," + j);
			}
			System.out.println();
		}
	}

}
