package com.java8.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8MathsQuestions {
	public static void main(String[] args) {

		// SUM OF NUMBERS
		List<Integer> list = Arrays.asList(1, 4, 2, 5, 7, 4, 8, 9, 3, 4);
		Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);

		System.out.println("sum of numbers :" + sum.get());

		// ================
		// average of number

		double average = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println(average);

		// square of each and every number

		list.stream().map(e -> e * e).mapToInt(e -> e).forEach(e -> System.out.print(" " + e));
		System.out.println();

		double asDouble = list.stream().map(e -> e * e).filter(e -> e > 10).mapToInt(e -> e).average().getAsDouble();
		System.out.println(asDouble);

		// print odd and even

		List<Integer> even = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

		List<Integer> odd = list.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());

		System.out.println(even);
		System.out.println(odd);

		// ================
		// Number startswith

		// 2,222,234,567,890,432,234,236,211,22

		List<Integer> numbers = Arrays.asList(2, 222, 234, 567, 890, 432, 234, 236, 211, 22);

		List<Integer> listOfInteger = numbers.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2"))
				.map(Integer::valueOf).collect(Collectors.toList());

		System.out.println("starts with 2 : " + listOfInteger);

		// find duplicates

		Set<Integer> duplicate = list.stream().filter(e -> Collections.frequency(list, e) > 1)
				.collect(Collectors.toSet());

		System.out.println("duplicate  " + duplicate);

		// max
		Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("max " + max);

		// min
		Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("min " + min);

		// sort numbers

		List<Integer> sortedNum = list.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted : " + sortedNum);

		// get 5 /limit numbers
		List<Integer> limitNum = list.stream().limit(5).collect(Collectors.toList());

		Integer limitsum = list.stream().reduce((p, q) -> p + q).get();

		System.out.println("Limit " + limitNum + "sum " + sum);

		// skiped first 5 num

		List<Integer> skip = list.stream().skip(5).collect(Collectors.toList());
		System.out.println("skip " + skip);

		
		//2nd lowest and 2nd highest
		
		Optional<Integer> secondLargest = list.stream()
		.sorted(Collections.reverseOrder())
		.distinct()
		.skip(1)
		.findFirst();
		
		
		Optional<Integer> secondLowest = list.stream()
		.sorted()
		.distinct()
		.skip(1)
		.findFirst();
		
		System.out.println("second highest "+ secondLargest + " lowset " + secondLowest);
		
	}
}
