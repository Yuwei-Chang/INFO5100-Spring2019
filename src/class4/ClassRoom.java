package class4;

public class ClassRoom {
	String name;
	private int totalNumberOfStudents;
	public String location;
	protected String roomNumber;

	public static void main(String args[]) {
		Student[] students = new Student[3];
		// student[0] = new Student();
		Student student = new MaleStudent();
		// MaleStudent ms = new Student();
		students[0] = new FemaleStudent();
		students[1] = new FemaleStudent();
		students[2] = new MaleStudent();
		for (Student s : students) {
			s.speak();
		}
	}
}

class Student {
	public void speak() {
		System.out.println("Student is speaking");
	}

}

class MaleStudent extends Student {
	public void speak() {
		System.out.println("Male is speaking");
	}
}

class FemaleStudent extends Student {
	public void speak() {
		System.out.println("Female is speaking");
	}
}