package dz5Transport;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor


public abstract class Transport {
	int power;
	int speedMax;
	double weight;
	String brand;
	
	public double powerInKw() {
		return (power*0.74);
	}

	@Override
	public String toString() {
		return "Transport power=" + power + "�.�., powerInKw= "
				+ powerInKw() + "���" +
				" , speedMax=" + speedMax + "��/�" +
				" , weight=" + weight + "��" +
				" , brand=" + brand;
	}

	
	
}
