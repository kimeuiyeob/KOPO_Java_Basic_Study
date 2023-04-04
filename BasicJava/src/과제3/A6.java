package 과제3;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {

//		User inputs a number, N
//		Print the factors of N
//		
//		10
//
//		1
//		2
//		5

		Scanner scan = new Scanner(System.in);
		System.out.println("약수를 구할 숫자를 입력하세요.");
		
		int num = scan.nextInt();
		int num1 = num-1;
		System.out.println();

		for (int i = 1; i <= num1; i++) {
			
			if ((num % i) == 0) {
				
				System.out.println(i);

			}
		}
	}

}
