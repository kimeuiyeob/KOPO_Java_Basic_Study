package 과제6;

import java.util.Scanner;

public class P4 {
	
	static String[] strArray = null;
	
	public static void main(String[] args) {

//		String words = "kim,lee,park";
//		String[] names =words.split(",");
		
		String name = menu();
		splitName(name);
	}
	
	public static String menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름,이름 이렇게 입력");
		String str = sc.nextLine();
		return str;
	}
	
	public static void splitName(String str) {
		for (int i = 0; i < str.length(); i++) {
			strArray = str.split(",");
		}
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("이름 : " + strArray[i]);
		}
	}

}
