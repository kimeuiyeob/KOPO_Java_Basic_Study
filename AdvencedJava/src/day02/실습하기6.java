package day02;

public class 실습하기6 {

	   public static void main(String[] args) {

	      byte kopo07_b = 1; // byte형 변수b를 생성뒤 1을 대입
	      short kopo07_s = 2; // short형 변수s를 생성뒤 2를 대입
	      char kopo07_c = 'A'; // char형 변수c를 생성뒤 A를 대입

	      int kopo07_finger = 10; // int형 finger변수 10을 대입
	      //정수형 data type중 가장 긴 long에 big 선언 뒤에 long자료형이므로 L 추가
	      long kopo07_big = 10000000000000L; // long형 big변수에 10000000000000대입
	      long kopo07_hex = 0xFFFFFFFFFFFFFFFL; // long형 hex변수에 0xFFFFFFFFFFFFFFFL대입

	      int kopo07_octNum = 010; // 10진수 8을 octNum에 대입
	      int kopo07_hexNum = 0x10; // 10진수 16을 hexNum에 대입
	      int kopo07_binNum = 0b10; // 10진수 2를 binNum에 대입

	      System.out.printf("b = %d\n", kopo07_b); // 출력 == b = 1
	      System.out.printf("s = %d\n", kopo07_s); // 출력 == s = 2
	      // 문자열 c출력과 문자열인 c를 int로 바꿔 'A'의 아스키코드 출력
	      System.out.printf("c = %c, %d \n", kopo07_c, (int) kopo07_c); // 출력 == c = A, 65

	      System.out.printf("finger = [%5d]\n", kopo07_finger); // 출력 == finger = [ 10] <== %뒤 숫자가 커지면 []안에 공간이 더 넓어진다.
	      System.out.printf("finger = [%-5d]\n", kopo07_finger); // 출력 == finger = [10 ] <== %뒤 -가 붙어서 []안에 뒤 공간이 더 넓어진다.
	      System.out.printf("finger = [%05d]\n", kopo07_finger); // 출력 == finger = [00010] <== %뒤 05가 붙어서 000뒤 10이 붙는다.

	      System.out.printf("big = %d\n", kopo07_big); // 출력 == big = 10000000000000
	      System.out.printf("hex = %#x\n", kopo07_hex); // 출력 == hex = 0xfffffffffffffff

	      // 8진수로 octNum출력, 10진수로 octNum 출력
	      System.out.printf("octNum = %o, %d\n", kopo07_octNum, kopo07_octNum); // 출력 == octNum = 10, 8
	      // 16진수로 hexNum출력, 10진수로 hexNum 출력
	      System.out.printf("hexNum = %x, %d\n", kopo07_hexNum, kopo07_hexNum); // 출력 == hexNum = 10, 16
	      // 2진수로 binNum 출력, 10진수로 binNum 출력
	      System.out.printf("binNum = %s, %d\n", Integer.toBinaryString(kopo07_binNum), kopo07_binNum); // 출력 == binNum = 10, 2
	                                                                              

	   }

	}