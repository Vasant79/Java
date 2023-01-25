package com.exception.handelling;

public class TryCatchDemo {

	public static void main(String[] args) {

		String s = "abcd";
		int a;

		try {
			a = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("write number as string");
		}

		System.out.println("Number format Exception handelled ");
	}

}
