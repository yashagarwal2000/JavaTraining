package com.lumen.fun;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FuncDemo {
	public static void main(String[] args) {
		Function<String, Integer> fun = (str) -> str.length();
//		call the methord
		System.out.println(fun.apply("Yash"));

		Function<String, String> fun1 = (str) -> str.toUpperCase();
		System.out.println(fun1.apply("Yash"));

		Function<Book, String> fun2 = (str) -> str.getTitle();
		System.out.println(fun2.apply(new Book("java", "yash", "study", 101, 3000)));

		Function<String, Book> fun3 = (author) -> {
			if (author.equals("yash")) {
				return new Book("java", "yash", "study", 101, 3000.0);
			} else
				return null;
		};
		System.out.println(fun3.apply("yash"));

		Function<Integer, List<String>> fun4 = (num) -> {
			if (num == 2)
				return Arrays.asList("java", "Angular");
			if (num == 3)
				return Arrays.asList("Java", "angular", "yash");
			else
				return null;
		};
		System.out.println(fun4.apply(2));

		Predicate<String> predi = (str) -> {
			if (str.equals("Yash"))
				return true;
			else {
				return false;
			}
		};
		System.out.println(predi.test("Yash"));
	}
}
