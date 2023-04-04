package 과제3;

import java.util.Scanner;

public class A5 {
	public static void main(String[] args) {

//		User inputs a number, N
//		Print an N height of the inverted equilateral triangle with “*”
//		Use a “for” or “while” loop

//		*********
//		 *******
//		  *****
//		   ***
//		    *

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num1 = sc.nextInt();

		String star = "*";
		String blank = " ";

		int num2 = 1;
		int num3 = 1;
		int num4 = (num1 + num1) - 1;

		for (int i = 1; i <= num1; i++) {

			for (int j = 0; j < num2; j++) {
				System.out.print(blank);
			}
			num2++;

			for (int j = 0; j < num4; j++) {
				System.out.print(star);
			}
			num4 -= 2;
			for (int j = 0; j < num3; j++) {
				System.out.print(blank);
			}
			num3++;

			System.out.println();
		}
	}

}
