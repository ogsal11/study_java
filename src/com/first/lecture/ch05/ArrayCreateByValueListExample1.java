package com.first.lecture.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int[] score;	// 선언 아래와 같은 뜻이지만 위에거를 선호
//		
//		int score2[];	// 선언
//		
//		int[] score3 = {1,2,3,4,5,6,7,8,9,10};	// 객체 생성
//		
//		int score4[] = {4,5,6};	// 객체 생성
//		
//		double[] score6 = {1,2,3,4};
//		
//		String[] strArray = {"장원영", "전지현","장동건","고소영"};
		
//		입력이 되는 데이터 타입이 동일해야 한다.
//		순서는 무조건 0 부터 시작한다.
//		총갯수를 원활하게 늘릴 수 없다.
		
		int[] score = {83,90,87,99};
		
		System.out.println("score[0]: " + score[0]);
		System.out.println("score[1]: " + score[1]);
		System.out.println("score[2]: " + score[2]);
		System.out.println("score[3]: " + score[3]);
		
		int sum = 0;
		for(int i=0; i<4; i++) {
			
			sum += score[i];
			
		}
		System.out.println("총합은 : " + sum);
		double avg = (double) sum/4;
		System.out.println("평균은 : " + avg);
	}

}
