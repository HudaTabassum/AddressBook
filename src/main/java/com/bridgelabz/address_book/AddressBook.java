package com.bridgelabz.address_book;

import java.util.Scanner;

public class AddressBook {
   
Scanner sc = new Scanner(System.in);

	
	public void createContact()
	{
		Contact contact = new Contact();
		System.out.println("pls enter first name");
        String firstName = sc.nextLine();
        contact.setFirstName(firstName);	
        System.out.println("pls enter last name");
        String lastName = sc.nextLine();
        contact.setFirstName(lastName);
        System.out.println("pls enter city");
        String city = sc.nextLine();
        contact.setFirstName(city);
        System.out.println("pls enter address");
        String address = sc.nextLine();
        contact.setFirstName(address);
        System.out.println("pls enter state");
        String state = sc.nextLine();
        contact.setFirstName(state);
        System.out.println("pls enter the zip");
        String zip = sc.nextLine();
        contact.setFirstName(zip);
        System.out.println("pls enter phone number");
        String phone = sc.nextLine();
        contact.setFirstName(phone);
        System.out.println(contact);
	}
}
