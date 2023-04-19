package day05;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class 영수증출력2 {

	public static void main(String[] args) throws ParseException {

		// 현재 날짜를 가져오는 LocalDateTime객체를 생성해 now에 담아준다.
		LocalDateTime now = LocalDateTime.now();
		// now를 format()함수를 사용해 내가 원하는 형식으로 바꾼뒤 formatedNow에 담아준다.
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
		// now를 format()함수를 사용해 내가 원하는 형식으로 바꾼뒤 formatedNow2에 담아준다.
		String formatedNow2 = now.format(DateTimeFormatter.ofPattern("MM월dd일"));

		// Calendar객체를 생성해 currentDateTime에 담아준다.
		Calendar currentDateTime = Calendar.getInstance();
		// currentDateTime.add()함수를 사용해서 14일 날짜를 더해준다.
		currentDateTime.add(Calendar.DATE, 14);
		// SimpleDateFormat객체를 생성해 내가 원하는 형식으로 포맷한뒤 format1에 담는다.
		SimpleDateFormat format1 = new SimpleDateFormat("MM월dd일");
		// 그리고 format1의 날짜를 formattedCurrentDateTime에 담아준다.
		String formattedCurrentDateTime = format1.format(currentDateTime.getTime());

//		=========================================================
		// 숫자3자리뒤에 ,를 붙이기 위해 포맷 객체를 생성한다.
		DecimalFormat df = new DecimalFormat("###,###,###");
//		=========================================================

		String itemname1 = "비말차단용마스크(최고급형)"; // 아이템을 위해 문자열 변수 생성
		String itemcode1 = "31613"; // 아이템 코드 문자열 변수에 대입
		int price1 = 1231233; // 정수형 변수에 가격 대입
		int amount1 = 1; // 정수형 변수에 수량 대입
		int total1 = price1 * amount1; // 가격 * 수량을 정수형 total대입

		double tax1 = (price1 * amount1) * 1.0; // 부가세 계산을한다.

//		=========================================================

		String itemname2 = "슬라이드식명찰(가로형)(100호)"; // 아이템을 위해 문자열 변수 생성
		String itemcode2 = "8152"; // 아이템 코드 문자열 변수에 대입
		int price2 = 2312330; // 정수형 변수에 가격 대입
		int amount2 = 1; // 정수형 변수에 수량 대입
		int total2 = price2 * amount2; // 가격 * 수량을 정수형 total대입

		double tax2 = (price2 * amount2) * 1.0; // 부가세 계산을한다.

//		=========================================================

		String itemname3 = "매직흡착 인테리어후크(알루미늄타입)"; // 아이템을 위해 문자열 변수 생성
		String itemcode3 = "20800"; // 아이템 코드 문자열 변수에 대입
		int price3 = 2323330; // 정수형 변수에 가격 대입
		int amount3 = 1; // 정수형 변수에 수량 대입
		int total3 = price3 * amount3; // 가격 * 수량을 정수형 total대입

		double tax3 = (price3 * amount3) * 1.0; // 부가세 계산을한다.

		double Alltotal = Math.ceil(total1 + total2 + total3); // 총 금액을 Alltotal에 대입한다.

//		=========================================================

		System.out.printf("            \"국민가게, 다이소\"\n");
		System.out.printf("(주)아성다이소_분당서현점\n");
		System.out.printf("전화:031-702-6016\n");
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		System.out.printf("대표:박정부,신호섭 213-81-52063\n");
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현동)\n");
		System.out.printf("=========================================\n");
		System.out.printf("      소비자중심경영(CCM) 인증기업\n");
		System.out.printf("    ISO 9001 품질경영시스템 인증기업\n");
		System.out.printf("=========================================\n");
		System.out.printf("%15.15s(%s)%s\n", "교환/환불 14일", formattedCurrentDateTime, "이내,"); // 시간을 출력한다.
		System.out.printf("   영수증,결제카드 지참후 구입매장가능\n");
		System.out.printf("   포장/가격 택  훼손시 교환/환불 불가\n");
		System.out.printf("     체크카드 취소 시 최대 7일 소요\n");
		System.out.printf("=========================================\n");
		System.out.printf("[POS 1058231]         %s\n", formatedNow);
		System.out.printf("=========================================\n");
		System.out.printf("%6.6s  %11.11s %3.3s %11.11s\n", itemname1, df.format(price1), df.format(amount1),
				df.format(total1)); // 첫번째 품목의 가격 수량 총금액을 출력한다.
		System.out.printf("[%s]\n", itemcode1);
		System.out.printf("%6.6s  %11.11s %3.3s %11.11s\n", itemname2, df.format(price2), df.format(amount2),
				df.format(total2)); // 두번째 품목의 가격 수량 총금액을 출력한다.
		System.out.printf("[%s]\n", itemcode2);
		System.out.printf("%6.6s   %11.11s %3.3s %11.11s\n", itemname3, df.format(price3), df.format(amount3),
				df.format(total3)); // 세번째 품목의 가격 수량 총금액을 출력한다.
		System.out.printf("[%s]\n", itemcode3);

		double aasd = Alltotal - (tax1 + tax2 + tax3);

		System.out.printf("%14.14s %22.22s\n", "과세합계", df.format(Alltotal - Math.ceil(Alltotal / 11)));

		System.out.printf("%15.15s %22.22s\n", "  부가세", df.format(Math.ceil(Alltotal / 11)));

		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s %32.32s\n", "판매합계", df.format(Alltotal)); // 총금액을 출력한다.
		System.out.printf("=========================================\n");
		System.out.printf("%s %32.32s\n", "신용카드", df.format(Alltotal)); // 총금액을 출력한다.
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s %32.32s\n", "우리카드", "538720**********");
		System.out.printf("%s %s  %s%11.11s\n", "승인번호", "77982853(0)", "승인금액", df.format(Alltotal)); // 총금액을 출력한다.
		System.out.printf("=========================================\n");
		System.out.printf("     %s %s\n", formatedNow, "분당서현점");
		System.out.printf("%s : %s\n", "상품 및 기타 문의", "1522-4400");
		System.out.printf("멤버십 및 샵다이소 관련문의 : 1599-2211\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("◈다이소멤버십앱 or 홈페이지에 접속하셔서\n");
		System.out.printf("  회원가입 후 다양한 혜택을 누려보세요!◈");

	}

}
