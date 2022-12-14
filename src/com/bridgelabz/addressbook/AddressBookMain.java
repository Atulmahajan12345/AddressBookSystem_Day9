package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Address Book");
		AddressBookService contact = new AddressBookService();
		while (true) {
			System.out.println("Enter what you have to do");
			System.out.println(" 1 Add Contact \n 2 Edit Contact \n 3 Delete Contact \n 4 Display Contact \n 5 Quit ");
			int userChoice = scanner.nextInt();
			switch (userChoice) {
			case 1:
				contact.addContact();
				break;
			case 2:
				System.out.println("Enter the Phone Number");
				int phoneNumber = scanner.nextInt();
				boolean updated = contact.editContact(phoneNumber);
				if (updated) {
					System.out.println("Contact Updated Successfully");
				} else {
					System.out.println("Contact not found");
				}
				break;
			case 3:
				System.out.println("Enter the Phone Number");
				int phoneNumberToDelete = scanner.nextInt();
				boolean status = contact.deleteContact(phoneNumberToDelete);
				if (status) {
					System.out.println("Contact Deleted Successfully");
				} else {
					System.out.println("Contact not found");
				}
				break;
			case 4:
				contact.diaplayContacts();
				break;
			default:
				System.out.println("Thanks For Using Us");
				System.exit(0);
			}
		}

	}

}
