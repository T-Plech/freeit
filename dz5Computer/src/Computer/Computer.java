package Computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {
	
	String processor;
	int operativnayaPamyat;
	int hardDisk;
	int resursPolnihCiklovOnOff;
	
	public Computer(String processor, int operativnayaPamyat, int hardDisk, int resursPolnihCiklovOnOff) {
		this.processor=processor;
		this.operativnayaPamyat=operativnayaPamyat;
		this.hardDisk=hardDisk;
		this.resursPolnihCiklovOnOff=resursPolnihCiklovOnOff;
	}
	
	
	Scanner in = new Scanner(System.in);
	boolean compLive=true;
	boolean compOn;
	Random random = new Random();
	
	public void on() {
		
				
		if(!compOn) {
		
		if(compLive) {
		int randomChoice = random.nextInt(2);
//		System.out.println(randomChoice);
		System.out.println("Введите 0 или 1");
		int yourChoice = in.nextInt();
		if(yourChoice != randomChoice || resursPolnihCiklovOnOff <=0) {
			compLive = false;
			compOn=false;
		System.out.println("Комп сгорел");
		}
		else {
			resursPolnihCiklovOnOff -=1;
			compOn=true;
			System.out.println("Комп включен");			
		}
		
		}
		else System.out.println("Комп сгорел раньше");
			}
	else System.out.println("Комп уже включен");	
}
	
	public void off() {
		
		if(compOn) {
			int randomChoice = random.nextInt(2);
//			System.out.println(randomChoice);
			System.out.println("Введите 0 или 1");
			int yourChoice = in.nextInt();
			if(yourChoice != randomChoice) {
				compLive = false;
				compOn = false;
				System.out.println("Комп сгорел");
			}
			else {
				compOn = false;
				System.out.println("Комп выключен");
			}
		}
		
		
	}
	
	@Override
	public String toString() {
		return "Computer [processor=" + processor +
				", operativnayaPamyat=" + operativnayaPamyat + 
				", hardDisk="
				+ hardDisk + 
				", resursPolnihCiklovOnOff=" + resursPolnihCiklovOnOff +
				", getClass()=" + getClass() +
				"]";
		
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getOperativnayaPamyat() {
		return operativnayaPamyat;
	}

	public void setOperativnayaPamyat(int operativnayaPamyat) {
		this.operativnayaPamyat = operativnayaPamyat;
	}

	public int getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(int hardDisk) {
		this.hardDisk = hardDisk;
	}

	public int getResursPolnihCiklovOnOff() {
		return resursPolnihCiklovOnOff;
	}

	public void setResursPolnihCiklovOnOff(int resursPolnihCiklovOnOff) {
		this.resursPolnihCiklovOnOff = resursPolnihCiklovOnOff;
	}

	
	
	

}
