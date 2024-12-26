package com.design.pattern.builder;

public class Dog {

	private String name;
	private String gender;
	private String breed;
	private double price;

	public Dog(DogBuilder builder) {
		
		this.name = builder.getName();
		this.gender= builder.getGender();
		this.breed = builder.getBreed();
		this.price =builder.getPrice();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", gender=" + gender + ", breed=" + breed + ", price=" + price + "]";
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static class DogBuilder {
		private String name;
		private String gender; // cannot change
		private String breed; // cannot change
		private double price;

		public String getName() {
			return name;
		}

		public DogBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public double getPrice() {
			return price;
		}

		public DogBuilder setPrice(double price) {
			this.price = price;
			return this;
		}

		public DogBuilder setGender(String gender) {
			this.gender = gender;
			return this;

		}

		public String getGender() {
			return gender;
		}

		public DogBuilder setBreed(String breed) {
			this.breed = breed;
			return this;

		}

		public String getBreed() {
			return breed;
		}
		
		 public Dog build() {
	         // Validate required fields
	         if (gender == null || breed == null) {
	             throw new IllegalArgumentException("Gender and breed are required fields and cannot be null.");
	         }
	         return new Dog(this);
	     }

	}
	

}
