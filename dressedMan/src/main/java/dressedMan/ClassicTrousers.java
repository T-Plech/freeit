package dressedMan;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class ClassicTrousers implements Trousers {
	
	String color;
	int price;

	public ClassicTrousers() {
		
	}

	public void putOn() {
		System.out.println("Брюки одеты");
	
	}

	public void takeOff() {
		
		System.out.println("Брюки сняты");	
	}

}
