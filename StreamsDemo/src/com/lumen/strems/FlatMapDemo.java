package com.lumen.strems;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapDemo {
	public static void main(String[] args) {
		String [] names = new String[] {"Yash","Shivam","Saba","venku"}; 
		Arrays.stream(names).forEach(System.out::println);
		
//		to work with 2d array
		String[][] twoCourses = new String[][] {{"java","angular"},{"html","javascript"}};
		Stream<String[]> stremTwo = Arrays.stream(twoCourses);
		
//		call flatmap to convert Stream<String> to
		Stream<String> streamo = stremTwo.flatMap(onearr->Arrays.stream(onearr));
		
//		apply map if you want to change
		streamo.mapToInt(String::length).forEach(System.out::println);
		
		Arrays.stream(twoCourses) //Stream<string[]>
		.flatMap(onearr -> Arrays.stream(onearr)).map(String::toUpperCase).forEach(System.out::println-);
		
		
		
	}
}
