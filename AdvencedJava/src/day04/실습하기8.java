package day04;

public class 실습하기8 {

	public static void main(String[] args) {

		// 문자열 배열 units 생성뒤 "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" 초기화한다.
		String[] kopo07_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };

		// 반복을 총 100 번 돈다.
		for (int kopo07_i = 0; kopo07_i < 101; kopo07_i++) {

			// 만약 i가 0부터 9까지 라면
			if (kopo07_i >= 0 && kopo07_i < 10) {
				// 일의자리를 출력한다/ 배열에 순서대로 영 일 이 삼 이 들어가있어서 차례대로 뽑으면 같다.
				System.out.println("일의자리 : " + kopo07_units[kopo07_i]);
				// 만약 변수i가 10이랑 같거나 크고 100보다 작으면
			} else if (kopo07_i >= 10 && kopo07_i < 100) {

				// 정수형 변수 i10 과 i0을 생성한다
				int kopo07_i10, kopo07_i0;
				// i10변수에는 i/10을 대입
				kopo07_i10 = kopo07_i / 10;
				// i10변수에는 i%10을 대입
				kopo07_i0 = kopo07_i % 10;

				// 만약 i0변수가 0으과 값이 같다면
				if (kopo07_i0 == 0) {
					// 아래를 출력하고 / 배열 출력은 위랑 동일하게 작동된다.
					System.out.println("십의자리 : " + kopo07_units[kopo07_i10] + "십");
				} else {
					// 아니면 아래를 출력한다.
					System.out.println("십의자리 : " + kopo07_units[kopo07_i10] + "십" + kopo07_units[kopo07_i0]);
				}
			} else {
				// 마지막 반복때 아래가 출력된다.
				System.out.println("==> " + kopo07_i);
			}
		}

	}

}
