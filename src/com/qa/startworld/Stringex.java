package com.qa.startworld;

public class Stringex {

	public static void main(String[] args) {
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
//		System.out.println(str2.toUpperCase() + ", " + str1.toUpperCase());
		
		String mySubString1 = str2.substring(0, 11);
		String mySubString2 = str1.substring(16, 24);
//		System.out.println(mySubString1.toUpperCase() + mySubString2.toUpperCase());
		
		ex2();
		ex3();
		ex4();
		ex5("here", "here");

	}
	
	public static void ex2() {
		String a = "Hello World";
//		System.out.println(a.length());
	}
	
	public static void ex3() {
		String b = "Hi There!";
		
		String sub1 = b.substring(0, 2);
		String sub2 = b.substring(3, 8);
	
		String join = sub1 + "\n" + sub2;
		
//		System.out.println(join);
		
		
	}
	
	public static void ex4() {
		
		String b = "They're here!";
		
		String sub1 = b.substring(0, 7);
		String sub2 = b.substring(8, 12);
		
		String revJoin = sub2 + "\n" + sub1;
		
		System.out.println(revJoin);
		
	}
	
	public static void ex5(String msg, String finder) {
		
//		System.out.println(msg.equals(finder));
	}
	

}
