package class4;

public class Companay {

	public static void main(String[] args) {
		Employee[] employees = new Employee[100];
		makeEmployees(employees);
		for (Employee e : employees) {
			e.getBonus();
		}
		
		Manager manager[] = new Manager[100];
		Engineer engineer[] = new Engineer[100];
		
		ClassRoom cr = new ClassRoom();
		//cr.

	}

	private static void makeEmployees(Employee[] employees) {
		
		
	}

}

class Employee {
	public int getBonus() {
		return 1000;
	}
}

class Clerk extends Employee {
}

class Director extends Employee {
	public int getBonus() {
		return 10000;
	}
}

class Manager extends Employee {
}

class Engineer extends Employee {
	public int getBonus() {
		return 5000;
	}
}
