package 과제5;

import java.util.Scanner;

public class A11 {
	
	public static void main(String[] args) {
		
		  //   m / s   ->                                      ->    1m / 1s   
	      //   k / h   ->   1000m / 60m   ->   1000m / 3600s   ->   (1m / 1s) / 3.6
	      //   m / ms  ->   1m / 0.001s   ->   1000m / 1s      ->   (1m / 1s) * 1000
		
//		사용자는 세 가지 값을 입력합니다.
//		각각은 m/s, km/h, m/ms 순으로
//		값을 비교하고 가장 빠른 것을 인쇄하십시오.
		
//		[Example]
//		190
//		780
//		0.19
//
//		780km/h
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" m/s, km/h, m/ms 순으로 입력해주세요.");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double a1 = a;
		double b1 = b;
		double c1 = c;
		
		a = a;
		b = b/3.6;
		c = c*1000;
		
		double max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		if(max == a) {
			System.out.println("가장 빠른 숫자 : " + (int)a1 + "m/s 입니다");
		}else if(max == b) {
			System.out.println("가장 빠른 숫자 : " + (int)b1 + "km/h 입니다");
		}else if(max == c) {
			System.out.println("가장 빠른 숫자 : " + (int)c1 + "m/ms 입니다");
		}
		
	}

}
