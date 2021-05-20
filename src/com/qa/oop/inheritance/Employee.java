package com.qa.oop.inheritance;

import com.qa.classes.Person;

//Employee must have:

//	a field annualSalary of type double
//	a field weeklySalary of type double
//	a method calculateWeeklySalary() which makes use of the formula weeklySalary = annualSalary / 52.

public class Employee extends Person {

	// Attributes
	protected double annualSalary;
	protected double weeklySalary;
	
	// Constructor
	public Employee(double annualSalary, double weeklySalary) {
		super();
		this.annualSalary = annualSalary;
		this.weeklySalary = weeklySalary;
	}
	
	// Constructor From - Super Class

	public Employee() {
		super();
		this.annualSalary = annualSalary;
		this.weeklySalary = weeklySalary;
	}

	
	public Employee(String name, int age, String gender, double annualSalary) {
		super(name, age, gender);
		this.annualSalary = annualSalary;
		calculateWeeklySalary(annualSalary);
	}

	public Employee(String name, int age, String gender) {
		super(name, age, gender);
		this.annualSalary = annualSalary;
		this.weeklySalary = weeklySalary;
	}

	public Employee(String name) {
		super(name);
		this.annualSalary = annualSalary;
		this.weeklySalary = weeklySalary;
	}
	
	// Methods - Getter and Setters

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	// Class Methods
	
	public void calculateWeeklySalary(double annualSalary) {
		this.annualSalary = annualSalary;
		double result = this.weeklySalary = annualSalary / 52;
		
		System.out.println("Employee Salary: " + result);
	
	}
	
	
	
	


}
