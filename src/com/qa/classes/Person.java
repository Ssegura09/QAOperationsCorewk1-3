package com.qa.classes;

public class Person {

	public String name; //
	public int age; //
	public String gender; //
	public boolean isBreathing;
	public int walkSpeed = 30; // in feet

// Constructor
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String read(String title) {
		return this.name + " is reading the book titled: " + title;
	}

	public boolean isStillBreathing() {
		return isBreathing;
	}

	public String speak(String msg) {
		return this.name + " says: " + msg;
	}

	public int walk() {
		return walkSpeed;
	}
	
//	public static void test() {
//		Book test = new Book("Moby Dick", "Herman Melville", "adventure");
//		System.out.println(test);
//	}
}