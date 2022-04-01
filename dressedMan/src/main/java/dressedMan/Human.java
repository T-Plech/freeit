package dressedMan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


//Создаём класс человек: 
//У человека поля: 
//-имя 
//-куртка 
//-штаны 
//-обувь
//У человека есть 2 метода: 
//- одеться(вызываются методы надеть у всех вещей) 
//- раздеться (вызываются методы снять у всех вещей)


public class Human {
	
	String name;
	Jacket jacket;
	Trousers trousers;
	Shoes shoes;
	
	
	
	public void dressUp() {
		
		jacket.dressUp();
		trousers.putOn();
		shoes.putOn();
		
	}
	
	
	public void dressOff() {
		jacket.unDress();
		trousers.takeOff();
		shoes.takeOff();
	}
	
	

}
