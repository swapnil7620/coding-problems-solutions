package com.question;

public class LinerSearch {

	 static int linearSearch(int[] arr , int target) {
		 
		   for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 20, 99, 40, 443, 80 };

		int result = linearSearch(arr, 70);

	  System.out.println(result!=-1?"found at : "+result:"not found");

	  
	  // basic way 
		/*
		  int[] arr = { 10, 20, 100, 8, 977, 488 };
		  
		  for (int val : arr) { 
		  if (val == 488) 
		  {
		   System.out.println("present");
		  return;
		   } 
		  } System.out.println("absent");
		  
		 */

	}

}
