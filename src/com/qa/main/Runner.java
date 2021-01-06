package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		// creating new instances of customer class
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
		// i am going to
		// set customer1 name to Nick
		// set customer2 name to Gie
		
		customer1.setName("Nick");
		customer2.setName("Gie");
		
		customer1.setEmail("nick@qa.com");
		customer2.setEmail("gie@qa.com");
		
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println();
		
	}
}
