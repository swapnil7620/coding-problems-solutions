package com.question;

public class RemoveVowels {
	public static void main(String[] args) {

		String value = "apple";
		String vowles = "aeiou";
		StringBuffer sb = new StringBuffer();
		for (char ch : value.toCharArray()) {
			if (vowles.indexOf(ch) != -1)
				sb.append(ch);
		}
		System.out.println(sb);

	}

}
