package com.learning;

public class GreetingImpl implements Greeting {

	public String name(String name) {

		if (name == null) {
			throw new IllegalArgumentException();
		}
		return "Hello " + name;
	}

}
