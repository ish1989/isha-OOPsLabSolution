package com.greatlearning.model;

public class Employee 
{
	private String firstName;
	private String lastName;

	public Employee()
	{

		// its advisable  to create default constructor when creating parameterized constructor
	}

	public Employee(String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;

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
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}


}
