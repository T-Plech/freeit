package Stoves;

public class StovesRunner {
    public static void main(String[] args) {
//        Hob bosch15AF = new GasHob("Bosch", "15AF", "steel", 4, true);
//        System.out.println(bosch15AF.toString());
//        bosch15AF.inStain();
//        bosch15AF.burnerOn();
//        bosch15AF.burnerOff();

//        Hob horizont157 = new ElectricHob("Horizont", "157AW", "enamel", 4,false );
//
//        horizont157.burnerOn();
//        horizont157.inStain();
//        horizont157.burnerOn();
//        horizont157.burnerOff();

//        GasOven ZanussiZ500 = new GasOven(50,90,60,true,true, true, "Zanussi", "Z500");
//
//        System.out.println(ZanussiZ500.toString());
//        ZanussiZ500.inStain();
//        ZanussiZ500.setTemperature(180);
//        ZanussiZ500.grill();
//ZanussiZ500.upperBurn();
//ZanussiZ500.powerOn();

        ElectricOven HansaG250 = new ElectricOven("Hansa", "G250", 50,90,60,true,true,true, false, true);
        System.out.println(HansaG250.toString());
        HansaG250.powerOn();
        HansaG250.setTemperature(170);
        HansaG250.inStain();
        HansaG250.powerOn();
        HansaG250.convenction();
        HansaG250.upperBurn();
        HansaG250.grill();
        HansaG250.powerOff();
        HansaG250.offStain();

    }
}
