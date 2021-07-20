package bankCards;

public interface Cards {
   String material = "plastic";
   void pay(double cost);
   void getMoney(double summa);
   void setMoney(double summa);
   double balance();

}
