package Zadanie26BitovayaTehnika;

public class StovesAllGas extends Stoves{

    int numberOfBurner;
    public StovesAllGas(String brand, String model, int numberOfBurner) {
        super(brand, model);
        this.numberOfBurner = numberOfBurner;
    }

    @Override
    public void powerOn() {
        inStain();
        System.out.println("Электроподжиг подключен");
    }

    @Override
    public void powerOff() {
        offStain();
        System.out.println("Электроподжиг отключен, воспользуйтесь спичками");
    }

    @Override
    public void burnerOn() {
        System.out.println("Чирк-чирк, пух. Конфорка горит");

    }

    @Override
    public void burnerOff() {
        System.out.println("Конфорка потухла");
    }

    @Override
    public void ovenOn() {
        System.out.println("Пух! Духовку зажечь не так просто. \n Пух!Пух!Пух! \n Духовка горит");
    }

    @Override
    public void ovenOff() {
       System.out.println("Огонь в духовке погас");
    }

    @Override
    public String toString() {
        return super.toString() +
                "numberOfBurner = " + numberOfBurner;

    }

    public int getNumberOfBurner() {
        return numberOfBurner;
    }

    public void setNumberOfBurner(int numberOfBurner) {
        this.numberOfBurner = numberOfBurner;
    }
}
