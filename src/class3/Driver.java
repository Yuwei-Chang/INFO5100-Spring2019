package class3;

public class Driver {
	
	void drive() {
		//openDoor();
		//getSeatedInTheDriverSeat();
		//changeGears();
		//driveOnTheRoad();
		//applyBrakes();
		//changeLanes();
		//accelerate();
	}

	public static void main(String args[]) {
		DriverWithoutAbstraction rekha = new DriverWithoutAbstraction();
		rekha.drive();
	}

}

class DriverWithoutAbstraction {
	void drive() {
		System.out.println("Open the Door");
		System.out.println("Get seated in the driver seat");
		System.out.println("Start the Engine");
		System.out.println("Identify the Gear you are currently in");
		System.out.println("Move the Gear Jack to the targeted gear");
		System.out.println("Ensure that car is driving at the desired speed in the new gear");
		System.out.println("Push the Accelerator");
		System.out.println("Increase the speed by pushing the accelerator");
		System.out.println("Press the Brakes by your leg");
		System.out.println("Ensure that vehicle is completely stopped");
		System.out.println("Validate that no one is around");
		System.out.println("Push the Accelerator again");
		System.out.println("Change lanes when it is safe to do so");

	}

	void applyBrakes() {
		System.out.println("Press the Brakes by your leg");
		System.out.println("Ensure that vehicle is completely stopped");
		System.out.println("Validate that no one is around");

	}

	void switchGears() {
		System.out.println("Identify the Gear you are currently in");
		System.out.println("Move the Gear Jack to the targeted gear");
		System.out.println("Ensure that car is driving at the desired speed in the new gear");

	}

	void accelerate() {

	}

	void changeLanes() {

	}
}
