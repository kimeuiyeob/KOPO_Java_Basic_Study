package ReportSheet;

public class ReportSheet {

	public static void main(String[] args) {

		// 정수형 변수 생성뒤 10으로 초기화
		int kopo07_iPerson = 10;

		// InputData객체 생성자에 iPerson값 전달
		InputData kopo07_inData = new InputData(kopo07_iPerson);

		// iPerson값 만큼 반복돌린다.
		for (int kopo07_i = 0; kopo07_i < kopo07_iPerson; kopo07_i++) {
			// 문자열 변숫 생성뒤 이름을 숫자+1증감한것만큼 담는다.
			String kopo07_name = String.format("홍길%02d", kopo07_i);
			// Math.random()함수로 1~100자리 랜덤값을 국어,영어,수학 변수에 담는다.
			int kopo07_kor = (int) (Math.random() * 100);
			int kopo07_eng = (int) (Math.random() * 100);
			int kopo07_math = (int) (Math.random() * 100);
			// 값들을 SetData()함수로 전달한다.
			// 이렇게 되면 InputData클래스안에 각가의 배열의 값들이 iPerson수만큼 들어가는 것이다.
			kopo07_inData.SetData(kopo07_i, kopo07_name, kopo07_kor, kopo07_eng, kopo07_math);

		}
		// iPerson만큼 반복 돌린다.
		for (int kopo07_i = 0; kopo07_i < kopo07_iPerson; kopo07_i++) {
			// 각각의 배열에 들어가 있는 값들을 순서대로 출력한다.
			System.out.printf("번호:%d, 이름:%s, 국어:%s, 영어:%s, 수학:%s, 총점:%d, 평균%6.2f\n", kopo07_i,
					kopo07_inData.kopo07_nameArr[kopo07_i], kopo07_inData.kopo07_korArr[kopo07_i],
					kopo07_inData.kopo07_engArr[kopo07_i], kopo07_inData.kopo07_mathArr[kopo07_i],
					kopo07_inData.kopo07_sumArr[kopo07_i], kopo07_inData.kopo07_avgArr[kopo07_i]);
		}
	}

}
