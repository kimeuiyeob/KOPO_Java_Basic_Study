package day03;

public class 사칙연산4 {

	public static void main(String[] args) {
		
		int kopo07_ii; // 정수형 kopo07_ii변수 생성
		kopo07_ii = 12345; // kopo07_ii에다 12345값 대입
		int kopo07_j = (kopo07_ii / 10) * 10; // kopo07_j변수에다 (kopo07_ii / 10) * 10 결과값 대입
		// (12345 / 10 ) * 10 == 12340
		System.out.printf("#4-1 : %d\n", kopo07_j); // == 12340

		kopo07_ii = 12345; // kopo07_ii에다 12345값 대입
		kopo07_j = ((kopo07_ii + 5) / 10) * 10; /// kopo07_j변수에다 (kopo07_ii + 5 / 10) * 10 결과값 대입
		// (12345 + 5 / 10 ) * 10 == 12340
		System.out.printf("#4-2 : %d\n", kopo07_j); // == 12350

		kopo07_ii = 12344; // kopo07_ii에다 12344값 대입
		kopo07_j = ((kopo07_ii + 5) / 10) * 10; /// kopo07_j변수에다 (kopo07_ii + 5 / 10) * 10 결과값 대입
		// (12345 + 5 / 10 ) * 10 == 12340
		System.out.printf("#4-3 : %d\n", kopo07_j); // == 12340

		System.out.println();
		
//		===============================================================

		// #4-X. 100원 이하 버림 올림 , 1000원 이하 버림 반올림을 구하여라.
		kopo07_ii = 12344;
		// 100원 버림
		kopo07_j = (kopo07_ii / 100) * 100;
		// 12344를 먼저 100으로 나누기때문 123이나오고 그걸 100 곱하면 12300나온다.
		System.out.printf("#4-X-1 : %d\n", kopo07_j);

		// 100원 올림
		kopo07_j = ((kopo07_ii + 100) / 100) * 100;
		// 12344에 100을 먼저 더하면 12444에서 100을 나무녀 124가 나오고 그걸 100곱하면 12400나온다.
		System.out.printf("#4-X-2 : %d\n", kopo07_j);

		// 1000원 버림
		kopo07_j = (kopo07_ii / 1000) * 1000;
		// 12344를 먼저 1000으로 나누기때문 12이나오고 그걸 1000 곱하면 12000나온다.
		System.out.printf("#4-X-3 : %d\n", kopo07_j);

		// 1000 반올림
		kopo07_j = ((kopo07_ii + 500) / 1000) * 1000;
		// 12344를 먼저 500더하면 12844 가나오고 그걸 1000으로 나누면 12가 나오고 그걸 1000곱하면 12000이된다.
		System.out.printf("#4-X-4 : %d\n", kopo07_j);

		// 1000 반올림 화인
		kopo07_ii += 500; // 12844
		kopo07_j = ((kopo07_ii + 500) / 1000) * 1000;
		// 12844를 먼저 500더하면 13344 가나오고 그걸 1000으로 나누면 13가 나오고 그걸 1000곱하면 13000이된다.
		System.out.printf("#4-X-5 : %d\n", kopo07_j);

	}

}
