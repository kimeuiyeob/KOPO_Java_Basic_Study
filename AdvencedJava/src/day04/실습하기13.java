package day04;

import java.text.DecimalFormat;

public class 실습하기13 {

	public static void main(String[] args) {

		String kopo07_item = "사과"; // 문자열 item변수에 "사과" 대입
		int kopo07_unit_price = 5000; // 정수형 unit_price에 5000초기화
		int kopo07_num = 500; // 정수형 num변수에 500 초기화
		int kopo07_total = 0; // 정수형 total변수에 0초기화

		kopo07_total = kopo07_unit_price * kopo07_num; // unit_price와 num 즉 가격과 갯수를 곱한값을 total변수에 담는다.

		// DeciamlFormat객체 생성 => DeciamlFormat객체내부 format()함수로 내가 원하는 모양으로 포맷시킬수 있다.
		DecimalFormat kopo07_df = new DecimalFormat("###,###,###,###,###");

		System.out.printf("==========================================================\n");
		System.out.printf("%20.20s%8.8s%10.10s%10.10s\n", "품목", "단가", "수량", "합계");
		System.out.printf("==========================================================\n");
		// item, unit_price, num, total를 출력한다.
		System.out.printf("%20.20s%10.10s%9.9s%11.11s\n", kopo07_item, kopo07_df.format(kopo07_unit_price),
				kopo07_df.format(kopo07_num), kopo07_df.format(kopo07_total));
		System.out.printf("==========================================================\n");

	}
}
