package ReportSheet;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReportSheet3 {

	static int kopo07_countTitle = 1; // 페이지 처리를 위해 전역변수 생성 뒤 1로 초기화

	public static void main(String[] args) {

		int kopo07_iPerson = 200; // 정수 변수 생성뒤 출력받을 사람수 초기화
		int kopo07_perPage = 30; // 한장당 30명씩으로 계산할 변수 생성
		int kopo07_finalPersonMinus = kopo07_iPerson % kopo07_perPage; // 마지막 남은 인원 계산을 위한 변수 생성

		InputData3 kopo07_inData3 = new InputData3(kopo07_iPerson); // 객체 생성뒤 200을 보낸다.

		// 사람수만큼 반복한다.
		for (int kopo07_i = 1; kopo07_i <= kopo07_iPerson; kopo07_i++) {
			// 사람수만큼 이름,국어점수,영어점수,수학점수 를 랜덤함수를통해 변수에 담는다.
			String kopo07_name = String.format("홍길%02d", kopo07_i);
			int kopo07_kor = (int) (Math.random() * 100);
			int kopo07_eng = (int) (Math.random() * 100);
			int kopo07_math = (int) (Math.random() * 100);
			// setData메서드를 통해 값들을 보낸다.
			kopo07_inData3.SetData(kopo07_i, kopo07_name, kopo07_kor, kopo07_eng, kopo07_math);

		}

		// 헤더를 메서드에 담아놔서 출력한다.
		titleHeader();
		int kopo07_count = 0; // 카운트를 세줄 변수 생성
		int kopo07_e = 1; // 카운트를 세줄 변수 생성

		for (int kopo07_i = 1; kopo07_i <= kopo07_iPerson; kopo07_i++) {
			// 이름,국어점수,영어점수,수학점수,토탈점수,평균점수를 순서대로 출력한다.
			System.out.printf("%03d  %5.5s         %4.4s      %4.4s      %4.4s      %4.4s     %6.2f\n", kopo07_i,
					kopo07_inData3.kopo07_nameArr[kopo07_i], kopo07_inData3.kopo07_korArr[kopo07_i],
					kopo07_inData3.kopo07_engArr[kopo07_i], kopo07_inData3.kopo07_mathArr[kopo07_i],
					kopo07_inData3.kopo07_sumArr[kopo07_i], kopo07_inData3.kopo07_avgArr[kopo07_i]);

			kopo07_count++; // 갯수를 1씩 올린다.

			// 아래 과정은 현재페이지와 누적페이지 연산을 위해 변수를 저렇게 담아서 보내주었다.
			kopo07_inData3.kopo07_koreaNow += kopo07_inData3.kopo07_korArr[kopo07_i];
			kopo07_inData3.kopo07_englishNow += kopo07_inData3.kopo07_engArr[kopo07_i];
			kopo07_inData3.kopo07_mathNow += kopo07_inData3.kopo07_mathArr[kopo07_i];

			kopo07_inData3.kopo07_totalSumNow += kopo07_inData3.kopo07_sumArr[kopo07_i];
			kopo07_inData3.kopo07_totalavgNow += kopo07_inData3.kopo07_avgArr[kopo07_i];

			// 만약 카운트가 30이면 새로운 장을 만들어야 해서 조건문을 넣었다.
			if (kopo07_count % kopo07_perPage == 0) {

				System.out.printf("==================================================================\n");
				// 현재 페이지 출력을 한다.
				System.out.printf("현재페이지\n");
				System.out.printf("합계            %10d%10d%10d%10d   %6.2f\n", kopo07_inData3.kopo07_koreaNow,
						kopo07_inData3.kopo07_englishNow, kopo07_inData3.kopo07_mathNow,
						kopo07_inData3.kopo07_totalSumNow, kopo07_inData3.kopo07_totalavgNow);

				// 평균 페이지 출력을 한다. /평균페이지는 한장당 30명씩있어서 30으로 나눠준것이다.
				System.out.printf("평균              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
						(kopo07_inData3.kopo07_koreaNow / kopo07_perPage),
						(kopo07_inData3.kopo07_englishNow / kopo07_perPage),
						(kopo07_inData3.kopo07_mathNow / kopo07_perPage),
						(kopo07_inData3.kopo07_totalSumNow / kopo07_perPage),
						(kopo07_inData3.kopo07_totalavgNow / kopo07_perPage));

				// 아래 과정은 현재페이지와 누적페이지 연산을 위해 변수를 저렇게 담아서 보내주었다.
				kopo07_inData3.kopo07_koreaNowMore += kopo07_inData3.kopo07_koreaNow;
				kopo07_inData3.kopo07_englishNowMore += kopo07_inData3.kopo07_englishNow;
				kopo07_inData3.kopo07_mathNowMore += kopo07_inData3.kopo07_mathNow;
				kopo07_inData3.kopo07_totalSumNowMore += kopo07_inData3.kopo07_totalSumNow;
				kopo07_inData3.kopo07_totalavgNowMore += kopo07_inData3.kopo07_totalavgNow;

				// 현재페이지는 다시 초기화해서 연산해야되므로 여기서 초기화를 시켜주었다.
				kopo07_inData3.kopo07_koreaNow = 0;
				kopo07_inData3.kopo07_englishNow = 0;
				kopo07_inData3.kopo07_mathNow = 0;
				kopo07_inData3.kopo07_totalSumNow = 0;
				kopo07_inData3.kopo07_totalavgNow = 0;

				System.out.printf("==================================================================\n");
				// 위에 변수에 누적된 값을 누적 페이지에서 출력한다.
				System.out.printf("누적페이지\n");
				System.out.printf("합계            %10d%10d%10d%10d   %6.2f\n", kopo07_inData3.kopo07_koreaNowMore,
						kopo07_inData3.kopo07_englishNowMore, kopo07_inData3.kopo07_mathNowMore,
						kopo07_inData3.kopo07_totalSumNowMore, kopo07_inData3.kopo07_totalavgNowMore);

				// 아래 평균값은 한장당 30명에다 카운트를 곱해서 2장은 60으로 나누고 3장은 90으로 나눠주게해서 값을 구했다.
				System.out.printf("평균              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
						(kopo07_inData3.kopo07_koreaNowMore / (kopo07_perPage * kopo07_e)),
						(kopo07_inData3.kopo07_englishNowMore / (kopo07_perPage * kopo07_e)),
						(kopo07_inData3.kopo07_mathNowMore / (kopo07_perPage * kopo07_e)),
						(kopo07_inData3.kopo07_totalSumNowMore / (kopo07_perPage * kopo07_e)),
						(kopo07_inData3.kopo07_totalavgNowMore / (kopo07_perPage * kopo07_e)));

				kopo07_e++; // 증감은 2장은 60, 3장은 90이렇게 나눠줘야해서 또하나 카운팅을 해준것이다.
				System.out.printf("\n\n"); // 2줄 줄바꿈한다.
				titleHeader(); // 헤더를 출력한다.

			}
		}

		System.out.printf("==================================================================\n");
		// 위와 동일하게 초기화된 변수에다 값들을 더해 현재페이지에 출력한다.
		System.out.printf("현재페이지\n");
		System.out.printf("합계            %10d%10d%10d%10d    %6.2f\n", kopo07_inData3.kopo07_koreaNow,
				kopo07_inData3.kopo07_englishNow, kopo07_inData3.kopo07_mathNow, kopo07_inData3.kopo07_totalSumNow,
				kopo07_inData3.kopo07_totalavgNow);

		// 마지막장 평균은 남은 사람수를 구해야하므로 맨위에 변수에다 사람 % 30 나머지결과가 마지막 장에 나온 수이기때문에 그걸로 나눠준것이다.
		System.out.printf("평균              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
				(kopo07_inData3.kopo07_koreaNow / kopo07_finalPersonMinus),
				(kopo07_inData3.kopo07_englishNow / kopo07_finalPersonMinus),
				(kopo07_inData3.kopo07_mathNow / kopo07_finalPersonMinus),
				(kopo07_inData3.kopo07_totalSumNow / kopo07_finalPersonMinus),
				(kopo07_inData3.kopo07_totalavgNow / kopo07_finalPersonMinus));

		System.out.printf("==================================================================\n");

		// 누적페이지는 여태 총 누적된 변수들을 출력하것이다.
		System.out.printf("누적페이지\n");
		System.out.printf("합계            %10d%10d%10d%10d   %6.2f\n", kopo07_inData3.kopo07_korea,
				kopo07_inData3.kopo07_english, kopo07_inData3.kopo07_math, kopo07_inData3.kopo07_totalSum,
				kopo07_inData3.kopo07_totalavg);

		System.out.printf("평균              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
				(kopo07_inData3.kopo07_korea / kopo07_iPerson), (kopo07_inData3.kopo07_english / kopo07_iPerson),
				(kopo07_inData3.kopo07_math / kopo07_iPerson), (kopo07_inData3.kopo07_totalSum / kopo07_iPerson),
				(kopo07_inData3.kopo07_totalavg / kopo07_iPerson));

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
}
