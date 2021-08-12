package com.qa.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
	
	public static void main(String[] args) {
		
		List<String> teams = new ArrayList<>();
		
		teams.add("Liverpool");
		teams.add("Manchester");
		teams.add("Arsenal");
		teams.add("Chelsea");
		teams.add("Spurs");
		teams.add("Brighton");
		
		System.out.println("---Sysout arraylist---");
		System.out.println(teams);
		
		System.out.println("---For loop---");
		for (int i=0; i < teams.size(); i++) {
			System.out.println(teams.get(i));
		}
		
		System.out.println("---Enhanced for loop---");
		for (String i : teams) {
			System.out.println(i);
		}
		
		System.out.println("---Print Arsenal---");
		System.out.println(teams.get(2));
		
		System.out.println("---Change Spurs to Tottenham---");
		teams.set(4, "Tottenham");
		System.out.println(teams);
		
		System.out.println("---Remove Manchester---");
		teams.remove(1);
		System.out.println(teams);
		
		System.out.println("---Sort ArrayList---");
		Collections.sort(teams);
		System.out.println(teams);
		
		System.out.println("---Collections Examples---");
		Collections.reverse(teams);
		System.out.println("Reverse: ");
		System.out.println(teams);
		Collections.swap(teams, 2, 3);
		System.out.println("Swap 2+3: ");
		System.out.println(teams);
	}

}
