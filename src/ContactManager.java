import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	Scanner input;
	ContactManager(Scanner input){
		this.input = input;
	}

	public void AddContact() {
		Contact contact = new Contact();
		System.out.print("Contact Name :");
		contact.name = input.next();
		System.out.print("Contact Number :");
		contact.number = input.next();
		System.out.print("Contact Email :");
		contact.email = input.next();
		System.out.print("Contact Address :");
		contact.address = input.next();
		contacts.add(contact);
	}

	public void DeleteContact() {
		System.out.print("Contact Name :");
		String ContactName = input.next();
		int index = -1;
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).name.equals(ContactName)) {
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
			if(contact.name.equals(ContactName) ) {
				int num = -1;
				while (num != 5) {
					System.out.println("**Contact Info Edit Menu**");
					System.out.println("1. Edit Name");
					System.out.println("2. Edit Number");
					System.out.println("3. Edit Email");
					System.out.println("4. Veiw Address");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1 ~ 6 :");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Contact Name: ");
						contact.name = input.next();				
					}
					else if (num == 2) {
						System.out.print("Contact Number: ");
						contact.number = input.next();
					}
					else if (num == 3) {
						System.out.print("Email address: ");
						contact.email = input.next();					
					}
					else if (num == 4) {
						System.out.print("Address :");
						contact.address = input.next();
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
		for (int i = 0; i < contacts.size(); i++) {
			contacts.get(i).printInfo();
		}
	}
	public void DeveloperInformation() { 
		System.out.println("Joonwoo Kweon:)");
	}
}
