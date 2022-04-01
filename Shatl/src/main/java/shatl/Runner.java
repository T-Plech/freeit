package shatl;

public class Runner {
	
	public static void main(String[] args) {
	
	Shatl shatl = new Shatl();
	SpaceX spaceX = new SpaceX();
	RussianOne iRussian = new RussianOne();
	
	Spaceport america = new Spaceport();
	Spaceport baikanur = new Spaceport();
	
	america.launch(shatl);
	america.launch(spaceX);
	baikanur.launch(iRussian);
	
	}
}
