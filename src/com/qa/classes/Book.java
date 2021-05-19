package com.qa.classes;

public class Book {
	
	public String title;
	public String author;
	public String genre;
	public boolean isOpen;
	
	//Constructor
	public Book(String title, String author, boolean isOpen) {
		this.title = title;
		this.author = author;
		this.isOpen = isOpen;
	}
	
	public void open() {
		this.isOpen = true;
	}
	
	public void clos() {
		this.isOpen = false;
	}

}
