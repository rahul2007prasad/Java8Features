package com.java8.interview;

public class TCSCodingRound {
	public static void main(String[] args) {
		
		//find a numberr is evn or odd without using mod operator
		
		int num = 5;
		
		int quotient = num/2;
		if(quotient*2 == num) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		
		//approach 2 using bit oerator
		
		if((num & 1) == 0) {
			System.out.println("even");
		}else {
			System.out.println("Odd");
		}
		
		//prin pattern with 1 star in one line and 2 star in 2nd line and so on upto 5 rows
		printTriangle(5);
	}
	
	public static void printTriangle(int n) {
		for(int i=0 ; i < n ; i++) {
			for(int j= n-i ; j>1 ;j--) {
				System.out.print(" ");
			}
			for(int j =0 ; j<= i ;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
