package com.first.lecture.ch07;

public class Computer extends Calculator{

	@Override
	public double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI * r * r;
	}

	
}