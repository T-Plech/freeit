package library;

/*
В main создаем объект вашей консольной менюшки(приложения, Application). И вызываем метод старт. Библиотека должна работать по замкнутому циклу, до тех пор пока пользователь в меню не выберет выход. Естественно не забываем про обработку всевозможных ошибок.  Успехов!))
*/

public class Runner2 {

	
	
	public static void main(String[] args) {
		
		Book gordIpredub = new Book(1, "Gordost i predubegdenie", "Roman");
		Book dnevnikiVamp = new Book(2, "Dnevniki Vampira", "Roman");
		Book hobbit = new Book(32, "Hobbit", "Fantasy");
		
		Library myLib = new Library();
		myLib.addBook(hobbit);
		myLib.addBook(dnevnikiVamp);
		myLib.addBook(gordIpredub);

		
		ConsolMenu consol = new ConsolMenu();		
		
		consol.start(myLib);
	}
	
	
	
	
}
