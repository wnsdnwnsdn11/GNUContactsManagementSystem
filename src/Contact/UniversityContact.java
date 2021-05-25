package Contact;

import java.util.Scanner;

public class UniversityContact extends Contact {

	public UniversityContact(ContactKind kind) {
		super(kind);
	}

	public void getUesrInput(Scanner input) {
		setContactName(input);
		setContactNumber(input);
		setContactEmail(input);
		setContactAddress(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + "name:" + name + "  number:" + number + "  email:" + email + " address :" + address);
	}
}
