package Refrigerators;

public class RefrigeratorLG extends Refrigerators implements Freezer {
    private String brand;
    private String model;

    public RefrigeratorLG(String brand, String model, int volume, int coutnCamers, double height, double width, double depth) {
        super(volume, coutnCamers, height, width, depth);
        this.brand=brand;
        this.model=model;

    }


    @Override
    public void makeIce() {
        if(getIsInStain()){
            freeze();
        System.out.println("Ваш лёд кубиками готов. Подставьте стакан и нажмите на кнопку.");}
        else System.out.println("Холодильник отключен от сети питания");
    }

    @Override
    public void freeze() {
        if(super.getIsInStain()) System.out.println("Морозильник работает");
        else System.out.println("Холодильник отключен от сети питания");

    }

    @Override
    public String toString() {
        return "Refrigerators.RefrigeratorLG{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                super.toString() +
                '}';
    }
}
