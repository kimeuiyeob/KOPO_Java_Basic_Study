package ElevaterTest;

public class TestMain {

	private static int kopo07_inVal; // 정수형 전역변수 생성

	// TestMain클래스안에 up()메소드를 하나 더 생성한다. /이때 Elevator up메소드와는 다른거다.
	public static void up() {
		kopo07_inVal++; // inVal을 1씩 증감한다.
		System.out.printf("난 그냥 메소드[%d]\n", kopo07_inVal); // inVal을 출력한다.
	}

	public static void main(String[] args) {

		kopo07_inVal = 0; // inVal을 0으로 초기화한다.
		Elevater kopo07_elev; // Elevater객체를 담을 참조변수 kopo07_elev를 생성한다.
		kopo07_elev = new Elevater(); // Elevater객체를 kopo07_elev에 담는다.

		up(); // 이때 up()메서드는 위에 메서드를 호출한것이다.

		// 반복을 10번만큼 돌린다.
		for (int i = 0; i < 10; i++) {
			// 아래 up()메서드는 Elevater객체안에 있는 up()메소드를 호출한것이다.
			kopo07_elev.up(); // 그래서 .으로 접근해서 확실히 어느 메서드인지 지정해준것이다.
			// Elevater객체안에 있는 help문자열을 출력한다.
			System.out.printf("MSG[%s]\n", kopo07_elev.kopo07_help);
		}
		// 반복을 10번만큼 돌린다.
		for (int i = 0; i < 10; i++) {
			// 아래 down()메서드는 Elevater객체안에 있는 down()메소드를 호출한것이다.
			kopo07_elev.down();
			// Elevater객체안에 있는 help문자열을 출력한다.
			System.out.printf("MSG[%s]\n", kopo07_elev.kopo07_help);
		}

	}
}
