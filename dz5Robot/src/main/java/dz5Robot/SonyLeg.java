package dz5Robot;

public class SonyLeg implements ILeg {

	int price;
	public SonyLeg(int price) {
		this.price=price;
	}
	
	public SonyLeg() {
	}

	public void step() {
		
		System.out.println("Шаг вперед Sony");
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "SonyLeg";
	}

	
	
	
}
