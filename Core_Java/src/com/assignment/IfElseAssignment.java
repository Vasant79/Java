package com.assignment;

public class IfElseAssignment {

	public static void main(String[] args) {

		int math = 70;
		int chem = 60;
		int physics = 80;

		if (math > 35 && chem > 35 && physics > 35) {
			int avg = (math + chem + physics) / 3;
			if (avg <= 59) {
				System.out.println("Grade C");
			} else if (avg <= 69) {
				System.out.println("Grade B");
			} else {
				System.out.println("Grade A");
			}

		} else {
			System.out.println("Fail");
		}
	}

}
