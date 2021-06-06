package Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Manager.ContactManager;

public class WindowFrame extends JFrame {

	ContactManager contactManager;
	MenuSelection menuselection;
	ContactAdder Contactadder;
	ContactViewer contactviewer;

	public WindowFrame(ContactManager contactManager) {

		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.contactManager = contactManager;
		this.menuselection = new MenuSelection(this);
		this.Contactadder = new ContactAdder(this);
		this.contactviewer = new ContactViewer(this, this.contactManager);
		
		this.add(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public ContactAdder getContactadder() {
		return Contactadder;
	}

	public void setContactadder(ContactAdder contactadder) {
		Contactadder = contactadder;
	}

	public ContactViewer getContactviewer() {
		return contactviewer;
	}

	public void setContactviewer(ContactViewer contactviewer) {
		this.contactviewer = contactviewer;
	}
}
