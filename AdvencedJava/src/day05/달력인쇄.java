package day05;

public class 달력인쇄 {

	public static void main(String[] args) {

		int iWeekday = 5; // 정수형 변수생성 5로 초기화

		// 정수 배열 생성뒤 마지막날짜를 담아서 초기화
		int[] iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int yd_flag = 0; // 윤달을 표시하기 위해 yd_flag생성뒤 0으로 초기화

		if (yd_flag == 1) { // 만약 flag가 1이면 iEnd배열이 29로 바뀐다.
			iEnd[1] = 29;
		} else if (yd_flag == 0) { // 만약 flag가 1이면 iEnd배열이 28로 바뀐다.
			iEnd[1] = 28;
		}

		// ====================================================================

		// 월의 반복하기 위해 총 12번을 반복한다.
		for (int iMon = 0; iMon < 12; iMon++) {

			// iWeekday % 7 로 초기화를 해야 2번째 날짜부터 앞으로 붙는다.
			iWeekday = iWeekday % 7;

			// 달력의 헤더를 출력한다.
			System.out.printf("\n\n         %d월\n", iMon + 1);
			System.out.printf("=====================\n");
			System.out.printf("%2.2s%2.2s%2.2s%2.2s%2.2s%2.2s%2.2s\n", "일", "월", "화", "수", "목", "금", "토");

			// 처음 날짜를 출력할때 공백을 넣어주기 위해서 반복을 돌린다.
			for (int i = 0; i < iWeekday; i++) {
				System.out.printf("   ");
			}

			// iEnd[iMon]안의 날짜만큼 반복을 돌린다 => 29 ~ 31까지 돈다고 생각하면된다.
			for (int i = 1; i <= iEnd[iMon]; i++) {
				if (iWeekday % 7 == 0) { // 7이 되면 줄내림을 한다.
					System.out.println();
				}
				// 날짜를 출력한다.
				System.out.printf("%2.2s ", i);

				// iWeekday 1씩 증감한다.
				iWeekday++;
			}

		}
	}

}
