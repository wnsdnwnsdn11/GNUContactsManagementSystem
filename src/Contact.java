
public class Contact {

	String name;
	String number;
	String email;
	String address;
	
	public Contact() {
		
	}
		
	public Contact(String name, String number, String email, String address) {
		this.name = name;
		this.number = number;
		this.email = email;
		this.address = address;
	}
	
	public void printInfo() {
		System.out.println("name:" + name + "  number:" + number + "  email:" + email + "  address :" + address);
	}
}
