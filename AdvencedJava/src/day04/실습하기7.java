package day04;

public class 실습하기7 {

	public static void main(String[] args) {

		// 정수형 배열을 만들어 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31값으로 초기화한다.
		int[] kopo07_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 반복을 돌린다 / 1부터 12까지 / 1씩 증가
		for (int kopo07_i = 1; kopo07_i < 13; kopo07_i++) {

			// 월을 출력한다 월은 변수i이므로 총 12번 반복한다.
			System.out.printf(" %d월 => ", kopo07_i);

			// 반복을 돌린다 / 1부터 32까지 / 1씩 증가
			for (int kopo07_j = 1; kopo07_j < 32; kopo07_j++) {
				// 일을 출력한다 일은 변수j이므로 총 31번 반복한다.
				System.out.printf("%d", kopo07_j);

				// 만약 정수형 배열 첫번째 값 31이 j변수 31과 같다면 break건다 / 이런식으로 반복한다.
				if (kopo07_iLMD[kopo07_i - 1] == kopo07_j) {
					break;
				}
				// if문 밖에 ,찍은 이유는 마지막날에 ,를 안찍기 위해서다.
				System.out.printf(",");
			}
			// 월이 한번 반복 돌때 줄바꿈을 한다.
			System.out.println();
		}
	}

}
