package Contact;

import java.util.Scanner;

public class Contact {
	protected ContactKind kind = ContactKind.University;
	protected String name;
	protected String number;
	protected String email;
	protected String address;

	public Contact() {

	}

	public Contact(String name, String number, String email, String address) {
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

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void printInfo() {
		System.out.println("name:" + name + "  number:" + number + "  email:" + email + "  address :" + address);
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
}
