package com.lumen.strems;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
	public static void main(String[] args) {
		String[] names = new String[] {"ram","john","yash","shiva"};
//		create an array of the stream
		Stream.of(names).forEach(name->System.out.println(name));
		
		Arrays.stream(names).forEach(name->System.out.println(name));
		
		int[] nums = {10,30,35,65,79,60};
		int sum = Arrays.stream(nums,1,4)
				.filter(num->num%2 == 0)
				.sum();
		System.out.println(sum);
		
		IntStream stream = Arrays.stream(nums,1,5);
		double sum1 = stream.mapToObj(num->String.valueOf(num))
				.mapToDouble(str -> Double.parseDouble(str))
				.sum();
		System.out.println(sum1);
		
		
		Arrays.stream(nums,1,5)
		.map(num->(int)Math.pow(num, 2))
		.forEach(n-> System.out.println(n));
		
//		infinite stream
		Stream.generate(()->"Hello").limit(5).forEach(num-> System.out.println(num));
		
	}
}
