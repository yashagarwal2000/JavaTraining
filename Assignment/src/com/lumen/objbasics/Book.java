package com.lumen.objbasics;

public class Book {
	String title;
	String author;
	double price;
	
	Book(String title,String author,double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void getDetails() {
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price);
	}
	void checkBookType() {
		if(price>500)System.out.println("Preminum book");
		else {
			System.out.println("Standard book");
		}
	}
}
