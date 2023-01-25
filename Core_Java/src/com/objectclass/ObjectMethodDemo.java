package com.objectclass;

public class ObjectMethodDemo extends Object {

	private int a;

	private String firstName;
	private String lastName;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return firstName;

	}

	@Override
	public int hashCode() {
		return a;
	}

}
