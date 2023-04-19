package day05;

public class 구구단인쇄 {

	public static void main(String[] args) {

		// 한번 반복돌때 마지막 i 3씩 중감 => 그러면 총 반복을 3번 돈다.
		for (int kopo07_i = 1; kopo07_i < 10; kopo07_i = kopo07_i + 3) {

			// 정수형j 변수 생성 1로 초기화 (1,2,3,4,5,6,7,8,9가 반복이여서 하나 만듬)
			int kopo07_j = 1;
			// 구구단 헤더 출력
			System.out.printf("***************\t***************\t***************\n");
			System.out.printf("  구구단 %d 단    \t   구구단 %d 단  \t   구구단 %d 단   \t\n", kopo07_i, kopo07_i + 1,
					kopo07_i + 2);
			System.out.printf("***************\t***************\t***************\n");
			// 출력문에 i는 첫반복 1 i+1은 = 2 i+2 = 3으로 반복을 돌리고 1,2,3,4는 j변수를 이용해서 1씩 증가해서 출력한다.
			System.out.printf(" %d * %d = %d  \t  %d * %d = %d \t  %d * %d = %d \t\n", kopo07_i, kopo07_j, kopo07_i,
					kopo07_i + 1, kopo07_j, kopo07_i + 1, kopo07_i + 2, kopo07_j, kopo07_i + 2); // 1단
			kopo07_j++; // 1,2,3 이렇게 올라가는거라 ++로 1씩 증가
			System.out.printf(" %d * %d = %d  \t  %d * %d = %d \t  %d * %d = %d \t\n", kopo07_i, kopo07_j,
					kopo07_i * kopo07_j, kopo07_i + 1, kopo07_j, (kopo07_i + 1) * 2, kopo07_i + 2, kopo07_j,
					(kopo07_i + 2) * kopo07_j); // 2단
			kopo07_j++; // 1,2,3 이렇게 올라가는거라 ++로 1씩 증가
			System.out.printf(" %d * %d = %d  \t  %d * %d = %d \t  %d * %d = %d \t\n", kopo07_i, kopo07_j,
					kopo07_i * kopo07_j, kopo07_i + 1, kopo07_j, (kopo07_i + 1) * 3, kopo07_i + 2, kopo07_j,
					(kopo07_i + 2) * kopo07_j); // 3단
			kopo07_j++; // 1,2,3 이렇게 올라가는거라 ++로 1씩 증가
			System.out.printf(" %d * %d = %d  \t  %d * %d = %d \t  %d * %d = %d \t\n", kopo07_i, kopo07_j,
					kopo07_i * kopo07_j, kopo07_i + 1, kopo07_j, (kopo07_i + 1) * 4, kopo07_i + 2, kopo07_j,
					(kopo07_i + 2) * kopo07_j); // 4단
			kopo07_j++; // 1,2,3 이렇게 올라가는거라 ++로 1씩 증가
			System.out.printf(" %d * %d = %d  \t  %d * %d = %d \t  %d * %d = %d \t\n", kopo07_i, kopo07_j,
					kopo07_i * kopo07_j, kopo07_i + 1, kopo07_j, (kopo07_i + 1) * 5, kopo07_i + 2, kopo07_j,
					(kopo07_i + 2) * kopo07_j); // 5단
			kopo07_j++; // 1,2,3 이렇게 올라가는거라 ++로 1씩 증가
			System.out.printf(" %d * %d = %d  \t  %d * %d = %d \t  %d * %d = %d \t\n", kopo07_i, kopo07_j,
					kopo07_i * kopo07_j, kopo07_i + 1, kopo07_j, (kopo07_i + 1) * 6, kopo07_i + 2, kopo07_j,
					(kopo07_i + 2) * kopo07_j); // 6단
			kopo07_j++; // 1,2,3 이렇게 올라가는거라 ++로 1씩 증가
			System.out.printf(" %d * %d = %d  \t  %d * %d = %d \t  %d * %d = %d \t\n", kopo07_i, kopo07_j,
					kopo07_i * kopo07_j, kopo07_i + 1, kopo07_j, (kopo07_i + 1) * 7, kopo07_i + 2, kopo07_j,
					(kopo07_i + 2) * kopo07_j); // 7단
			kopo07_j++; // 1,2,3 이렇게 올라가는거라 ++로 1씩 증가
			System.out.printf(" %d * %d = %d  \t  %d * %d = %d \t  %d * %d = %d \t\n", kopo07_i, kopo07_j,
					kopo07_i * kopo07_j, kopo07_i + 1, kopo07_j, (kopo07_i + 1) * 8, kopo07_i + 2, kopo07_j,
					(kopo07_i + 2) * kopo07_j); // 8단
			kopo07_j++; // 1,2,3 이렇게 올라가는거라 ++로 1씩 증가
			System.out.printf(" %d * %d = %d  \t  %d * %d = %d \t  %d * %d = %d \t\n", kopo07_i, kopo07_j,
					kopo07_i * kopo07_j, kopo07_i + 1, kopo07_j, (kopo07_i + 1) * 9, kopo07_i + 2, kopo07_j,
					(kopo07_i + 2) * kopo07_j); // 9단

		}

	}

}
