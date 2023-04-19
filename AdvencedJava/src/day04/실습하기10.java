package day04;

public class 실습하기10 {

	public static void main(String[] args) {

		// 문자열 space 생성뒤 " "초기화
		String kopo07_space = " ";

		// 10번 반복을 돌린다.
		for (int kopo07_i = 0; kopo07_i < 10; kopo07_i++) {
			// 그다음 i가 1이되면 아래 반복 1번 실행, 이런식으로 돌아간다.
			for (int kopo07_j = 0; kopo07_j < kopo07_i; kopo07_j++) {
				// 빈칸을 출력한다.
				System.out.print(kopo07_space);
			}
			// 제일 처음은 둘다 영이기 때문에 바로 0 출력
			System.out.println(kopo07_i);
		}
	}

}
