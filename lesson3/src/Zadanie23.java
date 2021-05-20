//Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры,
// например <p id="p1">
// и замену их на простые теги абзацев <p>

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Zadanie23 {
    public static void main(String[] args) {

        String str  = "Регулярные выражения <p id=\"p33\">  это капец как сложно <p> . Правда. <p id=\"p1\"> ";

//        Pattern pattern = Pattern.compile("<p.*?>");
//        Matcher m = pattern.matcher(str);

//        while (m.find()){
//
//            System.out.println(str.substring(m.start(),m.end()));
//        }

        str = str.replaceAll("<p.*?>", "<p>");

        System.out.println(str);


    }

}
