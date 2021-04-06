
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
		System.out.println("name:" + name);
		System.out.println("number:" + number);
		System.out.println("email:" + email);
		System.out.println("address :" + address);
	}
}
