package class9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentGroups {

	public static void main(String[] args) {
		List<String> students = getStudents();
		int count = 0;
		while (true) {
			if (students.size() == 0)
				break;
			if (count % 4 == 0) {
				System.out.println("---------");
			}
			count++;
			int x = (int) (Math.random() * students.size());
			String s = students.remove(x);
			System.out.println(s);
		}

	}

	private static List<String> getStudents() {
		String[] students = new String[] { "Sidharth", "Amisha", "Rekha", "Priyanka", "Ashwini", "Jennifer", "Amanda",
				"Kate", "Phoenix", "Charlie", "Ashley", "Amy", "Jason", "Edison", "Larry", "Terry" };
		return new ArrayList(Arrays.asList(students));
	}

}
