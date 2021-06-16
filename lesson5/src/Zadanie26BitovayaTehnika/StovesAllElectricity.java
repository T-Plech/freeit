package Zadanie26BitovayaTehnika;

public class StovesAllElectricity extends Stoves {


    @Override
    public void powerOn() {
        inStain();
        System.out.println("Горит индикатор питания");
    }

    @Override
    public void powerOff() {
        offStain();
    }



}
