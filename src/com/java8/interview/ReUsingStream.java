package com.java8.interview;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReUsingStream {
	public static void main(String[] args) {
		// Can we Re use a  stream??
		
		String[] input = {"Amit" ,"ball" , "call" ,"Amit" ,"egg"};
		
		/*
		 * //we can not use the stream again and again Stream<String> stream =
		 * Arrays.asList(input).stream();
		 * 
		 * 
		 * stream.forEach(ex -> System.out.println(ex));
		 * 
		 * long count = stream.filter(x -> "Amit".equals(x)).count();
		 * System.out.println("Total count " + count);
		 * 
		 */
		
		// But how we can re use the stream
		
		//Answer is :: using SUPPLIER Interface
		Supplier<Stream<String>> inputStream = ()-> Stream.of(input);
		inputStream.get().forEach(ex -> System.out.println(ex));
		  
		  long count = inputStream.get().filter(x -> "Amit".equals(x)).count();
		  System.out.println("Total count " + count);
		
	}
}
