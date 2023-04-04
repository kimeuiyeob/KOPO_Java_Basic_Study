package 과제4;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {

//		Compose a program calculating the number of alphabets
//		The string is declared as a variable, “I go to school”

//		C – 1
//		G - 1
//		H – 1
//		I – 1
//		L – 1
//		O – 4
//		S - 1
//		T - 1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어로 쓰세요!");
		
		String input = sc.nextLine();
		
		String upperText = input.toUpperCase();
		String removeText = upperText.replace(" ", "");

		int alphabet[] = new int[26];

		for (int i = 0; i < removeText.length(); i++) {

			int temp = removeText.charAt(i) - 'A';
			alphabet[temp]++;

		}

		for (int i = 0; i < 26; i++) {
			if (alphabet[i] != 0) {
				System.out.println((char) (i + 65) + " - " + alphabet[i]);
			}
		}

	}

}
