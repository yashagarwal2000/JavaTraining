package com.lumen.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book("Harry poter", "Harry", 3000);
		Book book2 = new Book("Harry", "Yash", 3000);
		Book book3 = new Book("Harry poter-1", "Agarwal", 3000);
		Book book4 = new Book("Harry poter-2", "Harry", 3000);

		List<Book> booklist = new ArrayList();
		booklist.add(book1);
		booklist.add(book2);
		booklist.add(book3);
		booklist.add(book4);

//		Iterator<Book> iterator = booklist.iterator();
//		while (iterator.hasNext()) {
//			Book name = iterator.next();
//			System.out.println(name);
//		}
		
		
		
		
		
		List<Book>bookByAuthor = new ArrayList<>();
		
		
		for (Book book : booklist) {
//			System.out.println(book);
			if(book.getAuthor().equals("Harry")) {
				bookByAuthor.add(book);
				System.out.println(bookByAuthor);
			}
			System.out.println("Before sorting");
			for (Book book7 : booklist) {
				System.out.println(book);
			}
			Collection.sort(books);
			System.out.println("After sorting");
			for (Book book8 : booklist) {
				System.out.println(book8);
			}
		}

	}

}
