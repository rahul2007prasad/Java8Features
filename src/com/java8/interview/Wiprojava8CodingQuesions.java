package com.java8.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wiprojava8CodingQuesions {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		
		createEmployeeList2(empList);
		
		//max and Min employee salary
		
		Optional<Employee> maxSalary = empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary)));
		System.out.println("max salary +" +maxSalary);
	}
	
	
	
	
	private static void createEmployeeList2(List<Employee> empList) {
		empList.add(new Employee(
				"rahul" , "1", "ald" , 1000000 , "IT", 28 ,"active" ,2021
				));
	}
}
