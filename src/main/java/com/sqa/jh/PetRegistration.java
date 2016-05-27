/**
 *   File Name: PetRegistration.java<br>
 *
 *   Hamilton, James<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 25, 2016
 *   
 */

package com.sqa.jh;

import java.util.*;

/**
 * PetRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Hamilton, James
 * @version 1.0.0
 * @since 1.0
 *
 */
public class PetRegistration {
	static Scanner scanner;

	static String name;

	static String[] petNames, petAddresses, petCities, petStates, petRegPrices, petDOBs;

	static int petCount;

	public static void registerPets() {
		initApplication();
		retrieveUserName();
		retrieveNumberOfPets();
		initPetDetailArrays();
		retrieveAllPetDetails();
		displayAllPetDetails();
		exitApplication();

	}

	private static void displayAllPetDetails() {
		for (int i = 0; i < petCount; i++) {
			displayPetDetails(i);
		}

	}

	private static void displayPetDetails(int petIndex) {
		System.out.println("\nPet Details:");
		System.out.println("------------------------");
		System.out.println("Name: " + petNames[petIndex]);
		System.out.println("Address: " + petAddresses[petIndex]);
		System.out.println("City: " + petCities[petIndex]);
		System.out.println("State: " + petStates[petIndex]);
		System.out.println("Birthday: " + petDOBs[petIndex]);
		System.out.println("Registration Price: " + petRegPrices[petIndex]);

	}

	private static void exitApplication() {
		System.out.println("Thank you for using the Pet Registration Application");
		System.out.println("Good-bye " + name);
	}

	private static void initApplication() {
		scanner = new Scanner(System.in);
		System.out.println("Welcome to the Pet Registration Application");
	}

	/**
	 * 
	 */
	private static void initPetDetailArrays() {
		petNames = new String[petCount];
		petAddresses = new String[petCount];
		petCities = new String[petCount];
		petStates = new String[petCount];
		petRegPrices = new String[petCount];
		petDOBs = new String[petCount];

	}

	/**
	 * @param string
	 * @return
	 */
	private static int obtainInt(String question) {
		boolean validData = false;
		String input;
		int value = 0;
		while (!validData) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				value = Integer.parseInt(input);
				validData = true;
			} catch (NumberFormatException e) {
				System.out.println("You must supply a valid number character.");
			}
		}

		return value;
	}

	private static String obtainString(String question) {
		System.out.print(question);
		return scanner.nextLine();

	}

	private static void retrieveAllPetDetails() {
		for (int i = 0; i < petCount; i++) {
			retrievePetDetails(i);
		}

	}

	private static void retrieveNumberOfPets() {
		petCount = obtainInt("How many pets would you like to register?");

	}

	private static void retrievePetDetails(int petIndex) {
		System.out.println("Pet #" + (petIndex + 1) + " Details:");
		System.out.println("----------------------------------------");
		petNames[petIndex] = obtainString("What is your pet's name:");
		petAddresses[petIndex] = obtainString("What is " + petNames[petIndex] + "'s address:");
		petCities[petIndex] = obtainString("What city does he live in:");
		petStates[petIndex] = obtainString("How about the state:");
		petRegPrices[petIndex] = obtainString("How much are registration costs:");
		petDOBs[petIndex] = obtainString("What is " + petNames[petIndex] + "'s birthdate (MM/DD/YYYY)");
		System.out.println("----------------------------------------------------------");

	}

	private static void retrieveUserName() {
		System.out.print("Could you please give me your name:");
		name = scanner.nextLine();

	}
}
