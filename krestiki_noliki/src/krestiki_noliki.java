
import java.util.Scanner;

public class krestiki_noliki {


    public  static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);

       int[][] igra = new int[3][3];

       for(int x=0;x<3;x++){
           for(int y=0;y<3;y++){

               igra[x][y] = 8;
           }
       }



        Igra:

        for(int j=0;;j++){
            for (int i=0; i<3;i++){
                for(int s=0;s<3; s++){
                    System.out.print(igra[i][s]);
                }
                System.out.println();
            }

            {
                int a,b;

                if(j%2 ==0){ System.out.println("Игрок 1 введите координаты X (a ввод b)");
                   do {
                       a = sc.nextInt();
                       b = sc.nextInt();}
                    while (igra[a][b] !=8 );

                   igra[a][b] =1;

               }
               else {
                   do{
                       System.out.println("Игрок 2 введите координаты 0 (a b)");
                       a = sc.nextInt();
                       b = sc.nextInt();}
                   while (igra[a][b] !=8 );

                   igra[a][b]=0;
               }


                for (int i = 0; ; i++) {
                    if ((igra[i][0] == igra[i][1] & igra[i][1] == igra[i][2] & igra[i][0]!=8 ) || (igra[0][i] == igra[1][i] & igra[1][i] == igra[2][i] & igra[2][i]!=8) || (igra[0][0] == igra[1][1] & igra[1][1] == igra[2][2] & igra[2][2]!=8) || (igra[2][0] == igra[1][1] & igra[1][1] == igra[0][2] & igra[0][2]!=8)) {

                        if(j%2 == 0) System.out.println("Игра завершена. Победил игрок 1(Х)" );
                        else System.out.println("Игра завершена. Победил игрок 2(0)" );

                        break Igra;
                    }
                    else{
                        for(int k=0;k<3; k++){
                            if(igra[i][k] == 8) continue Igra;
                            else {
                                if(i==2 & k==2) {
                                    System.out.println("Все поля заняты. Ничья");
                                    break Igra;
                                }
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
