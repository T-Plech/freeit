//Создать двумерный массив и заполнить его бабочкой




import java.util.Random;

public class Zadanie17 {
    public static void main(String[] args) {

        Random rand = new Random();

        int n = rand.nextInt(10);
        //int n =10;

        int bater[][]= new int[n][n];

        for(int i=0;i<bater.length/2;i++){
            for(int j=0;j<bater[i].length; j++){

                if(j<i | j>(bater[i].length-1-i)) {
                    System.out.print(0);
                }
                else System.out.print(1);



            }
            System.out.println();}

        int n2 = bater.length/2;

        for(int i=n2;i<bater.length;i++){

            for(int j=0; j<bater[i].length; j++){

                if(j>i | j<(bater[i].length-1-i)) {
                    System.out.print(0);
                }
                else System.out.print(1);


            }
            System.out.println();
        }

    }



}
