package com.abstraction;

public class Test {

	public static void main(String[] args) {

		Audi a = new Audi();
		BMW b = new BMW();

		a.commonFunctionality();
		a.specificFunctionality();

		b.commonFunctionality();
		b.specificFunctionality();
	}

}
