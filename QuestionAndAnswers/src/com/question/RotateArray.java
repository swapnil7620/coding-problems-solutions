package com.question;

import java.util.ArrayList;
import java.util.List;

public class RotateArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		List<Integer> list = new ArrayList<Integer>();
		for (int i = arr.length - k; i < arr.length; i++)
			list.add(arr[i]);

		for (int i = 0; i < arr.length - k; i++)
			list.add(arr[i]);

		System.out.println(list);
		

		
	}

}
