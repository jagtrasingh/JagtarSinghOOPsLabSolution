package com.gl.lab1.driver;

import java.util.Scanner;

import com.gl.lab1.model.Employee;
import com.gl.lab1.services.CredentialService;

public class EmployeeDriver {
	public static void main(String[] args) {

		// Employee object creation -> Dummy Object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome , Please generate your credentail");
		System.out.println("Please Enter your firstName : ");
		String firstName = scanner.nextLine();
		System.out.println("Please Enter your lastName : ");
		String lastName = scanner.nextLine();

		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int option = scanner.nextInt();
		scanner.close();

		String departmentName = "";
		switch (option) {

		case 1:
			departmentName = "tech";
			break;

		case 2:
			departmentName = "admin";
			break;

		case 3:
			departmentName = "hr";
			break;

		case 4:
			departmentName = "legal";
			break;

		default:
			System.out.println("Please enter valid option");
		}

		Employee empObj = new Employee(firstName, lastName);
		CredentialService credentialService = new CredentialService();

		String sFirstName = empObj.getFirstName().trim().toLowerCase();

		String sLastName = empObj.getLastName();
		sLastName = sLastName.trim().toLowerCase();

		String sCreatedEmail = credentialService.generateEmailAddress(sFirstName, sLastName,
				departmentName);
		String sCreatedPass = credentialService.generatePassword();
		credentialService.showCredentials(empObj, sCreatedEmail, sCreatedPass);

	}

}

