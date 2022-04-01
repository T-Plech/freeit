package dressedMan;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class NoNameJacket implements Jacket {
	
	String season;
	int price;
	
	
	public NoNameJacket() {
	
	}

	public void dressUp() {
		System.out.println("Куртка одета");

	}

	public void unDress() {
		
		System.out.println("Куртка снята");

	}

}
