public class RefrigeratorLG extends Refrigerators implements Freezer {
    private String brand;
    private String model;

    public RefrigeratorLG(String brand, String model, int volume, int coutnCamers, double height, double width, double depth) {
        super(volume, coutnCamers, height, width, depth);
        this.brand=brand;
        this.model=model;

    }

    @Override
    public void inStain() {
    }
    @Override
    public void offStain() {
    }

    @Override
    public void makeIce() {
        freeze();
        System.out.println("Ваш лёд кубиками готов. Подставьте стакан и нажмите на кнопку.");
    }

    @Override
    public void freeze() {
        inStain();
        System.out.println("Морозильник работает");

    }

    @Override
    public String toString() {
        return "RefrigeratorLG{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                super.toString() +
                '}';
    }
}
