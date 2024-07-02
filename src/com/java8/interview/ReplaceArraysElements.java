package com.java8.interview;

public class ReplaceArraysElements {
	public static void main(String[] args) {
		int[] arr = {8,9,5,11,6,1,7,6};
		//output : 11,11,11,-1,7,7,-1,-1
		//replace with right heaighest num
		
		int size = arr.length;
		
		int maxFromRight = arr[size-1];
		arr[size-1] = -1;
		
		for(int i= size-2 ; i>=0;i--) {
			int temp = arr[i];
			if(maxFromRight > arr[i]) {
				arr[i] = maxFromRight;
			}else {
				arr[i] = -1;
			}
			
			if(maxFromRight < temp) {
				maxFromRight = temp;
			}
		}
		
		for(int i = 0 ; i<size ;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}
}
