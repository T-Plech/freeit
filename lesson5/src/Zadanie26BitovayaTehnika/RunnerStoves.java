package Zadanie26BitovayaTehnika;

public class RunnerStoves {
    public static void main(String[] args) {
        StovesAllGas gorenje101 = new StovesAllGas("Gorenje", "101md", 4);

        System.out.println(gorenje101.toString());
        gorenje101.burnerOn();
        gorenje101.ovenOn();
        gorenje101.burnerOff();
        gorenje101.ovenOff();


    }


}
