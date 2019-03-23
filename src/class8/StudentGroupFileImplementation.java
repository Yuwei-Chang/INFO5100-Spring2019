package class8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import class6.collections.Student;
import class6.collections.StudentGroup;
import class6.collections.StudentGroupArrayListImplementation;

public class StudentGroupFileImplementation implements StudentGroup {

	private StudentGroup sg = new StudentGroupArrayListImplementation();
	FileOutputStream fos;
	File file;

	StudentGroupFileImplementation() throws FileNotFoundException {
		file = new File("//Users/sdosapati/Downloads/students.txt");
		fos = new FileOutputStream(file, true);
		readStudentsFromFile();

	}

	private void readStudentsFromFile() throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileInputStream(file));
		while (scanner.hasNextLine()) {
			String s = scanner.nextLine();
			String tokens[] = s.split("\\,");
			Student st = new Student(tokens[1], Integer.parseInt(tokens[0]));
			sg.addStudent(st);
		}

	}

	@Override
	public int getCount() {
		return sg.getCount();
	}

	@Override
	public void addStudent(Student s) {
		sg.addStudent(s);
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

	}

	@Override
	public void modifyStudent(int roll, String name) {
		sg.modifyStudent(roll, name);

	}

	@Override
	public void displayStudents() {
		sg.displayStudents();

	}

}
