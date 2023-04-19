package day03;

public class 사칙연산정리하기 {
	public static void main(String[] args) {

//	1) 사칙연산
//	2) 연산 후 대입
//	3) 누적하기
//	4) 정수형 연산 (버림)
//	5) 나머지(%)연산자의 응용
//	6) 반올림 버림 처리
//	7) 소수점 자리의 반올림 버림 처리

		int kopo07_Number = (5 + 5) * 3 / 2; // 사칙연산 후 정수형 변수에 대입

		for (int kopo07_i = 1; kopo07_i < 7; kopo07_i++) { // 6번 반복 실행
			kopo07_Number += kopo07_i; // i는 1에서부터 5까지 kopo07_Number변수에 누적연산 => 1+2+3+4+5+6의 값을 누적시킨거다.
		}
		System.out.println(kopo07_Number); // == 36

		// 정수형 일의자리 숫자 버림
		kopo07_Number = (kopo07_Number / 10) * 10;
		// 36에서 우선적으로 10을 나누면 3이나온다 그걸 10을 곱하면 30이되므로 일의자리 6이 버려진다.
		System.out.println(kopo07_Number); // == 30

		kopo07_Number = kopo07_Number % 4; // 30에서 4를 나눈 나머지는 2이다.
		System.out.println(kopo07_Number); // == 2

		kopo07_Number += 12345; // 12345를 2와함께 누적한다.
		System.out.println(kopo07_Number); // == 12347

		// 10의자리 버림 처리
		kopo07_Number = (kopo07_Number / 100) * 100; // 12347에서 100을 나누면 123이 되고 그걸 100을 곱하면 12300이되므로 47을 버림처리
		System.out.println(kopo07_Number); // == 12300

		// 10의자리 반올림 처리
		kopo07_Number += 70; // 반올림을 처리하기 위해 12300에 70을 더해주었다.
		kopo07_Number = ((kopo07_Number + 50) / 100) * 100;
		// 12370에서 50을 먼저 더하면 12420이 나오고 그걸 100으로 나누면 124가 나온다 거기서 100을 곱하면 12400이 되서 뒤에
		// 70자리가 반올림 처리
		System.out.println(kopo07_Number); // == 12400

		double kopo07_DoubleNumber = kopo07_Number / 3.0; // double형 변수를 생성뒤 12400를 3.0으로 나눈값을 대입한다.
		System.out.println(kopo07_DoubleNumber); // == 4133.3333

		// 소수점 자리 버림
		System.out.println((int) kopo07_DoubleNumber); // 4133.3333을 정수형으로 형변환하여 소숫점 자리가 버려진다.

	}

}
