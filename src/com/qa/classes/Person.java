package com.qa.classes;

public class Person {

	// Attributes
	private String name; //
//	private String password; //
	private int age; //
	private String gender; //
//	private boolean isBreathing;
//	private int walkSpeed = 30; // in feet

// Constructor

	public Person() {
		super();
		this.name = "Please give me a name";
		this.age = 0;
		this.gender = "Please give me a gender";
	}
	
	public Person(String name) {
		this(); // Added measure if we the specified details haben't been met, the default Person() constructor kicks in
		this.name = name;
	}

	public Person(String name, int age, String gender) {
	//used 'Generate Constructor using fields' for this step
		
;		this.name = name;
		this.age = age;
		this.gender = gender;
	}

//	Methods - Getter and Setters

	public String getName() {
		return this.name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}

	public String read(String title) {
		return this.name + " is reading the book titled: " + title;
	}
	
	public void speak(String msg) {
		System.out.println(this.name + " says: " + msg);
	}

	public void bkSpeak(String msg) {
		System.out.println(this.name + " has read: " + msg);
	}

}