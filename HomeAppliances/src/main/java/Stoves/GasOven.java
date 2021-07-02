package Stoves;

import java.util.Random;


public class GasOven extends Oven{

    boolean isInStain;
    Random random = new Random();
    int temperature;



    public GasOven(int lenght, int height, int width, boolean isElectricity, boolean hasGrill, boolean hasUpperBurn, String brand, String model) {
        super(brand, model, lenght, height, width, isElectricity, hasGrill, hasUpperBurn);

    }

    @Override
    public void powerOn() {
        if(isInStain) System.out.println("Чирк-чирк- пуфф. В духовке горит огонь. Идет нагрев до " + temperature + " градусов");
        else{if(super.isElectricity()) System.out.println("Подключите духовой шкаф к сети или воспользуйтесь спичками");
            else {
                int n = random.nextInt(20);
                System.out.println("Вам удалось зажечь духовку с " + n + " раза. Идет нагрев до " + temperature + " градусов");}
        }
    }

    @Override
    public boolean inStain() {
        return isInStain = super.inStain();
    }

    public int getTemperature(){
        return temperature;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

    public void grill(){
        if (super.isHasGrill()){
        if(isInStain) System.out.println("Чирк-чирк. Горит гриль. Идет нагрев до " + temperature + " градусов");
        else{int n = random.nextInt(20);
            System.out.println("Используйте спички. Вам удалось зажечь гриль с " + n + " раза. Идет нагрев до " + temperature + " градусов");}
    }}


    public void upperBurn(){
        if(super.isHasUpperBurn()){
            if(isInStain) System.out.println("Чирк-чирк. Горит верхний нагрев. Идет нагрев до " + temperature + " градусов" );
            else {
                int n = random.nextInt(20);
                System.out.println("Воспользуйтесь спичками. Вам удалось зажечь верхний нагрев с " + n + " раза. Идет нагрев до " + temperature + " градусов");
            }
        }
    }


}
