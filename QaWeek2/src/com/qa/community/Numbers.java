package com.qa.iterations;

public class Numbers {
	
public static void main(String[] args) {
		
		System.out.println("Sum of two numbers = " + methodOne(74));
		
	}
	
	public static int methodOne(int num) {
		String[] parts = Integer.toString(num).split("(?!^)");
		int sum = 0;
		
		for(String p : parts) {
			int number = 0;
			try {
				number = Integer.parseInt(p);
			} catch (NumberFormatException ex) {
				ex.printStackTrace();
			}
			sum += number;
		}
		return sum;
		
	}
	
	
}



