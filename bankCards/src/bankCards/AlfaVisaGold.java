package bankCards;

import java.util.Date;

public class AlfaVisaGold extends DebetCards {
    String cardOwner;
    private long cardNumber;
    private final double cashback=0.01;

    public AlfaVisaGold(String bank, String type, String validityStr, String cardProgram,String cardOwner, long cardNumber) {
        super(bank, type, validityStr, cardProgram);
        this.cardOwner = cardOwner;
        this.cardNumber = cardNumber;

    }

    
    @Override
    public void pay(double cost, Date today) {
       
        System.out.println("Приложите карту.");
        
        if(cost<=balance) {super.pay(cost, today);
        super.balance+=(cashback*cost);
        System.out.println("Остаток " + super.balance);}
        
        else System.out.println("Недостаточно средств");

       
    }

    @Override
    public void getMoney(double summa, Date today) {
        
       System.out.println("Приложите карту. Введите пин-код");
        super.getMoney( summa, today);
        System.out.println("Остаток: " + super.balance);
    }
    
  @Override
    public void setMoney(double summa, Date today) {
 	  super.setMoney(summa, today);
 	  System.out.println("Остаток:" + super.balance);
    };
   
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
		return "AlfaVisaGold" + 
				super.toString() +
				"[cardOwner=" + cardOwner + 
				", cardNumber=" + cardNumber + 
				", cashback=" + cashback + "]";
	}

    
    }

