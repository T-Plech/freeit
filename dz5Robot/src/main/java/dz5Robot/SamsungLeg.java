package dz5Robot;

public class SamsungLeg implements ILeg {

	int price;
	public SamsungLeg(int price) {
		this.price=price;
	}
	
	public SamsungLeg() {
	}

	public void step() {
		System.out.println("Топ. Samsung");

	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "SamsungLeg";
	}

	
	
	
}
