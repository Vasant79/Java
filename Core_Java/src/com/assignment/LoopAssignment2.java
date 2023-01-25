package com.assignment;

import java.util.Scanner;

public class LoopAssignment2 {

	public static void main(String[] args) {

		// no from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int no = sc.nextInt();

		// displaying no - for loop
		for (int i = 0; i <= no; i++) {
			if (i % 10 == 0) {
				continue;
			}
			if (i > 100) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();

		// displaying while loop
		int i = 1;
		while (i <= no) {
			if (i % 10 == 0) {
				i++;
				continue;
			}
			if (i > 100) {
				break;
			}
			System.out.print(i++ + " ");

		}

		sc.close();
	}// main method

}
