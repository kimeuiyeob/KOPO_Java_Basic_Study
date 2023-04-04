package 과제6;

import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {

//		Create a two dimensional string array
//		Calculate the summation, average, minimum, maximum of scores for each subject and person
//		Hint, Integer.parseInt();

//		Name	Korean	English		Math
//		================================
//		Jeong	70		80			100
//		Pyo		60		70			86
//		Choi	54		100			82
//		Mike	87		95			79

//		Name Korean English Math
//		jeong 70 80 100
//		Pyo 60 70 86
//		Choi 54 100 82
//		Mike 87 96 79

//		jeong의 점수 합은 250
//		jeong의 점수 평균은 83

		String[][] strArray = new String[100][100]; // [4][5]
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 4; ++j) {
				strArray[i][j] = sc.next();
			}
		}
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 4; ++j) {
				System.out.print(strArray[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		int sum = 0;
		int k = 0;

		for (int i = 1; i < 5; i++) {
			System.out.print(strArray[i][k] + " 점수 합은 : "); // 10
			for (int j = 1; j < 4; j++) {
				sum += Integer.parseInt(strArray[i][j]);
			}
			System.out.println(sum);
			sum = 0;
		}
		System.out.println();
		for (int i = 1; i < 5; i++) {
			System.out.print(strArray[i][k] + " 평균 점수 : "); // 10
			for (int j = 1; j < 4; j++) {
				sum += Integer.parseInt(strArray[i][j]);
			}
			System.out.println(sum/3);
			sum = 0;
		}
		System.out.println();
	}
}
