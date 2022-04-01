package dressedMan;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class AddidasSneakers implements Shoes {
	
	int price;

	public AddidasSneakers() {
		
	}

	public void putOn() {

		System.out.println("Кроссы одеты, идем бегать");
		
	}

	public void takeOff() {
		System.out.println("Кроссы сняты. Душ");

	}

}
