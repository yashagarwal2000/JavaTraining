package com.lumen.strems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BookStreamDemo {
	public static void main(String[] args) {
		List<Book>books =  Arrays.asList(new Book("java","kathy","yash",200,1000000),
				new Book("Spring","John","shivam",200,3000000),
				new Book("Node","kathy","saba",200,4000000));
		
		
		books.stream()
		.filter(book -> book.getAuthor().equals("kathy"))
				.forEach(name -> System.out.println(name));
		books.stream()
		.map(book->book.getTitle())
		.forEach(book -> System.out.println(book));
		
		
		
		List<Integer> titlelength = books.stream()
		.map(book->(int)Math.pow((int)book.getTitle().length(), 2))
		.collect(Collectors.toList());
		
		titlelength.forEach(num->System.out.println(num));
	}
}
