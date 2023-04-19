package ElevaterTest;

public class Elevater2 {

	public int kopo07_limit_up_floor; // 최상층 변수 생성
	public int kopo07_limit_down_floor; // 최하층 변수 생성
	public int kopo07_floor; // 현재층 변수 생성
	public String kopo07_help; // 문자열 변수 생성

	// 기본 생성자 생성
	Elevater2() {
		super();
		kopo07_limit_up_floor = 10; // 최상층 변수 10으로 초기화한다.
		kopo07_limit_down_floor = 1; // 최하층 변수 1으로 초기화한다.
		kopo07_floor = 1; // 현재층 1층으로 초기화한다.
		kopo07_help = "엘레베이터 맞춤 준공완료";
		System.out.println(kopo07_help); // help를 출력한다.
	}

	// 기본 생성자 생성 / 파라미터로 최상층, 최하층, 현재층을 받는다.
	Elevater2(int kopo07_limit_up_floor, int kopo07_limit_down_floor, int kopo07_floor) {
		super();
		this.kopo07_limit_up_floor = kopo07_limit_up_floor;
		this.kopo07_limit_down_floor = kopo07_limit_down_floor;
		this.kopo07_floor = kopo07_floor;
		kopo07_help = "엘레베이터 맞춤 준공완료";
	}

	// up()메서드를 생성한다
	void up() {
		// 현재층이 10이면 아래 문자열 출력
		if (kopo07_floor == kopo07_limit_up_floor) {
			kopo07_help = "마지막 층입니다.";
		} else {
			// 현재층 1 증가뒤 아래 문자열 출력
			kopo07_floor++;
			kopo07_help = String.format("%d 층입니다.", kopo07_floor);
		}
	}

	// down()메서드를 생성한다
	void down() {
		// 현재층이 0이면 아래 문자열 출력
		if (kopo07_floor == kopo07_limit_down_floor) {
			kopo07_help = "처음 층입니다.";
		} else {
			// 현재층 1씩 빼고 아래 문자열 출력
			kopo07_floor--;
			kopo07_help = String.format("%d 층입니다.", kopo07_floor);
		}
	}

	// 메서드 오버로딩 / 같은 이름이지만 파라미터를 받기 때문에 다른메서드이다.
	void up(int kopo07_u) {
		// 파라미터로 날라온 정수만큼 반복을 통해 up메서드를 호출한다.
		for (int kopo07_i = 0; kopo07_i < kopo07_u; kopo07_i++) {
			this.up();
		}
	}

	// 메서드 오버로딩 / 같은 이름이지만 파라미터를 받기 때문에 다른메서드이다.
	void down(int kopo07_u) {
		// 파라미터로 날라온 정수만큼 반복을 통해 down메서드를 호출한다.
		for (int kopo07_i = 0; kopo07_i < kopo07_u; kopo07_i++) {
			this.down();
		}
	}

	// msg메서드를 생성한다.
	void msg(String kopo07_id) {
		// 문자열을 받으면 해당 문자열과 아래 값들을 출력한다.
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n", kopo07_id, kopo07_help, kopo07_limit_up_floor,
				kopo07_limit_down_floor, kopo07_floor);
	}

}
