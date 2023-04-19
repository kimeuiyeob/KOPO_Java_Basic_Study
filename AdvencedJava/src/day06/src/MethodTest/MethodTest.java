package MethodTest;

public class MethodTest {

	// 메소드라 불러줘요~~라는걸 출력하는 메서드 iamMethod를 생성한다.
	public static void iamMethod() {
		System.out.printf("메소드라 불러줘요~~\n");

	}

	// 메인 메서드에서 iamMethod메서드를 호출한다.
	public static void main(String[] args) {
		// 먼저 클래스로 접근해 안에 있는 iamMethod메서드를 호출한다.
		MethodTest.iamMethod();
		// static으로 정의했기때문에 바로 호출한다.
		iamMethod();
	}
}
