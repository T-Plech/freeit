package dressedMan;

public class Runner {

	public static void main(String[] args) {
		
		ZaraJacket zaraJacket = new ZaraJacket("spring", 150);
		NoNameJacket justJacket = new NoNameJacket("winter", 20);
		
		ClassicTrousers officeTrousers = new ClassicTrousers("black", 60);
		SportTrousers sportTrousers = new SportTrousers(10);
		
		DGShoes pumps = new DGShoes("leather", 150);
		AddidasSneakers sneakers = new AddidasSneakers(100);
		
		Human vany = new Human("Vany", justJacket, sportTrousers, sneakers);
		
		Human vika = new Human("Vika", zaraJacket, officeTrousers, pumps);
		
		System.out.println(vany.toString());
		System.out.println(vika.toString());
		
		vany.dressUp();
		vika.dressUp();
		vany.dressOff();
		vika.dressOff();
		

	}

}
