package dz5Transport;

import lombok.Data;

@Data

public class FreightTransport extends GroundTransport {

	double loadCopasity;
	
	public FreightTransport(int power, int speedMax, double weight, String brand, int numberOfWeels,
			int fuelConsumption, double loadCopasity) 
	{
		super(power, speedMax, weight, brand, numberOfWeels, fuelConsumption);
		this.loadCopasity = loadCopasity;
	}

	@Override
	public String toString() {
		return "FreightTransport "
				+ super.toString() +
				", loadCopasity=" + loadCopasity + "�";
	}
	
	public void loadCargo(double cargoWeight) {
		if(cargoWeight <= loadCopasity) {
			System.out.println("�������� ��������");
		}
		else System.out.println("��� ����� �������� ��������");
	}
		

}
