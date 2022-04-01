package dressedMan;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class DGShoes implements Shoes {
	
	String material;
	int price;

	public DGShoes() {
	
	}

	public void putOn() {
		System.out.println("Туфли DG одеты. Ходи аккуратно");

	}

	public void takeOff() {
		System.out.println("Туфли DG сняты. Отполируй и положи в коробку");

	}

}
