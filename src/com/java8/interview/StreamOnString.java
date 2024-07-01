package com.java8.interview;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamOnString {

	/*
	 * Using streams Find the vowels count in the string Find the duplicates in the
	 * string
	 * 
	 */

	public static void main(String[] args) {
		String input = "hello hello";
		
		long count = input.chars().filter(
				(x) -> {
			return (x == 'a' || x== 'e' || x== 'i' || x== 'o'|| x== 'u'); 
			}).count();
		
		System.out.println(" count vowels count "+ count);
	
	
	//duplicates
		
		Map<String,Long> collect = input.chars().mapToObj(x -> (char)x)
		.collect(Collectors.groupingBy(Object::toString , Collectors.counting()));
		collect.forEach((key, value) -> System.out.println( key + " " +value));
	
	}
}
