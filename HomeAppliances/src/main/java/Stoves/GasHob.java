package Stoves;


public class GasHob extends Hob  {

    private boolean hasElectricIgnition;
    private int burnerCount;
    public GasHob(String brand, String model, String coating, int burnerCount, boolean hasElectricIgnition) {
        super(brand, model, coating);
        this.burnerCount=burnerCount;
        this.hasElectricIgnition = hasElectricIgnition;
    }

    @Override
    public void burnerOn() {
       if(hasElectricIgnition = true) {inStain(); System.out.println("Чирк-чирк, пуффф. Огонь горит");}
       else System.out.println("Возьмите спички. Огонь горит");
    }

    @Override
    public void burnerOff() {
        System.out.println("пфф. Огонь погас");
    }


    @Override
    public void powerOn() {
    }

    @Override
    public void powerOff() {
    }

    @Override
    public boolean inStain() {
        if(hasElectricIgnition=true) System.out.println("Варочная панель подключена к сети питания");
        else System.out.println("Ты включил что-то другое.");
        return true;
    }

    @Override
    public String toString() {
        return "GasHob{" +
                super.toString() +
                "hasElectricIgnition=" + hasElectricIgnition +
                ", burnerCount=" + burnerCount +
                '}';
    }
}
