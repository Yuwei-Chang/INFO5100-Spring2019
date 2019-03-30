package class9;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StudentRegistrationForm extends BaseStudentRegistration {

	JLabel courseLabel;

	JTextArea results;
	JList courseList;
	JButton next;

	StudentRegistrationForm() {
	}

	public void addListeners() {
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String name = nameText.getText();
				String roll = rollText.getText();
				java.util.List courses = courseList.getSelectedValuesList();
				results.setText("");
				results.append("Name : " + name + "\n");
				results.append("Roll : " + roll + "\n");
				results.append("Courses : \n");
				for (Object c : courses) {
					results.append("\t" + c + "\n");
				}

			}
		});

	}

	public void addComponents() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());

		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));

		panel.add(nameLabel);
		panel.add(nameText);
		panel.add(rollLabel);
		panel.add(rollText);
		panel.add(courseLabel);
		panel.add(courseList);

		JPanel bottom = new JPanel();
		bottom.add(next);
		bottom.add(results);
		con.add(panel, "Center");
		con.add(bottom, "South");

	}

	protected void createMoreComponents() {
		courseLabel = new JLabel("Courses", JLabel.RIGHT);
		courseList = new JList<>(new String[] { "Java", "Database", "Algorithms" });
		next = new JButton("Next");
		results = new JTextArea(20, 20);
	}

	public static void main(String[] args) {
		new StudentRegistrationForm();

	}

}
