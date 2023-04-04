package 과제6;

import java.util.Arrays;
import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {

//		user inputs a string
//		print the words after splitting it against by a black(“ “)
//		sort them by in descending order and print them again

//		사용자가 문자열을 입력합니다.
//		검정(" ")으로 구분하여 출력
//		내림차순으로 정렬하고 다시 인쇄

		Scanner sc = new Scanner(System.in);

		System.out.println("문자열을 입력하세요~");
		System.out.println("단어의 알파벳순으로 정렬해드립니다.");
		
		String text = sc.nextLine();
		String[] textSplit = null;

		for (int i = 0; i < text.length(); i++) {
			textSplit = text.split(" ");
		}

		Arrays.sort(textSplit, String.CASE_INSENSITIVE_ORDER);
		for (int i = 0; i < textSplit.length; i++) {
			System.out.print(textSplit[i] + " ");

		}

	}

}
