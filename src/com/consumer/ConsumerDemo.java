package com.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	/*
	 * implements Consumer<Integer>
	 * 
	 * @Override public void accept(Integer t) { System.out.println("Print" + t);
	 * 
	 * }
	 */

	public static void main(String[] args) {

		Consumer<Integer> consumer = t -> System.out.println("Print " + t);
		//consumer.accept(10);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.forEach(consumer);
		
		//OR
		//list.forEach( t -> System.out.println("Print " + t));
	}

}
