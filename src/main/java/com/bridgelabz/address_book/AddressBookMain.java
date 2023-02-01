package com.bridgelabz.address_book;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBook addressBook = new AddressBook();
		addressBook.createContact();
		
		String ch;
        do {
            Scanner sc = new Scanner(System.in);

            // obj.addElement();

            System.out.println("Enter choice \n 1.Add Contact \n 2.Edit Contact \n 3.Delete contact");
            int choice;
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                	addressBook.createContact();
                    break;
                case 2:
                	addressBook.editContact();
                    break;
                

                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("----------------------------------------------------------------");
            System.out.println("DO YOU WANT TO ADD MORE CONTACT (PRESS y to contune)");
            ch = sc.next();
        } while (ch.equals("y") || ch.equals("Y"));
	}

}
