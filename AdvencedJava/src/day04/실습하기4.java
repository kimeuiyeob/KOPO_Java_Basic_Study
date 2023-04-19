package day04;

public class 실습하기4 {

	public static void main(String[] args) {

		// 반복을 총 1부터 13과 같아질때까지 돈다 / 즉 총 12번을 반복한다.
		for (int kopo07_i = 1; kopo07_i < 13; kopo07_i++) {
			System.out.printf(" %d월 => ", kopo07_i); // 월과 i변수값을 출력한다.
			// 반복을 총 1부터 31까지 돈다
			for (int kopo07_j = 1; kopo07_j < 32; kopo07_j++) {

				System.out.print(kopo07_j); // j를 출력한다.

				// i변수 값이 1 이고 j변수 값이 31일때 아래 .을 출력하고 break를 걸어준다.
				if (kopo07_i == 1 && kopo07_j == 31) {
					System.out.print(".");
					break;
				}
				// i변수 값이 2 이고 j변수 값이 28일때 아래 .을 출력하고 break를 걸어준다.
				if (kopo07_i == 2 && kopo07_j == 28) {
					System.out.print(".");
					break;
				}
				// i변수 값이 3 이고 j변수 값이 31일때 아래 .을 출력하고 break를 걸어준다.
				if (kopo07_i == 3 && kopo07_j == 31) {
					System.out.print(".");
					break;
				}
				// i변수 값이 4 이고 j변수 값이 30일때 아래 .을 출력하고 break를 걸어준다.
				if (kopo07_i == 4 && kopo07_j == 30) {
					System.out.print(".");
					break;
				}
				// i변수 값이 5 이고 j변수 값이 31일때 아래 .을 출력하고 break를 걸어준다.
				if (kopo07_i == 5 && kopo07_j == 31) {
					System.out.print(".");
					break;
				}
				// i변수 값이 6 이고 j변수 값이 30일때 아래 .을 출력하고 break를 걸어준다.
				if (kopo07_i == 6 && kopo07_j == 30) {
					System.out.print(".");
					break;
				}
				// i변수 값이 7 이고 j변수 값이 31일때 아래 .을 출력하고 break를 걸어준다.
				if (kopo07_i == 7 && kopo07_j == 31) {
					System.out.print(".");
					break;
				}
				// i변수 값이 8 이고 j변수 값이 31일때 아래 .을 출력하고 break를 걸어준다.
				if (kopo07_i == 8 && kopo07_j == 31) {
					System.out.print(".");
					break;
				}
				// i변수 값이 9 이고 j변수 값이 30일때 아래 .을 출력하고 break를 걸어준다.
				if (kopo07_i == 9 && kopo07_j == 30) {
					System.out.print(".");
					break;
				}
				// i변수 값이 10 이고 j변수 값이 31일때 아래 .을 출력하고 break를 걸어준다.
				if (kopo07_i == 10 && kopo07_j == 31) {
					System.out.print(".");
					break;
				}

				// i변수 값이 11 이고 j변수 값이 30일때 아래 .을 출력하고 break를 걸어준다.
				if (kopo07_i == 11 && kopo07_j == 30) {
					System.out.print(".");
					break;
				}
				// i변수 값이 12 이고 j변수 값이 31일때 아래 .을 출력하고 break를 걸어준다.
				if (kopo07_i == 12 && kopo07_j == 31) {
					System.out.print(".");
					break;
				}
				System.out.print(",");
			}
			System.out.println(); // i번 반복을 한번할때마다 줄바꿈을 출력한다.
		}
	}
}
