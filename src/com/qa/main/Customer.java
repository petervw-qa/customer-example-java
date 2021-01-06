package com.qa.main;

public class Customer {
	
	// variables (DECLARED)
	String name;
	int birthDay;
	String birthMonth;
	int birthYear;
	int age;
	String email;
	
	// constructor (INSTANTIATED)
	public Customer() {
		super();
		this.name = "Peter";
		this.birthDay = 18;
		this.birthMonth = "August";
		this.birthYear = 1997;
		this.age = 23;
		this.email = "petervw97@gmail.com";
	}
		
	// methods
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public int getAge() {
		return age;
	}
		
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
}
