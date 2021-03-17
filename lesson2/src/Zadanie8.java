//Имеется целое число(задать с помощью Random).
//Это число - количество денег в рублях.
// Вывести это число, добавив к нему слово "рублей" в правильном падеже.

import java.util.Random;

public class Zadanie8 {

    public static void main(String[] args) {

        Random rand = new Random();

    int x = rand.nextInt(1520);

        int ed = x % 10;
        int des = x % 100;

        System.out.println("x= "+ x);

        if(des==11 | des==12 | des==13| des==14| des==15){
            System.out.println(x + "рублей");
        }
        else{
            switch (ed){
                case 1: System.out.println(x + " рубль"); break;
                case 2:
                case 3:
                case 4: System.out.println(x + " рубля"); break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0: System.out.println(x + " рублей"); break;

            }
        }



    }
}
