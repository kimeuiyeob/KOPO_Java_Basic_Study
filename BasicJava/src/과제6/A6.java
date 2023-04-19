package 과제6;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {

//		Fibonacci Numbers
//		The formula for this is as below
//		  F0 = 0, F1 = 1
//		  Fn = Fn-1 + Fn-2
//		  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 …
//
//		Use a list
//		User inputs a number
//		Print the number of elements from the Fibonacci Numbers

		Scanner scanner = new Scanner(System.in);
		while (true) {
			int num = scanner.nextInt();
			int[] arr = new int[num];
			for (int i = 0; i < arr.length; i++) {
				if (i == 0) {
					arr[0] = 0;
				} else if (i == 1) {
					arr[1] = 1;
				} else {
					arr[i] = arr[i - 1] + arr[i - 2];
				}
				System.out.println(arr[i]);
			}
		}
	}
}
