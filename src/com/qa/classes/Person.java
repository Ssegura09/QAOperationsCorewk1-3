package com.qa.classes;

public class Person {

	// Attributes
	private String name; //
	private String password; //
	private int age; //
	private String gender; //
	private boolean isBreathing;
	private int walkSpeed = 30; // in feet 

// Constructor
	public Person(String name, int age, String gender) {
		this.name = name;
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
	
//	public String getPassword(String securityToken) {
//		if(securityToken.equals("statedValue")) {
//			return this.password;
//		} else {
//			return "Error";
//		}
//	}

	public String read(String title) {
		return this.name + " is reading the book titled: " + title;
	}

	public boolean isStillBreathing() {
		return isBreathing;
	}

	public String speak(String msg) {
		return this.name + " says: " + msg;
	}
	
	public String bkSpeak(String msg) {
		
		return this.name + " has read: " + msg;
	}

	public int walk() {
		return walkSpeed;
	}
	
}