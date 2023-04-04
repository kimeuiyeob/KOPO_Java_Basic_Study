package 과제6;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {

//		User inputs more than 10 sets of a name and a score
//		Print the list by name in ascending order
//		Print the list by name in descending order
//		Print the list by score in ascending order
//		Print the list by score in descending order
//		Add exception statements

		Map<String, Integer> hashMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 입력 하시겠습니까?");
		int num = sc.nextInt();
//		String[] strArray =  new String[num];

		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "번째 이름을 입력하세요");
			String name = sc.next();
			System.out.println((i + 1) + "번째 점수를 입력하세요");
			int score = sc.nextInt();
			hashMap.put(name, score);
		}
		

//		name in ascending order
		List<Map.Entry<String, Integer>> keySet = new LinkedList<>(hashMap.entrySet());
		keySet.sort(Map.Entry.comparingByKey());
		for(Map.Entry<String, Integer> entry : keySet){
		    System.out.println("알파벳으로 정렬 - 이름 : " + entry.getKey() + ", 점수 : " + entry.getValue());
		}
		
		System.out.println("===========================");
		
//		name in descending order
		List<Map.Entry<String, Integer>> valueSet = new LinkedList<>(hashMap.entrySet());
		valueSet.sort(Map.Entry.comparingByValue());
		for(Map.Entry<String, Integer> entry : valueSet){
		    System.out.println("점수로 정렬 - 이름 : " + entry.getKey() + ", 점수 : " + entry.getValue());
		}


	}

}
