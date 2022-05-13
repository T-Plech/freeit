package library;

/*
В main создаем объект вашей консольной менюшки(приложения, Application). И вызываем метод старт. Библиотека должна работать по замкнутому циклу, до тех пор пока пользователь в меню не выберет выход. Естественно не забываем про обработку всевозможных ошибок.  Успехов!))
*/

public class Runner2 {

	
	
	public static void main(String[] args) {
		
		ConsolMenu consol = new ConsolMenu();		
		
		consol.start();
	}
	
	
	
	
}
