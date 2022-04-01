package dressedMan;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class SportTrousers implements Trousers {
	
	int price;

	public SportTrousers() {
		
	}

	public void putOn() {
		System.out.println("Спортивки одеты");

	}

	public void takeOff() {
		System.out.println("Спортивки сняты");

	}

}
