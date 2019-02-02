package class4;

public class Home {
	public static void main(String args[]) {
		// Phone p = new Phone();
		iPhone ip = new iPhone();
		Phone p = ip;
		ip.makeCall(new iPhone());
		System.out.println("Done");
	}
}

abstract class Phone {
	float price;

	float getPrice() {
		return price;
	}

	void setPrice(float p) {
		this.price = p;
	}

	abstract void makeCall(Phone p);

	abstract void recieveCall(Phone p);
}

class iPhone extends Phone {

	void makeCall(Phone p) {
		System.out.println("iPhone can make phone calls");
	}

	@Override
	void recieveCall(Phone p) {
		// TODO Auto-generated method stub
		
	}

}

class FlipPhone extends Phone {
	void makeCall(Phone p) {
		System.out.println("Flipphone can also make phone calls");
	}

	@Override
	void recieveCall(Phone p) {
		// TODO Auto-generated method stub
		
	}

}