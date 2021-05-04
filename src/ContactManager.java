import java.util.ArrayList;
import java.util.Scanner;

import Contact.Contact;
import Contact.ContactKind;
import Contact.RestuarantsContact;

public class ContactManager {
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	Scanner input;
	ContactManager(Scanner input){
		this.input = input;
	}

	public void AddContact() {
		int kind = 0;
		Contact contact;
		while(kind != 1 && kind != 2 && kind != 3) {			
			System.out.println("1 for University  ");
			System.out.println("2 for Shops  ");
			System.out.println("3 for Restuarant  ");
			System.out.print("Select num 1, 2, or 3 for Contact Kind :");
			kind = input.nextInt();
			if(kind == 1) {
				contact = new Contact(ContactKind.University);
				contact.getUesrInput(input);
				contacts.add(contact);
				break;
			}
			else if (kind == 2) {
				contact = new ShopContact(ContactKind.Shops);
				contact.getUesrInput(input);
				contacts.add(contact);
				break;
			}
			else if (kind == 3) {
				contact = new RestuarantsContact(ContactKind.Restaurants );
				contact.getUesrInput(input);
				contacts.add(contact);
				break;
			}
			else {
				System.out.print("Select num for Contact kind: ");
			}
		}
	}

	public void DeleteContact() {
		System.out.print("Contact Name :");
		String ContactName = input.next();
		int index = -1;
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getName().equals(ContactName)) {
				index = i;
				break;
			}
		}
		if(index >= 0) {
			contacts.remove(index);
			System.out.println("the contact " + ContactName + "is deleted.");
		}
		else {
			System.out.println("the contact has not been registered.");
			return;
		}		
	}

	public void EditContact() { 
		System.out.print("Contact Name :");
		String ContactName = input.next();
		for (int i = 0; i < contacts.size(); i++) { 
			Contact contact = contacts.get(i);
			if(contact.getName().equals(ContactName) ) {
				int num = -1;
				while (num != 5) {
					System.out.println("**Contact Info Edit Menu**");
					System.out.println("1. Edit Name");
					System.out.println("2. Edit Number");
					System.out.println("3. Edit Email");
					System.out.println("4. Edit Address");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1 ~ 6 :");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Contact Name: ");
						String name = input.next();
						contact.setName(name);
					}
					else if (num == 2) {
						System.out.print("Contact Number: ");
						String number = input.next();
						contact.setNumber(number);
					}
					else if (num == 3) {
						System.out.print("Email address: ");
						String email = input.next();	
						contact.setEmail(email);
					}
					else if (num == 4) {
						System.out.print("Address :");
						String address = input.next();
						contact.setAddress(address);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}	

	public void ViewContact() {
		//		System.out.print("Contact Name :");
		//		String ContactName = input.next();
		System.out.println("# of registered contacts :" + contacts.size());
		for (int i = 0; i < contacts.size(); i++) {
			contacts.get(i).printInfo();
		}
	}
	public void DeveloperInformation() { 
		System.out.println("Joonwoo Kweon:)");
	}
}
