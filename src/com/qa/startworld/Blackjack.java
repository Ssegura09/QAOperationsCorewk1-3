package com.qa.startworld;

public class Blackjack {
//	Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. If they both go over 21 then return 0.

	public static void main(String[] args) {
		cards(19, 12);
	}
	
	public static void cards(int a, int b) {
		if (a > 21 && b > 21) {
			System.out.println(0);
		} else if (a > 21) {
			System.out.println(b);
		} else if (b > 21) {
			System.out.println(a);
		}
		int sumA = 21 - a;
		int sumB = 21 - b;
		
		if (sumA > sumB) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}
	}

}
