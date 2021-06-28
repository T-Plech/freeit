package Refrigerators;


public class RefrigeratorsRunner {
    public static void main(String[] args) {

//        RefrigeratorBosch A156 = new RefrigeratorBosch("Bosch", "A156", 155, 2, 180, 60, 60);
//        System.out.println(A156.toString());
//        A156.inStain();
//        A156.Vacantion();
//        A156.powerOn();
//        A156.setDegree(14);
//       System.out.println("Поддерживаемая температура в данный момент: " + A156.degreesPlus(2));
//       A156.powerOff();
//       A156.setDegree(25);

       RefrigeratorLG Lg555 = new RefrigeratorLG("LG", "555", 180, 4, 185, 90, 60);
        System.out.println(Lg555.toString());
        Lg555.setDegree(14);
        Lg555.inStain();
       Lg555.makeIce();



    }
}
