package 과제7;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {

//		User inputs a string and a character
//		Find the character from the string and show the order of the first found(case sensitive)
//		Add exception statements
//		사용자가 문자열과 문자를 입력합니다.
//		문자열에서 문자를 찾아 가장 먼저 찾은 순서 표시(대소문자 구분)
//		예외문 추가

//		[Example]
//		South Korea has a earned a reputation as a leading global ICT center
//		s
//		15
//
//		South Korea has a earned a reputation as a leading global ICT center
//		S
//		1

		try {
			String str = sentence1();
			String str2 = sentence1();
			countFun(str, str2);
		} catch (Exception e) {
			System.out.println("에러~~");
		}
	}

	public static String sentence1() {
		System.out.println("문자 입력");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		return str;
	}

	public static void countFun(String BigText, String smallText) {
		String[] charArray = null;
		int count = 0;

		for (int i = 0; i < BigText.length(); i++) {
			charArray = BigText.split("");
		}

		for (int i = 0; i < charArray.length; i++) {
			if (smallText.equals(charArray[i])) {
				break;
			}
			count++;
		}

		System.out.println("총 갯수 : " + (count + 1));
	}

}
