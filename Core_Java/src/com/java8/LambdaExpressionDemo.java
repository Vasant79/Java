package com.java8;

/*
 * lambda expression implementation of functional interface
 */

public class LambdaExpressionDemo {

	public static void main(String[] args) {

		// lambda without parameters
		FunctionalInterfaceDemo fid = () -> {
			System.out.println("lambda expression");
		};

		// lambda with parameters
		SumFunctionalInterface sfi = (a, b) -> {
			System.out.println(a + b);
		};

		fid.method1();
		sfi.sum(10, 20);
	}

}
