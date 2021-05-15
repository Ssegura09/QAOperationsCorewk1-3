package com.qa.startworld;

public class Calculator {

	public static void main(String[] args) {
		int addResult;
		int multiResult;
		int subResult;
		int diviResult;
		addResult = add(1, 2);
		multiResult = multi(1, 2);
		subResult = sub(1, 2);
		diviResult = sub(4, 2);
		System.out.println(addResult);
		System.out.println(multiResult);
		System.out.println(subResult);
		System.out.println(diviResult);

	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
		
	}
	
	public static int multi(int num1, int num2) {
		return num1 * num2;
		
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
		
	}
	
	public static int divi(int num1, int num2) {
		return num1 / num2;
		
	}

}
