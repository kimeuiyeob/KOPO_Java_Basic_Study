package day02;

public class 실습하기11 {

	public static void main(String[] args) {

		float kopo07_f = 9.1234567f; // float형 변수에 9.1234567f대입
		double kopo07_d = 9.1234567; // double형 변수에 9.1234567대입
		double kopo07_d2 = (double) kopo07_f; // 9.1234567f를 double로 형변환 한뒤 d2변수에 대입

		// float형은 7자리까지만 표현가능하기때문에 9.123456까지는 정확히 표현되지만 그이후는 반올림되서9.1234567 값을 저장한다.
		System.out.printf("f = %20.18f\n", kopo07_f); // 출력 == f = 9.123456954956055000

		// double형은 16자리까지 표현가능하기 때문에 9.1234567이 저장되고 출력된다
		System.out.printf("d = %20.18f\n", kopo07_d); // 출력 == d = 9.123456700000000000

		// float형을 double형으로 변환시켰기때문에 7자리까지만 저장된 float형의 형태로 나타나게된다.
		System.out.printf("d2 = %20.18f\n", kopo07_d2); // 출력 == d2 = 9.123456954956055000

	}

}