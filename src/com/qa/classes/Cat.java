package com.qa.classes;

public class Cat {

	// Attributes
	private String name;
	private int age;
	public String eyeColor;
	public String coatColor;
	
	

	// Constructor
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Default Constructor
	public Cat() {
		this.name = "Please provide a name";
		this.age = 1;
		this.eyeColor = "Please provide an eye color";
		this.coatColor = "Please provide a coat color";
	}
	
	//Method Overloading - Constructor
	public Cat(String name, int age, String eyeColor, String coatColor) {
		this.name = name;
		this.age = age;
		this.eyeColor = eyeColor;
		this.coatColor = coatColor;
	}
	
//	Methods - Getter and Setters
	
	public String getCatName() {
		return this.name;
	}
	
	public void setCatName(String newCatName) {
		this.name = newCatName;
	} 
	
	public int getCatAge() {
		return this.age;
	}
	
	public void setCatAge(int newCatAge) {
		this.age = newCatAge;
	}
	
	
//	Method - Behaviors
	
	public void speak() {
		System.out.println("Meow");
	}
	
	public void speak(boolean isAngry) {
		if(isAngry) {
			System.out.println("Hiss");
		} else {
			System.out.println("Meow");
		}
	}
}
