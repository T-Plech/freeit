package bankCards;

import java.util.Date;

public class CreditCards extends Cards{
    
    double moneyClient;
    double moneyCredit;
    double debt;
    double yearRate;
    String creditName;
    String cardOwner;
    long cardNumber;

    public CreditCards(String bank, String type, String validityStr,   double yearRate, String creditName, String cardOwner, long cardNumber, double moneyClient, double moneyCredit){
        super(bank, type,validityStr);
        this.moneyClient = moneyClient;
        this.moneyCredit = moneyCredit;
        this.yearRate = yearRate;
        this.creditName=creditName;
        this.cardOwner=cardOwner;
        this.cardNumber=cardNumber;
        
        super.balance=moneyClient + moneyCredit;
        
    }

    @Override
    public void pay(double cost, Date today) {
    	if(super.valid) {    	
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
        else System.out.println("Недостаточно средств");}
    	else System.out.println("Истек срок действия карты");

    }

    @Override
    public void getMoney(double summa, Date today) {
    	if(super.valid) {
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
        else System.out.println("Недостаточно средств");}
    	else System.out.println("Истек срок действия карты");
    	

    }

    @Override
    public void setMoney(double summa, Date today) {
    	if(super.valid) {
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

        System.out.println("Зачислено " + summa);}
    	else System.out.println("Истек срок действия карты");
    }

    @Override
    public void balance(Date today) {
    	
    	if(super.valid) {  	
    	
        System.out.println("Баланс: \n Личные средства: " + moneyClient + "\n Средства банка: " + moneyCredit + "\n Долг перед банком: " + debt );
       
    }
    	else System.out.println("Истек срок действия карты");
    	}

    
    @Override
	public String toString() {
		return "CreditCards ["
				+ super.toString() + 
				", moneyClient=" + moneyClient + 
				", moneyCredit=" + moneyCredit + 
				", debt=" + debt +
				", yearRate=" + yearRate +
				", creditName=" + creditName + 
				", cardOwner=" + cardOwner + 
				", cardNumber=" + cardNumber + 
				 "]";
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
    
    public double getYearRate() {
    	return yearRate;
    }
    
    public void setYearRate(double yearRate) {
    	this.yearRate=yearRate;
    }
    
    
}
