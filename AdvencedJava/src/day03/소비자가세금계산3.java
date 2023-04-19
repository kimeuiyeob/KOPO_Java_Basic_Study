package day03;

public class 소비자가세금계산3 {

	public static void main(String[] args) {

		// 문자열 배열을 생성뒤 초기값으로 "맛동산", "웨하스", "롯데센드", "오땅", "샤브레" 담는다.
		String[] kopo07_items = { "맛동산", "웨하스", "롯데센드", "오땅", "샤브레" };
		// 정수형 배열을 생성뒤 초기값으로 1000, 2000, 3000, 2500, 1450 담는다.
		int[] kopo07_price = { 1000, 2000, 3000, 2500, 1450 };
		// 정수형 배열을 생성뒤 초기값으로 10, 2, 1, 3, 5 담는다.
		int[] kopo07_amount = { 10, 2, 1, 3, 5 };
		// 더블형 변수에 0.1을 담는다.
		double kopo07_tax_rate = 0.1;
		// 총 합계를 넣어줄 정수형 변수를 생성한다.
		int kopo07_total_sum = 0;

		System.out.printf("*****************************************\n");
		System.out.printf("*****************영 수 증******************\n");
		System.out.printf("*****************************************\n");
		System.out.printf("             너가 질러버린 과자들\n");
		System.out.printf(" 항목        단가         수량            합계\n");
		for (int i = 0; i < kopo07_items.length; i++) { // 배열의 갯수만큼 반복을 돌린다 즉 5번 반복이 돌꺼다.
			int sum = kopo07_price[i] * kopo07_amount[i]; // 가격의 0번째 방과 수량의 0번째 방의 값을 곱해 sum변수에 담는다.
			kopo07_total_sum += sum; // 합계를 total_sum에 누적시킨다.
			// 각각의 아이템, 가격, 수량, 합계를 0번부터 4번까지 출력한다.
			System.out.printf("%.5s\t%7d\t\t%2d\t%9d\n", kopo07_items[i], kopo07_price[i], kopo07_amount[i], sum);
		}
		System.out.printf("*****************************************\n");
		System.out.printf(" 지불금액\t: %20d\n", kopo07_total_sum); // 총합계 금액을 출력한다.

		// 총 합계 금액을 1.1로 나눈뒤 정수형으로 타입변환해 소숫점을 버린 값을 total_net_price에 담는다.
		int kopo07_total_net_price = (int) (kopo07_total_sum / (1 + kopo07_tax_rate));
		System.out.printf(" 과세금액\t: %20d\n", kopo07_total_net_price);
		int kopo07_tax = kopo07_total_sum - kopo07_total_net_price; // 총합계 금액에서 과세금액을 뺀 값을 kopo07_tax에 담는다.
		System.out.printf(" 세  금\t: %20d\n", kopo07_tax); // 세금을 출력한다.
		System.out.printf("*****************************************\n");
		System.out.printf("*****************************************\n");
		System.out.printf("*****************************************\n");
	}

}
