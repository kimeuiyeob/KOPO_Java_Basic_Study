package receipt;

public class Receipt3 {

	public static void main(String[] args) {

		// 사이트에서 다운받은 scv파일을 배열안에 담는다.
		String[] kopo07_OneRec = { "시,구,기준년도,소상공인 업체 수,소상공인 종사자 수,집합금지 업종 수,영업제한 업종 수,코로나19 재난지원금 지출액",

				"서울특별시,송파구,2020년,94200,125610,11,10,23500", "서울특별시,송파구,2020년,94200,125610,11,10,55550",
				"서울특별시,송파구,2021년,50000,300000,11,43,512500000", "서울특별시,송파구,2022년,104200,35410,20,30,288000000" };

		// 배열안에 값을, 로 나누어 제목과 값들로 구분짓는다.
		String[] kopo07_field_name = kopo07_OneRec[0].split(","); // field_name은 , 기준으로 제목들만 들어간다.
		// 문자열 변수 생성
		String returnHangle;

		for (int kopo07_i = 1; kopo07_i < kopo07_OneRec.length; kopo07_i++) { // OneRec배열의 갯수만큼 반복을 돈다.

			String[] kopo07_field = kopo07_OneRec[kopo07_i].split(","); // OneRec[i]는 인덱스 두번째에 있는 값들을 ,기준으로 찢는다.

			// 인덱스 3부터 숫자이기때문에 그값들을 변수에 담는다.
			String kopo07_kim1 = kopo07_field[3];
			String kopo07_kim2 = kopo07_field[4];
			String kopo07_kim3 = kopo07_field[5];
			String kopo07_kim4 = kopo07_field[6];
			String kopo07_kim5 = kopo07_field[7];

			// 저번에 실습했던 숫자로 한글 만드는 코드를 메서드화해서 값을 숫자에서 한글로 바꾼다.
			returnHangle = changeToHangel(kopo07_kim1);
			kopo07_field[3] = returnHangle;
			returnHangle = changeToHangel(kopo07_kim2);
			kopo07_field[4] = returnHangle;
			returnHangle = changeToHangel(kopo07_kim3);
			kopo07_field[5] = returnHangle;
			returnHangle = changeToHangel(kopo07_kim4);
			kopo07_field[6] = returnHangle;
			returnHangle = changeToHangel(kopo07_kim5);
			kopo07_field[7] = returnHangle;

			// 제목과 값을 출력하는데 이때 숫자들이 전부 한글로 바껴서 출력된다.
			System.out.printf("***********************************\n");
			for (int kopo07_j = 0; kopo07_j < kopo07_field_name.length; kopo07_j++)
				System.out.printf(" %s : %s\n", kopo07_field_name[kopo07_j], kopo07_field[kopo07_j]); // 제목과 값들을
		}

		System.out.printf("***********************************\n");

	}
//	=============================================================================================================

	// 숫자를 한글로 바까주는 메서드
	public static String changeToHangel(String text) {
		// 인덱스 끼리 비교하기 때문에 아래같이 값을 초기화한다.
		String[] kopo07_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		String[] kopo07_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };
		// 값을 집어넣어줄 변수들 생성한다.
		String kopo07_sNumVal;
		String kopo07_sNumVoice;

		int kopo07_i, kopo07_j;

		kopo07_sNumVal = text;
		kopo07_sNumVoice = "";
		kopo07_i = 0;
		kopo07_j = kopo07_sNumVal.length() - 1; // 인덱스를 자르기 위해서 길이의-1값을 담는다.

		while (true) {
			// 만약 i가 sNumVal길이와 같다면 break
			if (kopo07_i >= kopo07_sNumVal.length()) {
				// i가 0부터시작해서 길이를 초과하게 되면 while문을 벗어나게 된다.
				break;
			}
			// sNumVal을 substring으로 첫번째부터 하나하나씩 자른다. 그리고 그게0이 같다면 안으로 들어간다.
			if (kopo07_sNumVal.substring(kopo07_i, kopo07_i + 1).equals("0")) {
				if (kopo07_unitX[kopo07_j].equals("억")) { // 억의 자리까지 있는지 판단
					kopo07_sNumVoice = kopo07_sNumVoice + "" + kopo07_unitX[kopo07_j]; // sNumVoice에 단위 "억" 붙인 값 저장
				} else if (kopo07_unitX[kopo07_j].equals("만") && kopo07_sNumVal.length() > 8 && kopo07_sNumVal
						.substring(kopo07_sNumVal.length() - 8, kopo07_sNumVal.length() - 5).equals("000")) {
					kopo07_sNumVoice = kopo07_sNumVoice + ""; // 조건에 맞다면 단위 "만"을 붙이지 않음
				} else if (kopo07_unitX[kopo07_j].equals("만")) {
					kopo07_sNumVoice = kopo07_sNumVoice + "" + kopo07_unitX[kopo07_j];
				} else {
				}
			} else {
				// 연속으로 0이 오는 경우가 아닐 때
				kopo07_sNumVoice = kopo07_sNumVoice
						+ kopo07_units[Integer.parseInt(kopo07_sNumVal.substring(kopo07_i, kopo07_i + 1))]
						+ kopo07_unitX[kopo07_j];
			}
			kopo07_i++;
			kopo07_j--;
		}
		return kopo07_sNumVoice; // 결과값 리턴한다.
	}

}
