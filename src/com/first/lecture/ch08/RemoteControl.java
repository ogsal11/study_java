package com.first.lecture.ch08;

public interface RemoteControl{

	int MAX_VOLUME = 10;		// public static final 생략되어있음
	int MIN_VOLUME = 0;
	
	// 추상 메소드 : 구현 클래스에서 무조건 오버라이드 해야 된다.
	void turnOn();					// public abstract 생략
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드 : public 생략 가능
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		} else {
			System.out.println("무음 해제합니다");
		}
	}
	
	// 정적 메소드: public 생략 가능
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
