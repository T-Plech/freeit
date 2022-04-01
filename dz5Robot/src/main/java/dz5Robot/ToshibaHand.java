package dz5Robot;

public class ToshibaHand implements IHand {
	
	int price;


	public ToshibaHand(int price) {
		this.price=price;		
	}
	
	public ToshibaHand() {
		}

	public void upHand() {
		
		System.out.println("Рука Toshiba поднята");		
	}

	public int getPrice() {
		
		return price;
	}

	@Override
	public String toString() {
		return "ToshibaHand";
	}
	
	

}
