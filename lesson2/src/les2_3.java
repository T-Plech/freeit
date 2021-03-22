//3) Дано целое число. Если оно является положительным, то прибавить к нему 1.Если
//отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10. Вывести полученное
//число

import java.util.Random;

public class les2_3 {


        public static void main(String[] args) {

            Random rand = new Random();
            int x = rand.nextInt();

            System.out.println(x);

            if (x>0){
                x+=1;
            }
            else{
                if(x<0){x-=2;}
                else x=10;
            }

            System.out.println(x);

        }


}
