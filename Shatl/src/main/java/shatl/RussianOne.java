package shatl;

import java.util.Random;

public class RussianOne implements IStart {
 
	Random random = new Random(); 
	
	public boolean preStartCheck() {
		
		int i = random.nextInt(100);
		if(i==2) {System.out.println("Вы обошли санкции"); return true;}
		else {
		System.out.println("Русский военный корабль, пошел ...");
		return false;}
	}

	public void startEngine() {
		
		System.out.println("Двигатель запущен.");

	}

	public void start() {
		System.out.println("Русская ракета взлетела. Но это не точно.");

	}

}
