package class9;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class BaseStudentRegistration extends JFrame {
	protected JLabel nameLabel, rollLabel;
	protected JTextField nameText, rollText;

	public BaseStudentRegistration() {
		createComponents();
		addComponents();
		addListeners();
		makeItVisible();
	}

	protected abstract void addComponents();

	protected abstract void addListeners();

	private void createComponents() {
		nameLabel = new JLabel("Name", JLabel.RIGHT);
		rollLabel = new JLabel("Roll", JLabel.RIGHT);
		nameText = new JTextField(10);
		rollText = new JTextField(10);
		createMoreComponents();
	}

	protected abstract void createMoreComponents();

	private void makeItVisible() {
		this.setSize(500, 500);
		this.setVisible(true);
		this.pack();

	}

}