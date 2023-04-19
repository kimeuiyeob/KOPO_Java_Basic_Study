package day03;

public class 소비자가세금계산2 {

	public static void main(String[] args) {

		int kopo07_price = 1500; // 정수형 변수 생성뒤 1500값을 담는다.
		double kopo07_tax_rate = 0.1; // 더블형 변수 생성뒤 0.1을 담는다.

		int kopo07_netprice = netprice(kopo07_price, kopo07_tax_rate); // 가격과 세율을 보내고 세전가격을 받는다.
		int kopo07_tax = kopo07_price - kopo07_netprice; // 세금은 가격에서 세전가격을 뺀 금액이다.

		System.out.printf("*************************************\n");
		System.out.printf("****** 소비자가,	세전가격,	세금계산 ******\n");
		// 가격,세전가격,세금을 출력한다.
		System.out.printf("소비자가격: %d, 세전가격: %d, 세금: %d\n", kopo07_price, kopo07_netprice, kopo07_tax);
		System.out.printf("*************************************\n");
	}

	// 세전 가격 구하는 함수
	public static int netprice(int kopo07_price, double kopo07_rate) { // 매게변수로 가격과 세율을 받는다.
		return (int) (kopo07_price / (1 + kopo07_rate)); // 가격을 1.1로 나눈값을 정수형으로 형변환뒤 리턴한다.
	}

}
