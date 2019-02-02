package class4.interfaces;

class Picnic {
	public static void main(String args[]) {
		Person amisha = new Person();
		Camera c = new Camera();
		amisha.capture(c);
		iPhone ip = new iPhone();
		iPad ipad = new iPad();
		amisha.capture(ip);
		amisha.capture(ipad);
		Photographer ashwini = new Photographer();
		amisha.capture(ashwini);
	}

}

interface PictureCapturer {
	public void takePicture();
}

class Photographer implements PictureCapturer {

	@Override
	public void takePicture() {
		System.out.println("Photographer");

	}

}

class Person {

	void capture(PictureCapturer pc) {
		pc.takePicture();
	}
}

class ElectronicDevice {
}

class Camera extends ElectronicDevice implements PictureCapturer {
	public void takePicture() {
		System.out.println("Camera");
	}
}

class Phone {
}

class iPhone extends Phone implements PictureCapturer {
	public void takePicture() {
		System.out.println("iPhone");
	}

	void makePhoneCall() {
	}
}

class DigitalDevice {
}

class iPad extends DigitalDevice implements PictureCapturer {
	public void takePicture() {
		System.out.println("iPad");
	}

	void browseInternet() {
	}
}