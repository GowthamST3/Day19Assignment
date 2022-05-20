package com.BridgeLabz_Day19Assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidationUc8R4 {
	private static void validateUserFirstName() {

		String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName = scanner.next();

		Pattern pattern = Pattern.compile(firstNamePattern);
		Matcher matcher = pattern.matcher(firstName);
		boolean result = matcher.matches();

		if(result == true)
			validateUserLastName();
		else
			System.out.println("First Name is Invalid");
	}

	private static void validateUserLastName() {

		String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Last Name:");
		String lastName = scanner.next();

		Pattern pattern1 = Pattern.compile(lastNamePattern);
		Matcher matcher1 = pattern1.matcher(lastName);
		boolean result1 = matcher1.matches();

		if(result1 == true)
			validateUserEmail();
		else
			System.out.println("Last Name is invalid");
	}

	private static void validateUserEmail() {

		String emailPattern = "[A-Za-z0-9.+-]+@[a-z0-9]+[.][a-z]";
		System.out.println("Enter your Email:");
		Scanner scanner = new Scanner(System.in);
		String email = scanner.next();

		Pattern pattern2 = Pattern.compile(emailPattern);
		Matcher matcher2 = pattern2.matcher(email);
		boolean result2 = matcher2.matches();

		if(result2 == true)
			validatreUserMobileNumber();
		else
			System.out.println("Email is invalid");
	}

	private static void validatreUserMobileNumber() {
		//UC4 User need to enter valid Mobile Number
		String mobileNoPattern = "(91-)?[6-9][0-9]{9}";
		System.out.println("Enter your Mobile Number:");
		Scanner scanner = new Scanner(System.in);
		String mobileNumber = scanner.next();

		Pattern pattern3 = Pattern.compile(mobileNoPattern);
		Matcher matcher3 = pattern3.matcher(mobileNumber);
		boolean result3 = matcher3.matches();

		if(result3 == true)
			validateUserPasswordRule1();
		else
			System.out.println("Mobile Number is invalid");
	}

	private static void validateUserPasswordRule1() {

		String passwordPaternRule1 = "[a-zA-Z0-9~!@#$]{8,}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Password for Rule1:");
		String passwordRule1 = scanner.next();

		Pattern pattern4 = Pattern.compile(passwordPaternRule1);
		Matcher matcher4 = pattern4.matcher(passwordRule1);
		boolean result4 = matcher4.matches();

		if(result4 == true)
			validateUserPasswordRule2();
		else
			System.out.println("Password is invalid & plz enter minimum 8 character");
	}

	private static void validateUserPasswordRule2() {
		//UC6 User need to enter valid Password with at least one Uppercase
		String passwordPaternRule2 = "([A-Z]){1}[0-9a-zA-Z~!@#$]*";
		System.out.println("Enter your Password for Rule2:");
		Scanner scanner = new Scanner(System.in);
		String passwordRule2 = scanner.next();

		Pattern pattern5 = Pattern.compile(passwordPaternRule2);
		Matcher matcher5 = pattern5.matcher(passwordRule2);
		boolean result5 = matcher5.matches();

		if(result5 == true)
			validateUserPasswordRule3();
		else
			System.out.println("Password is invalid & plz enter at least one Uppercase");
	}

	private static void validateUserPasswordRule3() {
		//UC7 User need to enter valid Password with at least one numeric number
		String passwordPaternRule3 = "([A-Z])(?=.*[0-9]){8,}.*";
		System.out.println("Enter your Password for Rule3:");
		Scanner scanner = new Scanner(System.in);
		String passwordRule3 = scanner.next();

		Pattern pattern6 = Pattern.compile(passwordPaternRule3);
		Matcher matcher6 = pattern6.matcher(passwordRule3);
		boolean result6 = matcher6.matches();

		if(result6 == true)
			validateUserPasswordRule4();
		else
			System.out.println("Password is invalid & plz enter at least one numeric number");
	}

	private static void validateUserPasswordRule4() {

		String passwordPaternRule4 = "([0-9a-zA-Z]*[~!@#$]){1}[0-9a-zA-Z~!@#$]*";
		System.out.println("Enter your Password for Rule4:");
		Scanner scanner = new Scanner(System.in);
		String passwordRule4 = scanner.next();

		Pattern pattern7 = Pattern.compile(passwordPaternRule4);
		Matcher matcher7 = pattern7.matcher(passwordRule4);
		boolean result7 = matcher7.matches();

		if(result7 == true)
			System.out.println("Password is Valid");
		else
			System.out.println("Password is invalid & plz enter at least one Special character");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration program");
		validateUserFirstName();
	}
}
