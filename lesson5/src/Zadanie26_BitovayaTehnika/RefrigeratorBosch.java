package Zadanie26_BitovayaTehnika;

public class RefrigeratorBosch extends Refrigerators{



    public RefrigeratorBosch(String brand, String model, int volume, int coutnCamers) {
        super(brand, model, volume, coutnCamers);

    }

    public RefrigeratorBosch(String brand, String model, int volume, int countCamers, double height, double width, double depth){
        super(brand,model,volume,countCamers,height,width,depth);
    }



    public void Vacantion(){
        powerOn();
        System.out.println("Потребление питания снижено. Холодильник работает в режиме \"Отпуск\". ");
    }


    @Override
    public String toString() {
        return "RefrigeratorBosch{" +
                super.toString()  +
                '}';
    }
}
