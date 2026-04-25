package com.question;

public class ReverseEachWord {

	public static void main(String[] args) {

		String sentence = "Birds are flying in sky";

		String[] arr = sentence.split(" ");

		StringBuffer reverse = new StringBuffer();

		for (int i = 0; i < arr.length; i++) {
			
			StringBuffer sb = new StringBuffer();
			sb.append(arr[i]);
			sb.reverse();
			reverse.append(sb + " ");

		}
		System.out.println(reverse);
	}

}
