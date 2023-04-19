package Array;

import java.util.ArrayList;

public class OneRec2Main {
	// OneRec2타입인 리스트ArrayOneRec을 생성한다.
	static ArrayList<OneRec2> kopo07_ArrayOneRec = new ArrayList<OneRec2>();

	public static void main(String[] args) {
		// 함수를 호출한다. / 20명 랜덤으로 이름과 성적을 만들어낸다.
		dataSet();
		// 헤더를 출력한다.
		HeaderPrint();
		// ItemPrint()메서드로 20명의 성적들을 출력한다.
		for (int kopo07_i = 0; kopo07_i < kopo07_ArrayOneRec.size(); kopo07_i++) {
			ItemPrint(kopo07_i);
		}
		// 꼬리를 출력한다.
		TailPrint();
	}

	// 누적 합계를 담아줄 전역변수 생성
	static int kopo07_sumKorea = 0;
	static int kopo07_sumEnglish = 0;
	static int kopo07_sumMath = 0;
	static int kopo07_sumSum = 0;
	static int kopo07_sumAvg = 0;

	// 20명의 사람의 성적을 출력하기 위해수 변수를 20으로 초기화
	static final int kopo07_IPERSON = 20;

	// 20번 반복을 통해 새로운 이름과 새로운 성적들을 생성해놓은 리스트에 추가한다.
	public static void dataSet() {
		// 위에 사람수만큼 반복을 돈다.
		for (int kopo07_i = 0; kopo07_i < kopo07_IPERSON; kopo07_i++) {
			// 각각의 랜덤이름과 랜덤숫자 점수들을 변수에 담는다.
			String kopo07_name = String.format("홍길%02d", kopo07_i);
			int kopo07_korea = (int) (Math.random() * 100);
			int kopo07_english = (int) (Math.random() * 100);
			int kopo07_math = (int) (Math.random() * 100);
			// 이때 new OneRec2의기본 생성자를 통해서 값들을 한번에 담아준다.
			kopo07_ArrayOneRec.add(new OneRec2(kopo07_i, kopo07_name, kopo07_korea, kopo07_english, kopo07_math));
		}
	}

	// 헤더 메서드
	public static void HeaderPrint() {
		System.out.printf("******************************************\n");
		System.out.printf("  %2s%4s  %2s %2s %2s %2s     %2s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");
		System.out.printf("******************************************\n");
	}

	public static void ItemPrint(int kopo07_i) {
		// ArrayOneRec 리스트안에 순서대로 가져와 rec을 담고 그 rec을통해 내부에 있는 값들을 출력한다.
		OneRec2 kopo07_rec = kopo07_ArrayOneRec.get(kopo07_i);
		System.out.printf("%4d  %4s  %3d  %3d  %3d  %3d     %6.2f\n", kopo07_rec.number(), kopo07_rec.name(),
				kopo07_rec.korea(), kopo07_rec.english(), kopo07_rec.math(), kopo07_rec.sum(), kopo07_rec.avg());

		// 꼬리 메서드안에 누적연산을 위해서 += 로 각각 성적을 담아준다.
		kopo07_sumKorea += kopo07_rec.korea();
		kopo07_sumEnglish += kopo07_rec.english();
		kopo07_sumMath += kopo07_rec.math();
		kopo07_sumSum += kopo07_rec.sum();
		kopo07_sumAvg += kopo07_rec.avg();

	}

	// 꼬리 메서드
	public static void TailPrint() {
		System.out.printf("******************************************\n");
		// 합계랑 합계평균을 출력하는거라서 총누적된 값에서 리스트의 갯수만큼 나눠주며 그게 평균이된다. 리스트 갯수가 곧 사람수이기 때문이다.
		System.out.printf("국어합계: %d  국어평균: %6.2f\n", kopo07_sumKorea,
				kopo07_sumKorea / (double) kopo07_ArrayOneRec.size());
		System.out.printf("영어합계: %d  영어평균: %6.2f\n", kopo07_sumEnglish,
				kopo07_sumEnglish / (double) kopo07_ArrayOneRec.size());
		System.out.printf("수학합계: %d  수힉평균: %6.2f\n", kopo07_sumMath,
				kopo07_sumMath / (double) kopo07_ArrayOneRec.size());
		System.out.printf("******************************************\n");
		System.out.printf("반평균합계: %d  반평균: %6.2f\n", kopo07_sumAvg, kopo07_sumAvg / (double) kopo07_ArrayOneRec.size());
	}

}
