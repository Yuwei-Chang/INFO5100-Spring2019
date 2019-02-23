package class6.collections;

public interface StudentGroup {
	public int getCount();

	public void addStudent(Student s);

	public Student findStudent(int roll);

	public void deleteStudent(int roll);

	public void modifyStudent(int roll, String name);

	public void displayStudents();

}

class Student {
	String name;
	int roll;

	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	public String toString() {
		return "(" + name + "," + roll + ")";
	}
}