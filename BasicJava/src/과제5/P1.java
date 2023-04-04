package 과제5;

import java.util.Scanner;

public class P1 {
	
	public static void main(String[] args) {

//		User selects a number for a family member
//		Print the name of the family member
//		The program should include the following function
//		   public void addition(int familyMember)

//		#Printing a Name
//		1. Father
//		2. Mother
//		3. Son
//		4. Daughter
//		-> 3
//		John

		while (true) {
			P1 p1 = new P1(); // member() 함수를 실행하는데 static이 없기때문에 P1클래스 호출

			int chooseNumber = p1.member(); // 그런다음 p1.으로 접근한다.
			p1.printName(chooseNumber);
		}
	}

	public int member() { // static을 지우면 위에서 P1클래스를 호출해야만 사용가능!
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Father");
		System.out.println("2. Mother");
		System.out.println("3. Son");
		System.out.println("4. Daughter");
		System.out.println("숫자를 선택하세요~");
		int num = sc.nextInt();
		return num;
	}

	public void printName(int chooseNumber) {

		if (chooseNumber == 1) {
			System.out.println("정우성");
		} else if (chooseNumber == 2) {
			System.out.println("손예진");
		} else if (chooseNumber == 3) {
			System.out.println("김의엽");
		} else if (chooseNumber == 4) {
			System.out.println("전지현");
		} else {
			System.out.println("1~4번중 고르세요~");
		}

	}

}
