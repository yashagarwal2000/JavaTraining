package com.bookaap.service;

import java.util.List;

import com.bookaap.exception.BookNotFoundException;
import com.bookaap.model.Book;

public interface IBookService {
	List<Book> getAll();
	List<Book> getByAuthorContains(String author) throws BookNotFoundException;
	List<Book> getByCategory(String category) throws BookNotFoundException;
	List<Book> getByPriceLessThan(double price) throws BookNotFoundException;
	List<Book> getByAuthorContainsAndCategory(String author,String category)throws BookNotFoundException;
	Book getById(int bookId) throws BookNotFoundException;
}
