package com.design.pattern.builder;



public class Driver {

	public static void main(String[] args) {
		// call builder pattern way to create object

		Dog dog1 = new Dog.DogBuilder().setName("bruno").setBreed("German Shepard").setGender("Male").setPrice(8500.45)
				.build();
		
		System.out.println(dog1);
	}

}
