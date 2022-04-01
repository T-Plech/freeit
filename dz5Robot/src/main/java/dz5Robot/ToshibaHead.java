package dz5Robot;

public class ToshibaHead implements IHead {

	int price;
	
	public ToshibaHead(int price) {
		this.price = price;
	}
	
	public ToshibaHead() {
		
	}

	public void speek() {
		System.out.println("Говорит голова Toshiba");
		
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "ToshibaHead";
	}
	
	

}
