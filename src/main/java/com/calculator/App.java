package com.calculator; // This line declares that this class belongs to the "com.calculator" package

import com.calculator.operations.Addition; // Importing the Addition class from the com.calculator.operations package
import com.calculator.operations.Division; // Importing the Division class from the com.calculator.operations package
import com.calculator.operations.Multiplication; // Importing the Multiplication class from the com.calculator.operations package
import com.calculator.operations.Subtraction; // Importing the Subtraction class from the com.calculator.operations package
import com.utils.InputHelper; // Importing the InputHelper class from the com.utils package

public class App { // This is the class declaration for the App class

	public static void main(String[] args) { // The main method, the entry point of the application
		// Printing the title of the calculator app with ASCII art
		System.out.println("===========================================");
		System.out.println("|          Welcome to Calculator App       |");
		System.out.println("===========================================");
		System.out.println("|         9       8      7       +         |");
		System.out.println("|         6       5      4       -         | ");
		System.out.println("|         3       2      1       /         |");
		System.out.println("|                 0                        |");
		System.out.println("===========================================");

		boolean continueCalculating = true; // Variable to control the loop for continuing calculations
		while (continueCalculating) { // Loop to keep asking for calculations until the user chooses to exit
			double num1 = InputHelper.getDoubleInput("\nEnter the first number: "); // Getting the first number from the user
			double num2 = InputHelper.getDoubleInput("Enter the second number: "); // Getting the second number from the user
			char operation = InputHelper.getOperationInput("Enter the operation (+, -, *, /): "); // Getting the operation
																																														// from the user

			double result = 0; // Variable to store the result of the calculation

			try { // Starting a try block to handle potential exceptions
				switch (operation) { // Using a switch statement to perform the appropriate operation based on user
															// input
					case '+': // Addition operation
						result = new Addition().calculate(num1, num2); // Creating an Addition object and calculating the result
						break;
					case '-': // Subtraction operation
						result = new Subtraction().calculate(num1, num2); // Creating a Subtraction object and calculating the
																															// result
						break;
					case '*': // Multiplication operation
						result = new Multiplication().calculate(num1, num2); // Creating a Multiplication object and calculating the
																																	// result
						break;
					case '/': // Division operation
						if (num2 == 0) { // Checking if dividing by zero
							throw new ArithmeticException("Cannot divide by zero."); // Throwing an exception if dividing by zero
						}
						result = new Division().calculate(num1, num2); // Creating a Division object and calculating the result
						break;
					default: // Handling invalid operation
						System.out.println("\nInvalid operation! Please try again."); // Printing an error message
						continue; // Prompting user for input again
				}

				System.out.println("\nResult: " + result); // Printing the result of the calculation
			} catch (ArithmeticException e) { // Catching ArithmeticException if division by zero occurs
				System.out.println("\nError: " + e.getMessage()); // Printing the error message
			} catch (Exception e) { // Catching any other unexpected exceptions
				System.out.println("\nAn unexpected error occurred: " + e.getMessage()); // Printing the error message
			}

			// Asking user if they want to continue performing calculations
			char choice = InputHelper.getCharInput("\nDo you want to perform another calculation? (Y/N): ");
			continueCalculating = (choice == 'Y' || choice == 'y'); // Updating the loop control variable based on user input
		}

		System.out.println("\nThank you for using Calculator App!"); // Printing a thank you message when the user chooses
																																	// to exit
	}
}

/*
 * package com.calculator;: Declares that this class belongs to the
 * com.calculator package. Packages are used for organizing related classes and
 * help prevent naming conflicts.
 *
 * import com.calculator.operations.*;: Imports the classes Addition, Division,
 * Multiplication, and Subtraction from the com.calculator.operations package.
 * The * means all classes in the package.
 *
 * import com.utils.InputHelper;: Imports the InputHelper class from the
 * com.utils package.
 *
 * public class App { ... }: Declares a class named App. The public keyword
 * means that this class can be accessed from other classes.
 *
 * public static void main(String[] args) { ... }: Declares the main method, the
 * entry point of the application. This method contains the logic for the
 * calculator app.
 *
 * The main method prompts the user for input, performs calculations based on
 * user input, handles exceptions, and asks if the user wants to continue. It
 * continues this process until the user chooses to exit.
 */