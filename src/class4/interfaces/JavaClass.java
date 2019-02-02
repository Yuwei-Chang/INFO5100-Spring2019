package class4.interfaces;

public class JavaClass {

	public static void main(String[] args) {
		Student amanda = new Student();
		EngineeringDirector siva = new EngineeringDirector();
		amanda.learnFromEngineeringDirector(siva);
		Student phoenix = new Student();
		for (int i = 0; i < 10; i++) {
			Teacher t = makeTeacher();
			phoenix.learn(t);
		}

	}

	private static Teacher makeTeacher() {
		int x = getRandom(10);
		if (x < 3) {
			return new EngineeringDirector();
		}
		if (x < 6) {
			return new TA();
		}
		return new EnthusiasticStudent();
	}

	private static int getRandom(int x) {
		return (int) (Math.random() * x);
	}

}

class Student {
	void learn(Teacher teacher) {
		teacher.teach();
	}

	void learnFromEngineeringDirector(EngineeringDirector ed) {
		ed.teach();
	}
}

interface Teacher {
	public void teach();
}

class EngineeringDirector implements Teacher {

	@Override
	public void teach() {
		System.out.println("Experienced Professional is teaching class");

	}

}

class TA implements Teacher {

	@Override
	public void teach() {
		System.out.println("TA is teaching class");
	}

}

class EnthusiasticStudent extends Student implements Teacher {

	@Override
	public void teach() {
		System.out.println("Passionate student is teaching the class");

	}

}