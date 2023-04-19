package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OneRec3Main {
	// 제네릭이 OneRec3타입인 리스트ArrayOneRec를 생성한다.
	// 제네릭은 타입과 비슷하다.
	// <>안에 OneRec3이안의 객체들의 타입만 들어올수 있다는것이다.
	static ArrayList<OneRec3> kopo07_ArrayOneRec = new ArrayList<OneRec3>();

	public static void main(String[] args) {
		// dataSet()호출한다. / 20명 랜덤으로 이름과 성적을 만들어낸다.
		dataSet();
		// dataSort()호출한다 / 내가 원하는 기준대로 정렬
		dataSort();
		// HeaderPrint() 호출한다.
		HeaderPrint();
		// ItemPrint()메서드로 20명의 성적들을 출력한다.
		for (int kopo07_i = 0; kopo07_i < kopo07_ArrayOneRec.size(); kopo07_i++) {
			ItemPrint(kopo07_i);
		}
		// TailPrint() 호출한다.
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
		// 사람의 수만큼 반복
		for (int kopo07_i = 0; kopo07_i < kopo07_IPERSON; kopo07_i++) {
			// 랜덤이름과 각각의 랜덤의 점수들을 변수에 담는다.
			String kopo07_name = String.format("홍길%02d", kopo07_i);
			int kopo07_korea = (int) (Math.random() * 100);
			int kopo07_english = (int) (Math.random() * 100);
			int kopo07_math = (int) (Math.random() * 100);
			// 이때 new OneRec2의기본 생성자를 통해서 값들을 한번에 담아준다.
			kopo07_ArrayOneRec.add(new OneRec3(kopo07_i, kopo07_name, kopo07_korea, kopo07_english, kopo07_math));
		}
	}

//	=========================================================================================

	// Comparable은 "자기 자신과 매개변수 객체를 비교" <- 파라미터가 하나
	// Comparator는 "두 매개변수 객체를 비교" <- 파라미터가 두개

	public static void dataSort() {
		// Comparator 객체는 인터페이스므로 compare메서드를 오버라이드 해서 구현해주어야 사용가능하다.
		// Comparator는 간단히 말해 객체끼리 비교할수 있는 용도이다.
		// OneRec2객체 list값 안에 여러값이 있기 때문에 어떤걸 기준으로 비교할지 모르니까 Comparator을 사용해서 비교기준을 잡고 그
		// 기준대로 정렬시킨다.
		Comparator<OneRec3> kopo07_compareWith = new Comparator<>() {

			// Comparator인터페이스 내부에 있는 compare메서드 구현해야한다.
			// 객체끼리 비교하기 위해서 사용한다.
			@Override
			// o1과 o2를 비교함에 있어 자기 자신은 두 객체 비교에 영향이 없다.
			public int compare(OneRec3 kopo07_o1, OneRec3 kopo07_o2) {
				// 합계를 비교해서 리턴하게 되면 합계가 낮은순부터 정렬되서 나오는데 맨아래 reverse로 한번 뒤집어서 합계가 가장 높은순으로 나올것이다.
				return kopo07_o1.sum() - kopo07_o2.sum();
			}
		};
		// 위에서 내가 원하는 정렬로 정렬시키는것이다.
		// (ArrayOneRec의 리스트를 compareWith객체안에 있는 내비교양식으로 정렬시킨다는 의미이다.
		Collections.sort(kopo07_ArrayOneRec, kopo07_compareWith);
		Collections.reverse(kopo07_ArrayOneRec); // reverse 반대로 뒤집는거다.
	}

//	=========================================================================================
	// 헤더 메서드
	public static void HeaderPrint() {
		System.out.printf("******************************************\n");
		System.out.printf("  %2s%4s  %2s %2s %2s %2s     %2s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");
		System.out.printf("******************************************\n");
	}

	public static void ItemPrint(int kopo07_i) {
		// ArrayOneRec 리스트안에 순서대로 가져와 rec을 담고 그 rec을통해 내부에 있는 값들을 출력한다.
		OneRec3 kopo07_rec = kopo07_ArrayOneRec.get(kopo07_i);
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
