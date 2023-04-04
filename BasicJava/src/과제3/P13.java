package 과제3;

import java.util.Scanner;

public class P13 {
	public static void main(String[] args) {
		
//		User inputs the two number N and M
//		The program adds 1 to N by M(ex : 10, 2, 1 + 3 + 5 + 7 + 9 = 25)
//		Print the summation
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int total = 0;
		int sum = 0;
		
		total = num1 / num2;
		
		for (int i = 0; i < total; i++) {
			sum += total;
		}
		System.out.println(sum);
		

	}
}
