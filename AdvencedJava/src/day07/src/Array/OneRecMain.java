package Array;

public class OneRecMain {

	public static void main(String[] args) {

		// 정수 변수 생성뒤 10으로 초기화
		int kopo07_iPerson = 10;
		// 위에 사람수만큼 배열 생성
		OneRec[] kopo07_inData = new OneRec[kopo07_iPerson];
		// 각각의 배열에 값들을 담아준다.
		kopo07_inData[0] = new OneRec("김의엽", 100, 100, 100);
		kopo07_inData[1] = new OneRec("양정우", 50, 70, 100);
		kopo07_inData[2] = new OneRec("임은준", 100, 30, 60);
		kopo07_inData[3] = new OneRec("조여사", 70, 100, 100);
		kopo07_inData[4] = new OneRec("김인엽", 100, 100, 100);
		kopo07_inData[5] = new OneRec("김의엽", 50, 100, 100);
		kopo07_inData[6] = new OneRec("양정우", 100, 100, 100);
		kopo07_inData[7] = new OneRec("임은준", 100, 40, 100);
		kopo07_inData[8] = new OneRec("조여사", 100, 100, 20);
		kopo07_inData[9] = new OneRec("김인엽", 100, 30, 100);

		// 배열의 수만큼 반복한다.
		for (int kopo07_i = 0; kopo07_i < kopo07_inData.length; kopo07_i++) {
			// 배열의 0번째 인덱스부터 순서대로 출력한다.
			System.out.printf("번호:%d  이름:%5.5s  국어:%5d  영어:%5d  수학:%5d  총점:%5d  평균:%6.2f\n", kopo07_i,
					kopo07_inData[kopo07_i].name(), kopo07_inData[kopo07_i].korea(), kopo07_inData[kopo07_i].english(),
					kopo07_inData[kopo07_i].math(), kopo07_inData[kopo07_i].sum(), kopo07_inData[kopo07_i].avg());
		}

	}

}
