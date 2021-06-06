package Manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Contact.Contact;
import Contact.ContactInput;
import Contact.ContactKind;
import Contact.RestuarantsContact;
import Contact.ShopContact;
import Contact.UniversityContact;

public class ContactManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7235828297451174595L;

	ArrayList<ContactInput> contacts = new ArrayList<ContactInput>();
	transient Scanner input;
	ContactManager(Scanner input){
		this.input = input;
	}

	public void AddContact() {
		int kind = 0;
		ContactInput contactInput;
		while(kind != 1 && kind != 2 && kind != 3) {
			try {
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
			catch(InputMismatchException e) {
				System.out.println("Please put a integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void DeleteContact() {
		System.out.print("Contact Name :");
		String ContactName = input.next();
		int index = findIndex(ContactName);
		removefromContacts(index, ContactName);
	}

	public int findIndex(String ContactName) {
		int index = -1;
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getName().equals(ContactName)) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromContacts(int index, String contactName) {
		if(index >= 0) {
			contacts.remove(index);
			System.out.println("the contact " + contactName + "is deleted.");
			return 1;
		}
		else {
			System.out.println("the contact has not been registered.");
			return -1;
		}		
	}

	public void EditContact() { 
		System.out.print("Contact Name :");
		String ContactName = input.next();
		for (int i = 0; i < contacts.size(); i++) { 
			ContactInput contact = contacts.get(i);
			if(contact.getName().equals(ContactName) ) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						contact.setContactName(input);
						break;
					case 2:
						contact.setContactNumber(input);
						break;
					case 3:
						contact.setContactEmail(input);
						break;
					case 4:
						contact.setContactAddress(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}	

	public void ViewContact() {
		System.out.println("# of registered contacts :" + contacts.size());
		for (int i = 0; i < contacts.size(); i++) {
			contacts.get(i).printInfo();
		}
	}

	public int size() {
		return contacts.size();
	}

	public ContactInput get(int index) {
		return (Contact) contacts.get(index);
	}

	public void DeveloperInformation() { 
		System.out.println("Joonwoo Kweon:)");
	}

	public void showEditMenu() {
		System.out.println("**Contact Info Edit Menu**");
		System.out.println("1. Edit Name");
		System.out.println("2. Edit Number");
		System.out.println("3. Edit Email");
		System.out.println("4. Edit Address");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 ~ 6 :");
	}
}

