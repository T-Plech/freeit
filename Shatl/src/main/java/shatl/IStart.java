package shatl;

//Создаем интерфейс IStart. 
//В интерфейсе определяем методы: 
//• предстартовая проверка систем(возвращает true/false) 
//• запуск двигателей(void) 
//• старт(void) 



public interface IStart {
	boolean preStartCheck();
	void startEngine();
	void start();

}
