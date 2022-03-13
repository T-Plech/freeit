package bankCards;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CardRunner {
    public static void main(String[] args) {
//        AlfaVisaGold myCard = new AlfaVisaGold("Alfa", "Visa Gold", "11/23","Tatyana Plechischik", 2000363655554444L);

        VtbHalva myCard = new VtbHalva("VTB", "Visa", "02/24", "Halva", "Ivanov Ivan", 2222333344445555L, 120.60, 1000);

        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
        System.out.println(format.format(today));

        System.out.println(myCard.toString());
//        System.out.println(format.format(myCard.validity));

        System.out.println("Все средства: " + myCard.allBalance);

       myCard.balance(today);

        myCard.pay(30.50, today);
        myCard.setMoney(150.00, today);
        myCard.pay(51.00,today);
        myCard.balance(today);
        myCard.getMoney(100.00,today);
        myCard.pay(650.00, today);
        myCard.balance(today);
        myCard.setMoney(500.00, today);
        myCard.balance(today);


    }
}
