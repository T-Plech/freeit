import lombok.Data;

@Data

public abstract class Refrigerators implements HomeAppliances{
    @Override
    public void powerOn() {
        inStain();
        System.out.println("Холодильник работает. Заданная температура  " + this.degree);
    }

    @Override
    public void powerOff() {
        offStain();
        System.out.println("Холодильник выключен");
    }


    private int volume;
    private int coutnCamers;
    private double height;
    private double width;
    private double depth;
    private int degree=12;

    public void setDegree(int degree){
        this.degree = degree;
    }

    public Refrigerators(int volume, int coutnCamers, double height, double width, double depth) {
        this.volume = volume;
        this.coutnCamers = coutnCamers;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    int degreesPlus(int plusDegree){
    this.degree +=plusDegree;
    return this.degree;
    }

    int degreesMinus(int degree, int minusDegree){
        this.degree -=minusDegree;
        return this.degree;
    }



}
