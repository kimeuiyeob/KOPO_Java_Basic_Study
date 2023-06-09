package 과제5;

import java.util.Scanner;

public class A4 {

	static int KEY = 5; // 키값

	public static void main(String[] args) {

//		Create your own encryption algorithm
//		  e.g., a->b, b->c, c->d, d->e
//		아스키코드사용 +1 , -1해보자

//		Menu
//		1. Encryption
//		2. Decryption
//		-> school

//		Result : tdippm
//		2.  Encryption
//		3.  Decryption
//		-> tdippm
//		Result : school
		
		while (true) {

			int chooseNumber = menu();

			if (chooseNumber == 1) {
				String password = goEncryption();
				encryption(password);
			} else if (chooseNumber == 2) {

				String password2 = goDecryption();
				decryption(password2);
			} else {
				System.err.println("번호를 다시 선택해주세요");
				menu();
			}

		}
	}

	public static int menu() {
		System.out.println("MENU");
		System.out.println("1. 암호화 선택");
		System.out.println("2. 복호화 선택");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	public static String goEncryption() {
		System.out.println("(암호화!)암호화할 문자열을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		return text;
	}

	public static String goDecryption() {
		System.out.println("(복호화)암호화된 문자열을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		return text;
	}

	public static void encryption(String text) {
		for (int i = 0; i < text.length(); i++) {
			int changeText = text.charAt(i) + KEY;
			System.out.print((char) changeText);
		}
		System.out.println();
	}

	public static void decryption(String text) {
		for (int i = 0; i < text.length(); i++) {
			int changeText = text.charAt(i) - KEY;
			System.out.print((char) changeText);
		}
		System.out.println();
	}

}
