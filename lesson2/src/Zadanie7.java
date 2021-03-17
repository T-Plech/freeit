//Имеется прямоугольное отвестие размерами a и b,
// определить, можно ли его полностью закрыть круглой картонкой радиусом r


import java.util.Random;

public class Zadanie7 {

    public static void main(String[] args){

        Random rand = new Random();

        int a = rand.nextInt(25);
        int b = rand.nextInt(45);
        int r = rand.nextInt(100);

        double diag = Math.sqrt(a*a+b*b);

        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("r= " + r);
        System.out.println("Диагональ= " + diag);


        if(diag<=2*r){
            System.out.println("Отверстие закрыто");
        }
        else System.out.println("Отверстие НЕ закрыто");


    }



}
