package 과제7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {

//		User inputs a series of numbers and assign them to a queue
//		User input a number from the series of numbers
//		Print the number in order of output
//		Add exception statements
//		사용자가 일련의 숫자를 입력하고 대기열에 할당합니다.
//		사용자가 일련의 숫자에서 숫자를 입력했습니다.
//		출력 순서대로 숫자 출력
//		예외문 추가
//
//		1 21 13 34 15 16
//		13
//		3

		try {
			String str = sentence1();
			String str2 = sentence1();
			printOrderQue(str, str2);

		} catch (Exception e) {
			System.out.println("에러~~");
		}
	}

	public static void printOrderQue(String str, String str2) {

		Queue<String> que = new LinkedList<>();
		String[] strArray = null;
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			strArray = str.split(" ");
		}
		for (int i = 0; i < strArray.length; i++) {
			que.add(strArray[i]);
		}
		for (int i = 0; i < strArray.length; i++) {

			que.remove();
			count++;
			if (Integer.parseInt(str2) == Integer.parseInt(que.peek())) {
				break;
			}
		}
		System.out.println("위치 : " + (count + 1));
	}

	public static String sentence1() {

		System.out.println("문자 입력");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		return str;
	}

}
