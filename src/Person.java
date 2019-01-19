
public class Person {
	char name[];

	public static void main(String args[]) {
		Person siva = new Person();
		siva.name = new char[] { 's', 'i', 'v', 'a' };
		siva.name = new char[] { 'c', 'v', 'a' };
		System.out.println(siva.name.length);
		siva.name[0] = 'd';
		System.out.println(siva.name);

		Teacher cva = new Teacher();
		cva.name = new String("Siva");
		System.out.println(cva.name.length());
		System.out.println(cva.name.contains("i"));
		Teacher robert = new Teacher();
		robert.name = "Siva";
		Teacher bob = new Teacher();
		bob.name = "Si" + "va";
		Teacher john = new Teacher();
		john.name = new String("Siva");
		cva.name = "Siva";
		cva.age = 40;
		cva.degree = new Degree();
	}
}

class Teacher {
	String name;
	int age;
	Degree degree;
}

class Degree {

}
