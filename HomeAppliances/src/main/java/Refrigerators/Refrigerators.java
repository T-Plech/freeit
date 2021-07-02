package Refrigerators;

import HomeAppliances.HomeAppliances;
import com.sun.org.apache.xalan.internal.xsltc.dom.NthIterator;
import lombok.Data;

@Data

public abstract class Refrigerators implements HomeAppliances {
    private boolean isInStain;
    @Override
    public void powerOn() {
        if(isInStain)
        System.out.println("Холодильник работает. Заданная температура  " + this.degree);
        else System.out.println("Включите вилку в розетку");
    }

    @Override
    public void powerOff() {
        isInStain = false;
        System.out.println("Холодильник выключен");
    }


    private int volume;
    private int coutnCamers;
    private double height;
    private double width;
    private double depth;
    private int degree=12;

    public void setDegree(int degree){
        if(isInStain) this.degree = degree;
        else System.out.println("Холодильник отключен от сети");
    }

    public Refrigerators(int volume, int coutnCamers, double height, double width, double depth) {
        this.volume = volume;
        this.coutnCamers = coutnCamers;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int degreesPlus(int plusDegree){
    if(isInStain){this.degree +=plusDegree;
    return this.degree;}
    else return this.degree;
    }

   public int degreesMinus(int degree, int minusDegree){
     if(isInStain)  { this.degree -=minusDegree;
        return this.degree;}
     else return this.degree;
    }

    public boolean getIsInStain() {
        return isInStain;
    }


    @Override
    public boolean inStain() {
        return isInStain = true;
    }
}
