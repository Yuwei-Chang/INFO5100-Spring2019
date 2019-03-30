package class9;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import class6.collections.Student;
import class6.collections.StudentGroup;
import class8.StudentGroupFileImplementation;

public class NEUStudentRegistrationForm extends BaseStudentRegistration {

	JButton add, delete, modify, show, count;

	JLabel resultsLabel;

	StudentGroup group;

	NEUStudentRegistrationForm(StudentGroup sg) {
		super();
		this.group = sg;
	}

	@Override
	protected void addComponents() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		addInputControls(con);
		addActionControls(con);

	}

	private void addActionControls(Container con) {
		JPanel panel = new JPanel();
		panel.add(add);
		panel.add(delete);
		panel.add(modify);
		panel.add(show);
		panel.add(count);
		panel.add(resultsLabel);
		con.add(panel, "South");

	}

	public void addStudent() {
		Student s = makeStudent();
		group.addStudent(s);
		updateLabel("Add", s);
	}

	private Student makeStudent() {
		String name = nameText.getText();
		String roll = rollText.getText();
		Student s = new Student(name, Integer.parseInt(roll));
		return s;
	}

	private void updateLabel(String operation, Student s) {
		resultsLabel.setText(operation + " -> " + s.toString());

	}

	public void modifyStudent() {
		Student s = makeStudent();
		Student existing = group.findStudent(s.getRoll());
		group.modifyStudent(s.getRoll(), s.getName());
		updateLabel("Modified : " + existing, s);
	}

	private void addInputControls(Container con) {
		GridLayout gl = new GridLayout(2, 2, 5, 5);
		JPanel panel = new JPanel();
		panel.setLayout(gl);
		panel.add(nameLabel);
		panel.add(nameText);
		panel.add(rollLabel);
		panel.add(rollText);
		con.add(panel, "Center");
	}

	@Override
	protected void addListeners() {
		add.addActionListener((e) -> addStudent());
		modify.addActionListener((e) -> modifyStudent());
		count.addActionListener((e) -> {
			int count = group.getCount();
			resultsLabel.setText("Total Students : " + count);
		});
		delete.addActionListener((e) -> {
			Student s = makeStudent();
			Student st = group.findStudent(s.getRoll());
			group.deleteStudent(s.getRoll());
			updateLabel("Deleted : ", s);
		});
		show.addActionListener((e) -> {
			group.displayStudents();
		});
	}

	@Override
	protected void createMoreComponents() {
		add = new JButton("Add");
		delete = new JButton("Delete");
		modify = new JButton("Modify");
		show = new JButton("Display");
		count = new JButton("Count");
		resultsLabel = new JLabel("");

	}

	public static void main(String[] args) throws FileNotFoundException {
		StudentGroup sg = new StudentGroupFileImplementation();
		new NEUStudentRegistrationForm(sg);

	}

}
