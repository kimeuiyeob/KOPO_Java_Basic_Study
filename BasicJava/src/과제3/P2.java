package 과제3;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {

//		I am a boy
//		i AM A BOY

		Scanner sc = new Scanner(System.in);

		int temp = 0;
		String output = "";
		System.out.println("문자열을 입력하세요!");
		String text2 = sc.next();

		for (int i = 0; i < text2.length(); i++) {

			temp = (int) text2.charAt(i);

			if ((temp >= 65) && (temp <= 90)) {
				output += (char) (temp + 32);
			} else if ((temp >= 97) && (temp <= 122)) {
				output += (char) (temp - 32);
			} else {
				output += (char) temp;
			}

		}
		System.out.println(output);

	}

}
