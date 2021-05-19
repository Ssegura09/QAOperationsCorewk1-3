package com.qa.startworld;

import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Arrayex {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		System.out.println(Arrays.toString(nums));
		matrix();
		sandwiches();
		favoriteClass();
		method();
		

	}

	
	public static void matrix() {
	
		int[] arr = new int[10];
		for (int i = 1; i <= arr.length; i++) {
			for (int j = 1; j <= arr.length; j++) {
//				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
	}
	
	public static void method() {
//		Create a for loop that populates an integer array with values, outputting them at each iteration.
//		Then create another loop that iterates through the array, changing the values at each point to equal
//		itself times 10, outputting them at each iteration.
//		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
//			System.out.println(arr[i] + " ");
		}
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = arr[i] * 10;
//			System.out.println(arr[i] + " ");
		}
		
		
	}
	
	public static void sandwiches() {
		//arrayList
		List<String> sandwiches = new ArrayList <>();
		//add
		sandwiches.add("bread sandwich");
		sandwiches.add("PB & J");
		sandwiches.add("Egg Salad");
		
		sandwiches.set(0, "ice cream sandwich");
		
		
//		System.out.println(sandwiches);
		
//		for (int i = 0; i < sandwiches.size(); i++) {
//			System.out.println(sandwiches.get(i));
//		}
		
//		System.out.println(sandwiches.get(1));
		
//		System.out.println(sandwiches.remove(1));
//		System.out.println(sandwiches);
//		
		
	}
	
	public static void favoriteClass() {
		List<Integer> faveNums = new ArrayList<>();
		
		
		
		
		faveNums.add(50);
		faveNums.add(20);
		faveNums.add(10);
		faveNums.add(30);
		
		
//		Collections.sort(faveNums); //sorting
		
//		Collections.reverse(faveNums); //reverse
		
//		Collections.swap(faveNums, 0, 2); //swap
		
		//set a copy of the ArrayList and modified it
		List<Integer> myNums = new ArrayList<>(Arrays.asList(1,2,3,4));
		List<Integer> myNumsCopy = new ArrayList<Integer>(myNums);
		
		myNums.set(1, 32);
		System.out.println("Modified: " + myNums);
		System.out.println("Original: " + myNumsCopy);
		

		
		//for each loop in Java
		for (int i : faveNums) {
//			System.out.println(i);
		}
	}

}
