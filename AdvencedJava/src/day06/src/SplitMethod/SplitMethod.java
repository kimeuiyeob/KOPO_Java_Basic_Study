package SplitMethod;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class SplitMethod {
//	=======================================================================================
	// 문자열 배열에 아이템 종목들을 담는다.
	static String[] kopo07_items = { "aaaa가나나나다해피홈 SAFE365 핸드크림", "(G)LH원형유리화병 10", "상투과자E", "더블링 나일론 깡 롤페이퍼",
			"해피홈 SAFE 핸드워시", "농심 신라면120g*5", "(대)국내산삼겹살찌개", "오뚜기 진비빔면 156g", "GAP 죽장사과 4-6입/", "순 유기농 바나나(봉)",
			"피코크 탄두리 닭가슴", "(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK", "DZ주니어양말3족C_WH", "프리미엄생연어초밥", "피코크 들깨미역국500",
			"남양 맛있는우유GT 저", "녹차원흑당시럽10입", "진라면소컵(매)65g*6", "케라시스 앰플 트리트", "푸르밀 미숫가루우유", "자일로스갈색설탕500g", "CJ 비비고칩 20G",
			"피코크 들깨미역국500", "흑원당 말차 밀크티", "1+ 등급란 10개입 특대", "동원양반볶음김치기획" };

	// 정수형 배열에 위에 아이템 순서에 맞게 가격을 담는다.
	static int[] kopo07_price = { 10, 6920, 59820, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980,
			7130, 3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980 };

	// 정수형 배열에 위에 아이템 순서에 맞게 수량을 담는다.
	static int[] kopo07_amount = { 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1 };

	// 불린형 배열에 위에 아이템 순서에 맞게 true,false를 담는다 / 이게 세금공제아이템인지 아닌지를 구분하기 위해서이다.
	static boolean[] kopo07_tax = { false, false, false, false, true, false, true, false, true, false, false, false,
			false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, true,
			false, false, false };

	static int kopo07_totalAmount = kopo07_items.length; // 정수형 변수 totalAmount에 아이템 갯수를 담는다. ->반복을 돌리기 위해서다.
	static int kopo07_count = 1; // 정수형 변수 count를 1로 초기화한다. -> 갯수를 세기 위해서다.
	static double kopo07_taxFreeItems = 0; // 실수형 변수 taxFreeItems를 0으로 초기화한다. -> 세금공제아이템의 가격을 담기 위해서다.
	static double kopo07_taxNotFreeItems = 0; // 실수형 변수 taxNotFreeItems를 0으로 초기화한다. -> 세금아이템의 가격을 담기 위해서다.
	static double kopo07_bugase = 0; // 실수형 변수 bugase를 0으로 초기화한다. -> 부가세 가격을 담기 위해서다.
	static double kopo07_TotalPrice = 0; // 실수형 변수 TotalPrice를 0으로 초기화한다. ->총 가격을 담기 위해서다.
	static int i = 0;

	// LocalDateTime객체를 생성해 현재 시간을 now참조변수에 담는다.
	static LocalDateTime kopo07_now = LocalDateTime.now();
	// Calendar객체를 가져와 currentDateTime에 담는다.
	Calendar kopo07_currentDateTime = Calendar.getInstance();
	// DecimalFormat객체를 사용해 숫자 3자리마다,를 붙여준다.
	static DecimalFormat kopo07_df = new DecimalFormat("###,###,###,###,###");

//	=======================================================================================
//	=======================================================================================

	public static void main(String[] args) {
		int itemCounnt = kopo07_items.length; // 아이템 갯수를 itemCounnt변수에 담는다.
		TitlePrint(); // 제목을 출력한다.
		HeaderPrint(); // 헤더를 출력한다.
		for (int i = 0; i < itemCounnt; i++) {
			itemPrint(i); // 아이탬 갯수만큼 반복을 돌려 아이템들을 출력한다.
		}
		TotalPrint();// 총합을 출력한다.
	}

//	=======================================================================================
//	=======================================================================================

	// 바이트로 아이템 문자열 갯수 세서 자르기
	public static void itemSub() {
		for (int i = 0; i < kopo07_items.length; i++) { // 아이템 갯수만큼 반복을 돌린다.
			// 모든 아이템에 저만큼의 공백을 추가해서 붙인다. / 공백을 붙이는 이유는 아이템이름이 바이트14보다 길이가 작은아이템이 있을수도
			// 있어서이다.
			kopo07_items[i] += "                          ";
			int kopo07_getBytesCount = 0; // 바이트갯수를 세기 위한 변수 생성
			for (int j = 0; j < kopo07_items[i].length(); j++) { // 아이템 하나당 길이만큼 반복을 돌린다.
				char changeText = kopo07_items[i].charAt(j); // 아이템 하나의 한문자를 가져와 변수에 담는다.
				kopo07_getBytesCount += String.valueOf(changeText).getBytes().length; // 그 문자의 바이트 길이를 가져와 변수에 담는다.
				if (kopo07_getBytesCount == 13) { // 아이템 길이만큼 반복을 돌리니까 계속 반복을 돌다가 바이트갯수가 13만큼 차지면 아래로 들어간다.
					char checkText = kopo07_items[i].charAt(j + 1); // 13바이트 다음으로 올 문자를 변수에 담는다.
					// checkText변수의 바이트 길이를 checking에 담는다./이때 2가 담기면 한글이고 1이담기면 나머지문자이다.
					int checking = String.valueOf(checkText).getBytes().length;
					if (checking == 1) { // 만약 checking이 1이라면
						// 해당 아이템에 넘어올 마지막 문자를 자른다.
						kopo07_items[i] = kopo07_items[i].substring(0, j + 2);
					} else {
						// 아니면 해당 아이템에 넘어올 마지막 문자에 빈공백을 추가한다.
						kopo07_items[i] = kopo07_items[i].substring(0, j + 1) + " ";
					}
					// 14로 맞아 떨어지면 다음 넘어올 문자를 자른다.
				} else if (kopo07_getBytesCount == 14) {
					kopo07_items[i] = kopo07_items[i].substring(0, j + 1);
				}
			}
		}
	}

//	=======================================================================================
	// 헤더를 출력한다.
	public static void TitlePrint() {
		System.out.printf("%s %29.29s\n", "emart", "이마트 죽전점 (031)888-1234");
		System.out.printf("%30.30s\n", "206-86-50913 강희석");
		System.out.printf("%29.29s\n", "용인 수지구 포은대로 552");
		System.out.printf("\n");
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");
		System.out.printf("\n");
	}

//	=======================================================================================
	// 시간 함수들은 각각의 형식에 맞춰 메서드를 생성한다.
	public static String TimeStamp1() {
		String kopo07_formatedNow = kopo07_now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		return kopo07_formatedNow;
	}

	public static String TimeStamp2() {
		String kopo07_formatedNow2 = kopo07_now.format(DateTimeFormatter.ofPattern("MM월dd일"));
		return kopo07_formatedNow2;
	}

	public static String TimeStamp3() {
		String kopo07_formatedNow3 = kopo07_now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		return kopo07_formatedNow3;
	}

	public static String TimeStamp4() {
		String kopo07_formatedNow4 = kopo07_now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		return kopo07_formatedNow4;
	}

	// 주차시간을 불러오는 함수이다.
	public static String ParkingTime() {
		// Calendar객체를 가져와 currentDateTime참조변수에 담는다. / 이 객체를 생성한 이유는 Calendar객체에서 쉽게
		// 날짜시간등을 더하고 뺄수 있기때문이다.
		Calendar kopo07_currentDateTime = Calendar.getInstance();
		// .add메소드를 통하여 시간을 -2시간만큼 더해준다.
		kopo07_currentDateTime.add(Calendar.HOUR, -2);
		// 내가 원하는 날짜 형식을 kopo07_format1에 담아준다.
		SimpleDateFormat kopo07_format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// formattedCurrentDateTime변수에 내가 원하는 형식에다 -2시간을 해준 그 변수를 담는다.
		String kopo07_formattedCurrentDateTime = kopo07_format1.format(kopo07_currentDateTime.getTime());
		// 리턴한다.
		return kopo07_formattedCurrentDateTime;
	}

//	=======================================================================================

	// 헤더 출력
	public static void HeaderPrint() {
		String kopo07_time1 = TimeStamp1();
		// TimeStamp1()호출해 원하는 시간형식을 time변수에 담는다.
		System.out.printf("[%s]%s%18.18s\n", "구 매", kopo07_time1, "POS:0011-9861"); // time을 출력한다.
		System.out.printf("-----------------------------------------\n");
		System.out.printf("  %s %15.15s %4.4s %5.5s\n", "상품명", "단 가", "수량", "금 액");
		System.out.printf("-----------------------------------------\n");
	}

//	=======================================================================================
	// 아이템 출력
	public static void itemPrint(int itemlength) { // 아이템을 출력하기 위해서 파라미터로 갯수를 받는다.
		// itemSub()메서드를 통하여 먼저 아이템들을 내가 원하는 만큼 잘라준다.
		itemSub();
		// 여기 true / false는 해당 아이템이 세금아이템인가 세금혜택 아이템인가를 판별하기 위한 조건문이다.
		if (kopo07_tax[i] == false) {
			// 세금 아이템이 아니라면 출력문 앞에 빈공백을 추가하여 출력한다.
			System.out.printf("%s %s%11.11s%3.3s%11.11s\n", " ", kopo07_items[i], kopo07_df.format(kopo07_price[i]),
					kopo07_df.format(kopo07_amount[i]), kopo07_df.format(kopo07_price[i] * kopo07_amount[i]));
			kopo07_TotalPrice += (kopo07_price[i] * kopo07_amount[i]);
		}
		if (kopo07_tax[i] == true) {
			// 세금 아이템이라면 출력문 앞에 별을 추가하여 출력한다.
			System.out.printf("%s %s%11.11s%3.3s%11.11s\n", "*", kopo07_items[i], kopo07_df.format(kopo07_price[i]),
					kopo07_df.format(kopo07_amount[i]), kopo07_df.format(kopo07_price[i] * kopo07_amount[i]));
			kopo07_taxFreeItems += (kopo07_price[i] * kopo07_amount[i]);
		}
		// 아이템이 5개씩 나올때마다 ----을 추가한다.
		if (kopo07_count % 5 == 0) {
			System.out.printf("-----------------------------------------\n");
		}
		// 반복이 한번돌때마다 count , i 를 1씩 증감한다.
		kopo07_count++;
		i++;
		kopo07_bugase = (int) kopo07_TotalPrice / 11; // 부가세 계산을 한다.
		// 부가세금액에 마지막 소숫점을 올림을 해야하기 때문에 Math.ceil함수를 사용했다.
		kopo07_taxNotFreeItems = kopo07_TotalPrice - (Math.ceil(kopo07_TotalPrice / 11));
	}

//	=======================================================================================
	// 하단 추력
	public static void TotalPrint() {
		SplitMethod kopo07_splitMethod = new SplitMethod();
		// ParkingTime()메서드를 호출해 해당 값을 parkingTime에 담는다.
		String kopo07_parkingTime = kopo07_splitMethod.ParkingTime();
		// TimeStamp4()메서드를 호출해 해당 값을 time에 담는다.
		String kopo07_time4 = kopo07_splitMethod.TimeStamp4();

		System.out.printf("\n");
		System.out.printf("%22.22s %13.13s\n", "총 품목 수량", kopo07_df.format(kopo07_totalAmount));
		System.out.printf("%23.23s %13.13s\n", "(*)면 세  품 목", kopo07_df.format(kopo07_taxFreeItems));
		System.out.printf("%23.23s %13.13s\n", "과 세  물 품", kopo07_df.format(kopo07_taxNotFreeItems));
		System.out.printf("%24.24s %13.13s\n", "부   가   세",
				kopo07_df.format(kopo07_TotalPrice - kopo07_taxNotFreeItems));
		System.out.printf("%25.25s %13.13s\n", "합        계", kopo07_df.format(kopo07_TotalPrice + kopo07_taxFreeItems));
		System.out.printf("%s %23.23s\n", "결 제 대 상 금 액", kopo07_df.format(kopo07_TotalPrice + kopo07_taxFreeItems));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s %27.27s\n", "0012 KEB 하나", "541707**0484/35860658");
		System.out.printf("%s    %11.11s %10.10s\n", "카드결제(IC)", "일시불 /",
				kopo07_df.format(kopo07_TotalPrice + kopo07_taxFreeItems));

		System.out.printf("-----------------------------------------\n");
		System.out.printf("           [신세계포인트 적립]\n");
		System.out.printf("홍*두 고객님의 포인트 현황입니다.\n");
		System.out.printf("%s %18.18s %7.7s\n", "금회발생포인트", "9350**9995", "164");
		System.out.printf("%s %17.17s %6.6s\n", "누계(가용)포인트", "5,637(", "5,473)");
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("   구매금액기준 무료주차시간 자동부여\n");
		System.out.printf("%s : %29.29s\n", "차량번호", "27무****");
		System.out.printf("%s : %30.30s\n", "입차시간", kopo07_parkingTime);
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s %24.24s\n", "캐셔:084599 양OO", "1150");
		System.out.printf("%14.14s%s\n", kopo07_time4, "/00119861/00164980/31");
	}
}
