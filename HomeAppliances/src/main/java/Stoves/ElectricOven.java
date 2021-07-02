package Stoves;

public class ElectricOven extends Oven {
    private boolean hasPirolise;
    private boolean hasConvection;



    public ElectricOven(String brand, String model,int lenght, int height, int width, boolean isElectricity, boolean hasGrill, boolean hasUpperBurn, boolean hasPirolise, boolean hasConvection) {
        super(brand, model, lenght, height, width, isElectricity, hasGrill, hasUpperBurn);
        this.hasPirolise = hasPirolise;
        this.hasConvection = hasConvection;

    }

    boolean isInStain;
    int temperature;

    @Override
    public void powerOn() {
        if(isInStain) System.out.println("Духовой шкаф включен. Выберите температуру и режим нагрева");
        else System.out.println("Духовой шкаф выключен");
    }

    @Override
    public boolean inStain() {
        return isInStain=true;
    }

    public  void downBurn(){
        if(isInStain) System.out.println("Включен нижний нагрев");
            }

    public  void upperBurn(){
        if((isInStain) && (super.isHasUpperBurn())) System.out.println("Включен верхний нагрев");
    }
            public void convenction(){
        if((isInStain) && (hasConvection)) System.out.println("Включена конвенкция. Нагрев до " + temperature + "градусов.");
            }

            public void grill(){
        if((super.isHasGrill()) && (isInStain)) System.out.println("Включен гриль " + temperature + "градусов");
            }

            public int getTemperature(){
        return temperature;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

    public void pirolise(){
        if((isInStain)&&(hasPirolise))  System.out.println("Духовка самоочищается методом пиролиза");
    }


    public boolean getHasPirolise() {
        return hasPirolise;
    }

    public void setHasPirolise(boolean hasPirolise) {
        this.hasPirolise = hasPirolise;
    }

    public boolean getHasConvection() {
        return hasConvection;
    }

    public void setHasConvection(boolean hasConvection) {
        this.hasConvection = hasConvection;
    }

    @Override
    public String toString() {
        return "ElectricOven{" +
                super.toString() +
                "hasPirolise=" + hasPirolise +
                ", hasConvection=" + hasConvection +
                '}';
    }
}
