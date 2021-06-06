package Gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Contact.ContactInput;
import Manager.ContactManager;

public class ContactViewer extends JPanel {
	
	WindowFrame frame;

	ContactManager contactManager;
	
	public ContactViewer(WindowFrame frame, ContactManager contactManager) {
		this.frame = frame;
		this.contactManager = contactManager;
		
		System.out.println("***" + contactManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Number");
		model.addColumn("E-mail");
		model.addColumn("Address");
		
		for(int i = 0; i < contactManager.size(); i++) {
			Vector row = new Vector();
			ContactInput ci = contactManager.get(i);
			row.add(ci.getName());
			row.add(ci.getNumber());
			row.add(ci.getEmail());
			row.add(ci.getAddress());
			model.addRow(row);
		}

		JTable table =new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}
}