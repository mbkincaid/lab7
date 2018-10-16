package lab7;

import java.util.Scanner;

public class ValidationApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int age = getInt("Please enter your age.", scnr);
		System.out.println("You picked " + age);
		
		int pets = getInt("How many pets do you have?", scnr);
		System.out.println("You picked " + pets);
		
		scnr.close();
	}
	
	public static int getInt(String prompt, Scanner scnr) {
		
		boolean isValid = false; 
		int num = 0;
		
		while (!isValid) {
			System.out.println(prompt);
			if (scnr.hasNextInt()) {
				num = scnr.nextInt();
				isValid = true;	
			} else {
				System.out.println("Dammit, read the instructions.");
				scnr.nextLine(); // clear the bad input
				isValid = false;
			}
		}	return num;
	}
	
	public static double getDouble(String prompt2, Scanner scnr) {
		
		boolean isValid = false; 
		double num = 0.0;
		
		while (!isValid) {
			System.out.println(prompt2);
			if (scnr.hasNextInt()) {
				num = scnr.nextInt();
				isValid = true;	
			} else {
				System.out.println("Dammit, read the instructions.");
				scnr.nextLine(); // clear the bad input
				isValid = false;
			}
		} return num;
	}
}
	
//public static void main(String[] args) {
//	Scanner scnr = new Scanner(System.in);
//	
//	System.out.println("Enter a valid Java identifier.");
//	String input = scnr.nextLine();
//	// .matches checks for complete match with whole string.
//	//   Notice that we have to double \s.
//	//                 [a-zA-Z_$][\w$]*
//	if (input.matches("[a-zA-Z_$][\\w$]*")) {
//		System.out.println("It's good.");
//	} else {
//		System.out.println("It's not good.");
//	}
//
//	scnr.close();
//


