package com.qa.classes;

public class Book {
	
	private String title;
	private String author;
	public String genre;
	public boolean isOpen;
	
	//Constructor
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	
	}
	
//	Methods - Getter and Setters
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	
	
//	Methods - Behavior
	public void open() {
		this.isOpen = true;
	}
	
	public void close() {
		this.isOpen = false;
	}

}
