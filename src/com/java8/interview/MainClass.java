package com.java8.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		
		createEmployeeList(empList);
		
		
		//Group by 
		Map<String,List<Employee>> empCityMap = empList.stream().collect(Collectors.groupingBy(Employee:: getCity));
		
		
		//System.out.println(empCityMap);
		empCityMap.forEach((Key,Value) -> 
		System.out.println( Key + "    " + Value)
				);
		
		
		//sort
		System.out.println("--------------");
		empList.sort(Comparator.comparing(Employee :: getName));
		empList.forEach(emp -> System.out.println(emp.getName()));
		
		//group by comparator
		
		System.out.println("---comparator-----");
		Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getName)
				.thenComparing(Employee::getCity);
		
		
		empList.sort(groupByComparator);
		System.out.println(empList);
		
		//Filter employee based on age
		
		
		List<Employee> collectfilter = empList.stream().filter(emp -> Integer.valueOf(emp.getId()) > 4).collect(Collectors.toList());
		System.out.println("---filter--");
		System.out.println(collectfilter);
		
		//OR__
		
		List<String> collectFilterMap = empList.stream().map(Employee :: getId).collect(Collectors.toList());
		
		collectFilterMap.forEach(emp -> System.out.println(emp));
		
	}
	
	private static void createEmployeeList(List<Employee> empList) {
		Employee e1 = new Employee();
		e1.setName("Rahul");
		e1.setCity("NDLS");
		e1.setId("1");
		
		Employee e2 = new Employee();
		e2.setName("Prasad");
		e2.setCity("Noida");
		e2.setId("2");
		
		Employee e3 = new Employee();
		e3.setName("KP");
		e3.setCity("Delhi");
		e3.setId("3");
		
		Employee e4 = new Employee();
		e4.setName("RP");
		e4.setCity("Delhi");
		e4.setId("5");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
	}
}
