
import java.util.Scanner;

public class krestiki_noliki {


    public  static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);

     char[][] igra ={{ '1', '2', '3'},{'4','5','6'},{'7','8','9'}};

             Igra:

        for(int j=0;;j++){
            for (int i=0; i<3;i++){
                for(int s=0;s<3; s++){
                    System.out.print(igra[i][s]);
                }
                System.out.println();
            }

            {
                int a;

                if(j%2 ==0){ System.out.println("Игрок 1 введите ячейку X ");
                   do {
                       a=sc.nextInt();


                       switch (a){
                           case 1: {igra[0][0] = 'X'; break ;}
                           case 2:  {igra[0][1] = 'X'; break ;}
                           case 3:  {igra[0][2] = 'X'; break ;}
                           case 4:  {igra[1][0] = 'X'; break ;}
                           case 5:  {igra[1][1] = 'X'; break ;}
                           case 6:  {igra[1][2] = 'X'; break ;}
                           case 7:  {igra[2][0] = 'X'; break ;}
                           case 8: {igra[2][1] = 'X'; break ;}
                           case 9:  {igra[2][2] = 'X'; break ;}
                       }

                       }
                   while (a<1 || a>9);

               }
               else {
                    do {
                        System.out.println("Игрок 2 введите координаты 0 (a b)");
                        a = sc.nextInt();

                        switch (a) {
                            case 1:
                            {igra[0][0] = '0'; break; }
                            case 2:
                            {igra[0][1] = '0'; break; }
                            case 3:
                            {igra[0][2] = '0'; break; }
                            case 4:
                            {igra[1][0] = '0'; break;}
                            case 5:
                            {igra[1][1] = '0'; break; }
                            case 6:
                            {igra[1][2] = '0'; break; }
                            case 7:
                            {igra[2][0] = '0'; break; }
                            case 8:
                            {igra[2][1] = '0'; break; }
                            case 9:
                            {igra[2][2] = '0'; break; }
                        }
                    }
                    while (a < 0 || a > 9);
                }


               for(int s=0;;s++){
                for (int i = 0;i<3 ; i++) {
                    if ((igra[i][0] == igra[i][1] && igra[i][1] == igra[i][2]) || (igra[0][i] == igra[1][i] && igra[1][i] == igra[2][i]) || (igra[0][0] == igra[1][1] && igra[1][1] == igra[2][2] ) || (igra[2][0] == igra[1][1] && igra[1][1] == igra[0][2])) {

                        if(j%2 == 0) System.out.println("Игра завершена. Победил игрок 1(Х)" );
                        else System.out.println("Игра завершена. Победил игрок 2(0)" );

                        break Igra;
                    }}

                    for(int k=0;k<3; k++){
                            if(igra[s][k] !='X' && igra[s][k] != '0') continue Igra;
                            else {
                                if(s==2 & k==2) {
                                    System.out.println("Все поля заняты. Ничья");
                                    break Igra;
                                }
                            }
                        }


                }
            }
        }

                    for (int i=0; i<3;i++){
                for(int s=0;s<3; s++){
                    System.out.print(igra[i][s]);
                }
                System.out.println();
            }

    }

}
