package 과제4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class P8 {

	public static void main(String[] args) throws ParseException {

//		User inputs a date and a number for adding days
//		Print the new date after adding the input day to the start date 
//
//		20200203
//		8
//		20200212

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int y = (a / 10000);
		int m = (a % 10000) / 100;
		int d = (a % 100);
		
		String bDate = y + "-" + m + "-" + d;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date beforeDate = formatter.parse(bDate);
		Calendar cal = Calendar.getInstance();
		cal.setTime(beforeDate);
		
		int x = sc.nextInt();
		cal.add(Calendar.DATE, x);
		String date = formatter.format(cal.getTime());
		System.out.println(date);

	}

}
