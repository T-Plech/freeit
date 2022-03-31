package dz5Transport;


import lombok.Data;


@Data


public abstract class GroundTransport extends Transport {

	int numberOfWeels;
	double fuelConsumption;
	
	
	public GroundTransport(int power, int speedMax, double weight, String brand, int numberOfWeels,
			double fuelConsumption) {
		
		super(power, speedMax, weight, brand);
		this.numberOfWeels = numberOfWeels;
		this.fuelConsumption = fuelConsumption;
		
		
	}

	@Override
	public String toString() {
		return "Ground Transport: " +
	super.toString() +
	" ,number of weels " + numberOfWeels +
	" ,fuel consumption " + fuelConsumption + "λ/100κμ";
	}
	

}
