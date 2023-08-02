package com.lumen.objbasics;

public class BookMain {

	public static void main(String[] args) {
		Book book = new Book("TwoState", "ChetanBhagat", 12000);
		book.getDetails();
		book.checkBookType();
		Book book1 = new Book("Dare to risk", "Yash", 490);
		book1.getDetails();
		book1.checkBookType();
	}

}
