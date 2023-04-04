package 과제3;

import java.util.Scanner;

public class P12 {
	
	public static void main(String[] args) {
		
//		User inputs a number N
//		The program adds 1 to N
//		Print the summation
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	
	}

}
