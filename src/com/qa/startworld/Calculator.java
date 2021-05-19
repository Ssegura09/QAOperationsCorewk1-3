package com.qa.startworld;

public class Calculator {

	public static int add(int num1, int num2) {
		return num1 + num2;

	}

	public static int multi(int num1, int num2) {
		return num1 * num2;

	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int mod(int num1, int num2) {

		return num1 % num2;
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
