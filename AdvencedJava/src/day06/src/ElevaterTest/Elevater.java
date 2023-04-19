package ElevaterTest;

public class Elevater {

	int kopo07_limit_up_floor = 10; // 최상층10을 변수에 담는다
	int kopo07_limit_down_floor = 0; // 최하층 0을 변수에 담는다.
	int kopo07_floor = 1; // 현재 층수를 변수에 담는다
	String kopo07_help; // 문자를 출력할 문자열변수 생성한다.

	// up()메서드를 생성한다.
	void up() {
		// 만약 현재 층이 최상층10과 같다면
		if (kopo07_floor == kopo07_limit_up_floor) {
			// 아래 문자열 출력한다.
			kopo07_help = "마지막층입니다.";
		} else {
			// 아니면 층이 1씩 증감한다.
			kopo07_floor++;
			// 그리고 아래 문자 출력한다.
			kopo07_help = String.format("%d층입니다.", kopo07_floor);
		}
	}

	// down()메서드를 생성한다.
	void down() {
		// 만약 현재 층이 최하층0층이라면
		if (kopo07_floor == kopo07_limit_down_floor) {
			// 아래 문자열을 출력한다.
			kopo07_help = "처음층입니다.";
		} else {
			// 아니면 현재층을 1씩 뺀다.
			kopo07_floor--;
			// 그리고 아래 문자열을 출력한다.
			kopo07_help = String.format("%d층입니다.", kopo07_floor);
		}
	}

}
