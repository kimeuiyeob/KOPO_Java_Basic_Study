package day02;

public class 실습하기7 {

	public static void main(String[] args) {

		String kopo07_url = "www.codechobo.com"; // string형 url변수에 "www.codechobo.com"대입

		float kopo07_f1 = .10f; // float형 f1변수에 .10f대입
		float kopo07_f2 = 1e1f; // float형 f2변수 1e1f대입
		float kopo07_f3 = 3.14e3f; // float형 f3변수 3.14e3f대입

		double kopo07_d = 1.23456789; // double형 d변수 1.23456789대입

		// %f == 소수점아래 6자리 / %e == 지수 형태로 출력 / %g == 간략하게 출력
		// f1을 소수점표현방식, 지수표현방식, 길이에따라 소수점or지수표현방식으로 바뀌는 %g 3개방식으로 출력
		
		// 출력 == f1 = 0.100000, 1.000000e-01, 0.100000
		System.out.printf("f1 = %f, %e, %g\n", kopo07_f1, kopo07_f1, kopo07_f1);
		// 출력 == f2 = 10.000000, 1.000000e+01, 10.0000
		System.out.printf("f2 = %f, %e, %g\n", kopo07_f2, kopo07_f2, kopo07_f2);
		// 출력 == f3 = 3140.000000, 3.140000e+03, 3140.00
		System.out.printf("f3 = %f, %e, %g\n", kopo07_f3, kopo07_f3, kopo07_f3);

		System.out.printf("d = %f\n", kopo07_d); // 출력 == d = 1.234568 <== float이라 소숫점 6자리까지
		System.out.printf("d = %14.10f\n", kopo07_d); // 출력 == d = 1.2345678900

		// 출력 == url = [www.codechobo.com]
		System.out.printf("url = [%s]\n", kopo07_url);
		// 출력 == url = [   www.codechobo.com] <== url을 []20칸짜리를 만들어 오른쪽 정렬 출력
		System.out.printf("url = [%20s]\n", kopo07_url);
		// 출력 == url = [www.codechobo.com   ] <== url을 []20칸짜리를 만들어 왼쪽 정렬 출력
		System.out.printf("url = [%-20s]\n", kopo07_url);
		// 출력 == url = [www.code] <== url을 8자리만 [] 안에 출력
		System.out.printf("url = [%.8s]\n", kopo07_url);

	}

}