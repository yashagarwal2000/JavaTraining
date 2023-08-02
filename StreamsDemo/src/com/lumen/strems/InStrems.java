package com.lumen.strems;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class InStrems {
	public static void main(String[] args) {
		
		
		
		
		
		List<String> courses  = Arrays.asList("java","angular","node","Spring","css","react");
//		convert into the stream
		Iterator<String> iterator = courses.stream()
									.filter(str-> str.length()>4)
									.skip(2)
									.iterator(); //terminal
		
		while (iterator.hasNext()) {
			String cName = iterator.next();
			System.out.println(cName);
		}
		System.out.println();
		courses.stream()
			.filter(str-> str.length()>4)
			.skip(2)
			.distinct()
			.forEach(str-> System.out.println(str.toUpperCase()));
		
		System.out.println();
		List<Integer> nCourse =   courses.stream()
			.sorted()
			.map(str->str.length())
			.filter(num-> num>5)
			.collect(Collectors.toList());
		nCourse.forEach(num-> System.out.println(num));
		
//		convert list to stream and use map to get the length 
//		use filter to check ic is divisible by 2
//		print value using for each
		
		System.out.println();
		List<Integer> coursess =   courses.stream()
				.sorted()
				.map(str->str.length())
				.filter(num-> (num%2 == 0))
				.collect(Collectors.toList());
		coursess.forEach(num-> System.out.println(num));
		
		
	}
}
