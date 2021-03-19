// Создать массив оценок произвольной длины,
// вывести максимальную и минимальную оценку,
// ее(их) номер.


import java.util.Random;

public class Zadanie14 {

    public static void main(String[] args){

        Random rand = new Random();

        int n = rand.nextInt(10);

        int[] ocenki = new int[n];

        for (int i = 0; i< ocenki.length; i++){
            ocenki[i] = rand.nextInt(10);
            if(i== ocenki.length-1) System.out.println(ocenki[i] + ".");
            else System.out.print(ocenki[i] + ", ");
        }


        int max=ocenki[0];
        int max_index = 0;
        int min=ocenki[0];
        int min_index=0;

        for(int i=0;i<n;i++){
              if(ocenki[i]>max) {
                  max = ocenki[i];
                  max_index=i;
              }
              if(ocenki[i]<min){
                  min = ocenki[i];
                  min_index=i;
              }

        }

        System.out.println("Максимальная оценка = " + max + ". Её индекс = " + max_index);
        System.out.println("Минимальная оценка = " + min + ". Её индекс = " + min_index);

    }

}
