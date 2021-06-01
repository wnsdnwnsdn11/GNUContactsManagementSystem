package Gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ContactViewer extends JFrame {

	public ContactViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Number");
		model.addColumn("E-mail");
		model.addColumn("Address");

		JTable table =new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}