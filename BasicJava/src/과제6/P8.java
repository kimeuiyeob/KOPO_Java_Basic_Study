package 과제6;

import java.util.Arrays;

public class P8 {
	public static void main(String[] args) {

//		Initialize an array with the elements below
//		  {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20}
//
//		Sort the array in ascending order and print
//		Sort the array in descending order and print

		int[] intArray = { 2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20 };
		Arrays.sort(intArray);
		
//		ascending order
//		for (int i = 0; i < intArray.length; i++) {
//			System.out.println(intArray[i]);
//		}

//		descending order
		for (int i = intArray.length - 1; i > 0; i--) {
			System.out.println(intArray[i]);
		}
	}

}
