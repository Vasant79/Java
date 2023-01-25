package com.string;

public class ImmutibilityDemo {

	public static void main(String[] args) {

		// String creation -- obj but treated differently
		String s1 = "Vasant";
		String s2 = "Negi";

		String a1 = new String("Vasu");
		String a2 = new String("Vasu");

		/*
		 * string pool -- same string is not created twice rather variables point to one
		 * common string in stringpool
		 */

		System.out.println(a1 == a2);

	}

}
