package com.lamdaexpression;

import java.util.function.Function;

/*
 * function similar to lamda expression but can return any type
 */

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, Integer> f1 = s -> s.length();

		System.out.println(f1.apply("Vasu"));

	}

}
