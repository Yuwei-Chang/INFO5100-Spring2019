package class6.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupArrayListImplementation implements StudentGroup {
	ArrayList<Student> students = new ArrayList<Student>();

	@Override
	public int getCount() {
		return students.size();
	}

	@Override
	public void addStudent(Student s) {
		students.add(s);
	}

	@Override
	public Student findStudent(int roll) {
		for (Student s : students) {
			if (s.roll == roll) {
				return s;
			}
		}
		return null;
	}

	@Override
	public void deleteStudent(int roll) {
		Student s = findStudent(roll);
		students.remove(s);

	}

	@Override
	public void modifyStudent(int roll, String name) {
		Student s = findStudent(roll);
		if (s != null) {
			s.name = name;
		}

	}

	@Override
	public void displayStudents() {
		System.out.println(students);

	}

	@Override
	public List<Student> getStudents() {
		return students;
	}

}
