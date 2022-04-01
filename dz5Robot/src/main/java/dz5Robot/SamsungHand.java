package dz5Robot;

public class SamsungHand implements IHand {

	int price;
	public SamsungHand(int price) {
		this.price=price;
	}
	
	public SamsungHand() {
	}

	public void upHand() {
		System.out.println("Поднята рука Samsung");

	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "SamsungHand";
	}
	
	

}
