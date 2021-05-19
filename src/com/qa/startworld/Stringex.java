package com.qa.startworld;

public class Stringex {

	public static void main(String[] args) {
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
//		System.out.println(str2.toUpperCase() + ", " + str1.toUpperCase());
		
		String mySubString1 = str2.substring(0, 11);
		String mySubString2 = str1.substring(16, 24);
//		System.out.println(mySubString1.toUpperCase() + mySubString2.toUpperCase());
		
//		ex2("Hello World I am here");
		numOfWords("Hello World I am Here");
		ex3();
		printVertically("Hello World I am Here");
		printReverseVertically("Hello World I am Here");
		ex4();
//		ex5("here I am", "here I am not");

	}
	
//	public static void ex2(String str) {
//		int words = 0;
////		Counting words in a string
//		
//		for (int i = 0; i < str.length(); i++) {
//			words += str.substring(i, i + 1).equals("\s") ? 1: 0;
//		}
//		words += words > 0 ? 1 : 0;
//		System.out.println(words);
		
//	}
	
	public static int numOfWords(String s) {
        if (s.length() == 0) return 0;
        int words = 1;
        for (int i = 0; i < s.length(); i++) {
            String current = s.substring(i, i + 1);
            if (current.equals(" ")) {
                words++;
            }
        }
//        System.out.println(words);
        return words;
    }
	
	public static void ex3() {
		String b = "Hi There!";
		
		String sub1 = b.substring(0, 2);
		String sub2 = b.substring(3, 8);
	
		String join = sub1 + "\n" + sub2;
		
//		System.out.println(join);
		
		
	}
	
	// Method 2 - When given a String, print out this String in a
    //            vertical fashion, each word on a different line.
    public static void printVertically(String s) {
        String currentWord = "";
        for (int i = 0; i < s.length(); i++) {
            String currentChar = s.substring(i, i + 1);
            if (currentChar.equals(" ")) {
//                System.out.println(currentWord);
                currentWord = "";
            } else {
                currentWord += currentChar;
            }
        }
//        System.out.println(currentWord);
    }
    
    public static void printReverseVertically(String s) {
        String currentWord = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            String currentChar = s.substring(i, i + 1);
            
            if (currentChar.equals(" ")) {
//                System.out.println(currentWord);
                currentWord = "";
            } else {
                currentWord = currentChar + currentWord;
            }
        }
//        System.out.println(currentWord);
    }
	
	public static void ex4() {
		
		String b = "They're here!";
		
		String sub1 = b.substring(0, 7);
		String sub2 = b.substring(8, 12);
		String sub3 = b.substring(12, 13);
		
		String revJoin = sub3 + "\n" + sub2 + "\n" + sub1;
		
		System.out.println(revJoin);
		
	}
	
//	public static boolean ex5(String str1, String searchTerm) {
//		
//		String startTrigger = searchTerm.substring(0,1);
//		
//		for (int i = 0; i < str1.length(); i++) {
//			if (str1.substring(i, i + 1).equals(startTrigger)) {
//				
//				if(str1.substring(i, i + searchTerm.length()).equals(searchTerm)) {
//					return true;
//				}
//			}
//		}
//	}
//	

}
