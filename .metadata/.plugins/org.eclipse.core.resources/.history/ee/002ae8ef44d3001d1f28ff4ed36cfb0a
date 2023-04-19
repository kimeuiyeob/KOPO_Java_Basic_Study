package 과제7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {

//      User inputs the two words and assign them to lists
//      Print the following information
//       1. Size of the first word
//       2. Size of the second word
//       3. Number of the same characters
//      *Add exception statements
//      school
//      scholar
//      1 : 6
//      2 : 7
//      3 : 5
		
		try {
			String text1 = inputSc1();
			String text2 = inputSc1();
			
			countWordLength1(text1); // 첫번째 text길이
			countWordLength2(text2); // 두번째 text길이
			countWordSame(text1, text2); // 같은 문자 갯수
		} catch (Exception e) {
			System.out.println("에러~~");
		}
	}

	public static String inputSc1() {
		System.out.println("문자 입력");
		Scanner sc = new Scanner(System.in);
		String text1 = sc.next();
		return text1;
	}

	public static void countWordSame(String text1, String text2) {

		String[] text1Array = null;
		String[] text2Array = null;

		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();

		int count = 0;

		for (int i = 0; i < text1.length(); i++) {
			text1Array = text1.split("");
			set1.add(text1Array[i]);
		}
		for (int i = 0; i < text1.length(); i++) {
			text2Array = text2.split("");
			set2.add(text2Array[i]);
		}

		List<String> list1 = new ArrayList<>(set1);
		List<String> list2 = new ArrayList<>(set2);

		if (list1.size() > list2.size()) {
			for (int i = 0; i < list2.size(); i++) {
				for (int j = 0; j < list1.size(); j++) {
					if (list2.get(i).equals(list1.get(j))) {
						count++;
					}
				}
			}
		} else if (list1.size() < list2.size()) {
			for (int i = 0; i < list1.size(); i++) {
				for (int j = 0; j < list2.size(); j++) {
					if (list1.get(i).equals(list2.get(j))) {
						count++;
					}
				}
			}
		} else {
			count = list1.size();
		}
		System.out.println("3 : " + count);
	}

	public static void countWordLength1(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			count++;
		}
		System.out.println("1 : " + count);
	}

	public static void countWordLength2(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			count++;
		}
		System.out.println("2 : " + count);
	}

}
