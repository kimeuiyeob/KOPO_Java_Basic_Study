package day04;

public class 실습하기1 {

	public static void main(String[] args) {

		int kopo07_iA, kopo07_iB; // 정수형 변수iA,와 iB를 생성한다.
		String kopo07_star = "*"; // 문자열 변수 star를 생성뒤 *로 대입한다.
		kopo07_iA = 0; // 정수형 iA변수를 0으로 초기화한다.

		while (true) { // while()조건안에 true면 break가 만날때까지 반복을 한다.
			kopo07_iB = 0; // 정수형 iB변수를 0으로 초기화한다.
			while (true) { // while()조건안에 true면 break가 만날때까지 반복을 한다.
				System.out.print(kopo07_star); // 별을 출력한다.
				if (kopo07_iA == kopo07_iB) { // iA변수와 iB변수의 값이 동일하다면 break를 건다.
					break;
				}
				kopo07_iB++; // iB변수의 값을 1증감한다.
			}
			// 줄 바꿈을 한다. //이유는 첫번째 반복은 별하나 찍고 줄바꾸고 2번찍고 줄바꾸고.... 이런느낌으로 돌아간다.
			System.out.println();

			kopo07_iA++; // 변수iA의 값을 1증감한다.
			if (kopo07_iA == 30) { // iA값이 30번 반복해서 30이 되면 break걸어 초반while을 벗어난다.
				break;
			}
		}
		
	}
}
