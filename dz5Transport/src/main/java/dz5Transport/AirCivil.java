package dz5Transport;

import lombok.Data;

@Data

public class AirCivil extends AirTransport {

	int numberOfPassenger;
	boolean isBusinessClass;
	
	public AirCivil(int power, int speedMax, double weight, String brand, double wingspan, int runwayLenghtMin,
			int numberOfPassenger, boolean isBusinessClass) {
		super(power, speedMax, weight, brand, wingspan, runwayLenghtMin);
		this.numberOfPassenger = numberOfPassenger;
		this.isBusinessClass = isBusinessClass;
	}

	@Override
	public String toString() {
		return "AirCivil" + super.toString() + 
				" ,numberOfPassenger=" + numberOfPassenger + 
				", isBusinessClass=" + isBusinessClass;
	}
	
	public void loadPassenger(int numberOfPassenger) {
		if(this.numberOfPassenger >= numberOfPassenger) {
			System.out.println("Посадка завершена");
			}
		else System.out.println("Вам нужен самолет по-больше");
	}
	
}
