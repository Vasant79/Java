package com.abstraction;

/*
 * in child we can use final keyword ( after final no one can extend bmw)
 */
public final class BMW extends AbstractClassDemo {

	@Override
	void specificFunctionality() {

		System.out.println("Max Speed : 350");
	}

}
