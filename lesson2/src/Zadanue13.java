//Создать последовательность случайных чисел
//Найти и вывести наибольшее из них

import java.util.Random;

public class Zadanue13 {

    public static void main(String[] args){

        Random rand = new Random();
        int n = rand.nextInt(20);

        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i] = rand.nextInt(500);
            if(i == (n - 1)) System.out.println(array[i] + ".");
            else System.out.print(array[i] + " , ");
        }


        int x = array[0];

        for(int i=0; i<n;i++){
            if (array[i]>x){
                x= array[i];
            }
        }

        System.out.println("Наибольшее число в массиве = " + x);

    }


}
