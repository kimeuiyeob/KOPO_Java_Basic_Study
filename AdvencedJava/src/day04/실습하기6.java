package day04;

public class 실습하기6 {

	public static void main(String[] args) {
		// 총 12번 반복을 돌린다 => 월을 반복하는거다.
		for (int kopo07_i = 1; kopo07_i < 13; kopo07_i++) {
			// i가 1일때부터 총 12번 반복한다. => 월수 출력
			System.out.print(kopo07_i + "월 => ");
			// 총 31번 반복을 돌린다 => 일을 반복하는거다.
			LOOP: for (int kopo07_j = 1; kopo07_j < 32; kopo07_j++) {
				// 일을 출력
				System.out.printf("%d,", kopo07_j);
				// switch문을 사용하여 i에는 월이 들어간다.
				switch (kopo07_i) {
				case 4:
				case 6:
				case 7:
				case 9:
				case 11:
					// 월이 4,6,7,9,11일때 일이 30일때 같아지면 반복을 break걸고 나간다.
					if (kopo07_j == 30) {
						break LOOP;
					}
					break;
				// 월이 2일때 일이 28일때 같아지면 반복을 break걸고 나간다.
				case 2:
					if (kopo07_j == 28) {
						break LOOP;
					}
					break;
				}
			}
			// 월이 한번 반복 돌때 줄바꿈한다.
			System.out.println();
		}
	}

}
