package Zadanie26BitovayaTehnika;

public class Refrigerators extends LargeHomeAppliances implements Appliances{
    @Override
    public void powerOn() {
        inStain();
        System.out.println("Холодильник работает");
    }

    @Override
    public void powerOff() {
        offStain();
System.out.println("Холодильник выключен");
    }

    private String brand;
    private String model;
    private int volume;
    private int coutnCamers;
    private double height;
    private double width;
    private double depth;


    public Refrigerators(String brand, String model, int volume, int coutnCamers) {
        this.brand = brand;
        this.model = model;
        this.volume = volume;
        this.coutnCamers = coutnCamers;
    }

    public Refrigerators(String brand, String model, int volume, int countCamers, double height, double width, double depth) {
        this.brand = brand;
        this.model = model;
        this.volume = volume;
        this.coutnCamers = countCamers;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCoutnCamers() {
        return coutnCamers;
    }

    public void setCoutnCamers(int coutnCamers) {
        this.coutnCamers = coutnCamers;
    }

    @Override
    public String toString() {
        return "Refrigerators{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                ", coutnCamers=" + coutnCamers +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}

