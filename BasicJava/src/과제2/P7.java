package 과제2;

import java.util.Scanner;

public class P7 {
	
	public static void main(String[] args) {
		
//		User inputs a number N from 2 to 9
//		Print the N times table
		
		System.out.println("what number do you want");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 2; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}

	}

}
