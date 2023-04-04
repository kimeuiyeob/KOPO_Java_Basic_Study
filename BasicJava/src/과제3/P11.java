package 과제3;

import java.util.Scanner;

public class P11 {
	public static void main(String[] args) {

//		User inputs a number N from 2 to 9
//		Print the N times table
//		Use an “if” or “switch” statement
//		Use a “for” loop

		Scanner sc = new Scanner(System.in);
		String msg = "숫자 2~9중 입력하세요";

		int num1 = 0;

		do {
			System.out.println(msg);
			num1 = sc.nextInt();

		} while (!(1 < num1 && num1 < 10));

		for (int i = 2; i < 10; i++) {
			System.out.println(num1 + " X " + i + " = " + num1 * i);
		}

	}
}
