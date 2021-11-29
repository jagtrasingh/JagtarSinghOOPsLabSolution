package com.gl.lab1.services;

import java.util.Random;

import com.gl.lab1.model.Employee;

public class CredentialService {

	/**
	 * Generates the new password
	 * @return
	 */
	public String generatePassword() {
		String sGenPass = "";
		String sNumbers = "1234567890";
		String sCapLetter = "ABCDEFGHIJKLMNOPQRSTWXYZ";
		String sSmallLatters = "abcdefghijklmnopqrstwxyz";
		String sSpecialChar = "!@#$%^&*()";

		String values = sNumbers + sCapLetter + sSpecialChar + sSmallLatters ;

		Random randomize = new Random();
		char[] password = new char[8];

		int len = values.length(); 
		for (int i = 0; i < 8; i++) {
			int randomNextInt = randomize.nextInt(len); // -> 0 - 72
			password[i] = values.charAt(randomNextInt);
		}
		sGenPass = password.toString();

		return sGenPass;
	}

	/**
	 * Generates the Email address
	 * 
	 * @param firstName
	 * @param lastName
	 * @param departmentName
	 * @return generated email address
	 */

	public String generateEmailAddress(String firstName, String lastName, String departmentName) {
		String generatedEmailAddress = firstName + lastName + "@" + departmentName + ".abc.com";
		return generatedEmailAddress;
	}

	/**
	 * Displays the Credentials of the user
	 * 
	 * @param employeeObject
	 * @param email
	 * @param generatedPassword
	 */
	public void showCredentials(Employee employeeObject, String email, String generatedPassword) {
		System.out.println("Dear " + employeeObject.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email    --->" + email);
		System.out.println("Password --->" + generatedPassword);
	}
}
