package 과제4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {

//		사용자가 한 문장과 한 단어를 입력
//		문장에서 얼마나 많은 입력 단어를 만들 수 있는지 계산

//		I go to school by subway but it takes a very long time to go to school.
//		cool
//		2

		Scanner sc = new Scanner(System.in);
		String inputSentence = sc.nextLine();
		String inputWord = sc.next();

		int result = findNumWords(inputSentence, inputWord);
		System.out.println("결과 : " + result);
	}

	private static int findNumWords(String inputSentence, String inputWord) {
		String[] strArray = inputSentence.split(" ");
		int totalCount = 0;
		for (String str : strArray) {
			totalCount += getCountWord1ContainsWord2(str, inputWord);
		}
		return totalCount;
	}

	private static int getCountWord1ContainsWord2(String word1, String word2) {
		if (word1.length() < word2.length()) {
			return 0;
		}
		Map<Character, Integer> map = getCharacterMapOfWord(word1);
		int count = 0;
		while (removeWordLettersFromMap(map, word2)) {
			count++;
		}
		return count;
	}

	private static Map<Character, Integer> getCharacterMapOfWord(String word) {
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : word.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}
		return map;
	}

	private static boolean removeWordLettersFromMap(Map<Character, Integer> map, String word) {
		boolean result = false;
		List<Character> characterListToRemove = new ArrayList<>();
		for (char ch : word.toCharArray()) {
			if (!map.containsKey(ch)) {
				return false;
			}
			if (map.get(ch) <= 0) {
				return false;
			}
			characterListToRemove.add(ch);
		}
		for (Character ch : characterListToRemove) {
			map.put(ch, map.get(ch) - 1);
		}
		return true;
	}

}