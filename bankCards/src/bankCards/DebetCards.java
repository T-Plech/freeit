package bankCards;

import java.util.Date;

public abstract class DebetCards implements Cards{
    String bank;
    String type;
    double balance;
    String validityStr;


    public DebetCards(String bank, String type, String validityStr) {
        this.bank = bank;
        this.type = type;
        this.validityStr = validityStr;

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
    public void pay(double cost, Date today) {

        if(balance>=cost)  {
            balance -=cost;
        System.out.println("Операция произведена успешно");
        }
        else System.out.println("Недостаточно средств");}


    @Override
    public void getMoney(double summa, Date today) {
        if(balance>=summa){balance-=summa;
        System.out.println("Вы сняли наличными " + summa +" р.");}
        else System.out.println("Недостаточно средств"); }

    @Override
    public void setMoney(double summa, Date today) {
        balance+=summa;
    }

    @Override
    public double balance( Date today) {
            return balance;
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
