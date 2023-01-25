package com.exception.handelling.custome;

public class CustomeException extends Exception {

	/*
	 * parent get initilized first -- if parent and child have explicit constructor
	 * -- parent constructor needs to be invoked in child
	 */

	CustomeException(String message) {
		super(message);
	}

}
