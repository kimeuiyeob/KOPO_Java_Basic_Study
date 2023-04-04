package 과제6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P888 {

	public static void main(String[] args) {

//		Initialize an array with the elements below
//		  {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20}
//		Sort the array in ascending order and print
//		Sort the array in descending order and print

		List<Integer> list = new ArrayList<>(Arrays.asList(2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20));

		// ascending order
//		Collections.sort(list);
//		System.out.println(list);

		// descending order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

	}

}
