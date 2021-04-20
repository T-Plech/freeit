/*
Имеется строка с текстом.
Вывести текст, составленный из последних букв всех слов
*/

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Zadanie20 {

    public static void main(String[] args){

        String st = "Так тоже работает";

        st = st.trim();

        StringTokenizer tokenizer = new StringTokenizer(st, " ,.-\":;");
        List<String> words = new ArrayList<>();
        StringBuffer result = new StringBuffer();

        while (tokenizer.hasMoreTokens()){
            words.add(tokenizer.nextToken());
        }
        for (String temp : words) {
            int lastindex = temp.length() - 1;
            result.append(temp.charAt(lastindex));
        }

        words.forEach(System.out::println);

        System.out.println(result);

    }


}
