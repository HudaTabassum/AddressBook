package com.bridgelabz.address_book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook extends Contact{
   
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
        
       // System.out.println(newContact);
       
        al1.add(newContact);
        Iterator<Contact> itr = al1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        return newContact;
	}
	
	void editContact() {
        Contact contact = null;

        System.out.println("Enter the Contact Name which you want to Edit ");
        String name = sc.next();

        Iterator<Contact> itr = al1.iterator();

        while (itr.hasNext()) {
            Contact tempContact = itr.next();
            if (name.equals(tempContact.getFirstName())) {
                contact = tempContact;
            }
        }
        if (contact != null) {

            System.out.println("Enter your choice what you want to edit in contact edit press" + " \n 1.PhoneNo \n 2.Firstname \n 3.Lastname \n 4.Address \n 5.City \n " + "6.State \n 7. Email \n 8.ZipCode ");

            int ch = sc.nextInt();
            long phone;
			switch (ch) {

                case 1:
                    System.out.print("Please Enter The New Phone Number :: ");
                    phone = sc.nextLong();
                    contact.setPhone(phone);
                    break;
                case 2:
                    System.out.print("Enter first name :: ");
                    firstName = sc.next();
                    contact.setFirstName(firstName);
                    break;
                case 3:
                    System.out.print("Please Enter The Last Name :: ");
                    lastName = sc.next();
                    contact.setFirstName(lastName);
                    break;
                case 4:
                    System.out.print("Please Enter The Address :: ");
                    address = sc.next();
                    contact.setAddress(address);
                    break;
                case 5:
                    System.out.print("Please Enter The City :: ");
                    city = sc.next();
                    contact.setCity(city);
                    break;
                case 6:
                    System.out.print("Please Enter The State :: ");
                    state = sc.next();
                    contact.setState(state);
                    break;
                
                case 7:
                    System.out.print("Please Enter The Zip Code :: ");
                    zip = sc.nextInt();
                    contact.setZip(zip);
                    break;
                default:
                    System.out.println("Invalid input ");
            }

            System.out.println("Addressbook after editing contact ");
            al1.forEach(person -> System.out.println(person));

        } else {
            System.out.println("Name not found ");

        }

    }

	
	void print()
	{
		 
		 Iterator itr1 = al1.iterator();
	        while (itr1.hasNext()) {
	            System.out.println(itr1.next());
	        }
	}
	
	void deleteContact() {

        Contact contact = new Contact();

        System.out.println("Enter the Contact name which you want to delete  ");
        String name = sc.next();

        for (int i = 0; i < al1.size(); i++) {
            if (al1.get(i).getFirstName().equals(name)) {
                // al1.remove(contact);
                al1.remove(i);
            }
        }
        System.out.println("Address book after deleting contact ");

        Iterator itr1 = al1.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }
}
