package 과제3;

import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		
//		User inputs a numbers, N
//		Print the prime number to N
//
//		11
//
//		2
//		3
//		5
//		7
//		11

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력해주세요");

		int num1 = sc.nextInt();
		System.out.println();
		
		int num2 = 0;
		for (int i = 2; i < num1 + 1; i++) {
			num2 = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					num2 += 1;
				}
			}
			if(num2 == 0) {
				System.out.println(i);
			}
		}

	}

}
