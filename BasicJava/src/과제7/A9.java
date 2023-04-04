package 과제7;

import java.util.Scanner;

public class A9 {
	
	static int biggestNumber = 0;
	static int smallestNumber = 0;
	static int i = 0;
	static int number = 0;

	public static void main(String[] args) {

//		User inputs a number, and assign it to a list
//		Prints the number of numbers, mean, maximum, minimum
//		This is performed indefinitely
//		Add exception statements
//
//		5
//		Result : 1 - Mean 5, Max 5, Min 5
//		3
//		Result : 2 – Mean 4, Max 5, Min 3
//		1
//		Result : 3 – Mean 3, Max 5, Min 1
		
		problemSolve();
	}

	public static void problemSolve() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("숫자를 입력해주세요");
			try {
				number = sc.nextInt();
			} catch (Exception e) {
				System.out.println("에러~~");
			}
			if (i == 0) {
				biggestNumber = number;
				smallestNumber = number;
				i++;
			}
			if (biggestNumber > number) {
				biggestNumber = biggestNumber;
			} else if (biggestNumber < number) {
				biggestNumber = number;
			}

			if (smallestNumber > number) {
				smallestNumber = number;
			} else if (smallestNumber < number) {
				smallestNumber = smallestNumber;
			}
			System.out.println("Result : " + (i + 1) + " - " + "Max" + biggestNumber + ", Min" + smallestNumber
					+ ", Mean" + (biggestNumber + smallestNumber) / 2);
		}
	}

}
