package bankCards;

import java.util.Date;

public interface Cards {
   String material = "plastic";
   void pay(double cost, Date today);
   void getMoney(double summa, Date today);
   void setMoney(double summa, Date today);
   double balance(Date today);

}
