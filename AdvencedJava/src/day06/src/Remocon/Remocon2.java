package Remocon;

public class Remocon2 {
	static Remocon kopo07_remocon1;

	public static void main(String[] args) {

		// remocon1변수에 Remocon객체를 생성해 담는다.
		kopo07_remocon1 = new Remocon();

		// 10번 반복을 돌린다.
		for (int kopo07_i = 0; kopo07_i < 10; kopo07_i++) {
			// upchannel()을 호출한다.
			kopo07_remocon1.upchannel();
		}
		// upchannel()에다 3을 파라미터로 전달해서 메소드를 호출하면 채널이 3만큼 증가한다.
		kopo07_remocon1.upchannel(3);

		// 10번 반복을 돌린다.
		for (int kopo07_i = 0; kopo07_i < 10; kopo07_i++) {
			// upVolume()을 호출한다.
			kopo07_remocon1.upVolume();
		}
		// downVolume()에다 3을 파라미터로 전달해서 메소드를 호출하면 채널이 3만큼 내려간다.
		kopo07_remocon1.downVolume(3);
	}
}

class Remocon {

	private int kopo07_limit_up_channel; // 최상층 변수 생성
	private int kopo07_limit_down_channel; // 최하층 변수 생성
	private int kopo07_channel; // 현재층 변수 생성

	private int kopo07_limit_up_volume; // 최상 볼륨 변수 생성
	private int kopo07_limit_down_volume; // 최하 볼륨 변수 생성
	private int kopo07_volume; // 현재 볼륨 변수 생성

	public String kopo07_help; // 문자열 변수 생성

	// 기본 생성자 생성
	public Remocon() {
		super();
		kopo07_limit_up_channel = 20; // 최상층 변수에 20으로 초기화
		kopo07_limit_down_channel = 1; // 최하층 변수에 1로 초기화
		kopo07_channel = 1; // 현재층을 1로 초기화

		kopo07_limit_up_volume = 30; // 최상 볼륨을 30으로 초기화
		kopo07_limit_down_volume = 1; // 최하 볼륨을 1로 초기화
		kopo07_volume = 1; // 현재 볼륨을 1로 초기화

		kopo07_help = "나는야 리모콘~"; // 문자열 초기화

	}

//=================================================================================
//채널 한칸씩 업
	void upchannel() {
		System.out.println("채널 한칸 업!");
		// 만약 현재층이 최상층이라면 아래 문자열 출력
		if (kopo07_channel == kopo07_limit_up_channel) {
			kopo07_help = "마지막 채널입니다.";
		} else {
			// 채널 1씩 증가뒤 아래 출력
			kopo07_channel++;
			kopo07_help = String.format("[%d] 채널입니다.", kopo07_channel);
		}
	}

	// 채널 한칸씩 다운
	void downchannel() {
		System.out.println("채널 한칸 다운!");
		// 만약 현재층이 최하층이라면 아래 문자열 출력
		if (kopo07_channel == kopo07_limit_down_channel) {
			kopo07_help = "처음 채널입니다.";
		} else {
			// 채널 1씩 빼고 아래 출력
			kopo07_channel--;
			kopo07_help = String.format("[%d] 채널입니다.", kopo07_channel);
		}
	}

//=================================================================================
//볼륨 한칸씩 업
	void upVolume() {
		System.out.println("볼륨 한칸 업");
		// 만약 현재 볼륨이 최상 볼륨이라면 이레 출력
		if (kopo07_volume == kopo07_limit_up_volume) {
			kopo07_help = "마지막 볼륨입니다.";
		} else {
			// 볼륨 1씩 증가뒤 아래 문자 출력
			kopo07_volume++;
			kopo07_help = String.format("[%d] 볼륨입니다.", kopo07_volume);
		}
	}

	// 볼륨 한칸씩 다운
	void downVolume() {
		System.out.println("볼륨 한칸 다운");
		// 만약 현재 볼륨이 최하 볼륨과 같다면 아래 출력
		if (kopo07_volume == kopo07_limit_down_volume) {
			kopo07_help = "처음 볼륨입니다.";
		} else {
			// 볼룸 1씩 빼고 아래 문자열 출력
			kopo07_volume--;
			kopo07_help = String.format("[%d] 볼륨입니다.", kopo07_volume);
		}
	}

//==================================================================================
//볼륨 숫자만큼 업
	void upVolume(int kopo07_u) {
		// 파라미터로 받은 값만큼 반복
		for (int kopo07_i = 0; kopo07_i < kopo07_u; kopo07_i++) {
			// upVolume()메서드 호출
			this.upVolume();
		}
		// 아래 문자열들 출력
		System.out.println(kopo07_u + "칸 볼륨 업");
		System.out.println("현재볼륨 : " + kopo07_volume);
	}

	// 볼륨 숫자만큼 다운
	void downVolume(int kopo07_u) {
		// 파라미터로 받은 값만큼 반복
		for (int kopo07_i = 0; kopo07_i < kopo07_u; kopo07_i++) {
			// downVolume()메서드 호출
			this.downVolume();
		}
		// 아래 문자열들 출력
		System.out.println(kopo07_u + "칸 볼륨 다운");
		System.out.println("현재볼륨 : " + kopo07_volume);
	}

//==================================================================================
	// 채널 숫자만큼 업
	void upchannel(int kopo07_u) {
		// 파라미터로 받은 값만큼 반복
		for (int kopo07_i = 0; kopo07_i < kopo07_u; kopo07_i++) {
			// upchannel()메서드 호출
			this.upchannel();
		}
		// 아래 문자열들 출력
		System.out.println(kopo07_u + "칸 채널 업");
		System.out.println("현재채널 : " + kopo07_channel);
	}

	// 채널 숫자만큼 다운
	void downchannel(int kopo07_u) {
		// 파라미터로 받은 값만큼 반복
		for (int kopo07_i = 0; kopo07_i < kopo07_u; kopo07_i++) {
			// downchannel()메서드 호출
			this.downchannel();
		}
		// 아래 문자열들 출력
		System.out.println(kopo07_u + "칸 채널 다운");
		System.out.println("현재채널 : " + kopo07_channel);
	}

//==================================================================================

}
