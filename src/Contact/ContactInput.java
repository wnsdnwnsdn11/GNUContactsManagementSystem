package Contact;

import java.util.Scanner;

import Exception.EmailFormatException;

public interface ContactInput {
	
	public String getName();

	public void setName(String name); 
	
	public void setNumber(String number);
	
	public String getNumber();

	public void setEmail(String email) throws EmailFormatException;

	public String getEmail();
	
	public void setAddress(String address);
	
	public String getAddress();

	public void getUesrInput(Scanner input);

	public void printInfo();
	
	public void setContactName(Scanner input);
	
	public void setContactNumber(Scanner input);
	
	public void setContactEmail(Scanner input);
	
	public void setContactAddress(Scanner input);
}
