package 과제5;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {

//		사용자가 두 문자열을 입력합니다.
//		재배치 후 두 문자열이 동일한 경우 결과 표시

//		[Example]
//		abcdefg
//		fgdceba
//		Yes
//
//		Abbbccd
//		Bbbccda
//		No
//
//		Abc
//		cbA
//		Yes

		Scanner sc = new Scanner(System.in);
		System.out.println("문자 두번 입력!");

		String text1 = sc.next();
		String text2 = sc.next();
		
		answerYesOrNo(text1,text2);
	}

	public static void answerYesOrNo(String text1, String text2) {
		char changeText1 = 0;
		char changeText2 = 0;

		int count = 0;
		for (int i = 0; i < text1.length(); i++) {
			changeText1 = (char) text1.charAt(i);
			for (int j = 0; j < text2.length(); j++) {
				changeText2 = (char) text2.charAt(j);
				if (changeText1 == changeText2) {
					count++;
				}
			}
		}
		
		if (count == text1.length()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
