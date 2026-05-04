package com.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargeString {
	public static void main(String[] args) {

		String value = "Birds are flying in the sky".toLowerCase();

		String[] arr = value.split(" ");

		List<String> large = Arrays.stream(arr).
				sorted((a, b) -> b.length() - a.length()).collect(Collectors.toList());
				
		
		System.out.println(large.get(1));

	}

}
