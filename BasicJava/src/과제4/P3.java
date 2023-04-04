package 과제4;

public class P3 {
	public static void main(String[] args) throws Exception {

		String typo = "두근거렸지 누군가 나의 뒤를 쫓고있었고"
				+ "검은 절벽 끝 더 이상 발 디딜 곳 하나 없었지"
				+ "자꾸 목이 메어 간절히 네 이름을 되뇌었을 때"
				+ "귓가에 울리는 그대의"
				+ "뜨거운 목소리 그게 나의 구원이었어"
				+ "마른 하늘을 달려"
				+ "나 그대에게 안길 수만 있으면"
				+ "내 몸 부서진대도 좋아"
				+ "설혹 너머 태양 가까이 날아"
				+ "두 다리 모두 녹아 내린다고 해도"
				+ "내맘 그대 마음속으로"
				+ "영원토록 달려갈거야";
		
//		두근거렸지 누군가 나의 뒤를 쫓고있었고
//		검은 절벽 끝 더 이상 발 디딜 곳 하나 없었지
//		자꾸 목이 메어 간절히 네 이름을 되뇌었을 때
//		귓가에 울리는 그대의
//		뜨거운 목소리 그게 나의 구원이었어
//		마른 하늘을 달려
//		나 그대에게 안길 수만 있으면
//		내 몸 부서진대도 좋아
//		설혹 너머 태양 가까이 날아
//		두 다리 모두 녹아 내린다고 해도
//		내맘 그대 마음속으로
//		영원토록 달려갈거야

		// typo스트링의 글자수 만큼 list에 담아둡니다.
		int count = 0;
		
		for (int i = 0; i < typo.length(); i++) {
			char comVal = (char) (typo.charAt(i) - 0xAC00);

			if (comVal >= 0 && comVal <= 11172) {
				// 한글일경우

				// 초성만 입력 했을 시엔 초성은 무시해서 List에 추가합니다.
				char uniVal = (char) comVal;

				// 유니코드 표에 맞추어 초성 중성 종성을 분리합니다..
				char cho = (char) ((((uniVal - (uniVal % 28)) / 28) / 21) + 0x1100);
				
				char kim = (char) ((((uniVal - (uniVal % 28)) / 28) / 21) + 0x1100);
				
				char jung = (char) ((((uniVal - (uniVal % 28)) / 28) % 21) + 0x1161);
				char jong = (char) ((uniVal % 28) + 0x11a7);

				if (cho != 4519) {
					System.out.print(cho + " ");
				}
				if (jung != 4519) {
					System.out.print(jung + " ");
				}
				if (jong != 4519) {
					System.out.print(jong + " ");
				}
				if (kim == 4352 ) {
					count++;
				}

			} else {
				// 한글이 아닐경우
				comVal = (char) (comVal + 0xAC00);
				System.out.print(comVal + " ");
				
			}
		}
		
		System.out.println(count);

	}
}