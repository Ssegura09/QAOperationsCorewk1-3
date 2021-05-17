package com.qa.startworld;

public class Results {
	
	static double physics = 100;
	static double chemistry = 120;
	static double biology = 130;
	static double total = physics + chemistry + biology;
	static double percentage = total * 100 / 450;
	
	public static void main(String[] args) {
		
		markResults();
		percentageTotal();
	}
	
	public static void markResults() {

		System.out.println("Physics Mark: " + physics);
		System.out.println("Chemistry Mark: " + chemistry);
		System.out.println("Biology Mark: " + biology);
		System.out.println("*****************");
		System.out.println("Total Mark: " + total);
		
	}
	
	public static void percentageTotal() {
		System.out.println("Total Percentage: " + percentage + " %");
	}

}
