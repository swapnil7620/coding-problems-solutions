package com.question;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FirstLetterFromSentence {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the message");
		String sentence = scanner.nextLine().trim();

		if (sentence == null || sentence.trim().isBlank()) {
			System.out.println("sentence cannot be blank or null");
			return;
		}

		List<String> result = Arrays.stream(sentence.split("\\s+")). // to convert the string into array
				map(val -> 
				val.substring(0, 1). // to select first character
						toUpperCase())
				.toList(); // collect the result into list
		System.out.println(result);

	}

}

