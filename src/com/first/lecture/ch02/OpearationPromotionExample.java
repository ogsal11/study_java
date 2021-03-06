package com.first.lecture.ch02;

public class OpearationPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 연산: + - * / %
		
		// 형이 틀린 경우에는 큰 형으로 자동 형변환
		int a = 10;
		double b = 10.0;
	//	int c = (a+b);
		int d = (int) (a+b);
		int e = a + (int)b;
		double f = a+b;
		
		
		System.out.println("d: " +d);
		System.out.println("e: " +e);
		System.out.println("f: " +f);
		
		// 정수형 연산 (byte, short, int)은 int로 자동 형변환, long 은 제외
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println("intValue: " + intValue1);
		// 실수형 연산은 double 로 자동 형변환
		
		char charValue1 = 'A';
		char charValue2 = 1;
	//	char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char) intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
	//	int intValue6 = 10/ 4.0;
		double doubleValue = intValue5 / 4.0;
		System.out.println("doubleValue: " + doubleValue);
	}

}
