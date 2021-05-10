import java.util.ArrayList;
import java.util.Scanner;

import Contact.Contact;
import Contact.ContactInput;
import Contact.ContactKind;
import Contact.RestuarantsContact;
import Contact.ShopContact;
import Contact.UniversityContact;

public class ContactManager {
	ArrayList<ContactInput> contacts = new ArrayList<ContactInput>();
	Scanner input;
	ContactManager(Scanner input){
		this.input = input;
	}

	public void AddContact() {
		int kind = 0;
		ContactInput contactInput;
		while(kind != 1 && kind != 2 && kind != 3) {			
			System.out.println("1 for University  ");
			System.out.println("2 for Shops  ");
			System.out.println("3 for Restuarant  ");
			System.out.print("Select num 1, 2, or 3 for Contact Kind :");
			kind = input.nextInt();
			if(kind == 1) {
				contactInput = new UniversityContact(ContactKind.University);
				contactInput.getUesrInput(input);
				contacts.add(contactInput);
				break;
			}
			else if (kind == 2) {
				contactInput = new ShopContact(ContactKind.Shops);
				contactInput.getUesrInput(input);
				contacts.add(contactInput);
				break;
			}
			else if (kind == 3) {
				contactInput = new RestuarantsContact(ContactKind.Restaurants );
				contactInput.getUesrInput(input);
				contacts.add(contactInput);
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
			ContactInput contactInput = contacts.get(i);
			if(contactInput.getName().equals(ContactName) ) {
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
						contactInput.setName(name);
					}
					else if (num == 2) {
						System.out.print("Contact Number: ");
						String number = input.next();
						contactInput.setNumber(number);
					}
					else if (num == 3) {
						System.out.print("Email address: ");
						String email = input.next();	
						contactInput.setEmail(email);
					}
					else if (num == 4) {
						System.out.print("Address :");
						String address = input.next();
						contactInput.setAddress(address);
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

