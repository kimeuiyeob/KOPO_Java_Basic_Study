package 과제4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class P7 {

	public static void main(String[] args) throws ParseException {

//		User inputs the two dates
//		Print the days between the first and the second dates
//		 (Calculate Duration)

//		20200203
//		20200212
//		9

		Scanner sc = new Scanner(System.in);
		System.out.println("두 날짜를 입력해주세요.");

		String s1 = sc.next();
		String s2 = sc.next();

		int count = 0;

		DateFormat df = new SimpleDateFormat("yyyyMMdd");

		Date d1 = df.parse(s1);
		Date d2 = df.parse(s2);

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		c1.setTime(d1);
		c2.setTime(d2);

		while (c1.compareTo(c2) != 1) {

			count++;

			c1.add(Calendar.DATE, 1);
		}
		System.out.println(count - 1 + "번");

	}
}