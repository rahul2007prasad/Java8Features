package com.java8.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UstGlobalCodingInterview {
	public static void main(String[] args) {
		
		//1.find words starting with A and collect them
		
		List<String> name = Arrays.asList("Amit" , "Sunil" ,"Anil" ,"Ramesh" ,"Vivek");
		
		List<String> nameCollect = name.stream().filter(s -> s.startsWith("A"))
		.collect(Collectors.toList());
		
		nameCollect.forEach(n -> System.out.println(n));
		
		//2. Filter emplooyee and froup the based on gender
		List<Employee> empList = new ArrayList<>();
		createEmployeeList2(empList);
		
		empList.stream()
		
		.collect(Collectors.groupingBy(Employee::getAge));
		//3.Find the duplicates words in a  string woth their count
		
		String s = "Testing program is Testing program";
		Map<String,Integer> out = new HashMap<>();
		String[] splitArr = s.split(" ");
		for(String word : splitArr) {
			Integer oldCount = out.get(word);
			if(oldCount == null) {
				oldCount = 0;
			}
			out.put(word, oldCount+1);
		}
		
		out.forEach((k,v) ->{
			System.out.println(k + " " + v);
		});
		
		
		
		
		//4. create custom functional interface and use it in main method as lambda fn
		
		
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
