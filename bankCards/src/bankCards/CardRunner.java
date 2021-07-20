package bankCards;

public class CardRunner {
    public static void main(String[] args) {
        AlfaVisaGold myCard = new AlfaVisaGold("Alfa", "Visa Gold", "2023-11-31","Tatyana Plechischik", 2000363655554444L);

        System.out.println(myCard.toString());

//        myCard.pay(30.50);
//        myCard.balance();
//        myCard.getMoney(100.0);
//
//        myCard.pay(650.0);
//        myCard.balance();


    }
}
