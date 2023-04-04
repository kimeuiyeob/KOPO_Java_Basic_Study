package 과제4;

import java.util.Scanner;

public class A1 { 

	public static void main(String[] args) {

//		사용자가 숫자를 입력합니다.
//		숫자의 수, 평균, 최대, 최소를 인쇄합니다.
//		이것은 무기한으로 수행됩니다.

//		5
//		Result : 1 - Mean 5, Max 5, Min 5
//		
//		3
//		Result : 2 – Mean 4, Max 5, Min 3
//
//		1
//		Result : 3 – Mean 3, Max 5, Min 1


		Scanner sc = new Scanner(System.in);

		int biggestNumber = 0;
		int smallestNumber = 0;
		int i = 0;
		int number = 0;
		while (true) {
			System.out.println("숫자를 입력해주세요");
			try {
				number = sc.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("에러~~숫자입력바람");
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
