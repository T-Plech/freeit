import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Удалить неудовлетворительные оценки из списка.

//Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

public class Zadanie29i31 {

	public static void main(String[] args) {

		List<Integer> grade = new ArrayList<Integer>(20);
		
		Random rand = new Random();
				
		for(int i=0; i<20; i++) {
		
		grade.add(rand.nextInt(11));	
			}

		System.out.println(grade.toString());
		
		Iterator<Integer> iter = grade.iterator();
		int max =0;
		
		while(iter.hasNext()) {
			int k = iter.next();
			if(k >max) {max =k;}
			if(k < 4) {iter.remove();}
		}
		
		System.out.println(grade.toString());
		System.out.println("Max grade = " + max);
		
		
	}

}
