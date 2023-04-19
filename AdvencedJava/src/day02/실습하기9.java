package day02;

public class 실습하기9 {

	   public static void main(String[] args) {

	      double kopo07_d = 85.4; // double형 변수에 85.4대입
	      int kopo07_score = (int) kopo07_d; // 정수형score변수에 85.4를 정수형 형변환한뒤 대입 <== 소숫점 사라짐

	      System.out.println("score = " + kopo07_score); //변수 score 출력 == score = 85
	      System.out.println("d = " + kopo07_d); //변수 d출력 == d = 85.4
	   }

	}