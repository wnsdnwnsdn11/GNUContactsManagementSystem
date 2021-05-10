package Contact;

import java.util.Scanner;

public interface ContactInput {
	
	public String getName();

	public void setName(String name); 

	public void setNumber(String number);

	public void setEmail(String email);

	public void setAddress(String address);

	public void getUesrInput(Scanner input);

	public void printInfo();
}
