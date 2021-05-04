package Contact;

import java.util.Scanner;

public class RestuarantsContact extends Contact {
	
	public RestuarantsContact(ContactKind kind) {
		super(kind);
	}

	protected String branchAddress;
	protected String branchnumber;
	
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
			System.out.print("Do you have an Email? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Contact email :");
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
				System.out.print("Contact address :");
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
		
		answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you have a branch's address? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("branch's address :");
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
		System.out.println("kind:" + skind + " name:" + name + " number:" + number + " email:" + email + " address:" + address + " branch's address:" + address);
	}
}
