package com.qa.classes;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<>();
		
		Person bob = new Person("Bob", 32, "Male");
		
//		System.out.println(bob.age);
//		System.out.println(bob.speak("hello"));

		
		Book test = new Book("Moby Dick", "Herman Melville", "adventure");
		System.out.println(test.title);

	}

}
