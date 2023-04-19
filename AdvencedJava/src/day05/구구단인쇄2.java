package day05;

public class 구구단인쇄2 {

	public static void main(String[] args) {

		// 구구단 헤더와 해당 단을 총 3번 반복 돌린다.
		for (int kopo07_i = 1; kopo07_i < 4; kopo07_i = kopo07_i++) {

			// 구구단 헤더 출력
			// 헤더가 1단 ,4단, 7단 순으로 돌아가기 때문에 , i+3, i+6을 해주었다.
			System.out.printf("***************\t***************\t***************\n");
			System.out.printf(" 구구단 %d 단  \t  구구단 %d 단 \t  구구단 %d 단 \t\n", kopo07_i, kopo07_i + 3, kopo07_i + 6);
			System.out.printf("***************\t***************\t***************\n");

			// 구구단을 반복하기 위해 9번 반복한다.
			for (int kopo07_j = 1; kopo07_j < 10; kopo07_j++) {
				// 해당 구구단에 맞게 i와j를 곱해 구구단을 9번 출력한다.
				System.out.printf(" %d * %d = %d  \t  %d * %d = %d \t  %d * %d = %d \t\n", kopo07_i, kopo07_j, kopo07_i * kopo07_j, kopo07_i + 3, kopo07_j,
						(kopo07_i + 3) * kopo07_j, kopo07_i + 6, kopo07_j, (kopo07_i + 6) * kopo07_j);
			}
			// i를 증감해서 다음 구구단은 2부터 시작하게한다.
			kopo07_i++;
		}
	}

}
