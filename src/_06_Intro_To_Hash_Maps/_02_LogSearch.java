package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	public static void main(String[] args) {
		_02_LogSearch log= new _02_LogSearch();
		log.buttons();
	}
    /*
     * Crate a HashMap of Integers for the keys and Strings for the values.
     * Create a GUI with three buttons.
     * Button 1: Add Entry
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      After an ID is entered, use another input dialog to ask the user
     *      to enter a name. Add this information as a new entry to your
     *      HashMap.
     * 
     * Button 2: Search by ID
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      If that ID exists, display that name to the user.
     *      Otherwise, tell the user that that entry does not exist.
     * 
     * Button 3: View List
     *      When this button is clicked, display the entire list in a message
     *      dialog in the following format:
     *      ID: 123  Name: Harry Howard
     *      ID: 245  Name: Polly Powers
     *      ID: 433  Name: Oliver Ortega
     *      etc...
     * 
     * When this is complete, add a fourth button to your window.
     * Button 4: Remove Entry
     *      When this button is clicked, prompt the user to enter an ID using
     *      an input dialog.
     *      If this ID exists in the HashMap, remove it. Otherwise, notify the
     *      user that the ID is not in the list.
     */
	HashMap<Integer,String> map = new HashMap<Integer, String>();
JFrame f = new JFrame();
JPanel p = new JPanel();
JButton b1 = new JButton();
JButton b2 = new JButton();
JButton b3 = new JButton();
JButton b4= new JButton();
public void buttons() {
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b1.setText("add ID and Name");
	b2.setText("Search Name");
	b3.setText("view list");
	b4.setText("Remove ID");
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	f.add(p);
	f.setVisible(true);
	f.setSize(500, 500);
	map.put(123, "Harry Howard");
	map.put(245, "Polly Powers");
	map.put(433, "Oliver Ortega");
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1) {
	String s=	JOptionPane.showInputDialog("Enter an ID number");
	int id = Integer.parseInt(s);
	String string= JOptionPane.showInputDialog("Enter a name");
	map.put(id, string);
	}
	
	if(e.getSource()==b2) {
		String s=JOptionPane.showInputDialog("enter a ID number");
		int id=Integer.parseInt(s);
		for (int key  : map.keySet()) {
			if(key == id) {
				JOptionPane.showMessageDialog(null, map.get(key));
			}
			else if(key!=id) {
				JOptionPane.showMessageDialog(null, "No ID number exists");
			}
		}
	}
	
	if(e.getSource()==b3) {
		for (int key  : map.keySet()) {
			JOptionPane.showMessageDialog(null, "ID: " + key+" Name: "+ map.get(key) );
		}
	}
	
	if(e.getSource()==b4) {
		String s= JOptionPane.showInputDialog("Enter an ID number");
		int ID =Integer.parseInt(s);
		for (int key  : map.keySet()) {
		if(key==ID) {
			map.remove(key);
			JOptionPane.showMessageDialog(null, "The ID was removed");
		}
		else {
			JOptionPane.showMessageDialog(null, "No ID number was found");
		}
	}
}
}
}
