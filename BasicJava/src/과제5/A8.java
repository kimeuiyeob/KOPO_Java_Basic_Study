package 과제5;

import java.util.Scanner;


public class A8 {
	
	static int num = 0;

	public static void main(String[] args) {
		
		while(true) {
			int x = menu();
			if (x == 1) {
				encoderFunction();
			} else if (x == 2) {
				decoderFunction();
			} else {
				break;
			}
		}
	}

	public static int menu() {
		while (true) {
			System.out.println("MENU");
			System.out.println("1.Encoder");
			System.out.println("2.Decoder");
			System.out.println("3.Exit");
			System.out.println("====번호를 고르세요====");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();

			if (num == 1) {
				System.out.println("인코딩 하겠습니다");
				break;
			} else if (num == 2) {
				System.out.println("디코딩 하겠습니다");
				break;
			} else if (num == 3) {
				System.out.println("안녕히 가세요~");
				break;
			} else {
				System.out.println("1~3번중 골라주세요~");
			}
		}
		return num;
	}


	public static void encoderFunction() { //인코딩
		Scanner sc = new Scanner(System.in);
		System.out.println("핸드폰번호를 입력해주세요.");
		String text1 = sc.next();
		String text2 = "";
		int text = 0;

		for (int i = 0; i < text1.length(); i++) {
			int changeText = text1.charAt(i);
			for (int j = 48; j <= 57; j++) {
				if (changeText == j) {
					text = changeText + 49;
				}
			}
			text2 += (char) text;
		}
		System.out.println("인코딩 : " + text2 + " 입니다.");
	}


	public static void decoderFunction() { //디코딩
		Scanner sc = new Scanner(System.in);
		System.out.println("인코딩된 영어를 입력해주세요.");
		String text1 = sc.next();
		String text2 = "";
		int text = 0;

		for (int i = 0; i < text1.length(); i++) {
			int changeText = text1.charAt(i);
			for (int j = 97; j <= 106; j++) {
				if (changeText == j) {
					text = changeText - 49;
				}
			}
			text2 += (char) text;
		}
		System.out.println("디코딩 : " + text2 + " 입니다.");

	}
}
