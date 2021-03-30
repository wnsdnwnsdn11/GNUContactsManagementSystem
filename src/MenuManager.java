import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 7) {
			System.out.println("GNUContacts Magament System Menu");
			System.out.println("1. Add Contacts");
			System.out.println("2. Delete Contacts");
			System.out.println("3. Edit Contacts");
			System.out.println("4. View Contacts");
			System.out.println("5. Developer Information");
			System.out.println("6. Show Menu");
			System.out.println("7. Exit");
			System.out.println("Select one number between 1-7");
			num = input.nextInt();
			if (num == 1) {
				AddContacts();
			}
			else if(num == 2) {
				deleteContacts();
			}
			else if(num == 3) {
				EditContacts();
			}
			else if(num == 4) {
				ViewContacts();
			}
			else if(num == 5) {
				DeveloperInformation();
			}
			else {
				continue;
			}
		}
	}
	
	public static void AddContacts() {
		Scanner input = new Scanner(System.in);
		System.out.print("Contacts Name :");
		String ContactsName = input.next();
		System.out.print("Contacts Number :");
		int ContactsNumber = input.nextInt();
		System.out.print("Contacts Email :");
		String ContactsEmail = input.next();
		System.out.println(ContactsEmail);
		System.out.print("Contacts Address :");
		String ContactsAddress = input.next();
		System.out.println(ContactsAddress);
	}
	
	public static void deleteContacts() {
		Scanner input = new Scanner(System.in);
		System.out.print("Contacts Name :");
		String ContactsName = input.next();
	}
	public static void EditContacts() { 
		Scanner input = new Scanner(System.in);
		System.out.print("Contacts Name :");
		String ContactsName = input.next();
	}
	public static void ViewContacts() {
		Scanner input = new Scanner(System.in);
		System.out.print("Contacts Name :");
		String ContactsName = input.next(); 
	}
	public static void DeveloperInformation() { 
		System.out.println("Joonwoo Kweon:)");
	}
}
