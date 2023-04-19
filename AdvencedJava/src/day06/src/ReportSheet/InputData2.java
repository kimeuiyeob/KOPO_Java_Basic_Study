package ReportSheet;

public class InputData2 {

	// 문자열 변수 생성 ->이름을 담아줄것이다.
	static String[] kopo07_nameArr;

	// 정수형 변수들 국어,영어,수학,총점을 담고 실수형 변수에는 평균을 담아줄거다.
	static int[] kopo07_korArr;
	static int[] kopo07_engArr;
	static int[] kopo07_mathArr;
	static int[] kopo07_sumArr;
	static float[] kopo07_avgArr;

	// 누적합계담아줄 각각의 변수들 생성한다.
	static int kopo07_korea;
	static int kopo07_english;
	static int kopo07_math;
	static int kopo07_totalSum;
	static float kopo07_totalavg;

	// 기본 생성자에 파라미터로 정수하나를 받는다.
	InputData2(int kopo07_iPerson) {
		// 받을 정수값만큼 반복이 돌꺼기 때문에 그크기만큼 배열을 만든다.
		kopo07_nameArr = new String[kopo07_iPerson];
		kopo07_korArr = new int[kopo07_iPerson];
		kopo07_engArr = new int[kopo07_iPerson];
		kopo07_mathArr = new int[kopo07_iPerson];
		kopo07_sumArr = new int[kopo07_iPerson];
		kopo07_avgArr = new float[kopo07_iPerson];
	}

	// SetData()생성해 번호,이름,국어,영어,수학점수를 받는다.
	public static void SetData(int kopo07_i, String kopo07_name, int kopo07_kor, int kopo07_eng, int kopo07_mathes) {
		// 각각의 배열에 그 값들을 순서대로 저장한다.
		kopo07_nameArr[kopo07_i] = kopo07_name;
		kopo07_korArr[kopo07_i] = kopo07_kor;
		kopo07_engArr[kopo07_i] = kopo07_eng;
		kopo07_mathArr[kopo07_i] = kopo07_mathes;
		// 합계 배열은 3개의 과목들의 합을 더해서 담아준다.
		kopo07_sumArr[kopo07_i] = kopo07_kor + kopo07_eng + kopo07_mathes;
		// 평균 배열은 3개의 과목들의 합에 /3을 나눠준 평균값을 담아준다.
		// 평균값을 담을꺼라 배열도 실수형 배열로 생성하고 값도 실수값으로 저정한다.
		kopo07_avgArr[kopo07_i] = (float) ((float) (kopo07_kor + kopo07_eng + kopo07_mathes) / 3.0);

//		=======================================================================
		// 아래 변수들은 반복이 돌때마다 각각의 과목들의 합계를 누적시킨다.
		kopo07_korea += kopo07_kor;
		kopo07_english += kopo07_eng;
		kopo07_math += kopo07_mathes;
		// 합계와 평균도 계속 누적시켜서 마지막 출력때 총합계와 총평균을 출력할것이다.
		kopo07_totalSum += kopo07_kor + kopo07_eng + kopo07_mathes;
		// 평균값을 담을꺼라 배열도 실수형 배열로 생성하고 값도 실수값으로 저정한다.
		kopo07_totalavg += (float) (kopo07_kor + kopo07_eng + kopo07_mathes) / 3.0;
	}

}
