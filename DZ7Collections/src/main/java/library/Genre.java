package library;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Genre {

	String genre;
	int genreId;
	
	List<Genre> genres = new ArrayList<Genre>();
	
	public void addGenre(Genre genre) {
		
		A:{
			for(int i=0;i<genres.size(); i++) {
				if(genre.genreId == genres.get(i).genreId) {
					break A;
				}
			}
		genres.add(genre);
	}	
	}
	
	public String getGenre(int genreId) {
		
		
			for(int i=0; i<genres.size(); i++) {
				if(genreId == genres.get(i).genreId) {
				return genres.get(i).genre;
				
				}
		}
			return "нет жанра с таким id";
		
	}
	
	
}
