package Manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import Gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ContactManager contactManager = getObject("contactmanager.ser");
		if(contactManager == null) {
			contactManager = new ContactManager(input);
		}
		
		WindowFrame frame = new WindowFrame(contactManager);
		selectMenu(input, contactManager);
		putObject(contactManager,"contactmanager.ser");
	} 

	public static void selectMenu(Scanner input, ContactManager contactManager) {
		int num = -1;
		while(num != 6) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					contactManager.AddContact();
					logger.log("add a contact");
					break;
				case 2:
					contactManager.DeleteContact();
					logger.log("delete a contact");
					break;
				case 3:
					contactManager.EditContact();
					logger.log("edit a contact");
					break;
				case 4:
					contactManager.ViewContact();
					logger.log("view a contact");
					break;
				case 5:
					contactManager.DeveloperInformation();
					logger.log("DeveloperInformation");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put a integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() { 
		System.out.println("****GNUContacts Magament System Menu****");
		System.out.println("1. Add Contact");
		System.out.println("2. Delete Contact");
		System.out.println("3. Edit Contact");
		System.out.println("4. View Contacts");
		System.out.println("5. Developer Information");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6");
	}

	public static ContactManager getObject(String filename) {
		ContactManager contactManager = null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			contactManager = (ContactManager)in.readObject();

			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return contactManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return contactManager;
	}

	public static void putObject(ContactManager contactManager, String filename) {
		try {
			FileOutputStream  file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(contactManager);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
