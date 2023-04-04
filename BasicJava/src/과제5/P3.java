package 과제5;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {

//		사용자가 가족 구성원의 번호를 선택합니다.
//		가족 구성원의 이름을 인쇄하십시오
//		프로그램은 이름에 대한 정적 최종 변수를 선언하고 이름을 인쇄하는 매개변수가 포함된 함수를 포함해야 합니다.

		P3 p3 = new P3(); //static이 없기때문에 P3클래스를 생성한다. 그걸 p3이름으로 한다.
		while (true) {
			int choiceNumber = p3.printName(); // 아빠,엄마,딸,아들 선택 -> 리턴 숫자
			p3.choiceName(choiceNumber);// 리턴숫자 받고 정우성,손예진 실행
		}
	}

	public int printName() {

		String father = "1. 아빠";
		String mother = "2. 엄마";
		String son = "3. 아들";
		String daughter = "4. 딸";

		System.out.println(father);
		System.out.println(mother);
		System.out.println(son);
		System.out.println(daughter);
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 고르세요.");
		int num = sc.nextInt();

		return num;
	}

	public void choiceName(int x) {

		String fatherName = "1. 정우성";
		String motherName = "2. 손예진";
		String sonName = "3. 김의엽";
		String daughterName = "4. 김태희";
		String happy = "=============";

		switch (x) {

		case 1:
			System.out.println(fatherName);
			System.out.println(happy);
			break;
		case 2:
			System.out.println(motherName);
			System.out.println(happy);
			break;
		case 3:
			System.out.println(sonName);
			System.out.println(happy);
			break;
		case 4:
			System.out.println(daughterName);
			System.out.println(happy);
			break;
		default:
			System.out.println("1~4번중 고르세요~");
			System.out.println(happy);
			break;
		}

	}

}
