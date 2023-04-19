package day03;

public class 사칙연산3 {

	public static void main(String[] args) {

		int kopo07_ii; // int정수형 변수를 만든다.

		kopo07_ii = 1000 / 3; // 정수형의 나눗셈이므로 소숫점이 발생하지 않는다.
		System.out.printf("#3-1 : %d\n", kopo07_ii); // kopo07_ii는 1000/3의 결과 값이 출력된다. == 333

		kopo07_ii = 1000 % 3; // %는 나머지 연산자이므로 1의 결과값이 나온다.
		System.out.printf("#3-2 : %d\n\n", kopo07_ii);// kopo07_ii는 1000%3의 결과 값이 출력된다. == 1

		for (int kopo07_i = 0; kopo07_i < 20; kopo07_i++) { // 20번의 반복을 돌린다
			System.out.printf("#3-3 : %d\t", kopo07_i); // 20번 반복 출력이 된다. kopo07_i값이 1씩 증가한다.

			if (((kopo07_i + 1) % 5 == 0)) { // 만약 kopo07_i값 + 1이 5로 나눠어 떨어지면
				// 즉 i가 4일때 i+1 % 5 == 0으로 나누어떨어진다.
				System.out.print("\n"); // 줄바꿈을 실행해준다.
			}
		}

	}
}
