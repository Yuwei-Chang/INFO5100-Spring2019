package class6.collections;

import java.util.List;

public interface StudentGroup {
	public int getCount();

	public void addStudent(Student s);

	public Student findStudent(int roll);

	public void deleteStudent(int roll);

	public void modifyStudent(int roll, String name);

	public void displayStudents();

	public List<Student> getStudents();

}
