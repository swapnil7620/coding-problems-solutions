package com.question;

import java.util.Arrays;
import java.util.Collections;

public class MinMaxFromArrayUsingCollections {
	public static void main(String[] args) {
		
		
		
	Integer[] arr = {10,33,765,6520,7800};
		
	    // Note : Collections class methods only work on Wrapper class and collection framework 
    	// primitive  type are not allowed 
		int max = Collections.max(Arrays.asList(arr));
		int min = Collections.min(Arrays.asList(arr));
		System.out.println(max);
		System.out.println(min);
		
		// sorting using reversed method
		Arrays.asList(arr).reversed().forEach(System.out::println);
	}

}
