package 과제2;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1~4번 숫자를 선택하세요!");
		System.out.println("1.+		\n2.-		\n3.*		\n4./");

		int cal = sc.nextInt();
		if (cal == 1) {
			System.out.println("+를 선택하셨습니다.");
		} else if (cal == 2) {
			System.out.println("-를 선택하셨습니다.");
		} else if (cal == 3) {
			System.out.println("*를 선택하셨습니다.");
		} else if (cal == 4) {
			System.out.println("/를 선택하셨습니다.");
		} else {
			System.out.println("1~4번까지만 입력하세요~");
		}

		System.out.println("첫번째 숫자를 입력하세요!");
		int num1 = sc.nextInt();

		System.out.println("두번째 숫자를 입력하세요!");
		int num2 = sc.nextInt();

		if (cal == 1) {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		} else if (cal == 2) {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		} else if (cal == 3) {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		} else if (cal == 4) {
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		} else {
			System.out.println("1~4번까지만 입력하세요~");
		}
		
		
		
	}

}
