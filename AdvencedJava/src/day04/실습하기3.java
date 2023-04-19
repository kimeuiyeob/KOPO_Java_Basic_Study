package day04;

public class 실습하기3 {

	public static void main(String[] args) {

		int kopo07_iVal; // 정수형 iVal 생성

		// i를 0번부터 1씩 증가를해서 300아래 값까지 반복을 돌린다 ==> 300번 반복
		for (int kopo07_i = 0; kopo07_i < 300; kopo07_i++) {

			// iVal에다 i증가값 곱하기 5를해서 담는다. => 즉 iVal은 5의 배수만 들어갈것이다.
			kopo07_iVal = 5 * kopo07_i;

			// &한 개는 bit연산자이다. 둘다 연산은 되지만 값이 다르니까 잘알고 사용해야한다.
			// &&는 AND연산자라서 둘다 true여야만이 아래를 출력한다.
			if (kopo07_iVal >= 0 && kopo07_iVal < 10) { // 0보다 같거나 크고 10보다 작은 iVal값은 true
				System.out.println("일 : " + kopo07_iVal); // iVal값을 출력

			} else if (kopo07_iVal >= 10 && kopo07_iVal < 100) { // 10보다 같거나 크고 100보다 작은 iVal값은 true
				System.out.println("십 : " + kopo07_iVal); // iVal값을 출력

			} else if (kopo07_iVal >= 100 && kopo07_iVal < 1000) { // 100보다 같거나 크고 1000보다 작은 iVal값은 true
				System.out.println("백 : " + kopo07_iVal); // iVal값을 출력

			} else {
				System.out.println("천 : " + kopo07_iVal); // 나머지 iVal값을 출력 이때는 다 1000보다 큰수가 출력된다.
			}
		}
	}

}
