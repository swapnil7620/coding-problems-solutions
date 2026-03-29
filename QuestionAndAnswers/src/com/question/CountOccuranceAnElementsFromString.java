package com.question;

import java.util.Map;
import java.util.TreeMap;

public class CountOccuranceAnElementsFromString {

	public static void main(String[] args) {
	
		
		
   // Java Program to Count Words in a String Ignoring Special Characters"
		
		
		 //  converting  sentence into lower case
        String value =  "apple@ , apple  banana  peru peru".toLowerCase();
        // We use Regex to eliminate   non string element  
        // split also plays vital role as it used to split the sentence (space is key)
        String[]  convert = value.replaceAll("[^a-z]"," ").split(" ");
        Map<String, Integer>  LHM = new TreeMap<String, Integer>();

        for(String val :convert){
            if(!val.isBlank())
            {   
            	// first way
//                  LHM.put(val, LHM.getOrDefault(val,0)+1); 
            	// second way
            LHM.merge(val,1,Integer::sum);
            }
        }
        System.out.println(LHM);

	}

}
