//Создайте число.
// Определите, является ли число трехзначным
//Определите, заканчивается ли число на 7
//Определите, является ли число четным
//

import java.util.Random;

public class Zadanie6 {



    public static void main(String[] args){

        Random rand = new Random();
        int x = rand.nextInt(1230);

        if(x>=100 & x<=999){
            System.out.println("Число трехзначное" + " = " + x);
        }
        else System.out.println("Число не трехзначное" + " = " +x);

        int okonchanie = x%10;

        if(okonchanie==7) System.out.println("Заканчивается на 7");
        else System.out.println("Заканчивается не на 7, а на " + okonchanie);

        if(x%2==0) System.out.println("четное");
        else System.out.println("нечетное");

    }



}
