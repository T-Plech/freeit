//Имеется целое число.
// Определить, является ли это число простым, т.е. делится без остатка только на 1 и себя


import java.util.Random;

public class Zadanie11 {

    public static void main(String[] args){

        Random rand = new Random();

        int x= rand.nextInt(13);

        System.out.println("x= " + x);

        one :
        {
            for (int i = 2; i < x; i++) {

                if (x % i == 0) {
                    System.out.println("Число " + x + " НЕ является простым");
                    break one;
                }

            }
            System.out.println("Число " + x + " простое");
        }


    }
    }

