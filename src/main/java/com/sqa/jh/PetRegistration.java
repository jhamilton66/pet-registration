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

	static String petName, petAddress, petCity, petState, petRegPrice, petDOB;

	public static void registerPet() {
		initApplication();
		retrieveUserName();
		retrievePetDetails();
		displayPetDetails();
		exitApplication();

	}

	/**
	 * 
	 */
	private static void displayPetDetails() {
		System.out.println("\nPet Details:");
		System.out.println("------------------------");
		System.out.println("Name: " + petName);
		System.out.println("Address: " + petAddress);
		System.out.println("City: " + petCity);
		System.out.println("State: " + petState);
		System.out.println("Birthday: " + petDOB);
		System.out.println("Registration Price: " + petRegPrice);

	}

	private static void exitApplication() {
		System.out.println("Thank you for using the Pet Registration Application");
		System.out.println("Good-bye " + name);
	}

	private static void initApplication() {
		scanner = new Scanner(System.in);
		System.out.println("Welcome to the Pet Registration Application");
	}

	private static String obtainString(String question) {
		System.out.print(question);
		return scanner.nextLine();

	}

	/**
	 * 
	 */
	private static void retrievePetDetails() {
		petName = obtainString("What is your pet's name:");
		petAddress = obtainString("What is " + petName + "'s address:");
		petCity = obtainString("What city does he live in:");
		petState = obtainString("How about the state:");
		petRegPrice = obtainString("How much are registration costs:");
		petDOB = obtainString("What is " + petName + "'s date of birth:");

	}

	private static void retrieveUserName() {
		System.out.print("Could you please give me your name:");
		name = scanner.nextLine();

	}
}
