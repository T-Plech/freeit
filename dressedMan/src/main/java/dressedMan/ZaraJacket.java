package dressedMan;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class ZaraJacket implements Jacket {

	String season;
	int price;
		
	public ZaraJacket() {
		
	}

	public void dressUp() {
		System.out.println("Куртка Zara" + season + " одета");
	}

	public void unDress() {
		System.out.println("Куртка Zara снята");
	}

}
