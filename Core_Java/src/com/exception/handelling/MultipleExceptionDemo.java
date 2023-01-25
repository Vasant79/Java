package com.exception.handelling;

public class MultipleExceptionDemo {

	public static void main(String[] args) {

		// read command line argument
		try {
			String input = args[0];
			System.out.println(input);

			int number = Integer.parseInt(input);
			System.out.println("input in int : " + number);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Length greater");
		} catch (NumberFormatException e) {
			System.out.println("Type number as String first");
		} catch (RuntimeException e) {
			System.out.println("Something went wrong");
		}

		System.out.println("Multiple catch for multiple exceptions");
	}

}
