package day04;

public class switchCase문 {

	public static void main(String[] args) {

		String kopo07_jumin = "123456-1234567"; // string형 변수에 "123456-1234567" 대입

		// .charAt() String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 친구
		System.out.println("값 : " + kopo07_jumin.charAt(7)); // 값을 먼저 확인하자!

		switch (kopo07_jumin.charAt(7)) { // string은 표현이 안된다.

		case '1':
			// break가 걸려있지 않으므로 1번을 고르더라도 아래 출력까지 실행된다.
			System.out.printf("20세기전 태어난 남자 사람\n");
		case '2':
			// switch()안 조건문이 2일때 아래 출력뒤 break
			System.out.printf("20세기전 태어난 여자 사람\n");
			break;
		case '3':
			// switch()안 조건문이 3일때 아래 출력뒤 break
			System.out.printf("20세기후 태어난 남자 사람\n");
			break;
		case '4':
			// switch()안 조건문이 4일때 아래 출력뒤 break
			System.out.printf("20세기후 태어난 여자 사람\n");
			break;
		// switch()안 조건문이 동일한게 없으면 아래 출력 / default는 어차피 switch마지막에 수행되는거라 break가 필요없다.
		default:
			System.out.printf("사람\n");

		}

	}

}
