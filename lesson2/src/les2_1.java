import java.util.Random;

//1)В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно
//или отрицательное. Например, "это однозначное положительное число". Достаточно будет определить,
//является ли число однозначным, "двухзначным или трехзначным и более.
public class les2_1 {

        public static void main(String[] args) {

            Random rand = new Random();
            int x = rand.nextInt();
            int ed = x/10;

            System.out.println(x);

            if ((ed>=1 && ed<9) | (ed<=-1 && ed>-9)){System.out.print("это двузначное ");}
            else {
                if (ed<1 && ed >-1 && ed!=0) {System.out.print("это однозначное ");}
                if(ed>9 | ed<-9 ){ System.out.print("это  трёхзначное или более ") ;}

            }
            if(x>0) {System.out.println(" положительное число.");}
            else { if(x!=0) {System.out.println("отрицательное число");}
            else
            {System.out.println("это 0");}

            }
        }




    }




