package com.question;

import java.util.Arrays;

public class SumOfDigitFromString {

	// Find out sum of an digit from string
	public static void main(String[] args) {

		String value = "1o7j7";
		String[] digit = value.split("\\D+");

		// Imperative approach
		int count = 0, sum = 0;
		for (String val : digit) {
			if(val.isBlank()) {
				System.out.println("String is empty");
				break;
			}
	
		else if (!val.isEmpty()) {
				int values = Integer.parseInt(val);
				sum += values;
				count++;

			}
		}
		//System.out.println(count > 0 ? sum : "digit not found");

		// Declarative approach
		int summation = Arrays.stream(digit).
				             filter(ele -> !ele.isBlank() && !ele.isEmpty()). 
				             mapToInt(Integer::parseInt).
				             sum();
		
		System.out.print(summation > 0 ? sum : "digit not found");
		
	

	}

}
