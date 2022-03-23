package bankCards;

import java.util.Date;

public abstract class DebetCards extends Cards{
    
	String cardProgram;

	
    public DebetCards(String bank, String type, String validityStr, String cardProgram) {
    	super(bank, type,validityStr);
    	this.cardProgram=cardProgram;    
    }

    

    @Override
    public void getMoney(double summa, Date today) {
        if(balance>=summa){super.getMoney(summa, today);
        System.out.println("Вы сняли наличными " + summa +" р.");}
        else System.out.println("Недостаточно средств"); }

   
    
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




	@Override
	public String toString() {
		return "DebetCards "+ super.toString()
				+ "[cardProgram=" + cardProgram +  "]";
	}
    
    


}
