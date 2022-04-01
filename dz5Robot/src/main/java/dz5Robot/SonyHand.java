package dz5Robot;

public class SonyHand implements IHand {
	
	int price;
	public SonyHand(int price) {
		this.price = price;
	}

	public SonyHand() {
	}

	public void upHand() {
		
		System.out.println("Поднята рука Sony");

	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "SonyHand";
	}
	
	

}
