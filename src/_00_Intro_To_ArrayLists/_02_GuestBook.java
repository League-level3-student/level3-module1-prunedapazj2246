package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	/*
	 * Create a GUI with two buttons. One button reads "Add Name" and the other
	 * button reads "View Names". When the add name button is clicked, display an
	 * input dialog that asks the user to enter a name. Add that name to an
	 * ArrayList. When the "View Names" button is clicked, display a message dialog
	 * that displays all the names added to the list. Format the list as follows:
	 * Guest #1: Bob Banders Guest #2: Sandy Summers Guest #3: Greg Ganders Guest
	 * #4: Donny Doners
	 */

	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton viewn = new JButton();
	JButton addn = new JButton();
	static ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {

		names.add("Guest #1: Bob Banders");
		names.add("Guest #2: Sandy Summers");
		names.add("Guest #3: Greg Ganders");
		names.add("Guest #4: Donny Doners");

		_02_GuestBook gb = new _02_GuestBook();
		gb.setup();
	}

	public void setup() {
		viewn.addActionListener(this);
		viewn.setText("View Names");
		addn.addActionListener(this);
		addn.setText("Add Names");
		p.add(addn);
		p.add(viewn);
		f.add(p);
		f.setVisible(true);
		f.setSize(1000, 1000);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == viewn) {
			JOptionPane.showMessageDialog(null, names);
		}

		else if (e.getSource() == addn) {
			String add = JOptionPane.showInputDialog("What name would you like to add?");
			if (add == null) {

			}

			else {
				names.add(add);
			}
		}
	}
}
