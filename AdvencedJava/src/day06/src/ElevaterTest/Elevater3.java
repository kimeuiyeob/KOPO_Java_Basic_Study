package ElevaterTest;

//Elevater3클래스에 Elevater2를 상속받는다.
public class Elevater3 extends Elevater2 {

	// Repair()메서드를 생성한다.
	void Repair() {
		// 이 메서드가 호출이되면 help변수에 수리중입니다를 담는다.
		kopo07_help = String.format("수리중입니다.");
	}

	// up()메서드를 생성한다.
	void up() {
		// 만약 현재층이 최상층보다 같거나 높으면 아래를 출력한다.
		if (kopo07_floor >= kopo07_limit_up_floor) {
			kopo07_help = "마지막층입니다.";
		} else {
			// 아니면 현재층을 2씩 증감하고 아래 를 출력한다.
			kopo07_floor = kopo07_floor + 2;
			kopo07_help = String.format("%d층입니다.", kopo07_floor);
		}
		// down()메서드를 호출한다.
		this.down();
	}

	// down()메서드를 생성한다.
	void down() {
		// 부모의 down()메서드를 호출하고 아래문자열을 출력한다.
		super.down();
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.kopo07_help);
	}

}
