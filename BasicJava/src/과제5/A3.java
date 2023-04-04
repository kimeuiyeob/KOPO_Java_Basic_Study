package 과제5;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {

//		사용자는 M과 N에 각각 두 개의 숫자를 입력합니다.
//		1에서 M까지 N의 배수의 합을 계산합니다.

//		20  M
//		5  N
//		SUM : 50(5, 10, 15, 20)

		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int sum = 0;

		System.out.println("두 정수를 입력해주세요.");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			if (i % num2 == 0) {
				System.out.print(+i + " ");
				sum += i;
			}
		}
		System.out.println("/ 합계 : " + sum);
	}

}
