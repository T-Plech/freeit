

public class RefrigeratorBosch extends Refrigerators{
    private String brand;
    private String model;
    final int vacationDegree = 16;


    public RefrigeratorBosch(String brand, String model, int volume, int coutnCamers, double height, double width, double depth) {
        super(volume, coutnCamers, height, width, depth);
        this.brand = brand;
        this.model = model;
    }


    public void Vacantion(){
        powerOn();
        System.out.println("Потребление питания снижено. Холодильник работает в режиме \"Отпуск\". Поддержиаемая температура  " + vacationDegree);
    }

    @Override
    public void inStain() {
    }

    @Override
    public void offStain() {
    }

    @Override
    public String toString() {
        return "RefrigeratorBosch{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                        "volume=" + super.getVolume() +
                ", coutnCamers=" + super.getCoutnCamers() +
                ", height=" + super.getHeight() +
                ", width=" + super.getWidth() +
                ", depth=" + super.getDepth()+
                '}';
    }
}

