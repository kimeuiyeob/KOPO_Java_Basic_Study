package Array;

public class Array {

	public static void main(String[] args) {
		// 정수형 배열 아래 값들로 담아준다.
		int[] kopo07_iArray = { 1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 };

		// 배열안에 갯수만큼 반복을 돌린다.
		for (int kopo07_i = 0; kopo07_i < kopo07_iArray.length; kopo07_i++) {
			// 출력을 해당 인덱스에 값을 출력한다.
			System.out.printf("iArray[%d]=%d\n", kopo07_i, kopo07_iArray[kopo07_i]);
		}

		// 배열안의 최대값 구하기 / 우선적으로 맨앞에 값을 max변수에 담고 다비교하는 방식이다.
		int kopo07_max = kopo07_iArray[0];
		// 최대값이 인덱스 몇번째 있는지를 확인하기 위해서 변수하나를 더만든다.
		int kopo07_number = 0;
		// 배열 갯수만큼 반복을 돌린다 / 최대값을 구하기 위해서는 다 비교해봐야하기 때문이다.
		for (int kopo07_i = 0; kopo07_i < kopo07_iArray.length; kopo07_i++) {
			// 만약 내가 첫번째로 넣은 값보다 인덱스 그다음에 있는값이 더 크다면 그다음값을 max에 넣어서 최대값을 구하는 방식이다.
			if (kopo07_max < kopo07_iArray[kopo07_i]) {
				kopo07_max = kopo07_iArray[kopo07_i];
				kopo07_number = kopo07_i; // 해당 숫자를 변수에 담아 최대값이 몇번째 인덱스에 있는지 확인하는것이다.
			}
		}
		// 최대값과 그 인덱스 위치를 출력한다.
		System.out.printf("MAX : iArray[%d]=%d\n", kopo07_number, kopo07_max);

	}

}
