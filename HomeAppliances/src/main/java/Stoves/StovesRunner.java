package Stoves;

public class StovesRunner {
    public static void main(String[] args) {
//        Hob bosch15AF = new GasHob("Bosch", "15AF", "steel", 4, true);
//        System.out.println(bosch15AF.toString());
//        bosch15AF.inStain();
//        bosch15AF.burnerOn();
//        bosch15AF.burnerOff();

        Hob horizont157 = new ElectricHob("Horizont", "157AW", "enamel", 4,false );

        horizont157.burnerOn();
        horizont157.inStain();
        horizont157.burnerOn();
        horizont157.burnerOff();

    }
}
