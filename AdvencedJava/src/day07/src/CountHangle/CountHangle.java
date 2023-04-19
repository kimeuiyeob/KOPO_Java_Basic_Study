package CountHangle;

public class CountHangle {

	public static void main(String[] args) {

		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글한글aa", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackeword("한글aa", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackeword("한글한글aa", 15));
		System.out.printf("한글은 [%d]개\n", HanCount("한글한글한aa"));

	}

//	===================================================================================
	// 한글인지 갯수 세는 함수
	public static int HanCount(String kopo07_text) {
		// 카운트를 세줄 변수 생성
		int kopo07_count = 0;
		// 문자열의 길이만큼 반복을 돈다.
		for (int kopo07_i = 0; kopo07_i < kopo07_text.length(); kopo07_i++) {
			// 그 문자열의 각각의 한문자를 textSplit에 담는다.
			char kopo07_textSplit = kopo07_text.charAt(kopo07_i);
			// 각 문자의 바이트 길이를 textByteCount에 담는다.
			int kopo07_textByteCount = String.valueOf(kopo07_textSplit).getBytes().length;
			// 만약 2가 나오면 그건 한글이기때문에 카운트 갯수를 센다.
			if (kopo07_textByteCount == 2) {
				kopo07_count++;
			}
		}
		return kopo07_count;
	}

//	===================================================================================
	// 문자열 앞에 공백 넣는 함수
	public static String HanBlankForeword(String kopo07_text, int kopo07_length) {
		// 받아온 문자열의 바이트 갯수를 bytelength에 담는다.
		int kopo07_bytelength = kopo07_text.getBytes().length;
		// 15에서 그 바이트 갯수를 뺀값을 blankCount담는다.
		int kopo07_blankCount = kopo07_length - kopo07_bytelength;
		String kopo07_blank = " ";
		String kopo07_key = "";
		// 뺀 갯수만큼 반복을 돌려 key변수에 담는다.
		for (int kopo07_i = 0; kopo07_i < kopo07_blankCount; kopo07_i++) {
			kopo07_key += kopo07_blank;
		}
		// 그 누적된 공백들을 text문자열 앞에다 붙여서 리턴한다.
		return kopo07_key + kopo07_text;
	}

//	===================================================================================
	// 문자열 뒤에 공백 넣는 함수
	public static String HanBlankBackeword(String kopo07_text, int kopo07_length) {
		// 받아온 문자열의 바이트 갯수를 bytelength에 담는다.
		int kopo07_bytelength = kopo07_text.getBytes().length;
		// 15에서 그 바이트 갯수를 뺀값을 blankCount담는다.
		int kopo07_blankCount = 15 - kopo07_bytelength;
		String kopo07_blank = " ";
		String kopo07_key = "";
		// 뺀 갯수만큼 반복을 돌려 key변수에 담는다.
		for (int kopo07_i = 0; kopo07_i < kopo07_blankCount; kopo07_i++) {
			kopo07_key += kopo07_blank;
		}
		// 그 누적된 공백들을 text문자열 뒤에다 붙여서 리턴한다.
		return kopo07_text + kopo07_key;
	}

}
