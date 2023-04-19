package MethodTest;

public class MethodTest2 {
	// 전역 변수 정수형 변수 생성
	static int kopo07_iStatic;

	// add메서드 생성 / 파라미터로 정수를 받는다.
	public static void add(int kopo07_i) {
		kopo07_iStatic++; // add메서드를 메인에서 호출하게 되면 iStatic을 1씩 증감한다.
		kopo07_i++; // 파라미터로 받은 정수를 1씩 증가한다.
		// 증가한 iStatic을 출력한다.
		System.out.printf("add메소드에서 -> iStatic=[%d]\n", kopo07_iStatic);
		// 증가한 i를 출력한다.
		System.out.printf("add메소드에서 -> i=[%d]\n", kopo07_i);
	}

	// add2메서드 생성 / 파라미터로 정수를 받는다.
	public static int add2(int kopo07_i) {
		kopo07_iStatic++; // add메서드를 메인에서 호출하게 되면 iStatic을 1씩 증감한다.
		kopo07_i++; // 파라미터로 받은 정수를 1씩 증가한다.
		// 증가한 iStatic을 출력한다.
		System.out.printf("add메소드에서 -> iStatic=[%d]\n", kopo07_iStatic);
		// 증가한 i를 출력한다.
		System.out.printf("add메소드에서 -> i=[%d]\n", kopo07_i);
		// i의 값을 리턴한다.
		return kopo07_i;
	}

	public static void main(String[] args) {

		int kopo07_iMain; // 정수 변수 생성한다.
		// 생성한 변수에 1로 초기화한다
		kopo07_iMain = 1;
		// 전역변수로 생성한 iStatic을 1로 초기화한다.
		kopo07_iStatic = 1;

		System.out.printf("*********************************************\n");
		// iStatic을 출력한다 / 이때는 메서드를 호출하지 않았기때문에 초기화한 값이 출력된다.
		System.out.printf("메소드호출전 메인에서 -> iStatic=[%d]\n", kopo07_iStatic);
		// iMain을 출력한다 / 이때는 메서드를 호출하지 않았기때문에 초기화한 값이 출력된다.
		System.out.printf("메소드호출전 메인에서 -> iMain=[%d]\n", kopo07_iMain);
		System.out.printf("*********************************************\n");

		// add메서드 호출뒤 파라미터로 iMain을 보낸다. (이게 파라미터로 받은 int i이다)
		// 그리고 add메서드 안에 있는 출력값들을 출력한다.
		add(kopo07_iMain);

		System.out.printf("*********************************************\n");
		// iStatic을 출력한다 /이때는 메서드가 호출되어서 증감된 값이 출력된다.
		System.out.printf("메소드호출후 메인에서 -> iStatic=[%d]\n", kopo07_iStatic);
		// iMain을 출력한다 /이때는 메서드가 호출되어서 증감된 값이 출력된다.
		System.out.printf("메소드호출후 메인에서 -> iMain=[%d]\n", kopo07_iMain);
		System.out.printf("*********************************************\n");

		// add메서드 호출뒤 파라미터로 iMain을 보낸다. (이게 파라미터로 받은 int i이다)
		// 그리고 add메서드 안에 있는 출력값들을 출력한다.
		kopo07_iMain = add2(kopo07_iMain);

		System.out.printf("*********************************************\n");
		// iStatic을 출력한다 /이때는 메서드가 호출되어서 증감된 값이 출력된다.
		System.out.printf("메소드 add2호출후 메인에서 -> iStatic=[%d]\n", kopo07_iStatic);
		// iMain을 출력한다 /이때는 메서드가 호출되어서 증감된 값이 출력된다.
		System.out.printf("메소드 add2호출후 메인에서 -> iMain=[%d]\n", kopo07_iMain);
		System.out.printf("*********************************************\n");

	}

}
