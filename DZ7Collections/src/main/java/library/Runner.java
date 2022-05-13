//package library;
//
//import java.util.Collections;
//import java.util.Comparator;
//
////В main: 
////• создаем объект библиотеки 
////• создаем пару тройку книг и добавляем эти книги в библиотеку 
////• получаем список книг из библиотеки, сортируем по полю title (по названию книги) и выводим в консоль. 
////• удаляем одну книгу 
////• получаем список книг из библиотеки, сортируем по порядку добавления (последние добавленные в начале) и выводим в консоль. 
////• редактируем одну книгу 
////• получаем список книг и выводим в консоль
//
//
//public class Runner {
//
//	public static void main(String[] args) {
//	
//		Library myLib = new Library();
//		
//		Book gordIpredub = new Book(1, "Gordost i predubegdenie", "Roman");
//		Book dnevnikiVamp = new Book(2, "Dnevniki Vampira", "Roman");
//		Book hobbit = new Book(32, "Hobbit", "Fantasy");
//		
//		myLib.addBook(hobbit);
//		myLib.addBook(dnevnikiVamp);
//		myLib.addBook(gordIpredub);
//		System.out.println(myLib.toString());		
//		
//		
//		
////		List<Book> myBooks = myLib.getAllBooks();
//		Collections.sort(myLib.getAllBooks());
//		System.out.println(myLib.getAllBooks());
//		
//		myLib.removeBook(2);
//			
//		Collections.sort(myLib.getAllBooks(), new Comparator<Book>() {
//		    public int compare(Book book1, Book book2) {
//	        return book1.id - book2.id;
//	    }
//		});
//		
//		System.out.println(myLib.getAllBooks());
//		
//		myLib.redactBook(gordIpredub, "Gordost' i Predubegdenie");
//		System.out.println(myLib.getAllBooks());
//
//	}
//
//}
