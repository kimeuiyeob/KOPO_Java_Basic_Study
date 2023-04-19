package ReportSheet;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReportSheet2 {

	public static void main(String[] args) {

		// Calendar 객체를 생성해 kopo07_cal변수에 담아준다.
		Calendar kopo07_cal = Calendar.getInstance();
		// SimpleDateFormat객체를 생성해 내가 원하는 날짜 형식을 kopo07_dt에 담아준다.
		SimpleDateFormat kopo07_dt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		// 출력할 30명의 사람을 변수에 담아준다.
		int kopo07_iPerson = 30;
		// InputData2에 만들어놓은 기본생성자 파라미터에 30을 보낸다. -> 이때 각각의 배열들의 크기가 정해진다.
		InputData2 kopo07_inData2 = new InputData2(kopo07_iPerson);
		// 사람수만큼 반복을 돌린다.
		for (int kopo07_i = 0; kopo07_i < kopo07_iPerson; kopo07_i++) {
			// 문자열 변수를 만들어 이름뒤숫자를 1씩증가해서 담는다.
			String kopo07_name = String.format("홍길%02d", kopo07_i);
			// Math.random()함수를 사용해 1~100까지의 랜덤값을 각각의 변수에 담아준다.
			int kopo07_kor = (int) (Math.random() * 100);
			int kopo07_eng = (int) (Math.random() * 100);
			int kopo07_math = (int) (Math.random() * 100);
			// 담긴 값들을 SetData()함수 파라미터로 전달한다. -> 이러면 랜덤 이름과 과목의 랜덤 점수가 배열에 담기는것이다.
			kopo07_inData2.SetData(kopo07_i, kopo07_name, kopo07_kor, kopo07_eng, kopo07_math);

		}

		System.out.printf("                  성적집계표\n");
		// format()함수를 사용해 그안에 내가 현재 날짜를 담아 내가 원하는 형식의 날짜를 출력한다.
		System.out.printf("                            출력일자 : %s\n", kopo07_dt.format(kopo07_cal.getTime()));
		System.out.printf("=======================================================================\n");
		System.out.printf("번호    이름          국어      영어      수학      총점      평균\n");
		System.out.printf("=======================================================================\n");
		// 사람수만큼 출력을 한다.
		for (int kopo07_i = 0; kopo07_i < kopo07_iPerson; kopo07_i++) {
			// 각각의 배열들에 들어있는 값들을 순서대로 출력한다.
			System.out.printf("%03d  %5.5s         %4.4s      %4.4s      %4.4s      %4.4s    %6.2f\n", kopo07_i,
					kopo07_inData2.kopo07_nameArr[kopo07_i], kopo07_inData2.kopo07_korArr[kopo07_i],
					kopo07_inData2.kopo07_engArr[kopo07_i], kopo07_inData2.kopo07_mathArr[kopo07_i],
					kopo07_inData2.kopo07_sumArr[kopo07_i], kopo07_inData2.kopo07_avgArr[kopo07_i]);
		}

		System.out.printf("=======================================================================\n");
		// 누적시켜놓은 합계 변수들을 출력한다.
		System.out.printf("합계            %10d%10d%10d%10d  %6.2f\n", kopo07_inData2.kopo07_korea,
				kopo07_inData2.kopo07_english, kopo07_inData2.kopo07_math, kopo07_inData2.kopo07_totalSum,
				kopo07_inData2.kopo07_totalavg);
		// 누적시켜놓은 평균 변수들을 출력한다.
		System.out.printf("평균              %8.8s  %8.8s  %8.8s  %8.8s   %6.2f",
				(kopo07_inData2.kopo07_korea / kopo07_iPerson), (kopo07_inData2.kopo07_english / kopo07_iPerson),
				(kopo07_inData2.kopo07_math / kopo07_iPerson), (kopo07_inData2.kopo07_totalSum / kopo07_iPerson),
				(kopo07_inData2.kopo07_totalavg / kopo07_iPerson));

	}
}
