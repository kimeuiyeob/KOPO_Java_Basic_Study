package 과제6;

import java.util.Scanner;

public class A22 {

	static String[] senArray=null;
	static String[] worArray=null;
	static int count1 = 0;
	static int count2 = 0;
	static int key = 0;
	
	public static void main(String[] args) {

//		User inputs a string and assign it into an array
//		User inputs a word and assign it into an array
//		Count how many are the input words included in the string
//		I go to school. Where are you going?
//		go
//		3

		String sentence = sentence();
		String word = word();
		countFunction(sentence,word);
		
	}
	
	public static void countFunction(String sen, String word) {
		for (int i = 0; i < sen.length(); i++) {
			senArray = sen.split("");
			worArray = word.split("");
			for (int j = 0; j < worArray.length; j++) {

			}
			if (worArray[key].equals(senArray[i])) {
				count1++;
			}
			if (worArray[key + 1].equals(senArray[i])) {
				count2++;
			}
		}
		if (count1 > count2) {
			System.out.println("만들수 있는 총 갯수 : " + count2);
		} else {
			System.out.println("만들수 있는 총 갯수 : " + count1);
		}
	}
	
	public static String sentence() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요.");
		String sen = sc.nextLine();
		return sen;
	}
	
	public static String word() {
		Scanner sc = new Scanner(System.in);
		System.out.println("한단어를 입력하세요.");
		String word = sc.nextLine();
		return word;
	}

}
