package 과제3;

import java.util.Scanner;

public class A8 {
	public static void main(String[] args) {

//		User inputs the two numbers, N and M
//		Print the GCD
//
//		24
//		18
//
//		6

		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력해주세요");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println();

		int num3 = 0;
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				num3 = i;
			}
		}

		System.out.println(num3);

	}

}
