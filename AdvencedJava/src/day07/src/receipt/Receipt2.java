package receipt;

public class Receipt2 {

	public static void main(String[] args) {

		String[] kopo07_OneRec = { "시,구,기준년도,소상공인 업체 수,소상공인 종사자 수,집합금지 업종 수,영업제한 업종 수,코로나19 재난지원금 지출액",

				"서울특별시,송파구,2020년,94200,125610,11,10,23500",
				"서울특별시,송파구,2020년,94200,125610,11,10,55550", 
				"서울특별시,송파구,2021년,50000,300000,11,43,512500000",
				"서울특별시,송파구,2022년,104200,35410,20,30,288000000" };

		String[] kopo07_field_name = kopo07_OneRec[0].split(","); // field_name은 , 기준으로 제목들만 들어간다.

		for (int kopo07_i = 1; kopo07_i < kopo07_OneRec.length; kopo07_i++) { // OneRec배열의 갯수만큼 반복을 돈다.

			String[] kopo07_field = kopo07_OneRec[kopo07_i].split(","); // OneRec[i]는 인덱스 두번째에 있는 값들을 ,기준으로 찢는다.
																		// 뒤에 따라오는 값들이 field로 들어간다.
			System.out.printf("***********************************\n");
			// field_name의 반복은 제목갯수만큼 반복을 하는거다.
			for (int kopo07_j = 0; kopo07_j < kopo07_field_name.length; kopo07_j++)
				System.out.printf(" %s : %s\n", kopo07_field_name[kopo07_j], kopo07_field[kopo07_j]); // 제목과 값들을
		}
		System.out.printf("***********************************\n");

	}
}
