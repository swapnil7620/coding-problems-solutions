package com.question;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {

	public static void main(String[] args) {

		// First Non-Repeating Character in a String

		String value = "aabbacddfg";
		char[] arr = value.toCharArray();
		Map<Character, Integer> count = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < arr.length - 1; i++) {
			count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
		}

		for (char ch : arr) {
			// accessing the value by using get and matching with 1 
			if (count.get(ch) == 1) {
				System.out.println("First non repeating charecter in string  : "+ch);
				break;
			}
		}
	
		// find second  Non-Repeating Character in a String
		int counter =0;
		for(Map.Entry<Character,Integer> entry : count.entrySet()){
		    if(entry.getValue()==1) {
		    	counter++;
		    	 if(counter==2) {
				    	System.out.println("second non repeating character in string : "+entry.getKey());
				    }
		    	
		    }
		   
		}
		

	}
	

}
