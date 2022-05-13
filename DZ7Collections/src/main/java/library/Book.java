package library;

import lombok.AllArgsConstructor;
import lombok.Data;

//Создать класс Книга, поля: 
//• id (целое число) 
//• title (строка) 
//• genre (строка) (Если вы уже в себе уверены, создавайте еще один класс Genre и в класс Book вмест genre включайте genreId, который будет ссылаться на жанр с соответствующим id)
//

@Data
@AllArgsConstructor

public class Book implements Comparable<Book> {

	int id;
	String title;
	String genre;
	
	

	@Override
	public boolean equals(Object obj) {
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", genre=" + genre + "]";
	}


	
	public int compareTo(Book o) {
		
		return this.getTitle().compareTo(o.getTitle());
	}
	
	
	
}
