package dz5Transport;

import lombok.Data;

@Data

public class MilitaryAir extends AirTransport {
	
	boolean ejectionSystem;
	int countOfMissiles;
	public MilitaryAir(int power, int speedMax, double weight, String brand, double wingspan, int runwayLenghtMin,
			boolean ejectionSystem, int countOfMissiles) {
		super(power, speedMax, weight, brand, wingspan, runwayLenghtMin);
		this.ejectionSystem = ejectionSystem;
		this.countOfMissiles = countOfMissiles;
	}
	@Override
	public String toString() {
		return "MilitaryAir" + super.toString() +
				", ejectionSystem=" + ejectionSystem + 
				", countOfMissiles=" + countOfMissiles;
	}
	

	public void fight() {
		if(countOfMissiles >0) {
			System.out.println("Ракета пошла");
			countOfMissiles-=1;
					}
		else System.out.println("Боеприпасы отсутствуют");
	}
	
	public void ejection() {
		if(ejectionSystem) System.out.println("Катапультирование прошло успешно");
		else System.out.println("У вас нет такой системы");
	}
	
}
