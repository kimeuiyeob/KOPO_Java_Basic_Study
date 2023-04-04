package 과제3;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cola = 340;
		int orangeJuice = 500;
		int milk = 650;
		int water = 290;
		int coffee = 170;
		String won = "원";

		int myMoney = 1000;
		int sum = 0;

		System.out.println("1.콜라 = " + cola + won);
		System.out.println("2.오렌지쥬스 = " + orangeJuice + won);
		System.out.println("3.우유 = " + milk + won);
		System.out.println("4.물 = " + water + won);
		System.out.println("5.커피 = " + coffee + won);
		System.out.println("6.종료");

		while (true) {

			int num = sc.nextInt();

			if (num == 1) {
				sum += cola;
				System.out.println(num + "번을 고르셨습니다.");
			} else if (num == 2) {
				sum += orangeJuice;
				System.out.println(num + "번을 고르셨습니다.");
			} else if (num == 3) {
				sum += milk;
				System.out.println(num + "번을 고르셨습니다.");
			} else if (num == 4) {
				sum += water;
				System.out.println(num + "번을 고르셨습니다.");
			} else if (num == 5) {
				sum += coffee;
				System.out.println(num + "번을 고르셨습니다.");
			}

			else if (num == 6) {
				System.out.println("안녕히 게세요~");
				break;
			}

		}

		System.out.println("고르신 총 금액은 " + sum + "원 입니다.");
		System.out.println("금액을 지불해주세요~");
		int payMoney = sc.nextInt();
		System.out.println(payMoney + "원 받았습니다.");

		int receiveMoney = payMoney - sum;

		System.out.println("돌려받으실 금액은 " + receiveMoney + "원 입니다.");
		System.out.println("100원은 " + (receiveMoney / 100) + " 장" + " 50원은 " + (receiveMoney % 100 / 50) + " 장" + " 10원은 "+ (receiveMoney % 50 / 10) + " 장 입니다.");

	}

}
