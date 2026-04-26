package com.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {
	public static void movestoZero(Integer[] arr) {

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
	}

	public static void main(String[] args) {

		// Using  Two List
		  Integer[] arr2 = { 0,0, 1, 13, 0, 3, 35,0,44 };
		  
		  List<Integer> list = new ArrayList<Integer>(); 
		  List<Integer> zeros = new  ArrayList<Integer>();
		  
		  for (int i = 0; i < arr2.length; i++) { 
			  if(arr2[i]!=0)
				  list.add(arr2[i]);
			  else
		          zeros.add(arr2[i]); 
			  } 
		  list.addAll(zeros);
		  System.out.println(list);
		 

		// swap method

		Integer[] arr = { 0, 0, 1, 13, 0, 3, 35, 0, 44 };

		movestoZero(arr);
		System.out.println(Arrays.toString(arr));

	}

}
