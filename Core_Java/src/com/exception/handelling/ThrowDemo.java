package com.exception.handelling;

/*
 * throw -- used for throwing exception explictly & custome
 */
public class ThrowDemo {

	public static void main(String[] args) {

		// throw creating instance of checked exception
		try {
			throw new Exception("throwing funds not availabe");
		} catch (Exception e) {

		}
		System.out.println("creating instance of checked and unchecked exception");

		// throw creating instance of Runtime excepyion
		throw new RuntimeException("cannot divide by 0");

	}
}
