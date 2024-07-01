package com.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoiner {
	//Input = Hello How are you
	//Output = [Hello=how-are-you]
	
	public static void main(String[] args) {
		String input = "Hello How are you";
		String[] inputArray = input.split(" ");
		
		java.util.StringJoiner joiner = new java.util.StringJoiner("-","[","]");
		
		for(String inputArr : inputArray) {
			joiner.add(inputArr);
		}
		System.out.println(joiner.toString());
		
		
		//using java8 example
		List<String> inputList = Arrays.asList("Hello" , "How" , "are", "you");
		String outputList = inputList.stream().collect(Collectors.joining("-"));
		System.out.println("["+outputList+"]");
		
		
	}
}
