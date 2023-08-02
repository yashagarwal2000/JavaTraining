package com.lumen.api;

public class HashMain {

	public static void main(String[] args) {
//		if tirle and Isbn number are same then they are same object
		Book book = new Book("HeaderFirst", "Kathy", 18723456L);
		Book book2 = new Book("HeaderFirst", "John", 18723456L);
		Book book3 = new Book("Java", "Kathy", 18723456L);
		
		System.out.println("1 and 2 "+book.equals(book2));
		System.out.println("1 and 3 "+book.equals(book3));
		System.out.println("1 hash"+book.hashCode());
		System.out.println("1 hash"+book2.hashCode());
		System.out.println("1 hash"+book3.hashCode());
	}

}
