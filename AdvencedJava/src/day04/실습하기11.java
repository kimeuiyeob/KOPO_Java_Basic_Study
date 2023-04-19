package day04;

public class 실습하기11 {

	public static void main(String[] args) {

		// SIN그래프 그리기
		// 360도까지 값 확인
		double kopo07_fSin; // 실수double형 fSin변수 생성

		// 360번의 반복을 돌린다.
		for (int kopo07_i = 0; kopo07_i < 360; kopo07_i++) {
			// Math.sin()함수는 한각에 대한 사인값을 반환한다.
			// Math.sin()함수를 사용해 안에 i*파이/180을 fSin변수에 대입한다.
			kopo07_fSin = Math.sin(kopo07_i * 3.141592 / 180);
			// 출력 정수형 반복되는 i 출력, fSin을 출력한다.
			System.out.printf("%d sin ==> %f\n", kopo07_i, kopo07_fSin);
		}

//		======================================================

		// 360도까지 그리기
		// 360번의 반복을 돌린다.
		for (int i = 0; i < 360; i++) {
			// Math.sin()함수를 사용해 안에 i*파이/180을 fSin변수에 대입한다.
			kopo07_fSin = Math.sin(i * 3.141592 / 180);

			int kopo07_iSpace = (int) ((1.0 - kopo07_fSin) * 50);

			for (int kopo07_j = 0; kopo07_j < kopo07_iSpace; kopo07_j++) {
				System.out.printf(" ");
			}
			System.out.printf("*[%f][%d]\n", kopo07_fSin, kopo07_iSpace);
		}

	}

}
