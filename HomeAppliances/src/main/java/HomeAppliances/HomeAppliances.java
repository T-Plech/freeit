package HomeAppliances;

public interface HomeAppliances {
    void powerOn();
    void powerOff();
    boolean inStain();
    int power_consumption = 220;

    default void offStain() {
        System.out.println("Прибор отключен от сети питания");
    }
}
