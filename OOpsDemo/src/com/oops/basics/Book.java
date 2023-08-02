package com.oops.basics;
//Front end
public class Book {
	String title;
	String author;
	double price;

	void printDetails() {
		System.out.println("Book Title : " + title);
		System.out.println("Book Author : " + author);
		System.out.println("Book Price : " + price);
	}
	double getDiscountedPrice(double amount ) {
		return price-amount;
		
	}
}