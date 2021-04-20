/*Имеется строка с текстом.
Подсчитать количество слов в тексте.
Желательно учесть,что слова могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать*/


import com.sun.javafx.binding.StringFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Zadanie19 {
    public static void main(String[] args) {

        String st = "Я помню чудное мнгновенье, передо мной явилась ты ...  \"тратата\" ";

        st = st.trim();
        StringTokenizer tokenizer = new StringTokenizer(st, " ,.;-\"");

        List<String> words = new ArrayList<>();
        while (tokenizer.hasMoreTokens()){
            words.add(tokenizer.nextToken());
        }

        words.forEach(System.out::println);
        System.out.printf("Итого слов: %d", words.size());


    }
}
