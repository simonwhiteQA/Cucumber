package com.qa.arrays;

public class Arrays {
	
	public static void main(String[] args) {

		System.out.println("----Method One----" );
		method_one();
		System.out.println("----Method Two----" );
		method_two();

	}

	public static void method_one() {
		int[] firstArray = new int[10];
		firstArray[0] = 1;
		firstArray[1] = 2;
		firstArray[2] = 3;
		firstArray[3] = 4;
		firstArray[4] = 5;
		firstArray[5] = 6;
		firstArray[6] = 7;
		firstArray[7] = 8;
		firstArray[8] = 9;
		firstArray[9] = 10;

		for (int i = 0; i < firstArray.length; i++) {
			System.out.println(firstArray[i]);
		}
	}
	
	public static void method_two( ) {
		int[] secondArray = new int[10];
		
		for (int i=0; i < secondArray.length; i++) {
			int value = secondArray[i] = i*10;
			System.out.println(value);
		}
	}

}
