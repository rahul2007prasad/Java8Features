package com.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	/*
	 * @Override public String get() { // TODO Auto-generated method stub return
	 * "hi Rahul"; }
	 */
	public static void main(String[] args) {
//		Supplier<String> supplier = new SupplierDemo();
//		System.out.println(supplier.get());
//	
		
	
Supplier<String>  supplier =	() -> "Hi";
	System.out.println(supplier.get());
	
	
	List<String> list = Arrays.asList("a" , "b");
	//list.stream().findAny().orElseThrow(supplier);
	;
	}
}
