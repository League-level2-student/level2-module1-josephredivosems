package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton();
	JButton displayName = new JButton();
	ArrayList<String> guest = new ArrayList<String>();
	String newName;
	String displayNames = "";
	boolean already = false;
	void setup() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(addName);
		panel.add(displayName);
		addName.setText("Add Name");
		displayName.setText("View Names");
		addName.addActionListener(this);
		displayName.addActionListener(this);
		frame.pack();
		guest.add("Bob Banders");
		guest.add("Sunny Sanders");
		guest.add("Greg Ganders");
		guest.add("Dony Doners");
	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == addName) {
			 newName = JOptionPane.showInputDialog("What name would you like to add?");
			displayNames = displayNames + newName + "\n";
		}
		if(arg0.getSource() == displayName) {
			for (int i = 0; i < guest.size(); i++) {
				if(already == false) {
				displayNames = displayNames +  guest.get(i) + "\n";
				}
			}
			JOptionPane.showMessageDialog(null, displayNames);
			already = true;
		}
	}
	
}
