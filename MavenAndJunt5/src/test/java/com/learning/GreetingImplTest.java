package com.learning;

//comming from jupitor package coz junit 5
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * some annotation change -- BeforeEach & AfterEach
 * junit5 modularised
 */

class GreetingImplTest {

	@Test
	void valid_Output_With_Hello() {

		Greeting greet = new GreetingImpl();
		String result = greet.name("Vasant");

		// expected & actual
		Assertions.assertEquals("Hello Vasant", result);
	}

	@Test
	void Argument_exceptionthrown() {

		Greeting greet = new GreetingImpl();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			greet.name("Vasu");
		});

	}

}
