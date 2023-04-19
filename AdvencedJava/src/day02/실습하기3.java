package day02;

public class 실습하기3 {

	public static void main(String[] args) {

		String kopo07_name = "Kim" + "EuiYeob"; // 문자열 name변수 생성뒤 kimEuiyeob을 대입
		String kopo07_str = kopo07_name + 8.0; // 문자열 str변수 생성뒤 kimEuiyeob과 8.0을 대입

		System.out.println(kopo07_name); // name 출력 == KimEuiYeob
		System.out.println(kopo07_str); // str 출력 == KimEuiYeob8.0
		System.out.println(kopo07_str + 7); // 출력 == KimEuiYeob8.07 <== 앞에 문자열이 있어서 정수연산 안된다.
		System.out.println(7 + " "); // 출력 == 7
		System.out.println(" " + 7); // 출력 == 7 <== 7앞에 한칸 뛰어져있다.
		System.out.println(7 + ""); // 출력 == 7
		System.out.println("" + 7); // 출력 == 7
		System.out.println("" + ""); // 출력 ==
		System.out.println(7 + 7 + ""); // 출력 == 14 <== 정수형 끼리 덧셈
		System.out.println("" + 7 + 7); // 출력 == 77 <== 앞에 문자열""이 들어가서 77로 출력

	}

}