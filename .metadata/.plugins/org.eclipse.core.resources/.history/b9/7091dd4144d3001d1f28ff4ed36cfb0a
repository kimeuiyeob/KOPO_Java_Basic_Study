package 과제2;

import java.util.Scanner;

public class P3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int payMoney;
		int changeMoney;

		System.out.println("내야할 금액을 입력하세요.");
		payMoney = sc.nextInt();

		System.out.println("물건의 금액을 입력하세요.");
		changeMoney = sc.nextInt();

		int recieveMoney = payMoney - changeMoney;

		System.out.println("돌려 받으실 금액은");
		System.out.println(recieveMoney + "원 입니다.");

		int money10000 = 0;
		int money5000 = 0;
		int money1000 = 0;
		int money500 = 0;
		int money100 = 0;
		int money50 = 0;
		int money10 = 0;

		int won10000 = recieveMoney / 10000;
		int won5000 = (recieveMoney - (won10000 * 10000)) / 5000;
		int won1000 = (recieveMoney - (won10000 * 10000) - (won5000 * 5000)) / 1000;
		int won500 = (recieveMoney - (won10000 * 10000) - (won5000 * 5000) - (won1000 * 1000)) / 500;
		int won100 = (recieveMoney - (won10000 * 10000) - (won5000 * 5000) - (won1000 * 1000) - (won500 * 500)) / 100;
		int won50 = (recieveMoney - (won10000 * 10000) - (won5000 * 5000) - (won1000 * 1000) - (won500 * 500)
				- (won100 * 100)) / 50;
		int won10 = (recieveMoney - (won10000 * 10000) - (won5000 * 5000) - (won1000 * 1000) - (won500 * 500)
				- (won100 * 100) - (won50 * 50)) / 10;

		System.out.println("돌려받으실 10000원은 " + won10000 + "장입니다.");
		System.out.println("돌려받으실 5000원은 " + won5000 + "장입니다.");
		System.out.println("돌려받으실 1000원은 " + won1000 + "장입니다.");
		System.out.println("돌려받으실 500원은 " + won500 + "장입니다.");
		System.out.println("돌려받으실 100원은 " + won100 + "장입니다.");
		System.out.println("돌려받으실 50원은 " + won50 + "장입니다.");
		System.out.println("돌려받으실 10원은 " + won10 + "장입니다.");
	}

}
