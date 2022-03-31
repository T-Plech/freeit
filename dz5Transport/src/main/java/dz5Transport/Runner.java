package dz5Transport;

public class Runner {

	public static void main(String[] args) {
		
//		PassengerCar yaris = new PassengerCar(69, 155, 970, "yaris", 4, 5.0, "5-дверный кузов", 5);
//
//		System.out.println(yaris.toString());
//		yaris.distance(2);

//		FreightTransport gruzovik = new FreightTransport(150, 130, 1500, "kakoj-to", 6, 15, 3.5);
//		
//		System.out.println(gruzovik.toString());
//		gruzovik.loadCargo(1.5);
//		gruzovik.loadCargo(5.0);
		
//		AirCivil boeing747 = new AirCivil(300, 955, 164200, "boeing 747", 59.6, 2500, 366, false);
//		System.out.println(boeing747.toString());
//		boeing747.loadPassenger(340);
//		boeing747.loadPassenger(500);
		
		MilitaryAir bairactar = new MilitaryAir(200, 600, 50, "bairactar", 3, 100, false, 2);
		System.out.println(bairactar.toString());
		bairactar.fight();
		bairactar.fight();
		bairactar.fight();
		bairactar.ejection();
	
	}
	
}
