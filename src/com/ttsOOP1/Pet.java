package com.ttsOOP1;

public class Pet {
	
	private String petName;
	private int petAge;
	private String petLocation;
	private String petType;
	private boolean isGoodPet;
	
	
	public String getPetName() {
		return petName;
	}
	
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public String getPetType() {
		return petType;
	}
	
	public void setPetType(String petType) {
		this.petType = petType;
	}
	

	public int getPetAge() {
		return petAge;
	}

	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}

	public String getPetLocation() {
		return petLocation;
	}

	public void setPetLocation(String petLocation) {
		this.petLocation = petLocation;
	}

	public boolean isGoodPet() {
		return isGoodPet;
	}

	public void setGoodPet(boolean isGoodPet) {
		this.isGoodPet = isGoodPet;
	}
	
	public void printPetInfo(boolean withLocation) {
		int age = this.getPetAge();
		String location = this.getPetLocation();
		String name = this.getPetName();
		String type = this.getPetType();
		boolean isGoodPet = this.isGoodPet();
		
		if (withLocation == true) {
			System.out.println("It's " + isGoodPet + " that " + name 
				+ ", the " + age + " year old " + type 
				+ ", is a good " + type + ".\n" + name + " lives in " + location); 
		} else {
			System.out.println("It's " + isGoodPet + " that " + name 
				+ ", the " + age + " year old " + type 
				+ ", is a good " + type + ".");
		}
	}
}
	