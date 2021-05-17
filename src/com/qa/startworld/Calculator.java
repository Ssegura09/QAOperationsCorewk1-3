package com.qa.startworld;

public class Calculator {

	public static void main(String[] args) {
		int addResult;
		int multiResult;
		int subResult;
		int diviResult;
		int addThreeResult;

		addResult = add(1, 2);
		multiResult = multi(1, 2);
		subResult = sub(1, 2);
		diviResult = divi(1, 2);
		addThreeResult = addThree(4, 2, 2);

		System.out.println(addResult);
		System.out.println(multiResult);
		System.out.println(subResult);
		System.out.println(diviResult);
		System.out.println(addThreeResult);

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
		int result = 0;
		
		if (num1 > num2) {
			result = num1 / num2;
		} else {
			System.out.println("Division cannot be formed");
		}
		return result;
	}
	
	public static int addThree(int num1, int num2, int num3) {
		return num1 + num2 + num3;
		
	}

}
