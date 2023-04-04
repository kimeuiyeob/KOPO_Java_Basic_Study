package 과제5;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {

//		사용자가 숫자 N을 입력합니다.
//		N번 테이블 인쇄
//		(매개변수가 있는 N번 테이블을 인쇄하려면 별도의 방법을 사용하십시오.)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int num = sc.nextInt();
		gugudan(num);
	}

	public static void gugudan(int x) {
		for (int i = 1; i < 10; i++) {
			System.out.println(x + " X " + i + " = " + i*x);
		}
	}

}
