
import java.util.Scanner;

import Contact.Contact;
import Contact.ContactKind;

public class ShopContact extends Contact {
	
	public ShopContact(ContactKind kind) {
		super(kind);
	}

	public void getUesrInput(Scanner input) {
		System.out.print("Contact Name :");
		String name = input.next();
		this.setName(name);

		System.out.print("Contact Number :");
		String number = input.next();
		this.setNumber(number);

		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you have an email address? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Contact Email :");
				String email = input.next();
				this.setEmail(email);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setEmail("X");
				break;
			}
			else {

			}
		}
		
		answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you have an address? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Contact Address :");
				String address = input.next();
				this.setAddress(address);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setAddress("X");
				break;
			}
			else {

			}
		}
	}
}