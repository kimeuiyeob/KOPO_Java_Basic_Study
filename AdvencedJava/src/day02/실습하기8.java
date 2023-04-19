package day02;

public class 실습하기8 {

	   public static void main(String[] args) {

	      short kopo07_sMin = -32768; // short형 변수에 -32768대입
	      short kopo07_sMax = 32767; // hort형 변수에 32768대입
	      char kopo07_cMin = 0; // char형 변수에 0대입
	      char kopo07_cMax = 65535; // char형 변수에 65535대입

	      System.out.println("sMin = " + kopo07_sMin); // 출력 == sMin = -32768
	      System.out.println("sMin - 1 = " + (short) (kopo07_sMin - 1)); // 출력 == 32767

	      System.out.println("sMax = " + kopo07_sMax); // 출력 == 32767
	      System.out.println("sMax + 1 = " + (short) (kopo07_sMax + 1)); // 출력 == -32768

	      System.out.println("cMin = " + (int) kopo07_cMin); // 출력 == 0
	      System.out.println("cMin - 1  = " + (int) --kopo07_cMin); // 출력 == 65535

	      System.out.println("cMax = " + (int) kopo07_cMax); // 출력 == 65535
	      System.out.println("cMax + 1 = " + (int) ++kopo07_cMax); // 출력 == 0

	   }

	}