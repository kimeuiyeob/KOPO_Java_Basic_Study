package 과제4;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {

//		온도 변환을 위한 인쇄 메뉴
//
//		사용자가 메뉴에서 숫자를 선택합니다.
//
//		사용자가 숫자를 입력
//
//		변환된 온도를 인쇄
//
//		#현재 변환기
//		1. 섭씨 -> 화씨
//		2. 화씨 -> 섭씨
//		1
//		20
//		68

//		화씨= (섭씨x1.8) + 32
//		섭씨= (화씨-32)x0.55 입니다.

		Scanner sc = new Scanner(System.in);

		String msg1 = "메뉴를 선택해주세요~";
		String msg2 = "1. 섭씨  -->  화씨";
		String msg3 = "2. 화씨  -->  섭씨";
		String msg4 = "3. 종료";

		int total = 0;
		int num1 = 0;

		while (true) {
			System.out.println(msg1);
			System.out.println(msg2);
			System.out.println(msg3);
			System.out.println(msg4);
			int num = sc.nextInt();

			switch (num) {

			case 1:
				System.out.println("섭씨를 화씨로 변경해드리겠습니다.");
				System.out.println("섭씨를 입력해주세요.");
				num1 = sc.nextInt();

				System.out.println("입력하신 섭씨는 " + num1 + " 입니다.");
				total = (int) (num1 * 1.8) + (32);

				System.out.println("화씨는 " + total + " 입니다.");

			case 2:
				System.out.println("화씨를 섭씨로 변경해드리겠습니다.");
				System.out.println("화씨를 입력해주세요.");
				num1 = sc.nextInt();
				System.out.println("입력하신 화씨는 " + num1 + " 입니다.");
				total = (int) ((num1 - 32) * (0.55));

				System.out.println("섭씨는 " + total + " 입니다.");

			}
			if (num == 3) {
				System.out.println("안녕히 게세요~");
				break;
			}
		}

	}

}
