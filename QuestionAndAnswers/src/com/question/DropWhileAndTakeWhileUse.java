package com.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DropWhileAndTakeWhileUse {

	public static void main(String[] args) {

		
		
		/*   dropWhile() method
		    1) Skips elements from the start while the condition is true.
			2)  When condition becomes false, it returns the remaining elements.
			3)  Works on ordered streams.
			4)️  Also introduced in Java 9.
			
		 */
		List<Integer> values = Arrays.asList(2, 3, 5, 10);
		List<Integer> newVallue = values.stream().sorted().dropWhile(number -> number < 3).collect(Collectors.toList());
		System.out.println(newVallue);


		/*  // takeWhile() method
		    1) Returns elements from the start while the condition is true.
	    	2) Stops processing when the condition becomes false.
		    3)	 Works best with ordered streams.
			4) Introduced in Java SE 9.
		 */
		List<Integer> collect = values.stream().sorted().takeWhile(number -> number < 10).collect(Collectors.toList());
		System.out.print(collect);

	}

}
