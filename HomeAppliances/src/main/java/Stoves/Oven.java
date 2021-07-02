package Stoves;

import HomeAppliances.HomeAppliances;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString

public abstract class Oven implements HomeAppliances {
    private String brand;
    private String model;
    private int lenght;
    private int height;
    private int width;
    private boolean isElectricity;
    private boolean hasGrill;
    private boolean hasUpperBurn;



    @Override
    public void powerOn() {
    }

    @Override
    public void powerOff() {
        System.out.println("Духовой шкаф выключен");
    }

    @Override
    public boolean inStain() {
        if(isElectricity) return true;
        else {System.out.println("Подключение к сети питания не предустмотренно моделью."); return false;}
    }



}
