package Remocon;

public class Remocon1 {
	public static void main(String[] args) {

		// TvRemocon객체를 tv에 담는다.
		TvRemocon tv = new TvRemocon();
		// 10번 박복 한다.
		for (int i = 0; i < 10; i++) {
			// tv로 TvRemocon객체에 있는 channelUp()메서드를 호출한다.
			tv.channelUp();
		}
		// 10번 박복 한다.
		for (int i = 0; i < 10; i++) {
			// tv로 TvRemocon객체에 있는 channelDown()메서드를 호출한다.
			tv.channelDown();
		}
		// 구분 짓기 위해 줄내림을 한번 한다
		System.out.println();
		// 5번 박복 한다.
		for (int i = 0; i < 5; i++) {
			// tv로 TvRemocon객체에 있는 Volup()메서드를 호출한다.
			tv.Volup();
		}
		// 5번 박복 한다.
		for (int i = 0; i < 5; i++) {
			// tv로 TvRemocon객체에 있는 Voldown()메서드를 호출한다.
			tv.Voldown();
		}

	}

}

//TvRemocon 이너클래스 생성한다.
class TvRemocon {
	// 정수형 변수 volume,channel 생성뒤 1로 초기화한다.
	int volume = 1;
	int channel = 1;

	// channelUp()메서드를 생성한다.
	void channelUp() {
		++channel; // 채널을 1씩 증감하고 출력한다.
		System.out.println("현재 채널은 : " + channel);
	}

	// channelDown()메서드를 생성한다.
	void channelDown() {
		--channel; // 채널을 1씩 빼고 출력한다.
		System.out.println("현재 채널은 : " + channel);
	}

	// Volup()메서드를 생성한다.
	void Volup() {
		++volume; // 볼륨을 1씩 증감하고 출력한다.
		System.out.println("현재 볼륨은 : " + volume);
	}

	// Voldown()메서드를 생성한다.
	void Voldown() {
		--volume; // 볼륨을 1씩 빼고 출력한다.
		System.out.println("현재 볼륨은 : " + volume);
	}

}
