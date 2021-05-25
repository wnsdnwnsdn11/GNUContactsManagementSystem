package Contact;

import java.util.Scanner;

public class RestuarantsContact extends RestuarantAndShop {

	protected String branchAddress;
	protected String branchnumber;

	public RestuarantsContact(ContactKind kind) {
		super(kind);
	}

	public void getUesrInput(Scanner input) {
		setContactName(input);
		setContactNumber(input);
		setContactEmailwithYN(input);
		setContactAddresswithYN(input);
		setBranchAddresswithYN(input);
	}

	public void setBranchAddresswithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')	{
			System.out.print("Do you have a branch's address? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				setContactAddress(input);
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
		String skind = getKindString();
		System.out.println("kind:" + skind + " name:" + name + " number:" + number + " email:" + email + " address:" + address + " branch's address:" + address);
	}
}



