package 과제5;

import java.util.Scanner;

public class A6 {

//	스마트폰을 사용하여 웹에서 프로그램 작성
//	자음과 모음의 개수를 세는 프로그램을 작성하세요.
//	이 프로그램은 사용자의 입력 문자열에 따라 동적으로 작동해야 합니다.

//	This is an apple
//	Num. of Consonant : 8 -> 자음 (나머지)
//	Num. of Vowels : 5  -> 모음 (A E I O U)
//
//	I am fine
//	Num. of Consonant : 3 -> 자음
//	Num. of Vowels : 4 -> 모음

	public static void main(String[] args) {
		counting();
	}

	public static void counting() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input : ");

		String a = scanner.nextLine();
		String b = a.replaceAll(" ", "");
		String[] a1 = b.split("");

		int countv = 0;
		int countc = 0;

		for (int i = 0; i < b.length(); i++) {
			if (a1[i].equals("a") || a1[i].equals("A")) {
				countv += 1;
			} else if (a1[i].equals("e") || a1[i].equals("E")) {
				countv += 1;
			} else if (a1[i].equals("i") || a1[i].equals("I")) {
				countv += 1;
			} else if (a1[i].equals("o") || a1[i].equals("O")) {
				countv += 1;
			} else if (a1[i].equals("u") || a1[i].equals("U")) {
				countv += 1;
			} else {
				countc += 1;
			}
		}

		System.out.println("Consonant : " + countc);
		System.out.println("Vowels : " + countv);

	}
}