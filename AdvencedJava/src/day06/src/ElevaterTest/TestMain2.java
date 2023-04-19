package ElevaterTest;

public class TestMain2 {

	// Elevater2객체를 el1,2,3변수에 담는다.
	static Elevater2 kopo07_el1;
	static Elevater2 kopo07_el2;
	static Elevater2 kopo07_el3;

	public static void main(String[] args) {

		// el1,2,3변수에 Elevater2객체를 생성한다.
		// 기본 생성자를 el1에 담는다.
		kopo07_el1 = new Elevater2();
		// 파라미터로 받는 생성자를 el2에 담는다.
		kopo07_el2 = new Elevater2(20, 1, 8);
		// 파라미터로 받는 생성자를 el3에 담는다.
		kopo07_el3 = new Elevater2(50, -3, 5);

		// 20만큼 반복을 돌린다.
		for (int kopo07_i = 0; kopo07_i < 20; kopo07_i++) {
			// 20번 up()메서드를 호출한다. / 이러면 현재층이 20이 되지만 최상층이 10층이므로 마자믹층이 출력될것이다.
			kopo07_el1.up();
			// msg() 메서드를 출력한다.
			kopo07_el1.msg("1번 엘베 한층 오르기");
		}

		// 20만큼 반복을 돌린다.
		for (int kopo07_i = 0; kopo07_i < 20; kopo07_i++) {
			// 아래는 파라미터 받는 up()메서드라 2층씩 총 20번 올라가게 출력된다.
			kopo07_el1.up(2);
			// msg() 메서드를 출력한다.
			kopo07_el1.msg("1번 엘베 2층 오르기");
		}

		// 20만큼 반복을 돌린다.
		for (int kopo07_i = 0; kopo07_i < 20; kopo07_i++) {
			// 아래는 파라미터 받는 down()메서드라 3층씩 총 20번 올라가게 출력된다.
			kopo07_el1.down(3);
			// msg() 메서드를 출력한다.
			kopo07_el1.msg("1번 엘베 3층 내리기");
		}

	}
}
