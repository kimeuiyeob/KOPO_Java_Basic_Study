package 과제4;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {

//		사용자가 숫자를 입력합니다.
//		양수, 음수, 홀수 및 짝수의 숫자를 인쇄합니다.
//		이것은 무기한으로 수행됩니다.

//		2
//		양수 – 1, 음수 – 0, 홀수 – 0, 짝수 – 1
//
//		-3
//		양수 – 1, 음수 – 1, 홀수 – 1, 짝수 - 1
//
//		4
//		양수 – 2, 음수 – 1, 홀수 – 1, 짝수 - 2

		Scanner sc = new Scanner(System.in);

		int plus = 0;
		int minus = 0;
		int even = 0;
		int odd = 0;

		while (true) {
			System.out.println("숫자 입력");
			int num = sc.nextInt();

			if (num > 0) {
				plus++;
			} else if (num < 0) {
				minus++;
			}
			if (num % 2 == 0) {
				even++;
			} else if (num % 2 == 1 || num % 2 == -1) {
				odd++;
			}
			System.out.println("양수 - " + plus + " 음수 -" + minus + " 홀수 -" + odd + " 짝수 -" + even);
		}
	}

}
