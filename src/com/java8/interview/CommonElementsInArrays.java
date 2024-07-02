package com.java8.interview;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArrays {
	public static void main(String[] args) {
		String[] arr1 = {"java" ,"interview","questions","for","experianced"};
		
		String[] arr2 = {"java" ,"questions" ,"freshers","interview"};
		
		Set<String> output = new HashSet<>();
		for(int i=0 ; i< arr1.length ;i++) {
			for(int j=0; j<arr2.length ;j++) {
				if(arr1[i] == arr2[j]) {
					output.add(arr1[i]);
					break;
				}
			}
		}
		
		
		for(String s : output) {
			System.out.println(s);
		}
		
	}
}
