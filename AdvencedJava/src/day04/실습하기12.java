package day04;

public class 실습하기12 {

	public static void main(String[] args) {

		// int형 변수 n과m을 생성
		int kopo07_n, kopo07_m;
		kopo07_m = 20; // m변수를 20으로 초기화
		kopo07_n = 1; // n변수를 1로 초기화

		// 무한 반복
		while (true) {
			// 반복을 20만큼하고 맨아래 m에다 -1씩 차감해서 반복이 줄것이다.
			for (int kopo07_i = 0; kopo07_i < kopo07_m; kopo07_i++) {
				// 출력을 " "를 처리해 처음에는 20칸뒤 별을 찍게 될거다.
				System.out.print(" ");
			}
			// 반복을 처음은 1번반 돈다. 아래 n+2가 있으니까 점점 반복이 늘어날것이다.
			for (int kopo07_i = 0; kopo07_i < kopo07_n; kopo07_i++) {
				// *을 출력한다.
				System.out.print("*");
			}
			// 위에 for문이 다끝나면 줄바꿈을 하고 다시 반복을 실행한다.
			System.out.println();

			kopo07_m = kopo07_m - 1; // m변수를 1씩 차감한다.
			kopo07_n = kopo07_n + 2; // n변수를 2씩 더해준다.

			if (kopo07_m < 0) { // 만약 m이 0보다 작아지면 break걸려 while문을 탈출하게된다.
				break;
			}

		}
	}

}
