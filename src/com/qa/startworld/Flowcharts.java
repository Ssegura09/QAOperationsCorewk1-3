package com.qa.startworld;

public class Flowcharts {

	public static void main(String[] args) {
		madness1(2, 5, true);
		madness2(2001);
		

	}
	
	public static void madness1(int num1, int num2, boolean x) {
		if (x == true) {
			System.out.println(num1 + num2);
		} else {
			System.out.println(num1 * num2);
		}
	}
	
	public static void madness2(int a) {
		if (a > 2000) {
            System.out.println("A");
            if (a > 6000) {
                System.out.println("C");
                // THE END
            } else {
                System.out.println("B");
                if (a > 4000) {
                    System.out.println("D");
                    // THE END
                } else {
                    System.out.println("E");
                    // THE END
                }
            }
        } else {
            System.out.println("1");
            if (a > 100) {
                System.out.println("3");
                if (a > 600) {
                    System.out.println("5");
                    // THE END
                } else {
                    System.out.println("4");
                    if (a > 500) {
                        System.out.println("6");
                        // THE END
                    } else {
                        System.out.println("7");
                        // THE END
                    }
                }
            } else {
                System.out.println("2");
                // THE END
            }
        }

	}
}
