package day02;

public class 실습하기12 {

	public static void main(String[] args) {

		int kopo07_i = 91234567; // int형 변수i에 91234567대입
		float kopo07_f = (float) kopo07_i; // 변수i를 float으로 형변환

		int kopo07_i2 = (int) kopo07_f; // 변수f를 int형변환 한뒤 i2변수에 대입

		double kopo07_d = (double) kopo07_i; // i변수를 double로 형변환 한뒤 d변수에 대입
		int kopo07_i3 = (int) kopo07_d; // d변수를 int로 형변환한뒤 int변수에 대입

		float kopo07_f2 = 1.666f; // float형 변수f2에 1.666f대입
		int kopo07_i4 = (int) kopo07_f2; // int형 i4변수에 f2변수를 int형변환 한뒤 대입

		// 출력 == i = 91234567 <== %d로 출력해서 정수형으로 출력
		System.out.printf("i = %d\n", kopo07_i);
		// 출력 == f = 91234568.000000 i2 = 91234568 <== f는 실수형 출력 , i2는 정수형 출력
		System.out.printf("f = %f i2 = %d\n", kopo07_f, kopo07_i2);
		// 출력 == d = 91234567.000000 i3 = 91234567 <== d는 실수형 출력 , i3는 정수형 출력
		System.out.printf("d = %f i3 = %d\n", kopo07_d, kopo07_i3);
		// 출력 == (int)1.666000 = 1 <== f2를 실수형 출력, i4는 정수형 출력
		System.out.printf("(int)%f =  %d\n", kopo07_f2, kopo07_i4);
	}

}