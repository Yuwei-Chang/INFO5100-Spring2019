package class6.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentGroupArrayImplementation implements StudentGroup {

	private Student[] students = new Student[2];
	int count = 0;

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void addStudent(Student s) {
		expandStudentArrayIfNeeded();
		students[count] = s;
		count++;

	}

	private void expandStudentArrayIfNeeded() {
		if (count == students.length) {
			System.out.println("Expanding students group -> " + count + " to " + count * 2);
			Student newStudents[] = new Student[count * 2];
			for (int i = 0; i < students.length; i++) {
				newStudents[i] = students[i];
			}
			this.students = newStudents;
		}

	}

	@Override
	public Student findStudent(int roll) {
		for (Student s : students) {
			if (s == null)
				continue;
			if (s.roll == roll) {
				return s;
			}

		}
		return null;
	}

	@Override
	public void deleteStudent(int roll) {
		for (int i = 0; i < count; i++) {
			if (students[i].roll == roll) {
				Student s = students[count - 1];
				students[i] = s;
				count--;
				return;
			}
		}

	}

	@Override
	public void modifyStudent(int roll, String name) {
		for (Student s : students) {
			if (s == null)
				continue;
			if (s.roll == roll) {
				s.name = name;
				return;
			}
		}

	}

	@Override
	public void displayStudents() {
		System.out.print("[");
		for (Student s : students) {
			System.out.print(s + ",");
		}
		System.out.println("]");

	}

	@Override
	public List<Student> getStudents() {
		return Arrays.asList(students);
	}

}
