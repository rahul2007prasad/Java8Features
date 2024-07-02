package com.java8.interview;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumInArray {
	public static void main(String[] args) {
		Integer[] arr = {12,16,45,11,18,22,19,20};
		
		Integer secondHighest = Arrays.asList(arr).stream()
		.distinct()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst()
		.get();
		System.out.println("second highest : " + secondHighest);
	}
}
