package ReportSheet;

public class InputData {

	static String[] kopo07_nameArr;// 이름을 담을 문자열 배열 생성
	static int[] kopo07_korArr; // 국어 점수를 담을 정수형 배열 생성
	static int[] kopo07_engArr; // 영어 점수를 담을 정수형 배열 생성
	static int[] kopo07_mathArr; // 수학 점수를 담을 정수형 배열 생성
	static int[] kopo07_sumArr; // 총점 점수를 담을 정수형 배열 생성
	static float[] kopo07_avgArr; // 평균 점수를 담을 정수형 배열 생성

	// 기본 생성자 생성뒤 정수하나를 파라미터로 받는다.
	InputData(int kopo07_iPerson) {
		// 파라미터로 받아온 정수만큼 배열 크기 생성
		kopo07_nameArr = new String[kopo07_iPerson];
		kopo07_korArr = new int[kopo07_iPerson];
		kopo07_engArr = new int[kopo07_iPerson];
		kopo07_mathArr = new int[kopo07_iPerson];
		kopo07_sumArr = new int[kopo07_iPerson];
		kopo07_avgArr = new float[kopo07_iPerson];
	}

	// SetData 메서드 생성뒤 파라미터로 숫자,이름,국어점수,영어점수,수학점수를 받는다.
	public static void SetData(int kopo07_i, String kopo07_name, int kopo07_kor, int kopo07_eng, int kopo07_math) {
		// 받아온 값을을 배열에 저장한다.
		kopo07_nameArr[kopo07_i] = kopo07_name;
		kopo07_korArr[kopo07_i] = kopo07_kor;
		kopo07_engArr[kopo07_i] = kopo07_eng;
		kopo07_mathArr[kopo07_i] = kopo07_math;

		kopo07_sumArr[kopo07_i] = kopo07_kor + kopo07_eng + kopo07_math; // 총점이니까 다 더한값을 담는다
		kopo07_avgArr[kopo07_i] = (float) ((float) (kopo07_kor + kopo07_eng + kopo07_math) / 3.0); // 평균이니까 다 더한값에서 3으로
																									// 나눈값을
		// 담는다.
	}

}
