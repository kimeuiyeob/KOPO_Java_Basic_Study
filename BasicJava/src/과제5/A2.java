package 과제5;

import java.util.Scanner;

public class A2 {

	static int myMoney = 0;
	static int balance = 0;
	static int withdrawal = 0;
	static int num1 = 0;

	public static void main(String[] args) {
		while (true) {
			int num1 = menu();
			if (num1 == 1) {
				deposit();
			} else if (num1 == 2) {
				withdraw();
			} else if (num1 == 3) {
				moneyCheck();
			} else if (num1 == 4) {
				byebye();
				break;
			} else {
				System.out.println("다시 입력");
			}
		}
	}

	public static int menu() {
		System.out.println("MENU");
		System.out.println("1. 입금");
		System.out.println("2. 출금");
		System.out.println("3. 통장 금액 확인");
		System.out.println("4. 종료");
		System.out.println("번호를 선택하세요~");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		return answer;
	}

	public static void deposit() {
		System.out.println("입금할 금액을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		balance = sc.nextInt();
		System.out.println("임금하신 금액은 : " + balance + "원 입니다.");
		myMoney += balance;
	}

	public static void withdraw() {
		System.out.println("출금할 금액을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		withdrawal = sc.nextInt();
		System.out.println("출금하실 금액은 : " + withdrawal + "원 입니다.");
		myMoney -= withdrawal;
	}

	public static void moneyCheck() {
		System.out.println("잔여 금액은 : " + myMoney + "원 입니다.");
	}

	public static void byebye() {
		System.out.println("안녕히 가세요~");
	}

}
