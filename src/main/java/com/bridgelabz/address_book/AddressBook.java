package com.bridgelabz.address_book;

import java.util.Scanner;

public class AddressBook {
   
Scanner sc = new Scanner(System.in);

	
	public Contact createContact()
	{
		Contact newContact = new Contact();
		System.out.println("pls enter first name");
        String firstName = sc.nextLine();
        newContact.setFirstName(firstName);	
        System.out.println("pls enter last name");
        String lastName = sc.nextLine();
        newContact.setFirstName(lastName);
        System.out.println("pls enter city");
        String city = sc.nextLine();
        newContact.setFirstName(city);
        System.out.println("pls enter address");
        String address = sc.nextLine();
        newContact.setFirstName(address);
        System.out.println("pls enter state");
        String state = sc.nextLine();
        newContact.setFirstName(state);
        System.out.println("pls enter the zip");
        String zip = sc.nextLine();
        newContact.setFirstName(zip);
        System.out.println("pls enter phone number");
        String phone = sc.nextLine();
        newContact.setFirstName(phone);
        System.out.println(newContact);
        return newContact;
	}
}
