//Определить сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями(включая?).


import java.util.Random;

public class Zadanie16 {

    public static void main(String[] args){

        Random rand= new Random();
        int n = rand.nextInt(10);

        int[] array = new int[n];

        for(int i =0; i< array.length;i++){
            array[i] = rand.nextInt(20);
            if(i== array.length-1){
                System.out.println(array[i] + ".");
            }
            else System.out.print(array[i] + ", ");
        }

        int min = array[0];
        int max = array[0];
        int min_index=0;
        int max_index=0;


        for(int i=0; i< array.length; i++){
            for(int j=0; j< array.length; j++){
                if(array[j]<min) {
                    min = array[j];
                min_index = j;
                }
                if(array[j]>max) {
                    max = array[j];
                    max_index=j;
                }
            }

        }

        System.out.println("Max = " + max + ", min = " + min);

        int sum = 0;

        if(min_index<max_index){
            for(int i=min_index; i<=max_index; i++){
                sum +=array[i];
            }
        }
        else {
            if(min_index>max_index){
            for(int i =max_index; i<=min_index;i++){
                sum +=array[i];
            }
        }
        else {
            sum = array[max_index]+array[min_index];
            }
        }

        System.out.println("Сумма = " + sum);





    }

}
