package day03;

public class 사칙연산5 {

	public static void main(String[] args) {

		int kopo07_MyVal = 14 / 5; // 정수형 변수를 만들었기 때문에 소숫점이 버려진다.
		System.out.printf("#5-1 : %d\n", kopo07_MyVal); // == 2

		double kopo07_MyValF; // double형으로 kopo07_MyValF변수 생성

		kopo07_MyValF = 14 / 5; // 여기서 많이 실수를 하는게 double변수를 생성했다하더라도 연산은 .0을 붙이지 않으면 정수계산을 한다
		System.out.printf("#5-2 : %f\n", kopo07_MyValF); // == 2.000

		kopo07_MyValF = 14.0 / 5; // 이렇게 하나라도 실수를 표현한다면 double형 변수이기 때문에 소숫점까지 계산을 한다.
		System.out.printf("#5-3 : %f\n", kopo07_MyValF); // == 2.800

		kopo07_MyValF = (14.0) / 5 + 0.5; // 먼저 /나누기 계산을 실행한뒤 +0.5를 더해준다.
		System.out.printf("#5-4 : %f\n", kopo07_MyValF); // == 3.3000

		kopo07_MyValF = (14.0) / (5 + 0.5); // 이러면 ()소괄호안에 있는 값을 먼저 연산뒤 / 나눗셈을 연산하므로 결과가 위랑 달라진다.
		System.out.printf("#5-4-1 : %f\n", kopo07_MyValF); // == 2.545455

		kopo07_MyValF = (int) ((14.0) / 5 + 0.5); // 이렇게 되면 실수형으로 먼저 계산뒤 정수형으로 형변환 된다.
		System.out.printf("#5-5 : %f\n", kopo07_MyValF); // == 3.000

		kopo07_MyValF = (int) ((14.0) / (5 + 0.5));
		// () 먼저 실행하므로 결국 14.0 / 5.5가 실행되고 그걸 정수형으로 타입변환하면 소숫점을 버려 2.000을 출력하게된다.
		System.out.printf("#5-5-1 : %f\n", kopo07_MyValF); // == 2.000

	}

}
