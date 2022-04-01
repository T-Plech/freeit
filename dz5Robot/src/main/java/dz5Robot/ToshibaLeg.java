package dz5Robot;

public class ToshibaLeg implements ILeg {

	int price;
	public ToshibaLeg(int price) {
		this.price=price;
	}
	
	public ToshibaLeg() {
	}

	public void step() {
		
		System.out.println("Я не умею ходить, но я чуть-чуть подъеду. Toshiba");

	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "ToshibaLeg";
	}
	
	

}
