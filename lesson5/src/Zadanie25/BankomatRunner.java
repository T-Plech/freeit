package Zadanie25;

import java.util.Scanner;

public class BankomatRunner {
    public static void main(String[] args) {

        Bankomat alfabank = new Bankomat(1, 5, 4);

        System.out.println(alfabank.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println("Какую сумму желаете снять?");
        int get_summa = sc.nextInt();
        alfabank.get_money(get_summa);
        System.out.println(alfabank.toString());

        System.out.println("Какую сумму желаете внести?");
        int inset_summa = sc.nextInt();

        alfabank.inset_money(inset_summa);
        System.out.println(alfabank.toString());



    }
}
