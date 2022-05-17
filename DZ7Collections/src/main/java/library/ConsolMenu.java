package library;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Разрабатываем консольное меню для работы с библиотекой.

Алгоритм работы библиотеки: 
• Выберите действие: 

+ Вывод всех книг. При выборе этого действия, было бы отлично спросить у пользователя в какой сортировке вывести: 
▪ по алфавиту (возрастание) 
▪ по алфавиту (убывание) 
▪ по добавлению(сначала новые, потом более старые) 
После выбора сортировки, из библиотеки получаете список книг, сортируете их таким образом как выбрал пользователь и выводите в консоль. 

+ Добавление книги. При выборе этого действия: 
▪ пользователь должен ввести с консоли 3 параметра (id, название, жанр). 
▪ создаем объект книги (поля заполняются данными введенными пользователем) 
▪ добавляем книгу в библиотеку (напоминаю, если в списке книг уже существует книга с таким id, то новая книга не добавляется) 

+ Удаление книги. При выборе этого действия: 
▪ пользователь вводит id книги которую нужно удалить 
▪ удаляем книгу из магазина 

+ Редактирование книги. При выборе этого действия: 
▪ пользователь должен ввести с консоли 3 параметра (id книги для редактирования, новое название, новую жанр). 
▪ создаем объект книги (поля заполняются данными введенными пользователем) 
▪ редактируем книгу в библиотеке

+ Выход. При выборе этого действия, работа библиотеки завершается.
*/

import java.util.Scanner;

public class ConsolMenu {
	
//	Library myLib = new Library();
	
	static Scanner sc = new Scanner(System.in);
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	@SuppressWarnings("finally")
	public void start(Library myLib) {
		
		int choose = 0;
Start: {
	
	while(choose !=5) {
	
		System.out.println("Выберите действие: " + "\n" + "1. Вывести все книги библиотеки " + "\n" + "2. Добавить книгу" + "\n" + "3. Удалить книгу" + "\n" + "4. Редактировать книгу " + "\n" + "5. Выход");
		try {
			choose = sc.nextInt();
			if(choose<1|| choose>5) {
				choose = forceMakeChoice();
			}
		} catch (Exception e) {
			
			System.out.println("Что-то пошло не так.");
			choose = forceMakeChoice();
						
		}
		
		
		if(choose == 1) {
			
			System.out.println("Вы хотите отсортировать книги по: \n 1.по алфавиту (возрастание) \n 2. по алфавиту (убывание) \n 3. по добавлению(сначала новые, потом более старые) ");
			
			int sortChoose;
			try {
				sortChoose = sc.nextInt();
				if(sortChoose<1 || sortChoose>3) {
					sortChoose = forceMakeSortChoice();
				}
				
			}
			catch(Exception ex){
				System.out.println("Что-то пошло не так");
				sortChoose = forceMakeSortChoice();
			}
			
			if(sortChoose ==1) {
				
				myLib.compareTitleUp();
				System.out.println(myLib.toString());
					}
			if(sortChoose ==2) {
				
				myLib.compareTitleDown();
				System.out.println(myLib.toString());
					}

			if(sortChoose ==3) {
		
				myLib.compId();
				System.out.println(myLib.toString());
		}
			
			
		}
		
		if(choose ==2) {
//			Добавление книги. При выборе этого действия: 
//				▪ пользователь должен ввести с консоли 3 параметра (id, название, жанр). 
//				▪ создаем объект книги (поля заполняются данными введенными пользователем) 
//				▪ добавляем книгу в библиотеку (напоминаю, если в списке книг уже существует книга с таким id, то новая книга не добавляется) 

			
			int id;
			String title;
			String genre;
			System.out.println("Введите: id");
			try {
				id = sc.nextInt();
				
			}
			catch(Exception e){
				System.out.println("Что-то не так");
				id = inputId();
			}
			
			System.out.println("Введите название");
			
			try {
				title = reader.readLine();
			}
			catch(Exception e) {
				System.out.println("Что-то не так");
				title = inputString();
			}
			
			System.out.println("Введите жанр");
			
			try {
				genre = reader.readLine();
			}
			catch(Exception e) {
				System.out.println("Что-то не так");
				genre = inputString();
			}
			
			
			myLib.addBook(new Book(id, title, genre));
			
			
		}
		
//		◦ Удаление книги. При выборе этого действия: 
//			▪ пользователь вводит id книги которую нужно удалить 
//			▪ удаляем книгу из магазина 

		if(choose ==3) {
			
			System.out.println("Введите id удаляемой книги");
			int id=0;
			 try {
				 id = sc.nextInt();
			 }
			 catch(Exception e){
				 
				 System.out.println("Что-то не так");
				 inputId();
			 }
			
			 
			 myLib.removeBook(id);			
			
		}
		
//		◦ Редактирование книги. При выборе этого действия: 
//			▪ пользователь должен ввести с консоли 3 параметра (id книги для редактирования, новое название, новую жанр). 
//			▪ создаем объект книги (поля заполняются данными введенными пользователем) 
//			▪ редактируем книгу в библиотеке

		
		if(choose == 4) {
			
			int id=0;
			String newTitle = null;
			String newGenre = null;
			
			System.out.println("Введите id книги для редактирования ");
			
			try {
				id = sc.nextInt();				
			}
			catch(Exception e) {
				System.out.println("Что-то пошло не так");
				inputId();
			}
						

			System.out.println("Введите новое название");
			
			try {
				newTitle = reader.readLine();				
			}
			catch(Exception e) {
				System.out.println("Что-то пошло не так");
				inputString();
			}

			System.out.println("Введите новый жанр");

			try {
				newGenre = reader.readLine();			
			}
			catch(Exception e) {
				System.out.println("Что-то пошло не так");
				inputString();
			}
			
			
			myLib.redactBook(myLib.getBook(id), newTitle, newGenre);
			
		}
		
//		◦ Выход. При выборе этого действия, работа библиотеки завершается.

		if(choose == 5) {
			sc.close();
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("reader не закрыт. Что-то пошло не так");
			}
			finally {System.out.print("Работа библиотеки завершена");
			break Start;}
			
			
		}
		}}



	}
		
	private static String inputString() {
		String st=null;
		boolean inputOk=false;
		while(!inputOk) {
			System.out.println("Введите корректные данные");
			try {
				st = reader.readLine();
			} catch (IOException e) {
				inputString();
			}
			if(st!=null) {
				inputOk=true;
			}
		}
		return st;
	}

	private static int inputId() {
		int a=0;
		boolean inputOk = false;
		while(!inputOk) {
			System.out.println("Введите id");
			 a = sc.nextInt();
			if(a>0) {
				inputOk =true;
			}
		}
		return a;
		
	}

	private static int forceMakeSortChoice() {
		boolean inputOk = false;
		int a=0;
		while(!inputOk) {
			System.out.println("Сделайте выбор сортировки");
			a = sc.nextInt();
			
			if(a>=1 && a<=3) {
				inputOk = true;
			}
		}
		return a;
	}

	private static int forceMakeChoice() {
	
		boolean inputOk = false;
		int a=0;
		while(!inputOk) {
			System.out.println("Сделайте свой выбор");
			 a= sc.nextInt();
			
			if(a>=1 && a<=5) {
				inputOk = true;
			}
		}
		return a;
		}


}
