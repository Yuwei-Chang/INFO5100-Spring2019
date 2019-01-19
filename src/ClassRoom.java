class ClassRoom {
	short roomNumber;
	int capacity;
	float length, breadth;
	boolean hasProjector;
	String buildingName;
	char[] address;

	public static void main(String args[]) {
		ClassRoom oneFourThree = new ClassRoom();
		System.out.println(oneFourThree.capacity);
		University northEasternUniversity = new University();
		System.out.println(northEasternUniversity.dean);
	}

}

class University {
	ClassRoom[] classRoom;
	String cityOfLocation;
	Dean dean;
	Professor[] professor;
}

class Professor {

	boolean canTeach(int age, boolean gender) {
		if( age > 20 && gender == true) {
			return true;
		}
		if( age > 18 && gender == false) {
			return true;
		}
		return false;
	}
}

class Dean {

}
