package com.first.lecture.ch08;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("MyClassB-method1() 실행");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
//		MyInterface.super.method2();
		System.out.println("MyClassB-method2() 실행");
	}
	
	

}
