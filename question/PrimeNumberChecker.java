package com.question;

import java.util.Scanner;

public class PrimeNumberChecker {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Number");
		int number = scanner.nextInt();
		if (number <= 0) {
			System.out.println("Invalid Number");

		}
		int counter = 0;
		for (int i = 1; i < number; i++) {
			if (number <= 0) {
				System.out.println("Invalid Number");
				break;
			}
			if (number % i == 0) {
				counter++;
			}
			
		}

		System.out.print(counter==2 ? "its prime Number" : "Its not prime Numbeer");
		scanner.close();

	}
}
