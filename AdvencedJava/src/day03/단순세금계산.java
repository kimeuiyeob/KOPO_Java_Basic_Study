package day03;

import java.util.Scanner;

public class 단순세금계산 {

	public static void main(String[] args) {

		int kopo07_value = inputSc(); // 내가 낸 금액
		int kopo07_rate = inputSc(); // 세율

		int kopo07_tax = taxcal(kopo07_value, kopo07_rate); // 100으로 나눈 가격을 리턴 / 소숫점없으면 그대로, 있으면 +1 리턴
		printTax(kopo07_value, kopo07_rate, kopo07_tax); // 출력 함수
	}

	// 세금을 계산해주는 함수 / 내가 낸 금액과 세율을 입력 받는다.
	public static int taxcal(int kopo07_value, int kopo07_rate) {
		int kopo07_return; // 리턴해줄 정수형 변수return을 생성

		if (((double) kopo07_value * (double) kopo07_rate / 100.0) == kopo07_value * kopo07_rate / 100) {
			kopo07_return = kopo07_value * kopo07_rate / 100; // 만약 소숫점이 없으면 그대로 리턴
		} else {
			kopo07_return = kopo07_value * kopo07_rate / 100 + 1; // 소숫점이 있다면 +1을해서 리턴
		}
		return kopo07_return; // 나온 값을 리턴한다.
	}

	// 입력받을 인풋 함수 / 세금과 세율을 입력한다.
	public static int inputSc() {
		Scanner sc = new Scanner(System.in); // Scanner객체를 생성해서 입력을 받는다.
		int kopo07_number = sc.nextInt(); // 정수형 number변수에 대입한다.
		return kopo07_number; // number변수를 리턴한다.
	}

	// 출력함수
	public static void printTax(int kopo07_value, int kopo07_rate, int kopo07_tax) {
		System.out.printf("****************************************\n");
		System.out.printf("*******      단순    세금    계산   ********\n");
		System.out.printf("실제 세금 계산 : %f\n", kopo07_value * kopo07_rate / 100.0); // 내가 낸 금액의 세금 계산
		// 세전가격, 세금, 세포함가격을 출력한다.
		System.out.printf("세전가격:%d   세금:%d   세포함가격: %d\n", kopo07_value, kopo07_tax, kopo07_value + kopo07_tax);
		System.out.printf("****************************************\n");
	}

}
