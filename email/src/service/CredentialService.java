package service;

import java.util.Random;

import model.Employee;

public class CredentialService {

	public char[] generatePassword() {

		String capitalletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smalletters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialcharacters = "!@#$%^&*-=_+";

		String values = capitalletters + smalletters + numbers + specialcharacters;

		Random random = new Random();

		char[] password = new char[8];

		for (int i = 0; i < password.length; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}

	public String generateEmailAddress(String firstName, String lastName, String department) {
		String email = firstName + lastName + "@" + department + ".abc.com";

		return email;
	}

	public void showCredentials(Employee employee, String email, char[] password) {
		System.out.println("dear" + employee.getFirstName() + "your generated credentials are as follows:");

		System.out.println("Email -->" + email);
		System.out.println("Password -->");
		System.out.println(password);
	}
}
