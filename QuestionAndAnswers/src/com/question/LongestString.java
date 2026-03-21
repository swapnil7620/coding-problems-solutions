package com.question;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LongestString {

	public static void main(String[] args) {

		// find the longest element from the sentence
		String value = "Birds are flying in the sky".toLowerCase();
		
		String[] arr = value.split(" ") ;
		
		String val = Arrays.stream(arr).
				sorted((b, a) -> a.length() - b.length()).
				findFirst().
				orElseThrow(() -> new NoSuchElementException("not found"));

		System.out.println(val);

	}

}
