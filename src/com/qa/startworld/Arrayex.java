package com.qa.startworld;

import java.util.Arrays;

public class Arrayex {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(Arrays.toString(nums));
		matrix();

	}

	
	public static void matrix() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
	}

}
