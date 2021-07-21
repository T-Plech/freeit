package bankCards;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AlfaVisaGold extends DebetCards {
    String cardOwner;
    private long cardNumber;

    public AlfaVisaGold(String bank, String type,  String validityStr,String cardOwner, long cardNumber) {
        super(bank, type, validityStr);
        this.cardOwner = cardOwner;
        this.cardNumber = cardNumber;

    }

    Date validity;
     SimpleDateFormat format = new SimpleDateFormat("yy/MM");
    {
        try {
            validity = format.parse(validityStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void pay(double cost, Date today) {
        if(today.before(validity)){
        System.out.println("Приложите карту.");
        super.pay(cost, today);
        System.out.println("Остаток " + super.balance);}
        else System.out.println("Истек срок действия карты");
    }

    @Override
    public void getMoney(double summa, Date today) {
        if(today.before(validity)){
       System.out.println("Приложите карту. Введите пин-код");
        super.getMoney( summa, today);
        System.out.println("Остаток " + super.balance);}
        else System.out.println("Истек срок действия карты");
    }

    @Override
    public void setMoney(double summa, Date today){
        if(today.before(validity)){
            super.setMoney(summa,today);
        }
        else System.out.println("Истек срок действия карты");
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
                ", validity = " + validityStr + '\'' +
                '}';
    }
}
