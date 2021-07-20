package bankCards;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class DebetCards implements Cards{
    String bank;
    String type;
    double balance;
    String validityStr;
    Date date = new Date();

    public DebetCards(String bank, String type, String validityStr) {
        this.bank = bank;
        this.type = type;
        this.validityStr = validityStr;

    }

    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Date validity;

    {
        try {
            validity = format.parse(validityStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return "DebetCards{" +
                "bank='" + bank + '\'' +
                ", type='" + type + '\'' +
                ", validity=" +validityStr +
                '}';
    }


    @Override
    public void pay(double cost) {

        if(validity.after(date)){
        if(balance>=cost)  {
            balance -=cost;
        System.out.println("Операция произведена успешно");
        }
        else System.out.println("Недостаточно средств");}
        else System.out.println("Срок действия карты истек");
    }

    @Override
    public void getMoney(double summa) {
        if(validity.after(date)){
        if(balance>=summa){balance-=summa;
        System.out.println("Вы сняли наличными " + summa +" р.");}
        else System.out.println("Недостаточно средств"); }
        else System.out.println("Срок действия карты истек");
    }

    @Override
    public void setMoney(double summa) {
        if(validity.after(date)){balance+=summa;}
        else System.out.println("Срок действия карты истек");

    }

    @Override
    public double balance() {
        if (validity.after(date)) {
            return balance;
        } else {System.out.println("Срок действия карты истек"); return  0;}
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValidityStr() {
        return validityStr;
    }

    public void setValidityStr(String validityStr) {
        this.validityStr = validityStr;
    }


}
