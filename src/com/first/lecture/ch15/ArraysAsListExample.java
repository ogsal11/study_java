package com.first.lecture.ch15;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = Arrays.asList("김도현", "김동현", "김지현");
		for(String name: list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value: list2) {
			System.out.println(value);
		}
	}

}
