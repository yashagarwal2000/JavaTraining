package com.bookaap.util;

import java.util.Arrays;
import java.util.List;

import com.bookaap.model.Book;

public class BookDetails {
	public static List<Book> showBooks() {
		return Arrays.asList(new Book("Poosh ki raat", "Munshi", "Story", 1, 100),
				new Book("Two State", "Chetan Bhagat", "Novel", 3, 200.0),
				new Book("RaatRani", "Gupta ji", "Story", 2, 300.0),
				new Book("Buisness", "Yash", "Story", 4, 400.0));
	}
}
