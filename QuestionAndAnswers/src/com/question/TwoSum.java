package com.question;

import java.util.LinkedHashMap;
import java.util.Map;

class solution {

	public int[] twoSum(int[] nums, int target) {

		return nums;

	}
}

public class TwoSum {
	public static void main(String[] args) {
/*
		int[] nums = { 3,2,4 };

		int target = 6;

		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = i+1; j < nums.length; j++) {

				if ((nums[i] + nums[j]) == target) {
					System.out.println(i + " " + j);
				}
			}
		}
	
	*/	

		int[] nums = { 2,7,11,14 };

		int target = 9;
		
		Map<Integer, Integer> arr = new LinkedHashMap<Integer, Integer>();
		
		for(int i=0; i< nums.length;i++) {
			int remain = target - nums[i];
			if(arr.containsKey(remain)) {
				System.out.println(arr.get(remain) +": "+i);
			}
			arr.put(nums[i], i);
   		}
		
		
	}

}
