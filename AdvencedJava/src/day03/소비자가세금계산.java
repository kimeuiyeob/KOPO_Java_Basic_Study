package day03;

public class 소비자가세금계산 {

	public static void main(String[] args) {

//		1) 세전가격 = 1234/1.1 = 1121.818181… => 1121원
//		2) 세금 = 1234- 1121 = 113원  // 112.18181으로 세금을 걷을 수 없으니 1원미만은 올려서 받는다.

		int kopo07_price = 1234; // 정수형 변수를 생성해 1234값을 담는다.

		// 세전가격
		double kopo07_pre_tax_price = kopo07_price / 1.1; // 세전 가격은 소비자 가격에서 1.1을 나눈 금액이다.
		System.out.println("세전 가격 : " + (int) kopo07_pre_tax_price); // 정수형으로 형변환해 소숫점을 버린 값을 출력한다.

		// 세금
		int kopo07_tax = kopo07_price - (int) kopo07_pre_tax_price; // 세금은 가격에서 세전가격을 뺀 금액이다.
		System.out.println("세금 : " + kopo07_tax); // 세금을 출력한다.

	}

}
