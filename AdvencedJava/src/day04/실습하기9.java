package day04;

public class 실습하기9 {

	public static void main(String[] args) {

		int iNumVal = 200000000; // 정수 iNumVal 생성뒤 200000000 초기화
		String sNumVal = String.valueOf(iNumVal); // 문자열 변수 sNumVal생성뒤 숫자변수 넣기 위해서 형변환
		String sNumVoice = ""; // 문자열 sNumVoice 생성뒤 빈문자열 초기화

		// 출력 sNumVal값과 sNumVal의길이 출력
		System.out.printf("==> %s [%d자리]\n", sNumVal, sNumVal.length());
		int i, j; // 정수형 i,j 생성
		// 문자열 배열 units 생성 "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" 대입
		String[] kopo07_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		// 문자열 배열 unitX 생성 "", "십", "백", "천", "만", "십", "백", "천", "억", "십" 대입
		String[] kopo07_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };
		i = 0; // i변수를 0으로 초기화
		j = sNumVal.length() - 1; // j변수에 sNumVal길이 -1을 대입
		// while조건문 무한 반복
		while (true) {

			// 만약 i가 sNumVal길이와 같다면 break
			if (i >= sNumVal.length()) { // 이때 sNumVal.length()의 길이는 10이다.
				break; // i가 0부터시작해서 10을 초과하게 되면 while문을 벗어나게 된다.
			}
			// sNumVal.substring(i, i + 1)은 문자열을 숫자로 형변환 한거라 정수로 출력 (1001034567) 이렇게 순서대로 출력
			System.out.printf("%s[%s]", sNumVal.substring(i, i + 1),

					// units[]배열 안에는 문자가 있는데 위에 자른갓을 인덱스로 대입하면 해당 숫자와 문자가 같이 출력하게 된다.
					kopo07_units[Integer.parseInt(sNumVal.substring(i, i + 1))]);

			// sNumVal을 substring으로 첫번째부터 하나하나씩 자른다. 그리고 그게0이 같다면 안으로 들어간다.
			if (sNumVal.substring(i, i + 1).equals("0")) { // 바로 옆 숫자까지 연속으로 0인 경우
				if (kopo07_unitX[j].equals("억")) { // 억의 자리까지 있는지 판단
					sNumVoice = sNumVoice + "" + kopo07_unitX[j]; // sNumVoice에 단위 "억" 붙인 값 저장
				} else if (kopo07_unitX[j].equals("만") && sNumVal.length() > 8
						&& sNumVal.substring(sNumVal.length() - 8, sNumVal.length() - 5).equals("000")) {
					sNumVoice = sNumVoice + ""; // 조건에 맞다면 단위 "만"을 붙이지 않음
				} else if (kopo07_unitX[j].equals("만")) {
					sNumVoice = sNumVoice + "" + kopo07_unitX[j];
				} else { // 특별한 수행 없음
				}
			} else { // 연속으로 0이 오는 경우가 아닐 때
				sNumVoice = sNumVoice + kopo07_units[Integer.parseInt(sNumVal.substring(i, i + 1))] + kopo07_unitX[j];
			}
			i++; // k19_i 1씩 더하기
			j--; // k19_j 1씩 빼기
		}
		if (iNumVal == 0) {
			System.out.printf("\n%s[%s]\n", sNumVal, "영");
		} else {
			System.out.printf("\n%s[%s]\n", sNumVal, sNumVoice); // 결과 출력
		}

	}
}
