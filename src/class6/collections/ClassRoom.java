package class6.collections;

public class ClassRoom {

	public static void main(String[] args) {
		// StudentGroup sg = new StudentGroupArrayImplementation();
		// StudentGroup sg = new StudentGroupArrayListImplementation();
		StudentGroup sg = new StudentGroupMapImplementation();
		sg.addStudent(new Student("Larry", 100));
		sg.addStudent(new Student("Phoenix", 101));
		sg.addStudent(new Student("Amanda", 102));
		sg.addStudent(new Student("Amy", 103));

		System.out.println("Total # of Students " + sg.getCount());
		sg.displayStudents();
		sg.modifyStudent(100, "Kobe");
		sg.displayStudents();

		sg.addStudent(new Student("Charlie", 104));
		sg.displayStudents();

		sg.addStudent(new Student("Ashlyn", 105));
		sg.displayStudents();
		sg.deleteStudent(102);
		sg.displayStudents();
		System.out.println(sg.getCount());
		sg.addStudent(new Student("Kate", 106));
		sg.displayStudents();
		System.out.println(sg.findStudent(103));
		System.out.println(sg.findStudent(125));
	}

}
