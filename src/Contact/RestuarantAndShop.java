package Contact;

import java.util.Scanner;

import Exception.EmailFormatException;

public abstract class RestuarantAndShop extends Contact {

	public RestuarantAndShop(ContactKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUesrInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + "name:" + name + "  number:" + number + "  email:" + email + " address :" + address);
	}

	public void setContactEmailwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you have an email address? (Y/N)");
			answer = input.next().charAt(0);
			try {	
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
			catch(EmailFormatException e) { 
				System.out.println("Incorrect Email Format. Put the e-mail address that contains @");
			}
		}
	}

	public void setContactAddresswithYN(Scanner input) {
		char answer = 'x';
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
