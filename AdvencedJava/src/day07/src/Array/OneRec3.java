package Array;

public class OneRec3 {

	// 이름과 점수들를 담을 변수들 생성
	private int kopo07_number;
	private String kopo07_name;
	private int kopo07_korea;
	private int kopo07_english;
	private int kopo07_math;

	// 기본 생성자에 번호,이름,각각의 점수들을 파라미터로 받는다.
	public OneRec3(int kopo07_num, String kopo07_name, int kopo07_korea, int kopo07_english, int kopo07_math) {
		super();
		// 이름과 점수들이 넘어오면 위에 변수에 값이 담긴다.
		this.kopo07_number = kopo07_num;
		this.kopo07_name = kopo07_name;
		this.kopo07_korea = kopo07_korea;
		this.kopo07_english = kopo07_english;
		this.kopo07_math = kopo07_math;
	}

	// 번호 가져오기
	public int number() {
		return this.kopo07_number;
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
