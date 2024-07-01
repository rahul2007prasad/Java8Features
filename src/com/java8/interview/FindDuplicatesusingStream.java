package com.java8.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesusingStream {
	/*
	 * Find no of times a word/ number got duplicated
	 * 
	 * input : 5,3,4,1,3,7,2,9,9,4
	 * output :1-1,2-1,3-2,4-2,5-1,7-1,9-2
	 * 
	 * input : "Amanda" ,"Rob","sunny",Amanda","Rob"
	 * output : Rob-2,sunny-1,Amanda-2
	 */
	
	
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(5,3,4,1,3,7,2,9,9,4);
		
		List<String> strList = Arrays.asList("Amanda" ,"Rob","sunny","Amanda","Rob");
		
		Map<Integer, Long> output = numList.stream().collect(Collectors
				.groupingBy(Function.identity(), Collectors.counting()));
		
		output.forEach((key,value) -> {
			System.out.println(key + " - " + value);
		});
		
		
		Map<String, Long> strOutput = strList.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
		
		strOutput.forEach((key,value)->{
			System.out.println(key + " - " + value);
		});
		
		
		//traditional approach
		System.out.println("Traditional approach");
		Map<String, Integer> out = new HashMap<String, Integer>();
		for(String s : strList) {
			
			if(out.containsKey(s)) {
				int count = out.get(s);
				count++;
				out.put(s,count);
			}else {
				out.put(s, 1);
			}
		}
		
		
		out.forEach((key,value) ->{
			System.out.println(key + " - " + value);
		});
		
	}
}
