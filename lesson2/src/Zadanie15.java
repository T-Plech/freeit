//Создать массив
//Заполнить его случайными элементами
//распечатать
//перевернуть и снова распечатать(при переворачивании нежелательно создавать еще один массив)

import java.util.Random;

public class Zadanie15 {
    public static void main(String[] args){

        Random rand = new Random();
        int n = rand.nextInt(10);

        int[] mass = new int[n];

        for(int i=0; i< mass.length;i++){
            mass[i]= rand.nextInt(100);
            if(i== mass.length-1) {System.out.println(mass[i] + " .");}

            else System.out.print(mass[i] + ", ");
        }


        for(int i=0; i< mass.length;i++){
            if(i<n-1-i){
                int temp = mass[i];
                mass[i]=mass[(mass.length-1-i)];
                mass[(mass.length-1-i)] = temp;}

            if(i== mass.length-1) {System.out.println(mass[i] + " .");}
            else System.out.print(mass[i] + ", ");

        }


    }


}
