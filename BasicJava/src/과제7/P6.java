package 과제7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		
//		Print the current time on the screen
//		User inputs a time in second
//		The program prints out “time is over” after the input time
//
//		12:34:45
//		30
//		time is over(12:35:15)


		String today = null;

		Date date = new Date();

		SimpleDateFormat sdformat = new SimpleDateFormat("HH:mm:ss");

		Calendar cal = Calendar.getInstance();

		cal.setTime(date);
		today = sdformat.format(cal.getTime());
		System.out.println("지금 : " + today);

		Scanner sc = new Scanner(System.in);
		System.out.println("더할 초 입력 : ");
		int num = sc.nextInt();

		cal.add(Calendar.SECOND, num);
		today = sdformat.format(cal.getTime());
		System.out.println("더한 뒤 : " + today);

	}

}
