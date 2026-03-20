package com.question;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		
		String  value = "appa".toLowerCase();
		
		boolean flag = true;
		
		for(int i=0;i<value.length()-1;i++) {
			if(value.charAt(i)!= value.charAt(value.length()-1 -i)) {
				flag = false;
				break;
			}
		}
		
		System.out.println(flag?"its palindrome":"its not palindrome");
	}

}
