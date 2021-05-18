package com.qa.startworld;

public class Blackjack {
	

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
