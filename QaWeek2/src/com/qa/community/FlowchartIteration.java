package com.qa.iterations;

public class FlowchartIteration {
	
	public static void main(String[] args) {
		
		System.out.println("---Flow one---");
		flow(95);
		System.out.println("---Flow two---");
		flowTwo(95);
	}
	
	public static void flow(int num) {
		boolean playing = true;

		do {
			num++;

			if (num == 100 && num < 200) {
				System.out.println(num + ": A");
				playing = false;
			} else {
				System.out.println(num + ": Not 100 and less than 200");
			}
		} while (playing);
		
		System.out.println("End");
	}
	
	public static void flowTwo(int num) {
		boolean playing = true;

		do {
			num++;

			if (num == 100 && num % 2 == 0) {
				System.out.println(num + ": -");

				if (num <= 200) {
					playing = false;
				}

			} else {
				System.out.println(num + ": *");
			}

		} while (playing);

		System.out.println("End");

	}
}
