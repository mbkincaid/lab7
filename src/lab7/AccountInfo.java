package lab7;

import java.util.Scanner;

public class AccountInfo {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
//		System.out.print("Please enter your name: ");
//		String name1 = scnr.nextLine();
//		if (name1.matches("[A-Z][a-z]*")) {
//			System.out.println("Name is valid.");
//		} else {
//			System.out.println("Name is NOT valid!");
//		}
//		
//		System.out.print("Please enter a valid email: ");
//		String email1 = scnr.nextLine();
//		if (email1.matches("[A-Za-z\\d]{1,30}\\@[A-Za-z\\d]{5,10}\\.[A-Za-z\\d]{2,3}")) {
//			System.out.println("Email is valid.");
//		} else {
//			System.out.println("Email is NOT valid!");
//		}
//		
//		System.out.print("Please enter a valid phone number: ");
//		String phone1 = scnr.nextLine();
//		if (phone1.matches("\\d{3}\\-\\d{3}\\-\\d{4}")) {
//			System.out.println("Phone number is valid.");
//		} else {
//			System.out.println("Phone number is NOT valid!");
//		}
//		
//		System.out.print("Please enter a valid date in DD-MM-YYYY format: ");
//		String date1 = scnr.nextLine();
//		if (date1.matches("\\d{2}\\/\\d{2}\\/\\d{4}")) {
//			System.out.println("Date is valid.");
//		} else {
//			System.out.println("Date is NOT valid!");
//		}

		System.out.println("Please enter your name: ");
		String name1;
		
		System.out.println("Please enter a valid email: ");
		String name1;
		name1 = getName(name);
		
		System.out.println("Please enter a valid phone number: ");
		String name1;
		name1 = getName(name);
		
		System.out.println("Please enter a valid date in DD-MM-YYYY format: ");
		String name1;
		name1 = getName(name);
	}

	private static boolean getName(String name) {
		Scanner scnr = new Scanner(System.in);
		name = scnr.nextLine();
		return name.matches("[A-Z][a-z]*");
	
	}
	private static boolean getEmail(String email) {
		Scanner scnr = new Scanner(System.in);
		email = scnr.nextLine();
		return email.matches("[A-Za-z\\d]{1,30}\\@[A-Za-z\\d]{5,10}\\.[A-Za-z\\d]{2,3}");
		
	}
	private static boolean getPhoneNumber(String phone) {
		Scanner scnr = new Scanner(System.in);
		phone = scnr.nextLine();
		return phone.matches("\\d{3}\\-\\d{3}\\-\\d{4}");

		
	}
	private static boolean getDate(String date) {
		Scanner scnr = new Scanner(System.in);
		date = scnr.nextLine();
		return date.matches("\\d{2}\\/\\d{2}\\/\\d{4}");

	}
}


