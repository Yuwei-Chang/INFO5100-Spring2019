package class5;

import java.util.Scanner;

import class3.Driver;
//import class3.Driver;
import class4.ClassRoom;

public class PackageTest {

	public static void main(String[] args) {

		class3.Driver driver;
		ClassRoom.main(args);
		ClassRoom cr = new ClassRoom();
		cr.location = "ABC";

		class3.ClassRoom classRoom;

		Scanner scanner = new Scanner(System.in);
		System.out.println("God is great");

		Driver a;
		Driver b;
		Driver c;

		new PackageTest().display();
		new PackageTest().display();
	}

	public void display() {
		System.out.println(hashCode());
	}

}

class AdvancedClassRoom extends ClassRoom {
	public void doSomething() {
		roomNumber = "200";
	}
}
