package dz5Robot;

public class SamsungHead implements IHead {

	int price;
	
	public SamsungHead(int price) {
		this.price = price;
	}
	
	public SamsungHead() {
	}

	public void speek() {
		
		System.out.println("Говорит голова Samsung");
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "SamsungHead";
	}

	
	
}
