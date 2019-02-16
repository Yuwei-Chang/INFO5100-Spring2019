package class5;

public class StaticTest {

	public static void main(String args[]) {
		VMWareEmployee.makeYourCEOSpeak();

		Employee siva = new Employee();
		siva.company = "Indeed";

		VMWareEmployee jason = new VMWareEmployee();
		jason.name = "Jason";
		jason.company = "vmware";
		jason.comeToOffice();
		// jason.attendCompanyMeeting();

		VMWareEmployee larry = new VMWareEmployee();
		larry.name = "Larry";
		VMWareEmployee.makeYourCEOSpeak();
		VMWareEmployee.vmWareCEO.name = "Siva Dosapati";
		// larry.vmWareCEO.name = "Amisha";
		VMWareEmployee.makeYourCEOSpeak();

	}

}

class Employee {
	String company;
	String name;
	CEO ceo;
	float salary;
}

class VMWareEmployee extends Employee {
	static CEO vmWareCEO = new CEO("Pat Gelsinger");

	public void comeToOffice() {
		System.out.println(name + " come to office");
	}

	public static void makeYourCEOSpeak() {
		vmWareCEO.speakToAllEmployees();
	}
}

class CEO {
	String name;

	CEO(String name) {
		this.name = name;
	}

	CEO() {

	}

	void speakToAllEmployees() {
		System.out.println(name + " is speaking to all employees");
	}

}

class Person {
	String name;
	int age;
	// static Earth earth;
	// Road roadOnWhichYouAreTravelling;
	// Place birthPlace;
}

class Student {
	Professor professorTeachingClass;
}

class Professor {

}