package 과제7;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {

//		User inputs a number and the number defines the size of an array
//		User inputs numbers more than the defined size
//		In this case, this program prints “error” and starts again from the beginning,
//		Otherwise, assign the numbers into the array, sort and print them

		Scanner sc = new Scanner(System.in);

		boolean continueLooping = true;

		while (continueLooping) {
			try {
				int number = bringArraySize();
				String text = bringInputText();
				InputArray(number, text);
				continueLooping = false;
			} catch (Exception e) {
				System.out.println("error");
			}
		}
	}

	public static void InputArray(int size, String text) {

		char[] charArray = new char[size];
		for (int i = 0; i < text.length(); i++) {
			charArray[i] = text.charAt(i);
		}
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + " ");
		}
	}

	public static int bringArraySize() {
		System.out.println("배열 크기 숫자 입력");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	public static String bringInputText() {
		System.out.println("문장 입력");
		Scanner sc2 = new Scanner(System.in);
		String text = sc2.nextLine();
		return text;
	}

}
