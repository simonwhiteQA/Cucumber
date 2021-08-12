package com.qa.arrays;

public class EnhancedForLoop {
	
	public static void main(String[] args) {
		
		System.out.println("---String Method---");
		stringLoop();
		
		System.out.println("---Int Method---");
		arrayInt();
		
		System.out.println("---Boolean Method---");
		System.out.println(arrayBoolean(5)); // should return false
		System.out.println(arrayBoolean(4)); // should return true
		
		System.out.println("---Maths Method---");
		methodTwoAndThree();
		

	}

	public static void stringLoop() {
		
		String[] stringArray = { "Simon", "Megan", "Niall" };

		for (String str : stringArray) {
			System.out.println(str);
			
		}
	}
	
	public static void arrayInt() {

		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int i : intArray) {
			int value = i*i;
			System.out.println(value);
		}

	}
	
	public static boolean arrayBoolean(int i) {

		if (i % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void methodTwoAndThree() {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int i : intArray) {
			boolean test = arrayBoolean(i);

			if (test == true) {
				int cube = i * i * i;
				System.out.println(test + ": Cube of " + i + " = " + cube);
			} else {
				int square = i * i;
				System.out.println(test + ": Square of " + i + " = " + square);
			}
		}

	}

}
