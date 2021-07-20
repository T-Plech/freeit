package bankCards;

import java.util.Calendar;
import java.util.Calendar.Builder;
import java.util.GregorianCalendar;

public class AlfaVisaGold extends DebetCards {
    String cardOwner;
    private long cardNumber;

    public AlfaVisaGold(String bank, String type,  String validityStr,String cardOwner, long cardNumber) {
        super(bank, type, validityStr);
        this.cardOwner = cardOwner;
        this.cardNumber = cardNumber;

    }


    @Override
    public void pay(double cost) {
        System.out.println("Приложите карту.");
        super.pay(cost);
        System.out.println("Остаток " + super.balance);
    }

    @Override
    public void getMoney(double summa) {
       System.out.println("Приложите карту. Введите пин-код");
        super.getMoney(summa);
        System.out.println("Остаток " + super.balance);
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "AlfaVisaGold{" +
                "cardOwner='" + cardOwner + '\'' +
                ", cardNumber=" + cardNumber +
                ", bank='" + bank + '\'' +
                ", type='" + type + '\'' +
                ", validity = " + validity + '\'' +
                '}';
    }
}
