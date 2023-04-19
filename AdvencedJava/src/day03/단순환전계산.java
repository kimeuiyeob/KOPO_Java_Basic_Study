package day03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class 단순환전계산 {
	public static void main(String[] args) {

		DecimalFormat kopo07_df = new DecimalFormat("###,###,###,###"); // 3자리수 뒤에 , 생성 하는 DecimalFormat객체 생성

		int kopo07_MyWon = 1000000; // 100만을 정수형 변수에 대입한다.
		double kopo07_MoneyEx = 1238.21; // 환율 변수를 생성한다.
		double kopo07_commission = 0.003; // 수수료 변수를 생성한다.

		// 1000000에서 1238.21 나눈 금액을 정수형으로 타입변한해 usd달러변수에 담는다.
		int kopo07_usd = (int) (kopo07_MyWon / kopo07_MoneyEx);

		// usd값을 먼저 1238.21로 한국돈으로 바꾼뒤 1000000애서 빼준 금액은 돌려받을 금액이다.
		int kopo07_remain = (int) (kopo07_MyWon - kopo07_usd * kopo07_MoneyEx);

		System.out.printf("*****************************************************************\n");
		System.out.printf("***********               수수료 없이 계산               *************\n");
		System.out.println("총 환화환전금액: " + kopo07_df.format(kopo07_MyWon) + "원    =>    미화: " + kopo07_usd + "달러, 잔돈: "
				+ kopo07_remain + "원");
		System.out.printf("*****************************************************************\n");

		// 더블형 ComperOne 변수에 1238.21 * 0.003을 대입한다 == 이게 달러당 수수료 금액이다.
		double kopo07_ComPerOne = kopo07_MoneyEx * kopo07_commission;

		// 더블형 totalcom 변수에 환전한 usd달러를 달러당 수수료를 곱해준 금액이 내 달러의 총 수수료금액이다.
		double kopo07_totalcom = kopo07_usd * kopo07_ComPerOne;

		System.out.printf("*****************************************************************\n");
		System.out.printf("***********                  수수료 계산                  ***********\n");
		System.out.println("총 수수료: " + (float) kopo07_totalcom + "원 => 미화: " + kopo07_usd + "달러, 달러당 수수료: "
				+ kopo07_ComPerOne + "원");
		System.out.printf("*****************************************************************\n");

		int kopo07_i_totalcom; // 정수형 kopo07_i_totalcom변수 생성

		if (kopo07_totalcom != (double) ((int) kopo07_totalcom)) { // 만약 kopo07_totalcom이 소수점이 있으면
			kopo07_i_totalcom = (int) kopo07_totalcom + 1; // +1을 누적해서 대입하고
		} else {
			kopo07_i_totalcom = (int) kopo07_totalcom; // 같으면 그대로 다시 대입해준다
		}

		System.out.printf("*****************************************************************\n");
		System.out.printf("***********                수수료 적용 환전                ***********\n");

		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f\n", kopo07_i_totalcom, kopo07_usd, kopo07_ComPerOne);
		kopo07_remain = (int) (kopo07_MyWon - kopo07_usd * kopo07_MoneyEx - kopo07_i_totalcom);

		System.out.println("총 환화환전금액: " + kopo07_df.format(kopo07_MyWon) + "원 => 미화:" + kopo07_usd + "달러, 수수료징구: "
				+ kopo07_i_totalcom + "원," + " 잔돈: " + kopo07_remain + "원");
		System.out.printf("*****************************************************************\n");

//		=======================================================================================

		// 1000000에서 (1238.21 + 3.71463)더한 값을 나눠주고 정수형으로 변환하여 대입한다.
		kopo07_usd = (int) (kopo07_MyWon / (kopo07_MoneyEx + kopo07_ComPerOne));
		kopo07_totalcom = kopo07_usd * kopo07_ComPerOne; // 위의 값에서 3.71463를 곱한 금액을 totalcom에 대입한다.

		if (kopo07_totalcom != (double) ((int) kopo07_totalcom)) { // 만약 totalcom이 소숫점이 있다면
			kopo07_i_totalcom = (int) kopo07_totalcom + 1; // +1을 해주고 i_totalcom으로 대입한다.
		} else {
			kopo07_i_totalcom = (int) kopo07_totalcom; // 같으면 그대로 대입한다.
		}

		System.out.printf("*****************************************************************\n");
		System.out.printf("***********             (정확한)수수료 적용 환전             ***********\n");

		System.out.printf("총 수수료 : %d원 => 미화: %d달러, 달러당 수수료: %f원\n", kopo07_i_totalcom, kopo07_usd, kopo07_ComPerOne);

		kopo07_remain = (int) (kopo07_MyWon - kopo07_usd * kopo07_MoneyEx - kopo07_i_totalcom);
		System.out.println("총 환화환전금액: " + kopo07_df.format(kopo07_MyWon) + "원 => 미화: " + kopo07_usd + "달러, 수수료징구: "
				+ kopo07_i_totalcom + "원, 잔돈: " + kopo07_remain + "원");
		System.out.printf("*****************************************************************\n");

		System.out.printf("*****************************************************************\n");
		System.out.printf("***********                     콤마찍기,날짜 적용                     \n");
		System.out.printf("총 수수료 : %s원 => 미화: %s달러, 달러당 수수료: %f원\n", kopo07_df.format(kopo07_i_totalcom),
				kopo07_df.format(kopo07_usd), kopo07_ComPerOne);

		kopo07_remain = (int) (kopo07_MyWon - kopo07_usd * kopo07_MoneyEx - kopo07_i_totalcom);

		System.out.printf("총 환화환전금액: %s원 => 미화: %s달러, 수수료징구: %s원 잔돈: %s원\n", kopo07_df.format(kopo07_MyWon),
				kopo07_df.format(kopo07_usd), kopo07_df.format(kopo07_i_totalcom), kopo07_df.format(kopo07_remain));

		Calendar cal = Calendar.getInstance(); // 캘린더 객체를 생성해서 cal참조변수 담는다.
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // SimpleDateFormat객체 생성해서 데이터 형태를 포맷설정한다.
		System.out.printf("최종 실행 시간: %s\n", sdt.format(cal.getTime())); // 날짜 포맷함수를 사용하여 현재 시간을 포맷형태에 맡게 변형시켜 출력한다.

		System.out.printf("*****************************************************************\n");

	}

}
