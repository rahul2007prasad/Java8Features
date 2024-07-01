package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo  {
// implements Predicate<Integer>
	/*
	 * @Override public boolean test(Integer t) {
	 * 
	 * if(t % 2== 0) return true; else return false; }
	 */
	
	public static void main(String[] args) {
		/*
		 * Predicate<Integer> predicateDemo = new PredicateDemo();
		 * System.out.println(predicateDemo.test(5));
		 */
		
		Predicate<Integer> predicate = t -> t % 2==0;
			

	System.out.println(predicate.test(7));
	List<Integer> list = Arrays.asList(1,2,3,4,5);
	list.stream().filter(predicate).forEach(t-> System.out.println("Print :" + t));
	
	}

}
