package 과제5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class A9 {

	public static void main(String[] args) throws ParseException {

//		사용자가 2번의 시간 정보를 입력합니다.
//		그들 사이의 계산된 시간 간격을 초 단위로 인쇄합니다.

//		163227
//		163558
//		211s

		Scanner sc = new Scanner(System.in);

		String date1 = sc.next();
		String date2 = sc.next();

		Date format1 = new SimpleDateFormat("HHmmss").parse(date1);
		Date format2 = new SimpleDateFormat("HHmmss").parse(date2);

		long diffSec = (format1.getTime() - format2.getTime()) / 1000; // 초 차이
		long diffDays = diffSec / (24 * 60 * 60);

		if (diffSec > 0) {
			System.out.println((diffSec * 1) + "s");
		} else if (diffSec < 0) {
			System.out.println((diffSec * -1) + "s");

		}

	}

}
