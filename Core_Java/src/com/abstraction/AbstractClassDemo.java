package com.abstraction;

//abstract class -- cannot use final keyword ( will become non inheritable)
public abstract class AbstractClassDemo {

	// concerete method
	public void commonFunctionality() {
		System.out.println("Inside common functionality -  speedoMeter");
	}

	/*
	 * abstract method no body usecase - when child have some special functionality
	 */
	abstract void specificFunctionality();

}
