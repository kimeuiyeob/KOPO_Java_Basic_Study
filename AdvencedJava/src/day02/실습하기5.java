package day02;

import java.util.Scanner;

public class 실습하기5 {

	public static void main(String[] args) {

		// 스캐너라는 객체를 생성해서 sc참조변수 담는다. / (System.in)이라는것은 콘솔안에 입력할수있다.
		Scanner kopo07_sc = new Scanner(System.in);
		System.out.print("두자리 정수를 하나 입력해주세요."); // 문자열 "입력바람" 출력

		// sc객체안에 내장되어있는 함수 nextLine()을 사용 / 이건 문자열입력받을때 띄어쓰기까지 함께 받을수 있는 함수이다.
		String kopo07_input = kopo07_sc.nextLine(); // 입력값을 input에다 담는다.
		// input은 string형 타입이므로 정수형num변수에 담지 못하니까 Integer.parseInt()라는 String객체에 내장된 함수를
		// 사용하여 Integer타입으로 형변환한것이다.
		int kopo07_num = Integer.parseInt(kopo07_input);

		System.out.println("입력내용 : " + kopo07_input); // input을 출력한다. 이때 아래랑 동일한 5가 출력되지만 여긴 문자열 5가 출력된다.
		System.out.printf("num = %d\n", kopo07_num); // printf함수에서도 %decimal정수형 출력형식 / 정수변수num에 담은 정수형 5가 출력된다.
	}

}