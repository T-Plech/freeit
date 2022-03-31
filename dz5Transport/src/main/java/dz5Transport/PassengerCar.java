package dz5Transport;


import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class PassengerCar extends GroundTransport{

	String bodyType;
	int numberOfPassenger;
	
	public PassengerCar(int power, int speedMax, double weight, String brand, int numberOfWeels, double fuelConsumption, String bodyType, int numberOfPassenger) {
		super(power, speedMax, weight, brand, numberOfWeels, fuelConsumption);
		this.bodyType = bodyType;
		this.numberOfPassenger = numberOfPassenger;
	}
	
	public void distance(double vremy) {
		
		double distance=speedMax*vremy;
		double needingFuel = distance/100*fuelConsumption;		
			System.out.println("�� ����� " + vremy +" ����, ���������� " + brand + " �������� � ������������ ��������� " + speedMax + " ��/� ������� " + distance + "�� � ����������� " + needingFuel + " ������ �������");	
	}

	@Override
	public String toString() {
		return "PassengerCar: " + super.toString() +
	", bodyType= " + bodyType + 
	", numberOfPassenger= " + numberOfPassenger;
	}
	
	
	
}
