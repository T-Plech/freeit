package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Создать класс Библиотека, поля: 
//• Список книг (изначально пустой)
// методы: 
//• добавить книгу (принимает объект книги и добавляет его в список товаров). При попытке добавить книгу с id уже существующем в списке, вставка производится не должна 
//• получить все книги (метод ВОЗВРАЩАЕТ список всех книг в библиотеке) 
//• удалить книгу (метод принимает id книги и удаляет из списка книгу с соответствующим id) 
//• редактировать книгу (принимает объект книги и редактирует их список товаров) Обратите внимание что id книги и индекс книги в списке — это разные вещи, не перепутайте. Id книги — это поле вашего объекта, вы при его создании его задаете. А индекс книги в списке книг, это по сути её порядковый номер в списке(начинается с 0).


public class Library  {

	
	List<Book> books = new ArrayList<Book>();
	
	public void addBook(Book book) {
		
		A:{
		for(int i=0; i<books.size(); i++) {
			if(book.equals(books.get(i))) {
				System.out.println("Книга с таким id существует: " + books.get(i).toString());
				break A;}
		}
		
		books.add(book);
		System.out.println("Добавлена книга " + book.toString());
		
		}
				
	}
	
	public ArrayList<Book> getAllBooks() {
	
		return (ArrayList<Book>) books;
		
	}
	
	public void removeBook(int id) {
		A: {for(int i=0; i<books.size(); i++) {
			if(id == books.get(i).id) {
				books.remove(i);
				break A;
			}
			}
		System.out.println("Книг с таким id не существует");
		}
		
		System.out.println("Книга с id "  + id + " удалена.");
		
	}
	
	public void redactBook(Book book, String title, String genre) {
		
		book.title = title;
		book.genre = genre;
		
		A: {for(int i=0; i<books.size(); i++) {
			if(book.id == books.get(i).id) {
				books.set(i, book);
				break A;
			}
			}
		System.out.println("Книги с  id" + book.id + " не существует");
		}
		
		System.out.println("Книга " + book.toString() + " отредактирована");
		
	}
	
	
	public Book getBook(int id) {
		
		Book book = null;
		
		for(int i=0; i<books.size(); i++) {
			if( id == books.get(i).id) {
			
				book = books.get(i);
				break;				
			}
			}
		return book;
	}
	

	@Override
	public String toString() {
		return "Library [books=" + books + "]";
	}
	
	public void compareTitleUp() {
		Collections.sort(books);
	}

	public void compareTitleDown() {
		Collections.sort(books, Collections.reverseOrder());
	}

	
	public void compId() {
		
		Comparator<Book> compId = Comparator.comparing(obj -> obj.getId());

		Collections.sort(books, compId);
	}    
	
	

}
