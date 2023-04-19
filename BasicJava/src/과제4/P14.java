package 과제4;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {

//		사용자가 적어도 관사를 포함하는 문장을 입력합니다.
//		자음과 모음 앞의 관사가 맞는지 확인
//		필요한 경우 문서 수정

//		This is a apple.
//		This is an apple.
//
//		This is a school.
//		This is a school.

//		a양쪽에 있는 띄어쓰기를 찾고
//		그앞에 a,e,i,o,u 가 있으면 an으로 바꾼다.

		Scanner sc = new Scanner(System.in);
		System.out.println("영어로 쓰시오!!!");
		String text = sc.nextLine();

		if (text.contains(" a a")) {
			text = text.replaceAll(" a a", " an a");
			System.out.println(text);

		} else if (text.contains(" a e")) {
			text = text.replaceAll(" a e", " an a");
			System.out.println(text);

		} else if (text.contains(" a i")) {
			text = text.replaceAll(" a i", " an a");
			System.out.println(text);

		} else if (text.contains(" a o")) {
			text = text.replaceAll(" a o", " an a");
			System.out.println(text);

		} else if (text.contains(" a u")) {
			text = text.replaceAll(" a u", " an a");
			System.out.println(text);

		} else {
			System.out.println(text);
		}

	}
}
