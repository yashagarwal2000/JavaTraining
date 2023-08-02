package com.bookaap.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.bookaap.exception.BookNotFoundException;
import com.bookaap.model.Book;
import com.bookaap.util.BookDetails;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAll() {
		List<Book> books = BookDetails.showBooks();
		return books;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
		List<Book> bookByAuthore =  books.stream().filter(book->book.getAuthor().equals(author)).collect(Collectors.toList());
		
		
	
		
		
//		for (Book book : books) {
//			if (book.getAuthor().equals(author))
//				bookByAuthore.add(book);
//			System.out.println(book);
		
		if (bookByAuthore.isEmpty())
			throw new BookNotFoundException();
		return bookByAuthore;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
//		List<Book> bookByDetails = new ArrayList<Book>();
		List<Book> bookByDetails =  books.stream().filter(book->book.getCategory().equals(category)).collect(Collectors.toList());
		
		
//		for (Book book : books) {
//			if (book.getCategory().equals(category))
//				bookByDetails.add(book);
//			System.out.println(book);
//		}
		if (bookByDetails.isEmpty())
			throw new BookNotFoundException();
		return bookByDetails;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
//		List<Book> bookByPriceLessThan = new ArrayList<Book>();
		List<Book> bookByPriceLessThan =  books.stream().filter(book->book.getPrice()<= (price)).collect(Collectors.toList());
		
//		for (Book book : books) {
//			if (book.getPrice() <= price)
//				bookByPriceLessThan.add(book);
////			System.out.println("Book by"+price+" : "+book);
//		}
		if (bookByPriceLessThan.isEmpty())
			throw new BookNotFoundException();
		return bookByPriceLessThan;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
//		List<Book> booksByAuthorAndCategories = new ArrayList<Book>();
		
		
		List<Book> booksByAuthorAndCategories =  books.stream().filter(book->book.getCategory().equals(category)&& book.getAuthor().equals(author)).collect(Collectors.toList());

		
		
		
//		for (Book book : books) {
//			if (book.getAuthor().equals(author))
//				if (book.getCategory().equals(category))
//					booksByAuthorAndCategories.add(book);
////			System.out.println(book);
//		}
		if (booksByAuthorAndCategories.isEmpty())
			throw new BookNotFoundException();
		return booksByAuthorAndCategories;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
		
		boolean check = true;
		Stream<Book> bookVId =  books.stream().filter(book->book.getBookId().equals(bookId));
		
//		boolean check = true;
//		for (Book book : books) {
//			if (book.equals(bookId))
//				check = false;
//				return book;
//		}
		if (bookVId == null) throw new BookNotFoundException();
	return bookVId;
	}

}
