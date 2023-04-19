package Array;

import java.util.ArrayList;

public class ArrayListPrac2 {

	public static void main(String[] args) {

		// 정수변수에 1000000으로 초기화
		int kopo07_iTestMax = 1000000;
		// Integer타입으로 리스트 생성
		ArrayList<Integer> kopo07_list = new ArrayList<>();

		// 위에 값만큼 반복을 돌린다.
		for (int kopo07_i = 0; kopo07_i < kopo07_iTestMax; kopo07_i++) {
			// 리스트에 랜덤값들을 담는다.
			kopo07_list.add((int) (Math.random() * 1000000));
		}

		// 리스트사이즈 즉 리스트안에있는 값들의 갯수만큼 반복돈다. -> 1000000 돈다.
		for (int kopo07_i = 0; kopo07_i < kopo07_list.size(); kopo07_i++) {
			// 각각의 값들을 하나씩 get()을통해 출력한다.
			System.out.printf(" ArrayList %d = %d\n", kopo07_i, kopo07_list.get(kopo07_i));
		}

		System.out.printf("*****************************\n");
		// sort()함수를 사용하여 안에있는 값들을 순서대로 정렬시킨다.
		kopo07_list.sort(null);
		// 리스트 값들만큼 반복돈다.
		for (int kopo07_i = 0; kopo07_i < kopo07_list.size(); kopo07_i++) {
			// 각각의 값들을 하나씩 get()을통해 출력한다. -> 이러면 숫자가 정렬된 상태로 다시 출력된다.
			System.out.printf(" ArrayList %d = %d\n", kopo07_i, kopo07_list.get(kopo07_i));
		}
	}

}
