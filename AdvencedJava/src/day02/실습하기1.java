package day02;

public class 실습하기1 {

	public static void main(String[] args) {

		int kopo07_year = 0; // 정수형 변수 year 생성
		int kopo07_age = 31; // 정수형 변수 age 생성

		System.out.println("년도 1 : " + kopo07_year); // year 출력
		System.out.println("나이 2 : " + kopo07_age); // age 출력

		kopo07_year = kopo07_age + 1993 - 1; // year변수에 (31 + 1993 - 1) 결과값 대입
		kopo07_age = kopo07_age + 1; // age변수에 (31+1) 결과값 대입

		System.out.println("년도 3 : " + kopo07_year); // year 출력
		System.out.println("나이 4 : " + kopo07_age); // age 출력

	}

}