//Создать класс и объекты, описывающие Банкомат
//
//        Набор купюр, находящихся в банкомате должен задаваться 3мя свойствами: +
//        * количеством купюр номиналом 20
//        * -#-#-#-#                    50
//        * -#-#-#-#                    100
//
//        Сделать методы для добавления денег в банкомат ++
//
//        Сделать, функцию снимающую деньги:
//        На вход передается сумма денег, на выход - булевское значение(операция удалась или нет) ++
//        При снятии денег, функция должна распечатывать, каким количством купюр, какого номинала выдается сумма ++
//
//        Создать конструктор с тремя параметрами - количеством купюр++

package Zadanie25;

public class Bankomat {

    int amount_20;
    int amount_50;
    int amount_100;
    int summa;

    public int summa(){
        summa = (amount_20*20) + (amount_50*50) + (amount_100*100);
        return summa;
    }

    public void inset_money(int inset_20, int inset_50, int inset_100){
        amount_20 +=inset_20;
        amount_50 +=inset_50;
        amount_100 +=inset_100;

    }

    public void inset_money(int inset_summa){
        if((inset_summa <40 && inset_summa!=20) || inset_summa%10 !=0){System.out.println("Такие купюры не принимаю");}
        else {
            if(inset_summa - (inset_summa/100)*100 == 10){
                amount_100 += (inset_summa/100 -1) ;
                amount_50++;
                amount_20 +=3;
            }
            else {
                if(inset_summa - (inset_summa/100)*100 == 30){
                    amount_100 =(inset_summa/100 -1) ;
                    amount_50++ ;
                    amount_20 +=4 ;
                }
                else{
            amount_100 += inset_summa / 100;
            amount_50 += (inset_summa - (inset_summa / 100)*100) / 50;
            amount_20 += (inset_summa - ((inset_summa / 100)*100) - ((inset_summa - (inset_summa / 100)*100) / 50) * 50) / 20;
        }}}
    }

    public boolean get_money(int get_summa){
        boolean operation = false;
        if(get_summa<=summa() && get_summa>10 && get_summa!=30 && get_summa%10==0){
            int get_100 = get_summa/100;
            int get_50 = (get_summa - get_100*100)/50;
            int get_20= (get_summa - get_100*100 - get_50*50)/20;

            if(get_summa- get_100*100 == 10){
                get_100-=1;
                get_50=1;
                get_20=3;
            }
            if(get_summa-get_100*100==30){
                get_100-=1;
                get_50=1;
                get_20=4;
            }

            if(get_20<=amount_20 && get_50<=amount_50 && get_100<=amount_100)
            {
                System.out.println("Выдаю: " + "\n" + get_100 + " * 100р" + "\n" + get_50 + " *50р" + "\n" + get_20 + " *20р" + "\n" + "Итого: " + get_summa);
            operation=true;
            }
             else{
                   if(get_20<=amount_20&& (get_50 + 2*get_100)<=(amount_50+2*amount_100)) {
                       System.out.println("Выдаю: " + "\n" + get_100 + " * 100р" + "\n" + get_50 + " *50р" + "\n" + get_20 + " *20р" + "\n"  + "Итого: " + get_summa);
                       operation=true;

                   }
                   else {
                       if ((get_summa/20 <=amount_20) && get_summa%20==0){
                           operation = true;
                           System.out.println("Выдаю: " + "\n" +  get_20 + " *20р" + "\n"  + "Итого: " + get_summa);

                       }

                       else {
                           System.out.println("В банкомате недостаточно средств");
                           operation = false;

                       }}

            }
             amount_100 -=get_100;
             amount_50-=get_50;
             amount_20-=get_20;
        }


        return  operation;
    }

    public Bankomat(int amount_100, int amount_50, int amount_20){
        this.amount_100 = amount_100;
        this.amount_50 = amount_50;
        this.amount_20 = amount_20;
    }

    public int getAmount_20() {
        return amount_20;
    }

    public int getAmount_50() {
        return amount_50;
    }

    public int getAmount_100() {
        return amount_100;
    }

    public void setAmount_100(int amount_100) {
        this.amount_100 = amount_100;
    }

    public void setAmount_50(int amount_50) {
        this.amount_50 = amount_50;
    }

    public void setAmount_20(int amount_20) {
        this.amount_20 = amount_20;
    }

    @Override
    public String toString() {
        return "Bankomat{" + "\n" +
                "amount_20=" + amount_20 + "\n" +
                " amount_50=" + amount_50 + "\n" +
                " amount_100=" + amount_100 + "\n" +
                " summa=" + summa() +
                '}';
    }
}
