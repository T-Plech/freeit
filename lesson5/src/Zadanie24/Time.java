package Zadanie24;//Создать класс и объекты, описывающие промежуток времени. +
//        Сам промежуток должен задаваться 3 свойствами: секундами, минутами, часами. +
//        Сделать методы
//        * для получения полного количества секунд в объекте, +
//        * сравнения двух объектов(метод должен работать аналогично compareTo в строках).+
//        Создать два конструктора:
//        *получающий общее количество секунд +
//        * часы, минуты и секунды по отдельности +
//        Сделать метод для вывода данных+

public class Time {


    private long sec;
    private int min;
    private int hours;


    public Time(int sec, int min, int hours){
        this.hours= (int) ((sec + min*60+hours*3600)/3600);
        this.min=(int)(((sec + min*60+hours*3600) - this.hours*3600)/60);
        this.sec=(sec + min*60L+hours*3600L) - this.hours* 3600L -this.min*60L;
    }

    public Time(long sec){
        this.hours = (int) (sec/3600);
        this.min = (int)((sec - this.hours*3600)/60);
        this.sec = sec - this.hours* 3600L -this.min*60L;
    }

    public long allsec(){
        return sec + min*60L + hours*3600L;
    }

    public long compare_time(Time t1){

        return  (this.allsec()-t1.allsec());

    }

    public int getHours() {
        return hours;
    }

    public int getMin() {
        return min;
    }

    public long getSec() {
        return sec;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(long sec) {
        this.sec = sec;
    }

    @Override
    public String toString() {
        return "Time{" +
                "sec=" + sec +
                ", min=" + min +
                ", hours=" + hours +
                '}';
    }
}
