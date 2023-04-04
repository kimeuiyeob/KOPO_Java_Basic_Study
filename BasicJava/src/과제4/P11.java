package 과제4;

import java.util.Scanner;

public class P11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String msg1 = "1. 원화를 달러로 바꾸시겠습니까?";
		String msg2 = "2. 달러를 원화로 바꾸시겠습니까?";
		String msg3 = "3. 종료하겠습니다.";

		float korMoney = 1320;
		float total = 0;
		int inputMoney = 0;

		while (true) {

			System.out.println(msg1);
			System.out.println(msg2);
			System.out.println(msg3);

			int chooseNumber = sc.nextInt();

			if (chooseNumber == 1) {
				System.out.println("원화를 달러로~~");
				System.out.println("원화를 입금해주세요.");

				inputMoney = sc.nextInt();
				System.out.println("입금한 금액은 : " + inputMoney + " 원 입니다.");
				total = inputMoney / korMoney;
				System.out.println(total + " 달러 환전 처리되었습니다.");

				break;
			} else if (chooseNumber == 2) {
				System.out.println("달러를 원화로~~");
				inputMoney = sc.nextInt();
				System.out.println("입금한 금액은 : " + inputMoney + " 달러 입니다.");
				total = inputMoney * korMoney;
				System.out.println(Math.floor(total) + " 원화 환전 처리되었습니다.");

				break;
			} else if (chooseNumber == 3) {
				System.out.println("안녕히 가세요~");
				break;
			} else {
				System.out.println("1~3번중 골라주세요~~");
			}
		}
	}

}
