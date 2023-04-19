package day02;

public class 실습하기10 {

	public static void main(String[] args) {

		int kopo07_i = 10; // int형 변수i 에 10을 대입
		byte kopo07_b = (byte) kopo07_i; // i변수를 byte형변한 한뒤 변수b에 대입
		// 출력 == [int -> byte] i = 10 -> b = 10 <== 정수형 출력
		System.out.printf("[int -> byte] i = %d -> b = %d\n", kopo07_i, kopo07_b);

		kopo07_i = 300; // int형 변수i 에 300을 대입
		kopo07_b = (byte) kopo07_i; // i변수를 byte형변한 한뒤 변수b에 대입
		// int형인 i와 int형 에서 byte로 바뀐 b출력
		// 출력 == [int -> byte] i = 300 -> b = 44 <== 정수형 출력
		System.out.printf("[int -> byte] i = %d -> b = %d\n", kopo07_i, kopo07_b);

		kopo07_b = 10; // byte형 변수b 에 10을 대입
		kopo07_i = (int) kopo07_b; // 변수b를 int형변한 한뒤 변수i에 대입
		// byte형인 b와 byte형 에서 int형 으로 바뀐 i출력
		// 출력 == [byte -> int] i = 10 -> b = 10 <== 정수형 출력
		System.out.printf("[byte -> int] i = %d -> b = %d\n", kopo07_b, kopo07_i);

		kopo07_b = -2; // byte형 변수b 에 -2을 대입
		kopo07_i = (int) kopo07_b; // 변수b를 int형변한 한뒤 변수i에 대입
		// byte형인 b와 byte형 에서 int형 으로 바뀐 i출력
		// 출력 == [byte -> int] i = -2 -> b = -2
		System.out.printf("[byte -> int] i = %d -> b = %d\n", kopo07_b, kopo07_i);

		// -2인 int형 i를 BinaryString 함수를 통해 2진수로 변환한 값 출력
		// int 형이기때문에 2진수로 2,147,483,647 까지표현가능하므로 -2는 2의보수
		// 출력 == i = 11111111111111111111111111111110
		System.out.println("i = " + Integer.toBinaryString(kopo07_i));

	}

}