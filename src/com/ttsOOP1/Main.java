package com.ttsOOP1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO
		Scanner input = new Scanner(System.in);
		input.useDelimiter("\\n");
		
		System.out.println("Would you like to add a pet or a boat? ");
		String choice = input.next();
		
		if (choice.equalsIgnoreCase("pet")) {
			
			Pet Biscuit = new Pet();
			
			Biscuit.setGoodPet(true);
			Biscuit.setPetAge(1);
			Biscuit.setPetName("Biscuit");
			Biscuit.setPetType("dog");
			Biscuit.setPetLocation("Matt's house");
			
			//Biscuit.printPetInfo(true);
			
			System.out.println("What is the name, type (dog, cat, etc) and age of your pet? ");
			
			Pet userPet = new Pet();
			userPet.setPetName(input.next());
			userPet.setPetType(input.next());
			userPet.setPetAge(input.nextInt());
			System.out.println("Is " + userPet.getPetName() + " a good " + userPet.getPetType() + "?" );
			
			userPet.setGoodPet(true);
			
			userPet.printPetInfo(false);
			
		} else if (choice.equalsIgnoreCase("boat")) {
			
			Boat Cayuse = new Boat();
			Cayuse.setBoatName("Cayuse");
			Cayuse.setBoatType("Catamaran");
			Cayuse.setBoatLength(51);
			
			//Cayuse.printBoatInfo();
			
			System.out.println("What is the name, hull type (monohull, catamaran or trimaran) and length of your boat?\n"
					+ "With this data this program will attempt to calculate the hullspeed of your vessel");

			Boat userBoat = new Boat();
			userBoat.setBoatName(input.next());
			userBoat.setBoatType(input.next());
			userBoat.setBoatLength(input.nextInt());
			
			userBoat.printBoatInfo();
			
			
		} else {
			
			System.out.println("I'm sorry, I don't understand that input");
		}
		
		input.close();
	}
}
