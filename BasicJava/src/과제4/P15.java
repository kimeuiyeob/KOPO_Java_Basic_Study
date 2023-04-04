package 과제4;

import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {

//		User inputs an equation
//		Print the calculated result
//		Hint, String.substring(), String.contains() 

//		5*7.5
//		37.5

//		32/2
//		16

		Scanner sc = new Scanner(System.in);
		String text = sc.next();

		String list1 = "";
		String list2 = "";

		if (text.contains("*")) {
			String[] arry = text.split("\\*");
			list1 = arry[0];
			list2 = arry[1];

			double a = Double.parseDouble(list1);
			double b = Double.parseDouble(list2);
			System.out.println(a * b);

		} else if (text.contains("/")) {
			String[] arry2 = text.split("\\/");
			list1 = arry2[0];
			list2 = arry2[1];

			double a = Double.parseDouble(list1);
			double b = Double.parseDouble(list2);
			
			System.out.println((int)(a / b));
		}

	}

}
