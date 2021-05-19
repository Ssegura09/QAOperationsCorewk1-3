package com.qa.classes;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
//		ArrayList<Integer> array = new ArrayList<>();
//		
//		Person bob = new Person("Bob", 32, "Male");
		
//		System.out.println(bob.age);
//		System.out.println(bob.speak("hello"));
		
//		Book bk1 = new Book("Moby Dick", "Herman Melville", true);
//		
//		String result = bk1.title + " by " + bk1.author;
//		System.out.println(bob.bkSpeak(result));
	
//		Cat cat1 = new Cat("Tesla", 12);
//		Cat cat2 = new Cat("Tesla", 12, "Green", "Grey");
		
		Cat cat3 = new Cat();
		cat3.speak();
		cat3.speak(false);
		cat3.speak(true);
		System.out.println(cat3.name);

	}

}
