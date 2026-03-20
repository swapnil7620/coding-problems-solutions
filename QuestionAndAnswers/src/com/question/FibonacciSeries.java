package com.question;

public class FibonacciSeries {

	public static void main(String[] args) {

		int number = 5;
		int a = 0, b = 1;
		if (number > 0) {
			for (int i = 1; i <= number; i++) {
				System.out.print(a + " ");
				int next = a + b;
				a = b;
				b = next;
			}
		} else {
			System.out.println("number is not valid");
		}
	}

}
