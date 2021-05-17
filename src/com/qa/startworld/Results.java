package com.qa.startworld;

public class Results {
	
	static int physics = 100;
	static int chemistry = 120;
	static int biology = 130;
	static int total = physics + chemistry + biology;
	static int percentage = total * 100 / 450;
	
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
