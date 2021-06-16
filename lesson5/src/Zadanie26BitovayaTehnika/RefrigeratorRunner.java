package Zadanie26BitovayaTehnika;

public class RefrigeratorRunner {

    public static void main(String[] args) {

//        RefrigeratorBosch mojRefrigerator = new RefrigeratorBosch("Bosch", "m102n", 150, 2, 2.05, 50.0, 60.0);
//
//        System.out.println(mojRefrigerator.toString());
//
//        mojRefrigerator.powerOn();
//        mojRefrigerator.Vacantion();
//
//        RefrigeratorBosch houseRefrigerator = new RefrigeratorBosch("Bosch", "mn156", 350, 4);
//
//        System.out.println(houseRefrigerator.toString());


        RefrigeratorLG lg500 = new RefrigeratorLG("LG","lg500", 200, 4, false);
        System.out.println(lg500.toString());

        lg500.makeIceCube();




    }
}
