package receipt;

import java.text.DecimalFormat;

public class Receipt1 {

	public static void main(String[] args) {

		// 3자리 숫자뒤에 ,를 붙이기 위해서 DecimalFormat객체 생성뒤 포맷형식 정해준다.
		DecimalFormat kopo07_df = new DecimalFormat("###,###,###,###,###");

		String[] kopo07_items = { 
				"01   안녕하세여         30,000  1     32,000", "02   (G)LH원형유리       6,920  1      7,000",
				"03   상투과자E          59,820  1     59,820", "04   더블링 나일론       3,300  1      3,300",
				"05*  해피홈 SAFE 핸드    5,500  2     11,000", "06   농심 신라면120      3,380  1      3,380",
				"07*  (대)국내산삼겹      6,610  1      6,610", "08   오뚜기 진비빔       2,750  1      2,750",
				"09*  GAP 죽장사과 4개   10,800  1     10,800", "10   순 유기농 바나      4,980  1      4,980",
				"11   피코크 탄두리       2,480  1      2,480", "12   (달콤)순살닭강      7,920  1      7,920",
				"13   DZ주니어양말3족     4,980  1      4,980", "14   DZ주니어양말3       4,980  1      4,980",
				"15   프리미엄생연어      7,130  1      7,130", "16   피코크 들깨미       3,980  1      3,980",
				"17*  남양 맛있는우       4,480  1      4,480", "18   녹차원흑당시럽      4,980  1      4,980",
				"19   진라면소컵(매)      3,210  1      3,210", "20   케라시스 앰플      10,000  1     10,000",
				"21   푸르밀 미숫가루     2,980  2      5,960", "22   자일로스갈색설      1,990  1      1,990",
				"23   CJ 비비고칩 20개    1,980  1      1,980", "24   피코크 들깨         3,980  1      3,980",
				"25   흑원당 말차 밀가루  4,480  1      4,480", "26*  1+ 등급란 10개      3,480  2      7,960",
				"27   동원양반볶음김치    7,980  1      7,980" };

//      =========================================================================================================================

		// 이중배열 생성 / 배열안에 갯수만큼 열을 만들고 행은 문자열의 길이로 정한다. => 문자열의 길이가 다 같기때문이다.
		String[][] kopo07_matrix = new String[kopo07_items.length][kopo07_items[0].length()];

		// 2중배열의 열만큼 반복을 돈다.
		for (int kopo07_i = 0; kopo07_i < kopo07_items.length; kopo07_i++) {
			// 한 인덱스안에 하나의 문자열 sentence변수에 담는다.
			String kopo07_sentence = kopo07_items[kopo07_i];
			// getStringArray()메서드를 사용하여 안에 문자열을 하나씩 담기위해서다.
			String[] kopo07_row = getStringArray(kopo07_sentence);
			// 이러면 한 배열에 있던 아이템들이 각각의 배열로 들어가게 된다.
			kopo07_matrix[kopo07_i] = kopo07_row;
		}

		// 배열의 갯수만큼 반복을 돈다.
		for (String kopo07_sentence : kopo07_items) {
			// 배열안의 값을 " " 공백 기준으로 찢는다. => 이때 " "이거는 결국 2개의 배열에 찢어서 넣는건데
			// split(" +") 이렇게 공백안에 +를 추가해주면 여러배열로 split해서 들어가게된다.
			// => 이러면 0번째는 번호, 1번째는 이름, 2번째는 가격, 3번째는 수량, 4번째는 총합금액이 들어갈것이다.
			String[] kopo07_splitArray = kopo07_sentence.split("  +");
			// 출력하기 위해 각가의 변수들에 값들을 담아준다.
			String kopo07_nums = kopo07_splitArray[0];
			String kopo07_names = kopo07_splitArray[1];
			
			// 정수형으로 곱셈 및 연산이 필요하기 때문에 ","를 없애주고 인티져로 형변환을 시킨다.
			
			int kopo07_price = Integer.parseInt(kopo07_splitArray[2].replace(",", ""));
			int kopo07_quantity = Integer.parseInt(kopo07_splitArray[3]);
			int kopo07_total = Integer.parseInt(kopo07_splitArray[4].replace(",", ""));

			// 출력할 내용이 가격과 수량이 곱했을때 나오는 총합금액이 틀렸을때이니까 이렇게 조건문을 만든다.
			if (kopo07_price * kopo07_quantity != kopo07_total) {

				System.out.println("************************************************************");
				System.out.printf("오류[%-5.5s %-12.12s\t\t%6.6s   %s   %6.6s]\n", kopo07_nums, kopo07_names,
						kopo07_df.format(kopo07_price), kopo07_quantity, kopo07_df.format(kopo07_total));
				System.out.printf("수정[%-5.5s %-12.12s\t\t%6.6s   %s   %6.6s]\n", kopo07_nums, kopo07_names,
						kopo07_df.format(kopo07_price), kopo07_quantity,
						kopo07_df.format(kopo07_price * kopo07_quantity));
				System.out.println("************************************************************");

			}
		}
	}

	static String[] getStringArray(String kopo07_sentence) {
		// 매게변수로 나라온 갯수만큼 반복을 돈다.
		String[] kopo07_row = new String[kopo07_sentence.length()];
		// 이렇게 되면 각각의 문자열이 배열로 찢어져서 리턴하게된다.
		for (int kopo07_i = 0; kopo07_i < kopo07_row.length; kopo07_i++) {
			kopo07_row[kopo07_i] = kopo07_sentence.substring(kopo07_i, kopo07_i + 1);
		}
		return kopo07_row;
	}

}