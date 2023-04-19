package day05;

public class 구구단인쇄1 {

	public static void main(String[] args) {

		// 한번 반복돌때 마지막 i 3씩 중감 => 그러면 총 반복을 3번 돈다.
		for (int kopo07_i = 1; kopo07_i < 10; kopo07_i = kopo07_i + 3) {

			// 구구단 헤더 출력
			System.out.printf("***************\t***************\t***************\n");
			System.out.printf("  구구단 %d 단 \t  구구단 %d 단 \t  구구단 %d 단 \t\n", kopo07_i, kopo07_i + 1, kopo07_i + 2);
			System.out.printf("***************\t***************\t***************\n");

			//1단부터 9단까지 반복을 위해 이중포문을 사용해서 9번 반복을 돌린다.
			for (int kopo07_j = 1; kopo07_j < 10; kopo07_j++) {
				//규칙적으로 1,2,3,4,5...9를 j로 두고 i와j를 곱해서 구구단을 출력한다.
				System.out.printf(" %d * %d = %d  \t  %d * %d = %d \t  %d * %d = %d \t\n", kopo07_i, kopo07_j, kopo07_i * kopo07_j, kopo07_i + 1, kopo07_j,
						(kopo07_i + 1) * kopo07_j, kopo07_i + 2, kopo07_j, (kopo07_i + 2) * kopo07_j); 
			}
		}
	}
}