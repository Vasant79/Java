package com.encapsulation;

public class Test {

	public static void main(String[] args) {

		Patient p = new Patient();

		p.setId(1);
		p.setName("Vasu");
		p.setSsn("1100345");

		System.out.println("id : " + p.getId());
		System.out.println("name : " + p.getName());
		System.out.println("ssn : " + p.getSsn());

	}

}
