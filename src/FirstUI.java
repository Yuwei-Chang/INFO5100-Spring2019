import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FirstUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setTitle("My First UI Application");

		JButton button = new JButton("Click me");

		Container con = frame.getContentPane();

		FlowLayout fl = new FlowLayout();

		con.setLayout(fl);

		con.add(button);
		con.add(new JButton("Dummy Button"));

		ClickMeListener listener = new ClickMeListener();

		button.addActionListener(listener);

		frame.setSize(400, 500);
		frame.setVisible(true);

	}

	static class ClickMeListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "I clicked a button", "", 0);

		}

	}

}
