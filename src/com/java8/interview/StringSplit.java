package com.java8.interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringSplit {
	public static void main(String[] args) {
		
		Map<String,List<Integer>> result = new HashMap<>();
		
		String[] input = {"1-english:45" ,"2-englis:45","3-hindi:60","4-chem:40"};
		
		for(int i=0 ;i < input.length - 1; i++) {
			int indexOfDash = input[i].indexOf("-");
			
			String subMarksSub = input[i].substring(indexOfDash + 1);
			
			String[] subAndMarks = subMarksSub.split(":");
			if(result.containsKey(subAndMarks[0])) {
				List<Integer> list = result.get(subAndMarks[0]);
				//list.add(Integer.parseInt(subMarksSub[1]));
			}
			
		}
		
		
		
		
	}
}
