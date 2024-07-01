package com.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultiplicationByJava8 {
	public static void main(String[] args) {
		Integer[] input = {1,2,3,4,5,6}; //120
		
		List<Integer> asList = Arrays.asList(input);
		
		Optional<Integer> output = asList.stream().reduce((a,b)-> a*b);
		
		if(output.isPresent())
			System.out.println(output.get());
		else
			System.out.println("Empty list");
		
		
	}
}
