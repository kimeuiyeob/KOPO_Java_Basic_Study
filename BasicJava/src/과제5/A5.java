package 과제5;

import java.util.Scanner;

public class A5 {

	static String conditionMsg1 = "문자열 길이는 10 이상이어야 합니다.";
	static String conditionMsg3 = "문자열은 길이는 20 이하이어야 합니다.";
	static String conditionMsg2 = "문자열은 문자 'k'를 포함해야 합니다.";
	static String conditionMsg4 = "문자에 특수문자를 포함해야 합니다.";
	static String conditionMsg5 = "문자에 숫자를 포함해야 합니다.";
	static int count = 0;

	public static void main(String[] args) {

//		조건 설정
//		조건의 수는 5개 이상이어야 합니다.
//		예를 들어,
//		  #1 : 문자열 길이는 10 이상이어야 합니다.
//		  #2 : 문자열은 문자 'k'를 포함해야 합니다.
//		-> abdefewqqwer
//		FAIL
//		-> kdefkdie123
//		PASS
		
		String answer = menu();
		conditionSentence(answer);
	}

	public static String menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		System.err.println(conditionMsg1);
		System.err.println(conditionMsg2);
		System.err.println(conditionMsg3);
		System.err.println(conditionMsg4);
		System.err.println(conditionMsg5);
		String msg = sc.next();
		return msg;
	}

	public static void conditionSentence(String msg) {
		while (true) {
			if (msg.length() >= 10) {
				count++;
			}
			if (msg.length() <= 20) {
				count++;
			}
			for (int i = 0; i < msg.length(); i++) {
				int changeMsg = msg.charAt(i);
				if (changeMsg == 107) {
					count++;
				}
			}
			for (int i = 0; i < msg.length(); i++) {
				int changeMsg = msg.charAt(i);
				if (changeMsg >= 33 && changeMsg <= 47) {
					count++;
				}
			}
			for (int i = 0; i < msg.length(); i++) {
				int changeMsg = msg.charAt(i);
				if (changeMsg >= 31 && changeMsg <= 39) {
					count++;
				}
			}
			if (count == 5) {
				System.out.println("PASS");
				break;
			} else {
				System.out.println("FAIL");
				break;
			}
		}

	}
}
