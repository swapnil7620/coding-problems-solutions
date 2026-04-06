package com.question;

public class ReverseOnlyVowels {

	public static void main(String[] args) {

		// Input string
		String value = "hello".toLowerCase();   // convert string to lowercase

		// String containing vowels
		String vowels = "aeiou";                // used to check if a character is a vowel

		// Mutable string so characters can be swapped
		StringBuffer reverse = new StringBuffer(value);
	    System.out.println("Original : "+value);

		// Left pointer starting from beginning
		int i = 0;

		// Right pointer starting from end
		int j = reverse.length() - 1;

		// Run loop until both pointers meet
		while (i < j) {

		    // If character at i is NOT a vowel move i forward
		    if (vowels.indexOf(reverse.charAt(i)) == -1) {
		        i++;
		        continue;                      // skip remaining loop and check next character
		    }

		    // If character at j is NOT a vowel move j backward
		    if (vowels.indexOf(reverse.charAt(j)) == -1) {
		        j--;
		        continue;                      // skip remaining loop and check next character
		    }

		    // Store character at i
		    char temp = reverse.charAt(i);

		    // Replace character at i with character at j
		    reverse.setCharAt(i, reverse.charAt(j));

		    // Put stored character at position j
		    reverse.setCharAt(j, temp);

		    // Move both pointers after swap
		    i++;
		    j--;
		    
		}

		// Print result
		System.out.println("Result   : "+reverse);
	}

}
