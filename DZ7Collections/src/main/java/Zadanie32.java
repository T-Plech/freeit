import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

// Имеется текст. Следует составить для него частотный словарь.

public class Zadanie32 {

	public static void main(String[] args) {
		
		HashMap<String, Double> frequencyDictionary = new HashMap<String, Double>();
		
		String text = "Целый день был жаркий, где-то собиралась гроза, но только небольшая тучка брызнула на пыль дороги и на сочные листья. Левая сторона леса была темна, в тени; правая мокрая, глянцовитая блестела на солнце, чуть колыхаясь от ветра. Все было в цвету; соловьи трещали и перекатывались то близко, то далеко.";
		
//		String[] words = text.split("[^А-Яа-я]");
//		
//		for(int i=0; i<words.length; i++) {
//		
//		System.out.println(words[i]);}

		
//		text.split(" ");
		
		System.out.println(text);
		
		StringTokenizer tokenizer = new StringTokenizer(text, " ,.;:-\"");
		
		List<String> words = new ArrayList<String>();
		
		while(tokenizer.hasMoreTokens()) {
			words.add(tokenizer.nextToken());
		}
//		System.out.println(words);
		
		Iterator<String> iter = words.iterator();
		
		while(iter.hasNext()) {
			double n = 0.00;
			String tx = iter.next();
			for(int i =0; i<words.size(); i++) {
				String word = words.get(i);
				if(tx.equals(word)) {
					n++;
				}
								
			}
			double freq = n/words.size();
			
			//			System.out.println(tx + " " + n + "raz" + " freq " + freq);
			
			frequencyDictionary.put(tx, freq);
		}
		
		System.out.println(frequencyDictionary.toString());
		
	}

}
