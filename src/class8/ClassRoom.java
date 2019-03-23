package class8;

import java.io.FileNotFoundException;
import java.util.Scanner;

import class6.collections.Student;
import class6.collections.StudentGroup;

public class ClassRoom {

	public static void main(String[] args) throws FileNotFoundException {
		// StudentGroup sg = new StudentGroupArrayListImplementation();
		StudentGroup sg = new StudentGroupFileImplementation();
		manageStudents(sg);
	}

	private static void manageStudents(StudentGroup sg) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out
					.println("Enter the operation you want to perform(display, add, modify delete, find, count, exit)");
			String input = scanner.nextLine();
			if (input.equals("exit")) {
				System.out.println("Thank you. I'm done");
				break;
			}
			if (input.equals("modify")) {
				System.out.println("Please Enter Roll number");
				String roll = scanner.nextLine();
				System.out.println("Please enter Name");
				String name = scanner.nextLine();

				sg.modifyStudent(Integer.parseInt(roll), name);

			}
			if (input.equals("count")) {
				System.out.println(sg.getCount());
			}
			if (input.equals("add")) {
				System.out.println("Please Enter Roll number");
				String roll = scanner.nextLine();
				System.out.println("Please enter Name");
				String name = scanner.nextLine();
				Student s = new Student(name, Integer.parseInt(roll));
				sg.addStudent(s);

			}
			if (input.equals("delete")) {
				System.out.println("Please enter student roll number");
				int i = scanner.nextInt();
				sg.deleteStudent(i);
			}
			if (input.equals("find")) {
				System.out.println("Please enter student roll number");
				int i = scanner.nextInt();
				Student s = sg.findStudent(i);
				System.out.println(s);
			}
			if (input.equals("display")) {
				sg.displayStudents();
			}
		}

	}

}
