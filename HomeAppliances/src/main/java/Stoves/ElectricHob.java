package Stoves;

import lombok.Data;


public class ElectricHob extends Hob{

    private boolean isInduction;

    public ElectricHob(String brand, String model, String coating, int burnerCount, boolean isInduction) {
        super(brand, model, coating, burnerCount);
        this.isInduction=isInduction;
    }

    boolean isInStain=false;
    @Override
    public void powerOn() {
        if(isInStain) {System.out.println("Варочная панель работает");}
        else System.out.println("Подключите варочную панель к сети питания");
    }

    @Override
    public void powerOff() {
        System.out.println("Варочная панель не работает");
    }

    @Override
    public boolean inStain() {
        return isInStain=true;
    }

    @Override
    public void burnerOn() {
        if (isInStain) System.out.println("Комфорка греет");
        else System.out.println("Подключите варочную панель к сети питания");
    }

    @Override
    public void burnerOff() {
        System.out.println("Комфорка выключена");
    }
}
