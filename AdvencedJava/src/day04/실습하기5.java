package day04;

public class 실습하기5 {

	public static void main(String[] args) {

		// for문을 통해 반복 12번을 한다 => 이건 월을 반복하는거다.
		for (int kopo07_i = 1; kopo07_i < 13; kopo07_i++) {
			// 월을 출력한다.
			System.out.printf(" %d월 => ", kopo07_i);

			// for문을 통해 31번 반복한다 => 이건 일을 반복하는거다.
			for (int kopo07_j = 1; kopo07_j < 32; kopo07_j++) {
				// 일을 출력한다.
				System.out.printf("%d,", kopo07_j);
				// 만약 월이 4거나 6이거나 7이거나 9이거나 11일때
				if (kopo07_i == 4 || kopo07_i == 6 || kopo07_i == 7 || kopo07_i == 9 || kopo07_i == 11) {
					if (kopo07_j == 30) { // 일이 30일때 break걸어준다.
						break;
					}
				}
				// 만약 월이 2일때
				if (kopo07_i == 2) {
					if (kopo07_j == 28) { // 일이 28일때 break걸어준다.
						break;
					}
				}
			}
			System.out.println();// 월이 한번 반복될때 줄바꿈한다.
		}

	}
}
