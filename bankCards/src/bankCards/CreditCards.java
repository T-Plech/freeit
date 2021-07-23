package bankCards;

import java.util.Date;

public abstract class CreditCards implements Cards{
    String bank;
    String type;
    String validityStr;
    double moneyClient;
    double moneyCredit;
    double debt;


    public CreditCards(String bank, String type,String validityStr, double moneyClient, double moneyCredit){
        this.bank=bank;
        this.type=type;
        this.validityStr=validityStr;
        this.moneyClient = moneyClient;
        this.moneyCredit = moneyCredit;
    }

    @Override
    public void pay(double cost, Date today) {
        if((moneyClient+moneyCredit)>=cost){
                if(moneyClient<cost){
                cost-=moneyClient;
                moneyCredit-=cost; debt+=cost;
                moneyClient=0.00;

            }
            else{
                if(moneyClient>=cost)moneyClient-=cost;}
        System.out.println("Произведена оплата в размере " + cost +"р.");
        }
        else System.out.println("Недостаточно средств");

    }

    @Override
    public void getMoney(double summa, Date today) {
        if((moneyClient+moneyCredit)>=summa){
                if(moneyClient<summa){
                summa-=moneyClient;
                moneyCredit-=summa; debt+=summa;
                moneyClient=0.00;
            }
            else{
                if(moneyClient>=summa)moneyClient-=summa;}
        System.out.println("Снятие " + summa + "р. Произведено успешно.");
        }
        else System.out.println("Недостаточно средств");

    }

    @Override
    public void setMoney(double summa, Date today) {
        if (debt<=summa){
                summa-=debt;
                moneyCredit+=debt;
                debt=0.00;
                moneyClient+=summa;
            }
        else {
            debt-=summa;
            moneyCredit+=summa;
        }

        System.out.println("Зачислено " + summa);
    }

    @Override
    public double balance(Date today) {
        System.out.println("Баланс: \n Личные средства: " + moneyClient + "\n Средства банка: " + moneyCredit + "\n Долг перед банком: " + debt );
        return (moneyClient+moneyCredit);
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

    public double getMoneyClient() {
        return moneyClient;
    }

    public void setMoneyClient(double moneyClient) {
        this.moneyClient = moneyClient;
    }

    public double getMoneyCredit() {
        return moneyCredit;
    }

    public void setMoneyCredit(double moneyCredit) {
        this.moneyCredit = moneyCredit;
    }
}
