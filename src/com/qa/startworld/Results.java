package com.qa.startworld;

public class Results {
	
	static double physics = 1040;
	static double chemistry = 0;
	static double biology = 1200;
	static double total = physics + chemistry + biology;
	static double percentage = total * 100 / 450;
	static double passMark = 60;
	static double physMark = physics * 100 / 450;
	static double chemMark = physics * 100 / 450;
	static double bioMark = physics * 100 / 450;

	
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
		System.out.println("*****************");
		
	}
	
	public static void percentageTotal() {
		if (percentage < passMark) {
			System.out.println("I'm sorry. You did not pass");
		}
		else if (physMark < passMark) {
			System.out.println("I'm sorry. You did not meet your Physics mark");
			System.out.println("Physics Percentage: " + physMark + " %");
		}
		else if (chemMark < passMark) {
			System.out.println("I'm sorry. You did not meet your Chemistry mark");
			System.out.println("Chemistry Percentage: " + chemMark + " %");
		}
		else if (bioMark < passMark) {
			System.out.println("I'm sorry. You did not meet your Biometry mark");
			System.out.println("Biometry Percentage: " + bioMark + " %");
		}
		System.out.println("Total Percentage: " + percentage + " %");
	}
	
	
}
