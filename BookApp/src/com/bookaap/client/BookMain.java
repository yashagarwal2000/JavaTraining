package com.bookaap.client;

import com.bookaap.exception.BookNotFoundException;
import com.bookaap.service.BookServiceImpl;
import com.bookaap.service.IBookService;

public class BookMain {

	public static void main(String[] args) throws BookNotFoundException {
		IBookService bookService = new BookServiceImpl();
		bookService.getAll().stream().forEach(System.out::println);
		;

		System.out.println();
		bookService.getByAuthorContains("Yash").stream().forEach(System.out::println);
		;

		System.out.println();
		bookService.getByCategory("Story").stream().forEach(System.out::println);

		System.out.println();
		bookService.getByAuthorContainsAndCategory("Yash", "Story").stream().forEach(System.out::println);

		System.out.println();
		bookService.getByPriceLessThan(300).stream().forEach(System.out::println);

		System.out.println();
		System.out.println(bookService.getById(2));
	}

}
