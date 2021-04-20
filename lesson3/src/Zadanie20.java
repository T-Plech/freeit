/*
Имеется строка с текстом.
Вывести текст, составленный из последних букв всех слов
*/

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Zadanie20 {

    public static void main(String[] args){

        String st = "Я не придумала красивую фразу, чтобы получилось слово.";

        st = st.trim();

        StringTokenizer tokenizer = new StringTokenizer(st, " ,.-\":;");
        List<String> words = new ArrayList<>();
        String result = "";

        while (tokenizer.hasMoreTokens()){
            words.add(tokenizer.nextToken());
        }
        for(int i=0; i< words.size();i++){
            String temp = words.get(i);
            int lastindex = temp.length()-1;
            result = result + temp.charAt(lastindex);
        }

        words.forEach(System.out::println);

        System.out.println(result);

    }


}
