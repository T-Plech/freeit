// Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записаных по правилам Java, с помощью регулярных выражений.
// вывести их


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie22 {

    public static void main(String[] args) {
        String str = "я не заню    0x2546AB, что я      пишу. Но надо   это вывести на экран 0X2554AF. И вот это тоже 0x24789AAE";

        str = str.replaceAll(" +", " ");


        Pattern pattern = Pattern.compile("0x[0-9A-Fa-f]+", Pattern.CASE_INSENSITIVE);

        Matcher m = pattern.matcher(str);

        while (m.find()){
           System.out.println(str.substring(m.start(), m.end()));
        }


    }

}
