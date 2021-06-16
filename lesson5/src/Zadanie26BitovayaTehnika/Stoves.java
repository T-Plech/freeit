package Zadanie26BitovayaTehnika;

public abstract class Stoves extends LargeHomeAppliances {
    private String brand;
    private String model;


    public Stoves(String brand, String model) {
        this.brand = brand;
        this.model = model;

    }

    public void burnerOn(){
    }
    public void burnerOff(){
    }
    public void ovenOn(){
    }
    public void ovenOff(){
    }

    @Override
    public String toString() {
        return "Stoves " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' + ", " ;
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
}
