package Stoves;

public class GasHob extends Hob  {

    private boolean hasElectricIgnition;

    public GasHob(String brand, String model, String coating, int burnerCount, boolean hasElectricIgnition) {
        super(brand, model, coating,burnerCount);
        this.hasElectricIgnition = hasElectricIgnition;
    }

    boolean isInStain;


    @Override
    public void burnerOn() {
       if((hasElectricIgnition)&&(isInStain)) { System.out.println("Чирк-чирк, пуффф. Огонь горит");}
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
        if(hasElectricIgnition) {System.out.println("Варочная панель подключена к сети питания"); isInStain =true;}
        else {System.out.println("Ты включил что-то другое."); isInStain=false;}
        return isInStain;
    }

    @Override
    public String toString() {
        return "GasHob{" +
                super.toString() +
                "hasElectricIgnition=" + hasElectricIgnition +
                '}';
    }
}
