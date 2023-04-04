package 과제6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {

//		User inputs a string
//		Print the encrypted string
//		To encrypt the string, use an array to match characters one to one
//		(ex, original = {1, 2, 3}, encrypted = {a, b, c})
//		Write a scenario and compose it

//		사용자가 문자열을 입력합니다.
//		암호화된 문자열 출력
//		문자열을 암호화하려면 배열을 사용하여 문자를 일대일로 일치시킵니다.
//		(ex, 원본 = {1, 2, 3}, 암호화 = {a, b, c})

		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<>();
		String[] list2 = null;

		List<Character> list3 = new ArrayList<>();

		list.add(sc.next());

		for (int i = 0; i < list.size(); i++) {
			list2 = list.get(i).split(",");
		}

		for (int i = 0; i < list2.length; i++) {
			int input = Integer.parseInt(list2[i]);
			list3.add((char) (input + 96));
		}

		Collections.reverse(list3);
		;
		System.out.print(list3);

	}

}
