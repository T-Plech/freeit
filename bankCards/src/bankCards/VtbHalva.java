package bankCards;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VtbHalva extends CreditCards{

    String creditName;
    String cardOwner;
    long cardNumber;
    private  double yearRate=13.0;
    double allBalance=super.moneyClient+super.moneyCredit;


    public VtbHalva(String bank, String type, String validityStr, String creditName, String cardOwner, long cardNumber, double moneyClient, double moneyCredit) {
        super(bank, type, validityStr, moneyClient, moneyCredit);
        this.creditName=creditName;
        this.cardOwner=cardOwner;
        this.cardNumber=cardNumber;
        this.validityStr=validityStr;

    }


    Date validity;
    SimpleDateFormat format = new SimpleDateFormat("MM/yy");
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
        }
        else System.out.println("Истек срок действия карты");
    }

    @Override
    public void getMoney(double summa, Date today) {
        if(today.before(validity)){
            System.out.println("Введите пин-код");
            super.getMoney( summa, today);
            }
        else System.out.println("Истек срок действия карты");
    }

    @Override
    public void setMoney(double summa, Date today){
        if(today.before(validity)){
            super.setMoney(summa,today);
        }
        else System.out.println("Истек срок действия карты");
    }

    @Override
    public double balance(Date today) {
        if(today.before(validity)){
        return super.balance(today);
    }
        else {System.out.println("Истек срок действия карты");
        return 0.00;}

    }

    @Override
    public String toString() {
        return "VtbHalva{" +
                super.toString()+
                "creditName='" + creditName + '\'' +
                ", cardOwner='" + cardOwner + '\'' +
                ", cardNumber=" + cardNumber +
                ", validityStr='" + validityStr + '\'' +
                ", yearRate=" + yearRate +
                '}';
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
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

    public String getValidityStr() {
        return validityStr;
    }

    public void setValidityStr(String validityStr) {
        this.validityStr = validityStr;
    }



}
