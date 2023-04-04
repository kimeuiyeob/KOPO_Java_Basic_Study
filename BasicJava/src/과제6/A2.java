package 과제6;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {

//		User inputs a string and assign it into an array
//		User inputs a word and assign it into an array
//		Count how many are the input words included in the string
//
//		I go to school. Where are you going?
//		o
//		6
//
//		I go to school. Where are you going?
//		go
//		3

//		String sentence = "I go to school. Where are you going?";
//		String word = "o";
		
		String sentence = inputSentence();
		String word = inputWord();
		splitSentence(sentence,word);

	}
	
	public static void splitSentence(String sen, String word) {
		String[] senArray = null;
		int count = 0;

		for (int i = 0; i < sen.length(); i++) {
			senArray = sen.split("");
			if (word.equals(senArray[i])) {
				count++;
			}
		}
		System.out.println("총 갯수 : " + count);
	}
	
	public static String inputSentence() { //문장 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요.");
		String sen = sc.nextLine();
		return sen;
	}
	
	public static String inputWord() { //문장 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("한문자를 입력하세요.");
		String word = sc.nextLine();
		return word;
	}

}
