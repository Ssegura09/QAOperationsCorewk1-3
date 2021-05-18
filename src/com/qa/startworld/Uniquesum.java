package com.qa.startworld;

public class Uniquesum {
//	Given 3 integer values, return their sum.
//	If one value is the same as another value, they do not count towards the sum. In other words, only return the sum of unique numbers given.

	public static void main(String[] args) {
		unqSum(1, 4, 4);
	}
	
	public static void unqSum(int a, int b, int c) {
		if ( a == b) {
			System.out.println(c);
		} else if (a == c) {
			System.out.println(b);
		} else if (b == c) {
			System.out.println(a);
		} else if ( a == b && a == c && b == a && b == c) {
			System.out.println(0);
		} 
		else {
			System.out.println(a + b + c);
		}
		
	}

}
