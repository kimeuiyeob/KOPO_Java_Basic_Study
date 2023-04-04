package 과제3;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {

//		Use an “switch” statement
//		Use a double “while” loop
//		Print 2 to 9 times table

		int num1 = 2;
		int num2 = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("1~3번중 번호를 고르세요~");
		System.out.println("1번. 덧셈  \n2번. 뺄셈  \n3번. 곱셈");

		int num = sc.nextInt();
		switch (num) {

		case 1:
			System.out.println("덧셈을 선택하셨습니다.");
			while (num1 < 10) {
				while (num2 < 10) {
					System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
					num2++;
				}
				System.out.println();
				num2 = 1;
				num1++;
			}
			break;

		case 2:
			System.out.println("뺄셈을 선택하셨습니다.");
			while (num1 < 10) {
				while (num2 < 10) {
					System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
					num2++;
				}
				System.out.println();
				num2 = 1;
				num1++;
			}
			break;

		case 3:
			System.out.println("곱셈을 선택하셨습니다.");
			while (num1 < 10) {
				while (num2 < 10) {
					System.out.println(num1 + " X " + num2 + " = " + num1 * num2);
					num2++;
				}
				System.out.println();
				num2 = 1;
				num1++;
			}
			break;
			
		default:
			System.out.println("1~3번중 골라주세요~");
		}

	}
}
