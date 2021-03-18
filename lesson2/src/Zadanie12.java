//Найдите сумму первых n целых чисел, которые делятся на 3.

import java.util.Random;

public class Zadanie12 {
    public static void main(String[] args){

        Random rand = new Random();
        int n = rand.nextInt(20);
        System.out.println("n= " + n);
        int sum=0;
        for(int i=1; i<=n; i++){

            if(i%3==0){
               sum +=i;
            }

        }

        System.out.println("Сумма = "  + sum);

    }


}
