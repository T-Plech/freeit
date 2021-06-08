package Zadanie26_BitovayaTehnika;

public class RefrigeratorLG extends Refrigerators{

    private boolean isWaterContainerFull;

    public RefrigeratorLG(String brand, String model, int volume, int coutnCamers, boolean isWaterContainerFull) {
        super(brand, model, volume, coutnCamers);
        this.isWaterContainerFull = isWaterContainerFull;
    }

    public void makeIceCube(){
        powerOn();
        if(isWaterContainerFull = true){
            System.out.println("Ваш лёд готов");
        }
        else System.out.println("Наполните контейнер для воды");
    }

    public boolean isWaterContainerFull() {
        return isWaterContainerFull;
    }

    public void setWaterContainerFull(boolean waterContainerFull) {
        isWaterContainerFull = waterContainerFull;
    }

    @Override
    public String toString() {
        return "RefrigeratorLG{" +
                super.toString() +
                "isWaterContainerFull=" + isWaterContainerFull +
                '}';
    }
}
