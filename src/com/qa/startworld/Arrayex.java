package com.qa.startworld;

import java.util.Arrays;

public class Arrayex {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(Arrays.toString(nums));
		nestedForStatement();

	}

	public static void nestedForStatement() {
		for (int counter = 1; counter <= 10; counter++) {
			for (int innerCounter = 1; innerCounter <= 10; innerCounter++) {
				System.out.println(counter + " * " + innerCounter + " = " + (counter * innerCounter));
			}
		}
	}

}
