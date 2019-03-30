package class8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import class6.collections.Student;
import class6.collections.StudentGroup;
import class6.collections.StudentGroupArrayListImplementation;

public class StudentGroupFileImplementation implements StudentGroup {

	private StudentGroup sg = new StudentGroupArrayListImplementation();
	FileOutputStream fos;
	File file;

	public StudentGroupFileImplementation() throws FileNotFoundException {
		file = new File("//Users/sdosapati/Downloads/students.txt");
		readStudentsFromFile();
		fos = new FileOutputStream(file);
	}

	private void readStudentsFromFile() throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileInputStream(file));
		while (scanner.hasNextLine()) {
			String s = scanner.nextLine();
			String tokens[] = s.split("\\,");
			Student st = new Student(tokens[1], Integer.parseInt(tokens[0]));
			sg.addStudent(st);
		}
		sg.displayStudents();

	}

	@Override
	public int getCount() {
		return sg.getCount();
	}

	@Override
	public void addStudent(Student s) {
		sg.addStudent(s);
		flushStudentsToFile();

	}

	public void flushStudentsToFile() {
		List<Student> students = sg.getStudents();
		System.out.println(students);
		for (Student s : students) {
			addStudentToFile(s);
		}
		try {
			fos.close();
			fos = new FileOutputStream(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void addStudentToFile(Student s) {
		String output = s.getRoll() + "," + s.getName() + "\n";
		byte b[] = output.getBytes();
		try {
			fos.write(b);
			fos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Student findStudent(int roll) {
		return sg.findStudent(roll);
	}

	@Override
	public void deleteStudent(int roll) {
		sg.deleteStudent(roll);
		flushStudentsToFile();

	}

	@Override
	public void modifyStudent(int roll, String name) {
		sg.modifyStudent(roll, name);
		flushStudentsToFile();

	}

	@Override
	public void displayStudents() {
		sg.displayStudents();

	}

	@Override
	public List<Student> getStudents() {
		return sg.getStudents();
	}

}
