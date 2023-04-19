package day03;

public class 사칙연산2 {
	public static void main(String[] args) {

		int kopo07_sum; // 정수형 kopo07_sum변수를 생성
		kopo07_sum = 0; // kopo07_sum변수에 0을 대입

		for (int kopo07_i = 1; kopo07_i < 101; kopo07_i++) { // kopo07_sum변수에 +1을 100번 반복동안 누적한다.
			kopo07_sum = kopo07_sum + kopo07_i; // kopo07_sum = 5050
		}

		System.out.printf("#2-1 : %d\n", kopo07_sum); // 총 누적된 값
		System.out.printf("#2-2 : %d\n", kopo07_sum / 100); // 위의 합계에 100을 나눈 값 = 50

		int[] kopo07_v = { 1, 2, 3, 4, 5 }; // 정수형 배열 kopo07_v에 1,2,3,4,5를 집어넣어 생성한다.
		int kopo07_vSum;// 정수형 kopo07_vSum변수 생성
		kopo07_vSum = 0;// kopo07_vSum에 0 대입

		for (int kopo07_i = 0; kopo07_i < 5; kopo07_i++) { // 배열의 갯수가 5개 이므로 5번 반복을 돌린다
			kopo07_vSum = kopo07_vSum + kopo07_v[kopo07_i]; // 각각의 인덱스 안의 값을 kopo07_vSum에 누적한다.
		}

//		for (int kopo07_i : kopo07_v) { // 빠른 for문을 사용해도 같은 결과값을 만들어 낼수있다. 배열안의 값이 1,2,3,4,5가 있으니까 그냥 i로 계산
//			kopo07_vSum = kopo07_vSum + kopo07_i;
//		}

		System.out.printf("#2-3 : %d\n", kopo07_vSum); // 총 누적결과 값 = 15
	}
}
