package com.lamdaexpression;

import java.util.function.Predicate;

/*
 * lamda exp - provides implementation to functional interface
 * predicate - functonal interface that returns boolean 
 * functional interface - have only 1 abstract method , can have many default methods
 */

public class PredicateDemo {

	public static void main(String[] args) {

		String a = "Vasant";

		Predicate<String> p = (String b) -> {
			return b.equals(a);
		};

		System.out.println(p.test("Vasant"));

	}

}
