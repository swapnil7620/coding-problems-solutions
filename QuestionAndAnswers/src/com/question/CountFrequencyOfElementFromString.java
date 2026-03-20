package com.question;

import java.util.LinkedHashMap;

public class CountFrequencyOfElementFromString {

	public static void main(String[] args) {

		// Count Frequency of Characters in a String

		// first approach

		String value = "apple";

		LinkedHashMap<Character, Integer> count = new LinkedHashMap<Character, Integer>();

		for (char values : value.toCharArray()) {

			// first way getOrDefault
//			count.put(values, count.getOrDefault(values, 0) + 1);

			// second way using merge
			count.merge(values,1, Integer::sum);
			
		}
		System.out.println(count);

	}

}
