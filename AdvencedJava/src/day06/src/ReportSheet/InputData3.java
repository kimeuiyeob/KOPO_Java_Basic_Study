package ReportSheet;

public class InputData3 {

	// 각각의 이름과 점수들을 출력하기 위해 배열을 전부 생성하였다.
	static String[] kopo07_nameArr;
	static int[] kopo07_korArr;
	static int[] kopo07_engArr;
	static int[] kopo07_mathArr;
	static int[] kopo07_sumArr;
	static float[] kopo07_avgArr;

	// 각각 점수들의 값들을 누적하기 위해 생성하였다.
	static int kopo07_korea;
	static int kopo07_english;
	static int kopo07_math;
	static int kopo07_totalSum;
	static float kopo07_totalavg;

	// 현재페이지에 합계와 평균을 출력하기 위해서 변수들을 한번더 생성하였다.
	static int kopo07_koreaNow;
	static int kopo07_englishNow;
	static int kopo07_mathNow;
	static int kopo07_totalSumNow;
	static float kopo07_totalavgNow;

	// 누적페이지에 현재페이지를 장당씩 더해서 출력하기 위해 한번더 생성하였다.
	static int kopo07_koreaNowMore;
	static int kopo07_englishNowMore;
	static int kopo07_mathNowMore;
	static int kopo07_totalSumNowMore;
	static float kopo07_totalavgNowMore;

//	=======================================================================

	// 사람수가 ReportSheet클래스에서 넘오오면 그수만큼 배열을 생성한다.
	InputData3(int kopo07_iPerson) {

		// 배열을 1을 더키운이유는 반복을 1부터 시작해서이다.
		kopo07_nameArr = new String[kopo07_iPerson + 1];
		kopo07_korArr = new int[kopo07_iPerson + 1];
		kopo07_engArr = new int[kopo07_iPerson + 1];
		kopo07_mathArr = new int[kopo07_iPerson + 1];
		kopo07_sumArr = new int[kopo07_iPerson + 1];
		kopo07_avgArr = new float[kopo07_iPerson + 1];

	}

	// SetData메서드는 ReportSheet클래스에서 반복을 통한 값들을 여기서 배열에 하나하나 담아준것이다.
	public static void SetData(int kopo07_i, String kopo07_name, int kopo07_kor, int kopo07_eng, int kopo07_mathes) {

		kopo07_nameArr[kopo07_i] = kopo07_name;
		kopo07_korArr[kopo07_i] = kopo07_kor;
		kopo07_engArr[kopo07_i] = kopo07_eng;
		kopo07_mathArr[kopo07_i] = kopo07_mathes;

		kopo07_sumArr[kopo07_i] = kopo07_kor + kopo07_eng + kopo07_mathes; // 총합이다.
		kopo07_avgArr[kopo07_i] = (float) ((kopo07_kor + kopo07_eng + kopo07_mathes) / 3.0); // 평균은 총 더한값의 3을 나눈것이다.

//		=======================================================================

		// 여기는 값들의 누적점수를 알기위해서 계속 누적시킨것이다.
		kopo07_korea += kopo07_kor;
		kopo07_english += kopo07_eng;
		kopo07_math += kopo07_mathes;
		kopo07_totalSum += kopo07_kor + kopo07_eng + kopo07_mathes;
		kopo07_totalavg += (kopo07_kor + kopo07_eng + kopo07_mathes) / 3.0;

	}
}
