package day02;

public class 실습하기2 {

	public static void main(String[] args) {

		int kopo07_x = 10; // 정수형 변수 x 에 10을 대입
		int kopo07_y = 20; // 정수형 변수 y 에 20을 대입
		int kopo07_tmp = 0; // 정수형 변수 tmp에 0을 대입

		System.out.println("x : " + kopo07_x + " y : " + kopo07_y); // x값과 y값 출력

		kopo07_tmp = kopo07_x; // tmp변수에 x값 10을 대입
		kopo07_x = kopo07_y; // x변수에 y값 20을 대입
		kopo07_y = kopo07_tmp; // y변수에 tmp값 10을 대입

		// 서로 값을 바까주기 위해서 담아둘 tmp변수를 하나더 생성한것이다.

		System.out.println("x : " + kopo07_x + " y : " + kopo07_y); // x값과 y값 출력
	}

}