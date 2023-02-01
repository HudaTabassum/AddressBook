package com.bridgelabz.address_book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
   
Scanner sc = new Scanner(System.in);

	ArrayList<Contact> al1 = new ArrayList<Contact>();
	
	public Contact createContact()
	{
		Contact newContact = new Contact();
			
		System.out.println("pls enter first name");
        String firstName = sc.nextLine();
        newContact.setFirstName(firstName);	
        
        System.out.println("pls enter last name");
        String lastName = sc.nextLine();
        newContact.setLastName(lastName);
        
        System.out.println("pls enter city");
        String city = sc.nextLine();
        newContact.setCity(city);
        
        System.out.println("pls enter address");
        String address = sc.nextLine();
        newContact.setAddress(address);
        
        System.out.println("pls enter state");
        String state = sc.nextLine();
        newContact.setState(state);
        
        System.out.println("pls enter the zip");
        int zip = sc.nextInt();
        newContact.setZip(zip);
        
        System.out.println("pls enter phone number");
        long phone = sc.nextLong();
        newContact.setPhone(phone);
        
        System.out.println(newContact);
       
        return newContact;
	}
	
	void print()
	{
		 al1.add(createContact());
		System.out.println(al1);
	}
}
