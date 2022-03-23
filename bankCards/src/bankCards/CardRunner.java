package bankCards;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CardRunner {
	public static void main(String[] args) {
		AlfaVisaGold myCard = new AlfaVisaGold("Alfa", "Visa Gold", "10/23", "smartGold", "Tatyana Plechischik",
				2000363655554444L);

		/*
		 * CreditCards myCard = new CreditCards("VTB", "Visa", "02/25", 13.0, "Halva",
		 * "Ivanov Ivan", 2222333344445555L, 120.60, 1000);
		 */

		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
		System.out.println(format.format(today));

		System.out.println(myCard.toString());

		System.out.println(format.format(myCard.validity));
		myCard.valid(today);
		System.out.println(myCard.valid);
		myCard.balance(today);
		
		  myCard.pay(30.05, today);
		  myCard.setMoney(150.00, today);
			
			  myCard.pay(51.00,today); myCard.balance(today);
			  myCard.getMoney(100.00,today); 
			  myCard.pay(650.00, today);
			  myCard.balance(today); myCard.setMoney(500.00, today); myCard.balance(today);
			 
		  
		 

	}

}
