package MethodOverLoading;

public class MethodOverLoad {

	public static void main(String[] args) {

		// 정수 변수들을 생성하여 각각의 값들로 초기화한다.
		int kopo07_korean = 100;
		int kopo07_eng = 80;
		int kopo07_math = 92;
		int kopo07_sci = 95;
		int kopo07_soc = 83;

		// 국어 영어 수학 과학 사회점수 순서대로 출력한다.
		System.out.printf("3월 성적표\n");
		System.out.printf("========================================================\n");
		System.out.printf("이름      국어   영어   수학  총점   평균\n");
		System.out.printf("========================================================\n");
		System.out.printf("폴리융    %-7s%-7s%-7s%-7s%-7s\n", kopo07_korean, kopo07_eng, kopo07_math,
				// kopo07_Cal 객체안에 있는 sum()메서드를 통해 총합값을 출력한다.
				kopo07_Cal.kopo07_sum(kopo07_korean, kopo07_eng, kopo07_math),
				// kopo07_Cal 객체안에 있는 avg()메서드를 통해 총합값을 출력한다.
				kopo07_Cal.kopo07_avg(kopo07_korean, kopo07_eng, kopo07_math));
		System.out.printf("\n\n");

		System.out.printf("4월 성적표\n");
		System.out.printf("========================================================\n");
		System.out.printf("이름      국어   영어   수학  과학   총점   평균\n");
		System.out.printf("========================================================\n");
		System.out.printf("폴리융    %-7s%-7s%-7s%-7s%-7s%-7s\n", kopo07_korean, kopo07_eng, kopo07_math, kopo07_sci,
				// kopo07_Cal 객체안에 있는 sum()메서드를 통해 총합값을 출력한다.
				kopo07_Cal.kopo07_sum(kopo07_korean, kopo07_eng, kopo07_math, kopo07_sci),
				// kopo07_Cal 객체안에 있는 avg()메서드를 통해 총합값을 출력한다.
				kopo07_Cal.kopo07_avg(kopo07_korean, kopo07_eng, kopo07_math, kopo07_sci));
		System.out.printf("\n\n");

		System.out.printf("5월 성적표\n");
		System.out.printf("========================================================\n");
		System.out.printf("이름      국어   영어   수학  과학   사회   총점   평균\n");
		System.out.printf("========================================================\n");
		System.out.printf("폴리융    %-7s%-7s%-7s%-7s%-7s%-7s%-7s\n", kopo07_korean, kopo07_eng, kopo07_math, kopo07_sci,
				// kopo07_Cal 객체안에 있는 sum()메서드를 통해 총합값을 출력한다.
				kopo07_soc, kopo07_Cal.kopo07_sum(kopo07_korean, kopo07_eng, kopo07_math, kopo07_sci, kopo07_soc),
				// kopo07_Cal 객체안에 있는 avg()메서드를 통해 총합값을 출력한다.
				kopo07_Cal.kopo07_avg(kopo07_korean, kopo07_eng, kopo07_math, kopo07_sci, kopo07_soc));

	}

}

//==================================================================================================
//kopo07_Cal 이너클래스를 생성한다.
class kopo07_Cal {
	// sum()메서드를 생성한다. / sum은 총합계이므로 국어,영어,수학점수를 매게변수로 받아온다.
	public static int kopo07_sum(int kopo07_korea, int kopo07_english, int kopo07_math) {
		int kopo07_sum = 0; // 총합을 누적해서 담아줄 sum변수를 생성한다.
		kopo07_sum += kopo07_korea + kopo07_english + kopo07_math; // 다 더해준값을 sum에 담는다.
		return kopo07_sum; // sum변수를 리턴한다.
	}

	// avg()메서드를 생성한다. / avg은 평균이므로 국어,영어,수학점수를 매게변수로 받아온다.
	public static int kopo07_avg(int kopo07_korea, int kopo07_english, int kopo07_math) {
		int kopo07_avg = 0; // 평균값을 담아줄 avg변수 생성
		kopo07_avg += (kopo07_korea + kopo07_english + kopo07_math) / 3; // avg변수에 누적한다.
		return kopo07_avg; // avg를 리턴한다.
	}

//	=====================================================================
	// 오버로딩 / sum()메서드를 생성한다. / sum은 총합계이므로 국어,영어,수학,과확 점수를 매게변수로 받아온다.
	public static int kopo07_sum(int kopo07_korea, int kopo07_english, int kopo07_math, int kopo07_science) {
		int kopo07_sum = 0; // 총합을 누적해서 담아줄 sum변수를 생성한다.
		kopo07_sum += kopo07_korea + kopo07_english + kopo07_math + kopo07_science; // 다 더해준값을 sum에 담는다.
		return kopo07_sum; // sum변수를 리턴한다.
	}

	// avg()메서드를 생성한다. / avg은 평균이므로 국어,영어,수학,과학 점수를 매게변수로 받아온다.
	public static int kopo07_avg(int kopo07_korea, int kopo07_english, int kopo07_math, int kopo07_science) {
		int kopo07_avg = 0; // 평균값을 담아줄 avg변수 생성
		kopo07_avg += (kopo07_korea + kopo07_english + kopo07_math + kopo07_science) / 4; // avg변수에 누적한다.
		return kopo07_avg; // avg를 리턴한다.
	}

//	=====================================================================
	// 오버로딩 / sum()메서드를 생성한다. / sum은 총합계이므로 국어,영어,수학,과학,역사 점수를 매게변수로 받아온다.
	public static int kopo07_sum(int kopo07_korea, int kopo07_english, int kopo07_math, int kopo07_science,
			int kopo07_history) {
		int kopo07_sum = 0; // 총합을 누적해서 담아줄 sum변수를 생성한다.
		kopo07_sum += kopo07_korea + kopo07_english + kopo07_math + kopo07_science + kopo07_history; // 다 더해준값을 sum에
																										// 담는다.
		return kopo07_sum; // sum변수를 리턴한다.
	}

	// avg()메서드를 생성한다. / avg은 평균이므로 국어,영어,수학,과학,역사 점수를 매게변수로 받아온다.
	public static int kopo07_avg(int kopo07_korea, int kopo07_english, int kopo07_math, int kopo07_science,
			int kopo07_history) {
		int kopo07_avg = 0; // 평균값을 담아줄 avg변수 생성
		kopo07_avg += (kopo07_korea + kopo07_english + kopo07_math + kopo07_science + kopo07_history) / 5;// avg변수에
																											// 누적한다.
		return kopo07_avg; // avg를 리턴한다.
	}
}
