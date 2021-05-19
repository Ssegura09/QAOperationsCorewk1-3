package com.qa.classes;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
//		ArrayList<Integer> array = new ArrayList<>();
		
//		System.out.println(bob.age);
//		System.out.println(bob.speak("hello"));
		
//		Book bk1 = new Book("Moby Dick", "Herman Melville");
//		
//		String result = bk1.title + " by " + bk1.author;
//		System.out.println(bob.bkSpeak(result));
	
		
//		Person Encapsulation
		
		Person bob = new Person("Bob", 32, "Male");

		bob.setName("Robert");
		System.out.println(bob.getName());		
		
		
//		Book Encapsulation
		
		Book bk1 = new Book("Moby Dick", "Herman Melville");

		bk1.setTitle("Other Title");
		System.out.println(bk1.getTitle());		
		
//		Cat Encapsulation
		
		Cat cat1 = new Cat("Tesla", 2);

		cat1.setCatName("Fluffy");
		System.out.println(cat1.getCatName());	
		

	}

}
