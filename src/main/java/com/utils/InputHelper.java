package com.utils; // This line declares that this class belongs to the "com.utils" package

import java.util.Scanner; // Importing the Scanner class from the java.util package

public class InputHelper { // This is the class declaration for the InputHelper class

	private static Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input from the console

	// Method to get a double input from the user
	public static double getDoubleInput(String message) {
		System.out.print(message); // Printing the message prompt to the console
		return scanner.nextDouble(); // Reading a double input from the console and returning it
	}

	// Method to get a character input (operation) from the user
	public static char getOperationInput(String message) {
		System.out.print(message); // Printing the message prompt to the console
		return scanner.next().charAt(0); // Reading a character input from the console and returning the first character
	}

	// Method to get a character input from the user
	public static char getCharInput(String message) {
		System.out.print(message); // Printing the message prompt to the console
		char input = scanner.next().charAt(0); // Reading a character input from the console and storing it
		scanner.nextLine(); // Consuming the rest of the line to clear the buffer
		return input; // Returning the character input by the user
	}
}

/*
 * Explanation of key concepts:
 *
 * package com.utils;: Declares that this class belongs to the com.utils
 * package. Packages are used for organizing related classes and help prevent
 * naming conflicts.
 *
 * import java.util.Scanner;: Imports the Scanner class from the java.util
 * package. Import statements are used to access classes and packages from other
 * parts of the Java API or from user-defined packages.
 *
 * public class InputHelper {: Declares a class named InputHelper. The public
 * keyword means that this class can be accessed from other classes.
 *
 * private static Scanner scanner = new Scanner(System.in);: Declares a private
 * static variable scanner of type Scanner. private means it can only be
 * accessed within this class. static means it belongs to the class itself
 * rather than instances of the class. Scanner(System.in) creates a new Scanner
 * object to read input from the console.
 *
 * public static double getDoubleInput(String message) { ... }: Declares a
 * public static method named getDoubleInput that takes a String parameter
 * message. public means it can be accessed from other classes. static means it
 * belongs to the class itself. This method prompts the user with the provided
 * message and returns a double input from the console.
 *
 * public static char getOperationInput(String message) { ... }: Declares a
 * public static method named getOperationInput that takes a String parameter
 * message. This method prompts the user with the provided message and returns
 * the first character of the input as a char.
 *
 * public static char getCharInput(String message) { ... }: Declares a public
 * static method named getCharInput that takes a String parameter message. This
 * method prompts the user with the provided message, reads a character input
 * from the console, clears the buffer, and returns the character input by the
 * user.
 */