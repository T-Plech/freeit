//Даны 3 целых числа.
// Найти количество положительных числ в исходном наборе

import java.util.Random;

public class les2_4 {
    public static void main(String[] args){
        Random rand = new Random();

        int x = rand.nextInt();
        int y = rand.nextInt();
        int z = rand.nextInt();

        System.out.println("x = " + x + " , y = " + y + " , z = "+ z);

        int n_plus = 0;

        if(x>0){
            n_plus+=1;
        }
        if(y>0){
            n_plus+=1;
                    }
        if(z>0){
            n_plus+=1;
        }

        System.out.println("количество положительных чисел = " + n_plus);


    }


}
