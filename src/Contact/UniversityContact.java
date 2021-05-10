package Contact;

import java.util.Scanner;

public class UniversityContact extends Contact implements ContactInput {

	public UniversityContact(ContactKind kind) {
		super(kind);
	}

	public void getUesrInput(Scanner input) {
		System.out.print("Contact Name :");
		String name = input.next();
		this.setName(name);

		System.out.print("Contact Number :");
		String number = input.next();
		this.setNumber(number);

		System.out.print("Contact Email :");
		String email = input.next();
		this.setEmail(email);

		System.out.print("Contact Address :");
		String address = input.next();
		this.setAddress(address);
	}

	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case University:
			skind = "Univ.";
			break;
		case Shops:
			skind = "Shops.";
			break;
		case Restaurants:
			skind = "Restaurants";
			break;
		default:
		}
		System.out.println("kind: " + skind + "name:" + name + "  number:" + number + "  email:" + email + "  				 address :" + address);
	}
}
