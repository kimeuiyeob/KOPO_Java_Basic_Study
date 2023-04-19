package Array;

import java.util.ArrayList;

public class ArrayListPrac {

	public static void main(String[] args) {

		// 제네릭 즉 타입이 String형의 리스트를 생성한다.
		ArrayList<String> kopo07_list = new ArrayList<>();

		// 리스트는 add라는걸로 값을 집어넣는다.
		kopo07_list.add("abc");
		kopo07_list.add("abcd");
		kopo07_list.add("efga");
		kopo07_list.add("가나다0");
		kopo07_list.add("1234");
		kopo07_list.add("12rk34");

		System.out.printf("******************************************\n");
		System.out.printf(" 시작 ArraySize %d \n", kopo07_list.size()); // 리스트 갯수 출력
		// 리스트 갯수만큼 반복하고 첫번째 값들부터 하나하나 출력
		for (int kopo07_i = 0; kopo07_i < kopo07_list.size(); kopo07_i++) {
			// 리스트 안에 값들을 출력
			System.out.printf(" ArrayList %d = %s\n", kopo07_i, kopo07_list.get(kopo07_i));
		}

		// set은 3번째 인덱스안에 값을 바까주는것이다.
		kopo07_list.set(3, "가라라라");
		System.out.printf("******************************************\n");
		System.out.printf(" 내용 변경 ArraySize %d \n", kopo07_list.size()); // 리스트 갯수 출력
		// 리스트 갯수만큼 반복하고 첫번째 값들부터 하나하나 출력
		for (int kopo07_i = 0; kopo07_i < kopo07_list.size(); kopo07_i++) {
			// 리스트 안에 값들을 출력
			System.out.printf(" ArrayList %d = %s\n", kopo07_i, kopo07_list.get(kopo07_i));
		}

		// remove은 4번째 인덱스의 값을 지우는것이다.
		kopo07_list.remove(4);
		System.out.printf("******************************************\n");
		System.out.printf(" 내용 변경 ArraySize  %d \n", kopo07_list.size()); // 리스트 갯수 출력
		// 리스트 갯수만큼 반복하고 첫번째 값들부터 하나하나 출력
		for (int kopo07_i = 0; kopo07_i < kopo07_list.size(); kopo07_i++) {
			// 리스트 안에 값들을 출력
			System.out.printf(" ArrayList %d = %s\n", kopo07_i, kopo07_list.get(kopo07_i));
		}

		// sort는 리스트안에 값들을 순서대로 정렬한다 숫자 다음 알파벳 다음 한글순이다.
		kopo07_list.sort(null);
		System.out.printf("******************************************\n");
		System.out.printf(" 내용 변경 ArraySize  %d \n", kopo07_list.size()); // 리스트 갯수 출력
		// 리스트 갯수만큼 반복하고 첫번째 값들부터 하나하나 출력
		for (int kopo07_i = 0; kopo07_i < kopo07_list.size(); kopo07_i++) {
			// 리스트 안에 값들을 출력
			System.out.printf(" ArrayList %d = %s\n", kopo07_i, kopo07_list.get(kopo07_i));
		}

		// clear removeAll 은즉 리스트안을 비우겠다는거다.
		kopo07_list.clear(); // removeAll 비슷한거다.
		System.out.printf("******************************************\n");
		System.out.printf(" 전부 삭제 ArraySize %d \n", kopo07_list.size()); // 리스트 갯수 출력
		// 리스트 갯수만큼 반복하고 첫번째 값들부터 하나하나 출력
		for (int kopo07_i = 0; kopo07_i < kopo07_list.size(); kopo07_i++) {
			// 리스트 안에 값들을 출력
			System.out.printf(" ArrayList %d = %s\n", kopo07_i, kopo07_list.get(kopo07_i));
		}

	}

}
