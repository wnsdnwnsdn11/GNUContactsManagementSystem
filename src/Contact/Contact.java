package Contact;

import java.io.Serializable;
import java.util.Scanner;

import Exception.EmailFormatException;

public abstract class Contact implements ContactInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4997049755574096205L;
	protected ContactKind kind = ContactKind.University;
	protected String name;
	protected String number;
	protected String email;
	protected String address;

	public Contact() {

	}

	public Contact(ContactKind kind) {
		this.kind = kind;
	}

	public Contact(String name, String number, String email, String address) {
		this.name = name;
		this.number = number;
		this.email = email;
		this.address = address;
	}

	public Contact(ContactKind kind, String number, String email, String address) {
		this.kind = kind;
		this.name = name;
		this.number = number;
		this.email = email;
		this.address = address;
	}

	public ContactKind getKind() {
		return kind;
	}

	public void setKind(ContactKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailFormatException {
		if (!email.contains("@") && !email.equals("")) {
			throw new EmailFormatException();
		}
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public abstract void printInfo();

	public void setContactName(Scanner input) {
		System.out.print("Contact Name: ");
		String name = input.next();
		this.setName(name);
	}

	public void setContactNumber(Scanner input) {
		System.out.print("Contact Number: ");
		String number = input.next();
		this.setNumber(number);
	}

	public void setContactEmail(Scanner input) {
		String email = "";
		while (!email.contains("@")) {
			System.out.print("Email address: ");
			email = input.next();	
			try {
				this.setEmail(email);
			} catch (EmailFormatException e) {
				System.out.println("Incorrect Email Format. Put the e-mail address that contains @");
			}
		}
	}

	public void setContactAddress(Scanner input) {
		System.out.print("Address :");
		String address = input.next();
		this.setAddress(address);
	}

	public String getKindString() {
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
		return skind;
	}
}

