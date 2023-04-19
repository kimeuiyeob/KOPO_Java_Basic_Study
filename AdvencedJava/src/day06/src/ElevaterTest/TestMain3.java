package ElevaterTest;

public class TestMain3 {

	public static void main(String[] args) {

		// Elevater3객체를 생성하여 kopo07_elevater3참조변수에 담는다.
		Elevater3 kopo07_elevater3 = new Elevater3();

		// 반복을 10만큼 한다.
		for (int i = 0; i < 10; i++) {
			// 참조변수로 Elevater3에 있는 up()메서드를 호출하고 아래를 출력한다.
			kopo07_elevater3.up();
			System.out.printf("MSG elev[%s]\n", kopo07_elevater3.kopo07_help);
		}
		// 반복을 10만큼 한다.
		for (int i = 0; i < 10; i++) {
			// 참조변수로 Elevater3에 있는 down()메서드를 호출하고 아래를 출력한다.
			kopo07_elevater3.down();
			System.out.printf("MSG elev[%s]\n", kopo07_elevater3.kopo07_help);
		}
		// Repair()메서드를 호출한다. 그러면 안에 있는 help문자열이 변경된것을 알수있다.
		kopo07_elevater3.Repair();
		System.out.printf("MSG elev[%s]\n", kopo07_elevater3.kopo07_help);

	}
}