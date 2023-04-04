package 과제3;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {

//		User inputs a number, N
//		Print an N height of the right triangle with “*”
//		Use a “for” loop

//		*
//		**
//		***
//		****
//		*****

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");

		int numb1 = sc.nextInt();
		String star = "*";

		for (int i = 1; i <= numb1; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(star);
			}
			System.out.println();

		}

	}

}
