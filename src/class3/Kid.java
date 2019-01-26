package class3;

public class Kid {
	private String name;
	private int age;
	private int flag=0;

	public void setName(String name) {
		if (this.flag == 0) {
			flag=1;
			this.name = name;
		} else {
			throw new RuntimeException("Name can be only changed once.");
		}
		
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new RuntimeException("Age can't be less than 0");
		}
		if (this.age > age) {
			throw new RuntimeException(
					"My current age[" + this.age + "] is greater than the requested age[" + age + "]");
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	Kid(String name) {
		this.name = name;
		age = 0;
	}

	public String toString() {
		return "Name -> " + name + " Age -> " + age;
	}

	public void play() {
		System.out.println(name + " is playing");
	}
}
