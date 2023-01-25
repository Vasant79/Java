package com.assignment;

import java.util.Scanner;

public class LoopAssignment {

	public static void main(String[] args) {

		// taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int no = sc.nextInt();

		sc.close();

		boolean primeFlag = true;

		// looping till no-1
		for (int i = 2; i < no - 1; i++) {

			if (no % i == 0) {
				primeFlag = false;
			}
		}

		String result = (primeFlag) ? "It is a prime number" : "Not a prime number";
		System.out.println(result);
	}

}
