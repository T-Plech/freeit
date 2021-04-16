//Найти в строке не только запятые, но и другие знаки препинания.
// Подсчитать общее их количество


public class Zadanie18 {
    public static void main(String[] args){

        String str = "Строковый литерал - это последовательность символов, заключенных в двойные кавычки.";
        int n = 0;

        char ch;

        for(int i=0; i< str.length(); i++){

            ch = str.charAt(i);
            if(ch==',' || ch == '.' || ch == '?' || ch == ';' || ch ==':' || ch =='"' || ch == '!' || ch =='?' || ch =='-') {
                n++;
            }

        }

        System.out.println("количество знаков препинания в строке  \" " + str + " \"  = " + n );

    }


}
