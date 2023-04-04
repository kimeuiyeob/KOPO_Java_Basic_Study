package 과제6;

public class P88 {

	public static void main(String[] args) {

//		Initialize an array with the elements below
//		  {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20}
//		Sort the array in ascending order and print
//		Sort the array in descending order and print

		int[] intArray = { 2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20 };
		int tmp;

//		ascending order
//		for (int i = 0; i < intArray.length; i++) {
//			for (int j = i; j < intArray.length; j++) {
//				
//				if (intArray[j] < intArray[i]) {
//					tmp = intArray[j];
//					intArray[j] = intArray[i];
//					intArray[i] = tmp;
//				}
//			}
//		}
//		for (int i = 0; i < intArray.length; i++) {
//			System.out.println(intArray[i]);
//		}

//		=================================================

//		descending order
		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[j] > intArray[i]) {
					tmp = intArray[j];
					intArray[j] = intArray[i];
					intArray[i] = tmp;
				}
			}
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
