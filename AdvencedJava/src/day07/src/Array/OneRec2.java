package Array;

public class OneRec2 {

	// 번호와 각각의 점수를 담을 정수변수들과 이름을 담을 문자열 변수 생성
	private int kopo07_number;
	private String kopo07_name;
	private int kopo07_korea;
	private int kopo07_english;
	private int kopo07_math;

	// 기본생성자 파라미터에 번호,이름,국어점수,영어점수,수학점수를 받는다.
	public OneRec2(int kopo07_num, String kopo07_name, int kopo07_korea, int kopo07_english, int kopo07_math) {
		super();
		// 파라미터에 받는 변수가 필드내에 있는 변수랑 동일하다는것을 알려주는것이다.
		// 즉 값이 넘어오면 저기 변수에 값들이 담긴다고 생각하면된다.
		this.kopo07_number = kopo07_num;
		this.kopo07_name = kopo07_name;
		this.kopo07_korea = kopo07_korea;
		this.kopo07_english = kopo07_english;
		this.kopo07_math = kopo07_math;
	}

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
