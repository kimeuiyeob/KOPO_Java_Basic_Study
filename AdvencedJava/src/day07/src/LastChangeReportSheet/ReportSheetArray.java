package LastChangeReportSheet;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class ReportSheetArray {

	// <InputDataArray>타입인 list생성한다.
	static ArrayList<InputDataArray> kopo07_list = new ArrayList<InputDataArray>();

	// 페이지를 계산할 변수를 생성하고 1로 초기화한다.
	static int kopo07_countTitle = 1;

	public static void main(String[] args) {
		// 사람변수에 200을 담는다.
		int kopo07_iPerson = 200;
		// 각각의 페이지에 30명씩 출력해야하므로 조건문이 필요해서 30으로 초기화된 변수를 생성한다.
		int kopo07_perPage = 30;
		// 아래도 마지막 출력때 남은 사람을 출력하귀 위해서 저값을 변수에 담는다.
		int kopo07_finalPersonMinus = kopo07_iPerson % kopo07_perPage;

		// 사람수만큼 반복을 한다.
		for (int kopo07_i = 0; kopo07_i <= kopo07_iPerson; kopo07_i++) {
			// 랜덤이름과 각각의 랜덤값들을 변수에 담는다.
			String kopo07_ranDomName = String.format("홍길%02d", kopo07_i);
			int kopo07_koreaRandomScore = (int) (Math.random() * 100);
			int kopo07_englishRandomScore = (int) (Math.random() * 100);
			int kopo07_mathRandomScore = (int) (Math.random() * 100);
			// 값들이 담긴 각각의 객체를 리스트에 추가한다.
			kopo07_list.add(new InputDataArray(kopo07_i, kopo07_ranDomName, kopo07_koreaRandomScore,
					kopo07_englishRandomScore, kopo07_mathRandomScore));
		}

		// 헤더를 메서드에 담아놔서 출력한다.
		titleHeader();
		int kopo07_count = 0; // 카운트를 세줄 변수 생성
		int kopo07_e = 1; // 카운트를 세줄 변수 생성
		compareWith();

		// 사람수 만큼 반복한다.
		for (int kopo07_i = 1; kopo07_i <= kopo07_iPerson; kopo07_i++) {
			// get()을 통해 리스트안에 있는 값들을 순서대로 가져온 값을 OneByOne변수에 담는다.
			InputDataArray kopo07_OneByOne = kopo07_list.get(kopo07_i);

			// 이름,국어점수,영어점수,수학점수,토탈점수,평균점수를 순서대로 출력한다.
			System.out.printf("%03d  %5.5s         %4.4s      %4.4s      %4.4s      %4.4s     %6.2f\n",
					kopo07_OneByOne.num(), kopo07_OneByOne.name(), kopo07_OneByOne.korea(), kopo07_OneByOne.english(),
					kopo07_OneByOne.math(), kopo07_OneByOne.sum(), kopo07_OneByOne.avg());

			kopo07_count++; // 갯수를 1씩 올린다.

			// 아래 과정은 현재페이지와 누적페이지 연산을 위해 변수를 저렇게 담아서 보내주었다.
			InputDataArray.kopo07_koreaNow += kopo07_OneByOne.korea();
			InputDataArray.kopo07_englishNow += kopo07_OneByOne.english();
			InputDataArray.kopo07_mathNow += kopo07_OneByOne.math();

			InputDataArray.kopo07_totalSumNow += kopo07_OneByOne.sum();
			InputDataArray.kopo07_totalavgNow += kopo07_OneByOne.avg();

			// 만약 카운트가 30이면 새로운 장을 만들어야 해서 조건문을 넣었다.
			if (kopo07_count % kopo07_perPage == 0) {

				System.out.printf("==================================================================\n");
				// 현재 페이지 출력을 한다.
				System.out.printf("현재페이지\n");
				System.out.printf("합계            %10d%10d%10d%10d   %6.2f\n", InputDataArray.kopo07_koreaNow,
						InputDataArray.kopo07_englishNow, InputDataArray.kopo07_mathNow,
						InputDataArray.kopo07_totalSumNow, InputDataArray.kopo07_totalavgNow);

				// 평균 페이지 출력을 한다. /평균페이지는 한장당 30명씩있어서 30으로 나눠준것이다.
				System.out.printf("평균              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
						(InputDataArray.kopo07_koreaNow / kopo07_perPage),
						(InputDataArray.kopo07_englishNow / kopo07_perPage),
						(InputDataArray.kopo07_mathNow / kopo07_perPage),
						(InputDataArray.kopo07_totalSumNow / kopo07_perPage),
						(InputDataArray.kopo07_totalavgNow / kopo07_perPage));

				// 아래 과정은 현재페이지와 누적페이지 연산을 위해 변수를 저렇게 담아서 보내주었다.
				InputDataArray.kopo07_koreaNowMore += InputDataArray.kopo07_koreaNow;
				InputDataArray.kopo07_englishNowMore += InputDataArray.kopo07_englishNow;
				InputDataArray.kopo07_mathNowMore += InputDataArray.kopo07_mathNow;
				InputDataArray.kopo07_totalSumNowMore += InputDataArray.kopo07_totalSumNow;
				InputDataArray.kopo07_totalavgNowMore += InputDataArray.kopo07_totalavgNow;

				// 현재페이지는 다시 초기화해서 연산해야되므로 여기서 초기화를 시켜주었다.
				InputDataArray.kopo07_koreaNow = 0;
				InputDataArray.kopo07_englishNow = 0;
				InputDataArray.kopo07_mathNow = 0;
				InputDataArray.kopo07_totalSumNow = 0;
				InputDataArray.kopo07_totalavgNow = 0;

				System.out.printf("==================================================================\n");
				// 위에 변수에 누적된 값을 누적 페이지에서 출력한다.
				System.out.printf("누적페이지\n");
				System.out.printf("합계            %10d%10d%10d%10d   %6.2f\n", InputDataArray.kopo07_koreaNowMore,
						InputDataArray.kopo07_englishNowMore, InputDataArray.kopo07_mathNowMore,
						InputDataArray.kopo07_totalSumNowMore, InputDataArray.kopo07_totalavgNowMore);

				// 아래 평균값은 한장당 30명에다 카운트를 곱해서 2장은 60으로 나누고 3장은 90으로 나눠주게해서 값을 구했다.
				System.out.printf("평균              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
						(InputDataArray.kopo07_koreaNowMore / (kopo07_perPage * kopo07_e)),
						(InputDataArray.kopo07_englishNowMore / (kopo07_perPage * kopo07_e)),
						(InputDataArray.kopo07_mathNowMore / (kopo07_perPage * kopo07_e)),
						(InputDataArray.kopo07_totalSumNowMore / (kopo07_perPage * kopo07_e)),
						(InputDataArray.kopo07_totalavgNowMore / (kopo07_perPage * kopo07_e)));

				kopo07_e++; // 증감은 2장은 60, 3장은 90이렇게 나눠줘야해서 또하나 카운팅을 해준것이다.
				System.out.printf("\n\n"); // 2줄 줄바꿈한다.
				titleHeader(); // 헤더를 출력한다.

			}
		}

		System.out.printf("==================================================================\n");
		// 위와 동일하게 초기화된 변수에다 값들을 더해 현재페이지에 출력한다.
		System.out.printf("현재페이지\n");
		System.out.printf("합계            %10d%10d%10d%10d    %6.2f\n", InputDataArray.kopo07_koreaNow,
				InputDataArray.kopo07_englishNow, InputDataArray.kopo07_mathNow, InputDataArray.kopo07_totalSumNow,
				InputDataArray.kopo07_totalavgNow);

		// 마지막장 평균은 남은 사람수를 구해야하므로 맨위에 변수에다 사람 % 30 나머지결과가 마지막 장에 나온 수이기때문에 그걸로 나눠준것이다.
		System.out.printf("평균              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
				(InputDataArray.kopo07_koreaNow / kopo07_finalPersonMinus),
				(InputDataArray.kopo07_englishNow / kopo07_finalPersonMinus),
				(InputDataArray.kopo07_mathNow / kopo07_finalPersonMinus),
				(InputDataArray.kopo07_totalSumNow / kopo07_finalPersonMinus),
				(InputDataArray.kopo07_totalavgNow / kopo07_finalPersonMinus));

		System.out.printf("==================================================================\n");

		System.out.printf("누적페이지\n");
		System.out.printf("합계            %10d%10d%10d%10d   %6.2f\n",
				InputDataArray.kopo07_koreaNowMore + InputDataArray.kopo07_koreaNow,
				InputDataArray.kopo07_englishNowMore + InputDataArray.kopo07_englishNow,
				InputDataArray.kopo07_mathNowMore + InputDataArray.kopo07_mathNow,
				InputDataArray.kopo07_totalSumNowMore + InputDataArray.kopo07_totalSumNow,
				InputDataArray.kopo07_totalavgNowMore + InputDataArray.kopo07_totalavgNow);

		// 아래 평균값은 한장당 30명에다 카운트를 곱해서 2장은 60으로 나누고 3장은 90으로 나눠주게해서 값을 구했다.
		System.out.printf("평균              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
				(InputDataArray.kopo07_koreaNowMore / kopo07_iPerson),
				(InputDataArray.kopo07_englishNowMore / kopo07_iPerson),
				(InputDataArray.kopo07_mathNowMore / kopo07_iPerson),
				(InputDataArray.kopo07_totalSumNowMore / kopo07_iPerson),
				(InputDataArray.kopo07_totalavgNowMore / kopo07_iPerson));

	}

//	===================================================================================================================
	// 헤더를 간편하게 출력하기 위해 메서드에 따로 담아서 사용했다.
	public static void titleHeader() {

		// 타이틀 안에 날짜 표시가 있어서 Calendar 객체를 호출해서 포맷시켜서 출력였다.
		Calendar kopo07_cal = Calendar.getInstance();
		SimpleDateFormat kopo07_dt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		System.out.printf("                           성적집계표\n");
		System.out.printf("PAGE : %d                              출력일자 : %s\n", kopo07_countTitle,
				kopo07_dt.format(kopo07_cal.getTime()));
		System.out.printf("==================================================================\n");
		System.out.printf("번호    이름          국어      영어      수학      총점      평균\n");
		System.out.printf("==================================================================\n");
		kopo07_countTitle++; // 여기는 페이지를 증감시키려고 1씩증가로 올려주었다.
	}

//	===================================================================================================================
	// 합계 기준으로 총점이 제일 높은순으로 출력하기 위한 메서드입다.
	public static void compareWith() {
		// 객체안의 값끼리 비교를 해야하는 상황이므로 Comparator객체를 생성해 오버라이드해준다.
		Comparator<InputDataArray> kopo07_MyCompare = new Comparator<InputDataArray>() {

			// compare메서드를 구현한다.
			@Override
			public int compare(InputDataArray kopo07_o1, InputDataArray kopo07_o2) {
				return kopo07_o1.sum() - kopo07_o2.sum(); // 합계를 기준으로 비교해서 리턴한다.
			}
		};
		// 합계 기준으로 비교하는걸 Collections 사용하여 정렬시킨다.
		Collections.sort(kopo07_list, kopo07_MyCompare);
		// 합계가 높은순이므로 반대로 뒤집는다.
		Collections.reverse(kopo07_list);
	}

}
