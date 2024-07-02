package com.java8.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Wiprojava8CodingQuesions {
	public Wiprojava8CodingQuesions() {
		super();
		// TODO Auto-generated constructor stub
	}




	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		
		createEmployeeList2(empList);
		
		//max and Min employee salary
		
		Optional<Employee> maxSalary = empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary)));
		System.out.println("max salary +" +maxSalary);
		
		//min salary
		Optional<Employee> minSalary = empList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)));
		
		System.out.println("Min salary : "+ minSalary);
		
		
		//max salary of employee from each department
		Map<String,Optional<Employee>> salByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary)))));
		
		
		salByDept.forEach((key , value) ->{
			System.out.println(key + "  " + value.get().getSalary());
		});
		
		
		
		//------------
		//active and inacative employee in the given collection
		
		Map<String,List<Employee>> activeInactive = empList.stream().collect(Collectors.groupingBy(Employee::getActive));
		
		
		activeInactive.forEach((a ,b) ->{
			System.out.println(a + " " +b );
		});
 Map<String,Long> activeInactiveCount = empList.stream().collect(Collectors.groupingBy(Employee::getActive, Collectors.counting()));
 
		
		
 activeInactiveCount.forEach((a ,b) ->{
			System.out.println(a + " " +b );
		});
 
 
 
 
 //employee details working in each department
 
 Map<String,List<Employee>> deptWiseEmp = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
 
	
 deptWiseEmp.forEach((a ,b) ->{
		System.out.println(a + " " +b );
	});

 
 // employee count working in ech department
  Map<String, Long> employeeCountDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.counting()));
 
	
  employeeCountDept.forEach((a ,b) ->{
		System.out.println(a + " " +b );
	});
 

 
 
 
	}
	
	
	
	
	private static void createEmployeeList2(List<Employee> empList) {
		empList.add(new Employee(
				"rahul" , "1", "ald" , 1000000 , "IT", 38 ,"active" ,2021
				));
		empList.add(new Employee(
				"kp" , "2", "gzb" , 20000 , "ITI", 58 ,"passive" ,2024
				));
		
		empList.add(new Employee(
				"prasad" , "3", "dls" , 3000 , "DR", 18 ,"active" ,2023
				));
	}
}
