package Contact;

import java.util.Scanner;

import Exception.EmailFormatException;

public interface ContactInput {
	
	public String getName();

	public void setName(String name); 

	public void setNumber(String number);

	public void setEmail(String email) throws EmailFormatException;

	public void setAddress(String address);

	public void getUesrInput(Scanner input);

	public void printInfo();
	
	public void setContactName(Scanner input);
	
	public void setContactNumber(Scanner input);
	
	public void setContactEmail(Scanner input);
	
	public void setContactAddress(Scanner input);
}
