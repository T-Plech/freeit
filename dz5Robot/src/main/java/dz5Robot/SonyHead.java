package dz5Robot;

public class SonyHead implements IHead {
	
	private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    public void speek() {
        System.out.println("Говорит голова Sony");
    }

    public int getPrice() {
        return price;
    }

	@Override
	public String toString() {
		return "SonyHead";
	}
    
    
    
}
