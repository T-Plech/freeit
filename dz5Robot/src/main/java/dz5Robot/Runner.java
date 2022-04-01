package dz5Robot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		
		
		SonyHead sonyHead1 = new SonyHead(100);
		ToshibaHand toshibaHand1 = new ToshibaHand(10);
		ToshibaLeg toshibaLeg1 = new ToshibaLeg(20);
		
		Robot vasya = new Robot(sonyHead1, toshibaHand1, toshibaLeg1);
		
		SamsungHead samsungHead = new SamsungHead(250);
		SonyHand sonyHand = new SonyHand(100);
		SamsungLeg samsungLeg = new SamsungLeg(30);
		
		Robot t25 = new Robot(samsungHead, sonyHand, samsungLeg);
		
		ToshibaHead toshibaHead = new ToshibaHead(30);
		SamsungHand samsungHand = new SamsungHand(100);
		SonyLeg sonyLeg = new SonyLeg(90);
		
		Robot v6 = new Robot(toshibaHead, samsungHand, sonyLeg);
		
		vasya.action();
		t25.action();
		v6.action();
				
		System.out.println("Цена робота Васи: " + vasya.getPrice() + "\n" + "Цена робота t25: " + t25.getPrice() + "\n" + "Цена робота v6: " + v6.getPrice() );
		
		List<Robot> robots = new ArrayList<Robot>();
		robots.add(vasya);
		robots.add(t25);
		robots.add(v6);
		
//		System.out.println(robots);
		
		Collections.sort(robots);
		
//		System.out.println(robots.toString());
		
		System.out.println("Самый дорогой робот: "+robots.get(0).toString());
		
		
	}


}
