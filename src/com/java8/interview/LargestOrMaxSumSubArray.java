package com.java8.interview;

public class LargestOrMaxSumSubArray {
		public static void main(String[] args) {
			int[] input = {8,9,-1,1,6,5,7,-6};
			
			int currMax = input[0];
			int globalMax = input[0];
			
			for(int i = 1 ; i < input.length ;i++) {
				if(input[i] < 0) {
					currMax = 0;
				}else {
					currMax += input[i];
				}
				
				if(globalMax < currMax) {
					globalMax = currMax;
				}
			}
			
			System.out.println(globalMax);
			
		}
}
