package Array;

public class OneRec {

	// 문자열 변수와 정수형 변수 생성한다.
	private String kopo07_name;
	private int kopo07_korea;
	private int kopo07_english;
	private int kopo07_math;

	// 기본생성자에 파라미터로 이름,국어점수,영어점수,수학점수를 받는다.
	public OneRec(String kopo07_name, int kopo07_korea, int kopo07_english, int kopo07_math) {
		super();
		this.kopo07_name = kopo07_name;
		this.kopo07_korea = kopo07_korea;
		this.kopo07_english = kopo07_english;
		this.kopo07_math = kopo07_math;
	}

	// 이름 가져오기
	public String name() {
		return this.kopo07_name;
	}

	// 국어 점수 가져오기
	public int korea() {
		return this.kopo07_korea;
	}

	// 영어 점수 가져오기
	public int english() {
		return this.kopo07_english;
	}

	// 수학 점수 가져오기
	public int math() {
		return this.kopo07_math;
	}

	// 점수들의 합계 가져오기
	public int sum() {
		return kopo07_korea + kopo07_english + kopo07_math;
	}

	// 점수들의 평균 가져오기
	public double avg() {
		return sum() / 3.0;
	}

}
