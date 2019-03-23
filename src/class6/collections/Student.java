package class6.collections;

public class Student {
	String name;
	int roll;

	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	public String toString() {
		return "(" + name + "," + roll + ")";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	

}
