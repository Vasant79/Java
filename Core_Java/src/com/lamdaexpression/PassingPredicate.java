package com.lamdaexpression;

import java.util.function.Predicate;

public class PassingPredicate {

	public static void main(String[] args) {

		int arr[] = { 60, 10, 2, 3, 90, 4, 20 };

		Predicate<Integer> p1 = i -> i > 10;

		// 2nd predicate
		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println("Predicate p1 in action: ");
		PassingPredicate.method1(p1, arr);

		// joining predicate
		System.out.println("Predicate joining in action: p1.or(p2) ");
		PassingPredicate.method1(p1.or(p2), arr);// behaves like or

		System.out.println("p1.and(p2)");
		PassingPredicate.method1(p1.and(p2), arr);

		System.out.println("p1.negate()");
		PassingPredicate.method1(p2.negate(), arr);

	}

	// static method - belongs to class
	static void method1(Predicate<Integer> p, int arr[]) {
		for (int a : arr) {
			if (p.test(a)) {
				System.out.println(a);
			}
		}
	}

}
