package 과제5;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {

//		사용자가 숫자(과목 수)를 입력
//		사용자가 과목별 단위 입력 (?)
//		사용자가 과목별 등급 ==> A+(10점), A0(9.5점), B+(9점), B0(8.5점), C+(8점),
//		C0(7.5점), D+(7점), D0(6.5점), E+(6점), E0(5.5점), F+(5점), F0(4.5점)
//		*Float 데이터 형식을 사용하여 평균 성적을 출력
//		3 //과목수 입력
//		A+
//		B+
//		C0
//		3.1875 <=이런식으로 전체 과목 평균값 구하는건가...
		
		yourGrade();
		
	}

	public static void yourGrade() {
		Scanner sc = new Scanner(System.in);
		float total = 0;
		int count = 0;
		System.out.println("과목 갯수를 입력해주세요.");
		int subjectCount = sc.nextInt();
		System.out.println("과목 등급을 순서대로 입력해주세요. ex) A+,B+,C0...");
		for (int i = 0; i < subjectCount; i++) {

			String subjectCount1 = sc.next();
			count++;

			if (subjectCount1.equals("A+")) {
				total += 10;
			} else if (subjectCount1.equals("A0")) {
				total += 9.5;
			} else if (subjectCount1.equals("B+")) {
				total += 9;
			} else if (subjectCount1.equals("B0")) {
				total += 8.5;
			} else if (subjectCount1.equals("C+")) {
				total += 8;
			} else if (subjectCount1.equals("C0")) {
				total += 7.5;
			} else if (subjectCount1.equals("D+")) {
				total += 7;
			} else if (subjectCount1.equals("D0")) {
				total += 6.5;
			} else if (subjectCount1.equals("E+")) {
				total += 6;
			} else if (subjectCount1.equals("E0")) {
				total += 5.5;
			} else if (subjectCount1.equals("F+")) {
				total += 5;
			} else if (subjectCount1.equals("F0")) {
				total += 4.5;
			}
		}
		
		System.out.println("점수 총 합계 : " + total);
		System.out.println("평균 점수 : " + total / count);

	}
}
