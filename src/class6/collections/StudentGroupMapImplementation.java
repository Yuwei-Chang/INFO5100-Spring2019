package class6.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGroupMapImplementation implements StudentGroup {

	Map<Integer, Student> students = new HashMap<Integer, Student>();

	@Override
	public int getCount() {
		return students.size();
	}

	@Override
	public void addStudent(Student s) {
		students.put(s.roll, s);

	}

	@Override
	public Student findStudent(int roll) {
		return students.get(roll);
	}

	@Override
	public void deleteStudent(int roll) {
		students.remove(roll);

	}

	@Override
	public void modifyStudent(int roll, String name) {
		Student s = students.get(roll);
		if (s == null)
			return;
		s.name = name;

	}

	@Override
	public void displayStudents() {
		System.out.println(students.values());

	}

	@Override
	public List<Student> getStudents() {
		return new ArrayList<Student>(students.values());
	}

}
