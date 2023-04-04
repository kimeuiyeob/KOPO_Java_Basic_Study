package 과제1;

import java.util.Scanner;

public class A4_4 {
	public static void main(String[] args) {
		
//		Practice ‘if’ and ‘switch’ related examples
		Scanner sc = new Scanner(System.in);
		
		if (true) {
			System.out.println("이거는 무조건적인 실행!");
		}

		System.out.println("입력하신 숫자가 10보다 큰지 안큰지 알려드립니다.");
		int input1 = sc.nextInt();

		if (input1 < 10) {
			System.out.println("입력하신 숫자는 10보다 작은 숫자입니다.");
		} else {
			System.out.println("입력하신 숫자는 10보다 큰 숫자입니다.");
		}

//		코리아 초등학교에서 1학년부터 4학년까지 중간고사 시험을 보았다. 
//	    4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
//	    이를 판단하는 프로그램을 작성해보자.
//	    점수가 0미만 100초과이면 경고문구 출력!

		System.out.println("학년을 입력해주세요!");
		int grade = sc.nextInt();
		if (grade == 4) {
			System.out.println("점수를 입력해주세요");
			int score = sc.nextInt();
			if (score >= 70) {
				System.out.println("합격 하셨습니다!");
			} else {
				System.out.println("불합격 입니다!");
			}
		} else if (1 <= grade && grade < 5) {
			System.out.println("점수를 입력해주세요");
			int score = sc.nextInt();
			if (score >= 60) {
				System.out.println("합격 하셨습니다!");
			} else {
				System.out.println("불합격 입니다!");
			}
		} else {
			System.err.println("학년을 올바르게 입력해주세요.");
		}

//		수학점수가 90점 이상이면 "A학점", 80점 이상이면 "B학점", 70점 이상이면 "C학점", 60점 이상이면 "D학점", 나머지 "F학점"
		System.out.println("수학 점수를 입력해주세요!");
		int mathScore = sc.nextInt();
		if (90 <= mathScore) {
			System.out.println("A학점");
		} else if (80 <= mathScore) {
			System.out.println("B학점");
		} else if (70 <= mathScore) {
			System.out.println("C학점");
		} else if (60 <= mathScore) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}

//		============================================================================================

		System.out.println("1~5번까지 숫자를 입력하세요!");
		int input2 = sc.nextInt();

		switch (input2) {
		case 1:
			System.out.println("1번을 클릭하셨습니다");
			break;
		case 2:
			System.out.println("2번을 클릭하셨습니다");
			break;
		case 3:
			System.out.println("3번을 클릭하셨습니다");
			break;
		case 4:
			System.out.println("4번을 클릭하셨습니다");
			break;
		case 5:
			System.out.println("5번을 클릭하셨습니다");
			break;
		default:
			System.err.println("1~5번까지만 입력하랬잖아요~~~");
		}

//		System.out.println("1월부터 12월달까지 숫자를 입력하면 영어로 번역해드립니당~~");
		int month = sc.nextInt();
		String monthString = "";
		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid month";
			break;
		}
		System.out.println("입력하신 달은 " + monthString + " 입니다.");
		
	}

}
