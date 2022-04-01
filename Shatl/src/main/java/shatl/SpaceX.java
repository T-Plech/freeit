package shatl;

import java.util.Random;

public class SpaceX implements IStart {

	Random random =new Random();
	
	public boolean preStartCheck() {
		
		int i = random.nextInt(5);
		if((i*2)<6) return true;
		else return false;
	}

	public void startEngine() {
		
		System.out.println("Двигатель SpaceX запущен. Все системы проверены.");
	}

	public void start() {
		
		System.out.println("Старт SpaceX");
	}

}
