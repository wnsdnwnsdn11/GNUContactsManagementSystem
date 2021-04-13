import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ContactManager contactManager = new ContactManager(input);
		int num = 0;

		while(num != 6) {
			System.out.println("GNUContacts Magament System Menu");
			System.out.println("1. Add Contact");
			System.out.println("2. Delete Contact");
			System.out.println("3. Edit Contact");
			System.out.println("4. View Contacts");
			System.out.println("5. Developer Information");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6");
			num = input.nextInt();
			if (num == 1) {
				contactManager.AddContact();
			}
			else if(num == 2) {
				contactManager.DeleteContact();
			}
			else if(num == 3) {
				contactManager.EditContact();
			}
			else if(num == 4) {
				contactManager.ViewContact();
			}
			else if(num == 5) {
				contactManager.DeveloperInformation();
			}
			else {
				continue;
			}
		}
	}
}
