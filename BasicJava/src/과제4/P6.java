package 과제4;

import java.util.Calendar;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		
//		User inputs the two numbers for year and month
//		Print the calendar
//
//		2021 
//		2
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		int year = sc.nextInt();
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		P6 cal = new P6();
		cal.prn(year, month);
	}

	public void prn(int year, int month) {
		
		Calendar cal = Calendar.getInstance();
		System.out.printf("Sun\tMon\tTues\tWed\tThur\tFri\tSat\n");
		cal.set(year, month - 1, 1);

		int start = cal.get(Calendar.DAY_OF_WEEK);

		for (int i = 1; i < start; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%d\t", i);
			if (start % 7 == 0) {
				System.out.println();
			}
			start++;
		}
	}

}