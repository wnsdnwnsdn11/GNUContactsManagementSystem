package Contact;

import java.util.Scanner;

public abstract class Contact {
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

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public abstract void printInfo();
}

