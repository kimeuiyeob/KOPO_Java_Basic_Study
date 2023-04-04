package 과제7;

import java.util.Scanner;

public class A7 {

//	The formula for this is as below
//	  F0 = 0, F1 = 1
//	  Fn = Fn-1 + Fn-2
//	  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 …
//
//	Use a list
//	User inputs a number
//	Print the number of elements from the Fibonacci Numbers
//	Add exception statements

//	7
//	0 1 1 2 3 5 8

	public static void main(String[] args) {
		try {
			int num = inputFunc();
			printFibonacci(num);
		} catch (Exception e) {
			System.out.println("에러~~");
		}
	}

	public static void printFibonacci(int num) {
		System.out.println(fibonacci(num));
	}

	public static int inputFunc() {
		System.out.println("숫자 입력");
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		return N - 1;
	}

	// 피보나치 함수
	static int fibonacci(int N) {
		try {
			if (N == 0)
				return 0;
			if (N == 1)
				return 1;
		} catch (Exception e) {
			System.out.println("에러~~");
		}
		return fibonacci(N - 1) + fibonacci(N - 2);
	}

}