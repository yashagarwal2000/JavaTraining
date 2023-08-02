package com.lumen.fun;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunDemo {
	public static void main(String[] args) {
//		implement consumer using lamda
		Consumer<String> con = (str)->System.out.println(str.toUpperCase());
//		call the methord
		con.accept("Sri");
		
//		Do it for integer
		Consumer<Integer> consumer = (integer)->System.out.println(integer);
//		call the methord
		con.accept("29");
//		for books
		Consumer<Book> bookCon = (book)->System.out.println(book);
		bookCon.accept(new Book("java","yash","study",101,2001));
		
		
//		suppliers
		Supplier<String> supplier =()->"Hello".toUpperCase();
		String result = supplier.get();
		System.out.println(result);
		
	}
}
