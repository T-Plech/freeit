import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
//числа.

public class Zadanie30 {

		public static void main(String[] args) {
		
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		Random rand = new Random();
		
		for(int i=0; i<10; i++) {
			
			numbers.add(rand.nextInt(10));
				}
		
		System.out.println(numbers.toString());
		
		for(int i = 0; i<numbers.size(); i++) {
			int x = numbers.get(i);
		for(int n =i+1; n<numbers.size(); n++ ) {
			if(x == numbers.get(n)) {numbers.remove(n); n--;};
		}
	
		}
		System.out.println(numbers.toString());
		

	}

}
