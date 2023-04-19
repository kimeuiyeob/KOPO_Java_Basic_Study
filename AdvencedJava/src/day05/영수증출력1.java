package day05;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class 영수증출력1 {

	public static void main(String[] args) {

		// 정수형 변수 생성 가격으로 초기화
		int kopo07_price = 50000000; // 가격
		// float형 변수 생성뒤 세금을 0.1로 초기화
		float kopo07_tax = 0.1f; // 세금
		// 실수형 변수 totalPrice 생성뒤 소비자 가격을 담아준다.
		float kopo07_totalPrice = kopo07_price + kopo07_price * kopo07_tax; // 소비자 가격

		LocalDateTime kopo07_now = LocalDateTime.now(); // 현재 시간을 가져온다.

		// 시간을 포맷시킨다.
		String kopo07_formatedNow = kopo07_now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

		// DecimalFormat객체를 사용하여 3자리수뒤에,를 추가한다.
		DecimalFormat kopo07_df = new DecimalFormat("###,###,###");

		System.out.printf("%s", " 신용승인\n");
		System.out.printf("%s : %s\n", "단말기", "2N68665898       전표번호:041218");
		System.out.printf("%s : %s\n", "가맹점", "잠실김치찌개");
		System.out.printf("%s : %s\n", "주  소", "경기 성남시 분당구 황새울로351번길 10 , 1층");
		System.out.printf("%s : %s\n", "대표자", "김의엽");
		System.out.printf("%s : %s  %8.8s : %s\n", "사업자", "752-53-00558", "TEL", "7055695");
		System.out.printf("-----------------------------------------\n");
		// 금액을 포맷함수 사용해서 ,를 붙여 출력한다.
		System.out.printf("%s %30.30s 원\n", " 금  액", kopo07_df.format(kopo07_price));
		// 부가세를 포맷함수 사용해서 ,를 붙여 출력한다. / 부가세는 금액 * 세금이다.
		System.out.printf("%s %30.30s 원\n", " 부가세", kopo07_df.format((int) (kopo07_price * kopo07_tax)));
		// 합계금액을 포맷함수 사용해서 ,를 붙여 출력한다. / 합계 금액은 가격 + 금액 * 세금이다.
		System.out.printf("%s %30.30s 원\n", " 합  계", kopo07_df.format((int) kopo07_totalPrice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s", " 우리카드\n");
		System.out.printf("%s : %s %s\n", "카드번호", "5387-20*********4613(S)", "일시불");
		// 현재 날짜 객체를 생성해 포맷된 형태로 만든다음 출력한다.
		System.out.printf("%s : %s\n", "거래일시", kopo07_formatedNow);
		System.out.printf("%s : %s\n", "승인번호", "70404427");
		System.out.printf("%s : %s\n", "거래번호", "357734873739");
		System.out.printf("%s : %s  %3.3s : %s\n", "매입", "비씨카드사", "가맹", "720068568");
		System.out.printf("%s : %s\n", "알림", "EDC매출표");
		System.out.printf("%s : %s\n", "문의", "TEL)1544-4700");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%21.21s\n", "*감사합니다*");
		System.out.printf("%39.39s\n", "표준V2.08_20200212");

	}
}
