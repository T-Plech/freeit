//Изменить пример с суммой чисел таким образом, чтобы расчитывалась не сумма, а произведение, т.е. факториал

import java.math.BigInteger;
import java.util.Random;

public class Zadanie9 {
    public static void main(String[] args){

        Random rand = new Random();

        int x = rand.nextInt(100);

        System.out.println("x= " + x);

        int a=1;
        BigInteger fact= BigInteger.valueOf(1);

        while(a<=x){

            fact = BigInteger.valueOf(a).multiply(fact);
            a++;

        }

        System.out.println("Факториал= " + fact);

    }

}
