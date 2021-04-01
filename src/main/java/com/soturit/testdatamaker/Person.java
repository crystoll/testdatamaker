package com.soturit.testdatamaker;

import java.util.Objects;

public class Person {

	private final String firstName;
	private final String lastName;
	private final String email;


	public Person(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}


	public String getLastName() {
		return this.lastName;
	}


	public String getEmail() {
		return this.email;
	}


	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Person)) {
			return false;
		}
		Person person = (Person) o;
		return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, email);
	}

	@Override
	public String toString() {
		return "{" +
			" firstName='" + getFirstName() + "'" +
			", lastName='" + getLastName() + "'" +
			", email='" + getEmail() + "'" +
			"}";
	}

}