package com.question;

import java.util.LinkedHashMap;
import java.util.Map;

public class findMostFrequentCharacter {
	public static void main(String[] args) {

		String value = "";
		
		// Used map to stored the key and value pair
		Map<Character, Integer> map = new  LinkedHashMap<Character, Integer>();
		
		// toCharArray to convert string into characters
		for (char ch : value.toCharArray()) {
			
		// first way  to add the key and value in map
        // map.merge(ch, 1, Integer::sum);
	    // second way to add the key and value pair  in map
			map.put(ch, map.getOrDefault(ch,0 )+1);
		  
		}
        // System.out.println(map.entrySet());
		
		
		// Took two variable to add the key and value pair to stored the final output	
		int count = 0;	
		Character character=' ';
		
		// Entry methods  help to  return key and value pair 
		// entry set is allows us to iterate through both key and value  together
		
		for(Map.Entry<Character, Integer> valEntry : map.entrySet()) {
			
		// we will check weather the  current value is greater than new  value
		// getValue will return value 
		// getKey will return key 
		// In last we will stored the value which is highest and at same time we will stored respective key also
			
			if(valEntry.getValue() > count) {
				count = valEntry.getValue();
				character = valEntry.getKey();
			}
		}
		// for the output
		System.out.println(character +" : " +count);
		

		
		 
		
	}

}
