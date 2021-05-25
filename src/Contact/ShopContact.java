package Contact;

import java.util.Scanner;

public class ShopContact extends RestuarantAndShop {

	public ShopContact(ContactKind kind) {
		super(kind);
	}

	public void getUesrInput(Scanner input) {
		setContactName(input);
		setContactNumber(input);
		setContactEmailwithYN(input);
		setContactAddresswithYN(input);
	}
}


