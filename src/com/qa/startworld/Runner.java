package com.qa.startworld;

import com.qa.classes.Book;
import com.qa.classes.Cat;
import com.qa.classes.Person;
import com.qa.oop.inheritance.Employee;

public class Runner {

	public static void main(String[] args) {
		Person ex = new Person("Bob", 22, "Male");
//		System.out.println();
//		ex.speak("tweet");
		
		Employee emp = new Employee("Charlotte", 22, "Female", 26000.00);
		// name, age, gender, annualSalary
		System.out.println("Employee Name: " + emp.getName());
		System.out.println(emp.getWeeklySalary());
//		
	}

}
