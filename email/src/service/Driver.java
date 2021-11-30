package service;

import java.util.Scanner;

import model.Employee;

public class Driver {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first name");
		String firstName = sc.nextLine();
		System.out.println("Enter the last name");
		String lastName = sc.nextLine();

		Employee employee = new Employee(firstName, lastName);
		System.out.println("Please enter any of the following option");
		System.out.println("1 --> TECHNICAL");
		System.out.println("2 --> ADMIN");
		System.out.println("3 --> HUMAN RESOURCE");
		System.out.println("4 --> LEGAL");
		int option = sc.nextInt();

		CredentialService cs = new CredentialService();
		System.out.println(cs.generatePassword());

		String generatedEmail;
		char[] generatedPassword;
		if (option == 1) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);

		}

		else if (option == 2) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "admin");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);

		} else if (option == 3) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "hr");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);

		} else if (option == 4) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "legal");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		} else {
			System.out.println("Enter valid option");

		}
	}
}
