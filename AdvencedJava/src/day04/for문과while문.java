package day04;

public class for문과while문 {

	public static void main(String[] args) {

//		아래 4개가 다 동일한 결과가 나온다.
//		======================================

		System.out.println(1); // 1을 출력한다.
		System.out.println(2); // 2을 출력한다.
		System.out.println(3); // 3을 출력한다.
		System.out.println(4); // 4을 출력한다.
		System.out.println(5); // 5을 출력한다.

//		======================================

		int kopo07_i = 0; // i변수에 0을 대입
		do { // 무조건 한버은 실행하는 do while 문법
			kopo07_i++; // i변수가 한번 반복돌때마다 ++로 증감이된다.
			System.out.println(kopo07_i); // i를 출력한다.
			// while()안에는 조건문이 들어간다
		} while (kopo07_i <= 5); // i가 0에서부터 5와 같아질때까지 반복을 수행한다.

//		======================================

		// 아래가 for문의 문법 형식이다.
		// 우선 변수 j를 1로 초기화한다 ; 조건식으로 어디까지를 잡아준다 ; 변수j를 증감한다.
		for (int kopo07_j = 1; kopo07_j <= 5; kopo07_j++) {
			System.out.println(kopo07_j); // 변수 j를 출력한다.
		}

//		======================================

		// 변수 k에 1을 초기화한다.
		int kopo07_k = 1;

		// while문의 문법형식이다.
		while (kopo07_k <= 5) { // while()안에는 조건식이 들어간다. 즉 k가1부터시작해서 5까지 반복된다
			// 변수k를 출력한다.
			System.out.println(kopo07_k);
			kopo07_k++; // 반복 한번돌때마다 k값을 1씩 증감한다.
		}
	}

}
