package 과제7;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class P9 {

	public static void main(String[] args) throws IOException {

//		Write a text file including the game results of P6
//		The game result should be appended to the end of the file in real-time
//		P6의 게임 결과를 포함하는 텍스트 파일 작성
//		게임 결과는 실시간으로 파일 끝에 추가되어야 합니다.

		byte[] content = new byte[1000];
		FileInputStream fi = new FileInputStream("C:\\Users\\김의엽\\Desktop\\ex\\out.txt");
		FileWriter fw = new FileWriter("C:\\Users\\김의엽\\Desktop\\ex\\out.txt", true);

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

		fw.write(today + " , ");

		fi.read(content);
		String allLine = new String(content);
		System.out.println(allLine);

		fw.close();
		fi.close();
	}

}
