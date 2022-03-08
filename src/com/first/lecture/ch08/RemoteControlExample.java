package com.first.lecture.ch08;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		
//		Audio audio = new Audio();
		Television television = new Television();
		
		television.turnOn();
		television.turnOff();
		
		System.out.println();
		// 인터페이스를 구현한 클래스는 위에 처럼 일반클래스 객체 만들듯이 하면 안된다.
		
		// 인터페이스를 구현한 클래스를 사용해야 된다. 
//		RemoteControl remoteControl;	// 인터페이스 변수 선언
//		remoteControl = new Audio();	// 구현객체로 초기화
		
		RemoteControl remoteControl = new Television();
		
		remoteControl.turnOn();
		remoteControl.turnOff();
		remoteControl.setMute(false);
	}

}
