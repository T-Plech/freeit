package dz5Transport;

import lombok.Data;

@Data


public abstract class AirTransport extends Transport {
	
	double wingspan;
	int runwayLenghtMin;
	
	public AirTransport(int power, int speedMax, double weight, String brand, double wingspan,
	int runwayLenghtMin) {
		super(power, speedMax, weight, brand);
	
		this.wingspan=wingspan;
		this.runwayLenghtMin= runwayLenghtMin;
	}

	@Override
	public String toString() {
		return "AirTransport" + super.toString() + 
				", wingspan=" + wingspan + "ì" +
				" , runwayLenghtMin=" + runwayLenghtMin + "ì";
	}

	
	
}
