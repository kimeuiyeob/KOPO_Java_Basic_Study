package day04;

public class 실습하기2 {

	public static void main(String[] args) {

		int kopo07_iI; // 정수 iI변수 생성
		double kopo07_iD; // 더블 iD변수 생성

		kopo07_iI = 10 / 3; // iI변수에 10/3값 대입 <==이때 소수점 잘린값 == 3
		kopo07_iD = 10 / 3.0; // iD변수에 10/3.0값 대입 <==이때 소수점 붙은값 == 3.3333333333333335

		if (kopo07_iI == kopo07_iD) { // 만약 iI값과 iD값이 일치한다면
			System.out.println("Equal"); // Equal출력
		} else {
			// 아니면 Not Equal출력 , iI를 더블로 형변환한뒤 iD와 출력 // 아래께 출력된다. 3이랑 3.333...은 같지 않기 때문이다.
			System.out.printf("Not Equal [%f][%f]\n", (double) kopo07_iI, kopo07_iD);
		}

		if (kopo07_iD == 3.333333) { // 만약 iD가 3.333333과 같다면
			System.out.println("Equal"); // Equal출력
		} else {
			// 아니면 Not Equal출력 , iD변수 값 출력 // 아래께 출력된다. 3.333333이랑 3.33333...값은 같지 않기 때문이다.
			System.out.printf("Not Equal [3.333333][%f]\n", kopo07_iD);
		}

		// 더블형 변수 iD에 정수형iD값 대입
		kopo07_iD = (int) kopo07_iD;

		if (kopo07_iI == kopo07_iD) { // 만약 iI와 iD의 값이 같다면
			System.out.println("Equal"); // Equal출력
		} else {
			// 아니면 Not Equal출력 , 더블형 iI출력, iD출력
			System.out.printf("Not Equal [%f][%f]\n", (double) kopo07_iI, kopo07_iD);
		}

		// 실수형으로 iI출력, 정수형으로 iD변수 값 출력
		System.out.printf("int로 인쇄[%d][%f]\n", kopo07_iI, kopo07_iD);
		// 실수형으로 출력, iI 와 iD값 출력
		System.out.printf("double로 인쇄 [%f][%f]\n", (double) kopo07_iI, kopo07_iD);

		char kopo07_a = 'c'; // 문자형 a에 c대입

		if (kopo07_a == 'b') { // 만약 a가 b랑 같다면
			System.out.println("a는 b이다");
		}
		if (kopo07_a == 'c') { // 만약 a가 c랑 같다면
			System.out.println("a는 c이다"); // a는 c이다 출력
		}
		if (kopo07_a == 'd') { // 만약 a가 d랑 같다면
			System.out.println("a는 d이다"); // a는 d이다 출력
		}

		String kopo07_aa = "abcd"; // 문자열 aa에 abcd대입

		if (kopo07_aa.equals("abcd")) { // 만약 aa가 abcd와 같다면
			System.out.println("aa는 abcd이다"); // aa는 abcd이다 출력
		} else {
			System.out.println("aa는 abcd가 아니다"); // 아니면 aa는 abcd가 아니다 출력
		}

		boolean kopo07_bb = true; // 불린형 bb생성 true로 대입

		if (!!kopo07_bb) { // !!이므로 두번 부정한것이다 / 결국 다시 true값이라고 생각하면된다.
			System.out.println("bb가 아니고 아니면 참이다"); // 맞다면 bb가 아니고 아니면 참이다 출력
		} else {
			System.out.println("bb가 아니고 아니면 거짓이다."); // 아니면 bb가 아니고 아니면 거짓이다 출력
		}

	}
}
