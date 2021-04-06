import java.util.Scanner;

public class ContactManager {
	Contact contact;
	Scanner input;
	ContactManager(Scanner input){
		this.input = input;
	}

	public void AddContact() {
		contact = new Contact();
		System.out.print("Contact Name :");
		contact.name = input.next();
		System.out.print("Contact Number :");
		contact.number = input.next();
		System.out.print("Contact Email :");
		contact.email = input.next();
		System.out.print("Contact Address :");
		contact.address = input.next();
	}

	public void DeleteContact() {
		System.out.print("Contact Name :");
		String ContactName = input.next();
		if (contact == null) {
			System.out.println("the contact has not been registered.");
			return;
		}
		if (contact.name.equals(ContactName)) {
			contact = null;
			System.out.println("the contact is deleted.");
		}
	}

	public void EditContact() { 
		System.out.print("Contact Name :");
		String ContactName = input.next();
		if (contact == null) {
			System.out.println("the contact has not been registered.");
			return;
		}
		if (contact.name.equals(ContactName)) {
			System.out.println("the contact to be edited is " + ContactName);
		}
	}

	public void ViewContact() {
		System.out.print("Contact Name :");
		String ContactName = input.next(); 
		if (contact == null) {
			System.out.println("the contact has not been registered.");
			return;
		}
		if (contact.name.equals(ContactName)) {
			contact.printInfo();
		}
	}

	public void DeveloperInformation() { 
		System.out.println("Joonwoo Kweon:)");
	}
}
