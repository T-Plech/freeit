package bankCards;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CardRunner {
    public static void main(String[] args) {
        AlfaVisaGold myCard = new AlfaVisaGold("Alfa", "Visa Gold", "23/11","Tatyana Plechischik", 2000363655554444L);

        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
        System.out.println(format.format(today));

        System.out.println(myCard.toString());
        System.out.println(format.format(myCard.validity));

        myCard.pay(30.50, today);
        myCard.setMoney(150, today);
        myCard.pay(51,today);
        myCard.balance(today);
        myCard.getMoney(100.0,today);
//        myCard.pay(650.0);
//        myCard.balance();


    }
}
