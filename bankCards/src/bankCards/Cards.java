package bankCards;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class  Cards {
   String material = "plastic";
   String bank;
   String type;
   String validityStr;
   double balance;
   Date validity;
   Date today;
  boolean valid;
 
   
   public Cards(String bank,String type, String validityStr) {
	   this.bank=bank;
       this.type=type;
       this.validityStr=validityStr;
       
       SimpleDateFormat format = new SimpleDateFormat("MM/yy");
       {
           try {
               validity = format.parse(validityStr);
               
           } catch (ParseException e) {
               e.printStackTrace();
           }
       }
       
   }
   
   boolean valid( Date today) {
	  	  
	   if(today.before(validity)) { return valid = true;}
	   else {return valid = false;}
	      }
   
   void pay(double cost, Date today) {
	   valid(today);
	   if(valid){
           balance -=cost;
                }
       else System.out.println("Истек срок действия карты");
   };
   
   
   void getMoney(double summa, Date today) {
	   valid(today);
	   if(valid){
           System.out.println("Приложите карту.");
      balance -=summa;
           
       }
       else System.out.println("Истек срок действия карты");
	   	   
   };
   
   void setMoney(double summa, Date today) {
	   valid(today);
	   if(valid){
           System.out.println("Сумма внесена");
       balance+=summa;
           
       }
       else System.out.println("Истек срок действия карты");
   };
  
   void balance(Date today) {
	   valid(today);
	   if(valid){
           System.out.println("Баланс  " + balance);
                     
       }
       else System.out.println("Истек срок действия карты");
   };
   
       
   
   @Override
public String toString() {
	return "Cards [bank=" + bank + 
			", type=" + type +
			", validityStr=" + validityStr + 
			"]";
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
	   this.validityStr=validityStr;
   }
   
   
   
   

}
